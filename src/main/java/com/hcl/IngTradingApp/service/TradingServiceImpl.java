package com.hcl.IngTradingApp.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.hcl.IngTradingApp.dto.ConfirmResponse;
import com.hcl.IngTradingApp.dto.TradingDto;
import com.hcl.IngTradingApp.entity.PurchaseInfo;
import com.hcl.IngTradingApp.entity.Stocks;
import com.hcl.IngTradingApp.repository.PurchaseInfoRepository;
import com.hcl.IngTradingApp.repository.StocksRepository;

@Service
public class TradingServiceImpl implements TradingService{

	@Autowired
	PurchaseInfoRepository purchaseInfoRepository;
	@Autowired
	StocksRepository stocksRepository;
	
	public ConfirmResponse confirm(TradingDto tradingDto) {
		
		String uri="http://13.232.35.16:9090/ingtrading/verify/{id}";
		PurchaseInfo purchaseInfo=purchaseInfoRepository.findByStockId(tradingDto.getStockId());
		Stocks stock=stocksRepository.findByStockId(tradingDto.getStockId());
		RestTemplate restTemplate = new RestTemplate();
		 Map<String, Long> params = new HashMap<String, Long>();
		 params.put("id", purchaseInfo.getStockId());
		String result = restTemplate.getForObject( uri, String.class,params);
	    ConfirmResponse confirmResponse=new ConfirmResponse();
	    if(result.equals("stock is empty"))
	    {
	    confirmResponse.setMessage("stock is empty");
	    }
	    else if(result.equals("only"+purchaseInfo.getVolumeofstock()+"left"))
	    {
	    	  confirmResponse.setMessage("only"+purchaseInfo.getVolumeofstock()+"left");
	   	   
	    }
	    else
	    {
	    	stock.setNumberOfStocks(stock.getNumberOfStocks()-purchaseInfo.getVolumeofstock());
			stocksRepository.save(stock);
			purchaseInfo.setConfirmOrder('Y');
			purchaseInfoRepository.save(purchaseInfo);
			confirmResponse.setMessage("thanks for the purchase");;
		    
		
	    }
		
		 return confirmResponse;
		 	}

	@Override
	public String verify(Long getStockId) {

		PurchaseInfo purchaseInfo=purchaseInfoRepository.findByStockId(getStockId);
		Stocks stock=stocksRepository.findByStockId(getStockId);
		if(stock.getNumberOfStocks()==0)
		{
			return "stock is empty"; 
		}
		else if(stock.getNumberOfStocks()<purchaseInfo.getVolumeofstock())
		{
			return "only"+purchaseInfo.getVolumeofstock()+"left";
		}
		else
		{
			return "please go ahead, stocks are available";
		}
		
		
	}

}

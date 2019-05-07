package com.hcl.IngTradingApp.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.IngTradingApp.dto.PurchaseDto;
import com.hcl.IngTradingApp.dto.PurchaseResponse;
import com.hcl.IngTradingApp.entity.PurchaseInfo;
import com.hcl.IngTradingApp.entity.Stocks;
import com.hcl.IngTradingApp.repository.PurchaseRepository;
import com.hcl.IngTradingApp.repository.StockRepository;


@Service
public class ReviewPurchaseImpl implements ReviewPurchase{

	@Autowired
	private StockRepository stockRepository;
	
	@Autowired
	private PurchaseRepository purchaseRepository;
	
	double fees = 0;
	double marketPrice=0;
	double totalPrice=0;
	
	
	@Override
	public PurchaseResponse purchaseOrder(PurchaseDto purchaseDto) {
		
		
		PurchaseInfo purchaseinfo=new PurchaseInfo();
		PurchaseResponse response=new PurchaseResponse();
		
		Stocks stocks=	stockRepository.findByStockId(purchaseDto.getStockId()); 
			
		if(stocks!=null) {
		    
			   if(purchaseDto.getVolumeofstock()<500) {
				   
				 fees= stocks.getStandardPrice()*(0.10/100)*purchaseDto.getVolumeofstock();
				}
			   
			   if(purchaseDto.getVolumeofstock()>=500) {
				    fees= stocks.getStandardPrice()*(0.15/100)*purchaseDto.getVolumeofstock();
			      
			   }
			   
			    marketPrice=stocks.getMarketPrice();
			    totalPrice=fees+marketPrice;

				purchaseinfo.setStockId(purchaseDto.getStockId());
				purchaseinfo.setUserid(purchaseDto.getUserid());
				purchaseinfo.setVolumeofstock(purchaseDto.getVolumeofstock());				
				purchaseinfo.setStockpurchaseddate(new Date());
				purchaseinfo.setFees(fees);
				purchaseinfo.setTotalprice(totalPrice);
				purchaseRepository.save(purchaseinfo);
			   
				response.setPrice("Stocks Price subjected to Market Price");
				response.setFees("Fees applicale on you price. Fees are Rs." +fees);
				response.setMarketPrice(marketPrice);
				response.setStandardPrice(stocks.getStandardPrice());
				response.setMessage("purchase to order confirm or Cancel");
			   
			   
		      }
		
		else {
			response.setMessage("Stocks are not available");
		}
		
		return response;
	}

	
}

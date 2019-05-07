package com.hcl.IngTradingApp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.IngTradingApp.dto.StockDto;
import com.hcl.IngTradingApp.dto.StockListDto;
import com.hcl.IngTradingApp.entity.Stocks;
import com.hcl.IngTradingApp.repository.StockRepository;

@Service
public class StockServiceImpl implements StockService {

	@Autowired
	StockRepository stockRepository;

	@Override
	public List<StockListDto> getStocksList() {
		List<StockListDto> stockDtoLists = new ArrayList<StockListDto>();
		try {
			List<Stocks> stocksList = stockRepository.findAll();
			if (!stocksList.isEmpty()) {
				stocksList.stream().forEach(stocks -> {
					StockListDto stock = new StockListDto();
					stock.setStockId(stocks.getStockId());
					stock.setCompanyName(stocks.getCompanyName());
					stockDtoLists.add(stock);
				});
			}

		} catch (Exception e) {

		}
		return stockDtoLists;
	}

	@Override
	public StockDto getStockDetails(Long stockId) {
		StockDto stockDto = new StockDto();
		try {
			Stocks stocks = stockRepository.findByStockId(stockId);
			if (stocks != null) {

				stockDto.setStockId(stocks.getStockId());
				stockDto.setCompanyName(stocks.getCompanyName());
				stockDto.setNumberOfStocks(stocks.getNumberOfStocks());
				stockDto.setStandardPrice(stocks.getStandardPrice());

			}

		} catch (Exception e) {

		}
		return stockDto;
	}

}

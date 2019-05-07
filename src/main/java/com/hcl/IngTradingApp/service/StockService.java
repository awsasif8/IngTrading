package com.hcl.IngTradingApp.service;

import java.util.List;

import com.hcl.IngTradingApp.dto.StockDto;
import com.hcl.IngTradingApp.dto.StockListDto;

public interface StockService {
	List<StockListDto> getStocksList();
	StockDto getStockDetails(Long stockId);
}

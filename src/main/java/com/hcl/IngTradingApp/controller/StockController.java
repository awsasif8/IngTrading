package com.hcl.IngTradingApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.IngTradingApp.dto.StockDto;
import com.hcl.IngTradingApp.dto.StockListDto;
import com.hcl.IngTradingApp.service.StockService;

@RestController
public class StockController {
	@Autowired
	StockService stockService;

	@RequestMapping(value = "/stocks", method = RequestMethod.GET)
	public List<StockListDto> users() {

		List<StockListDto> response = stockService.getStocksList();
		return  response;
	}
	
	@RequestMapping(value = "/stockDetails", method = RequestMethod.GET)
	public StockDto getStockDetails(Long stockId) {

		StockDto response = stockService.getStockDetails(stockId);
		return  response;
	}
}

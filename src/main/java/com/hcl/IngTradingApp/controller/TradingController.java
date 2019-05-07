package com.hcl.IngTradingApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.IngTradingApp.Dto.ConfirmResponse;
import com.hcl.IngTradingApp.Dto.TradingDto;
import com.hcl.IngTradingApp.service.TradingService;
import com.hcl.IngTradingApp.service.TradingServiceImpl;

@RestController
public class TradingController {

	@Autowired
	TradingService tradingService;
	
	@PostMapping("/confirmOrder")
	public ConfirmResponse confirm(@RequestBody TradingDto tradingDto)
	{
		ConfirmResponse confirmResponse=tradingService.confirm(tradingDto);
		return confirmResponse;
		
	}
	@GetMapping("/verify/{id}")
	public String verify(@PathVariable Long id)
	{
		String confirmResponse=tradingService.verify(id);
		return confirmResponse;
		
	}
}
package com.hcl.IngTradingApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.IngTradingApp.dto.ConfirmResponse;
import com.hcl.IngTradingApp.dto.TradingDTO;
import com.hcl.IngTradingApp.service.TradingService;

@RestController
public class TradingController {

	@Autowired
	TradingService tradingService;
	
	@PostMapping("/confirmOrder")
	public ConfirmResponse confirm(@RequestBody TradingDTO tradingDto)
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

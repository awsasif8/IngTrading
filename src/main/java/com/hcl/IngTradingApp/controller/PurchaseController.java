package com.hcl.IngTradingApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.IngTradingApp.dto.PurchaseDto;
import com.hcl.IngTradingApp.dto.PurchaseResponse;
import com.hcl.IngTradingApp.service.ReviewPurchaseImpl;

@RestController
public class PurchaseController {
	
	
	@Autowired
	ReviewPurchaseImpl purchaseServiceImpl;
	
	@PostMapping("/reviewOrder")
	public PurchaseResponse reviewOrder(@RequestBody PurchaseDto purchasedto) {
		
		PurchaseResponse response=purchaseServiceImpl.purchaseOrder(purchasedto);
		
		return response;
		
		
	}
	
	
	@DeleteMapping("/deleteOrder")
	public String deleteOrder(@RequestParam Long stockId,@RequestParam Long userId) {
		
		purchaseServiceImpl.cancelOrder(stockId,userId);
		
		 
			
			return "Thank you";
		  
		  
		
	}

}

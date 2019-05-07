package com.hcl.IngTradingApp.service;

import com.hcl.IngTradingApp.dto.PurchaseDto;
import com.hcl.IngTradingApp.dto.PurchaseResponse;



public interface ReviewPurchase {
	
	
	public PurchaseResponse purchaseOrder(PurchaseDto purchaseDto);
	public void cancelOrder(Long stockId ,Long userId);
	
}

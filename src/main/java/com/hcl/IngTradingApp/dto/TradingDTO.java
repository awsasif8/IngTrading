package com.hcl.IngTradingApp.dto;

import java.io.Serializable;

public class TradingDTO implements Serializable{
	
	private Long stockId;
	private Long userId;
	public Long getStockId() {
		return stockId;
	}
	public void setStockId(Long stockId) {
		this.stockId = stockId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	
	
	

}

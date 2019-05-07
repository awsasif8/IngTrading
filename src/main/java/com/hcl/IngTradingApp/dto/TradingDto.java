package com.hcl.IngTradingApp.dto;

import java.io.Serializable;

public class TradingDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long stockId;
	private Long userid;
	public Long getStockId() {
		return stockId;
	}
	public void setStockId(Long stockId) {
		this.stockId = stockId;
	}
	public Long getUserid() {
		return userid;
	}
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	@Override
	public String toString() {
		return "TradingDto [stockId=" + stockId + ", userid=" + userid + "]";
	}
	public TradingDto() {
	}
	
	
}

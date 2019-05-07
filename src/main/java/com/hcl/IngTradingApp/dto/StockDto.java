package com.hcl.IngTradingApp.dto;


public class StockDto {
	private Long stockId;

	private String companyName;

	private Double standardPrice;

	//private Double marketPrice;

	private Integer numberOfStocks;

	public Long getStockId() {
		return stockId;
	}

	public void setStockId(Long stockId) {
		this.stockId = stockId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Double getStandardPrice() {
		return standardPrice;
	}

	public void setStandardPrice(Double standardPrice) {
		this.standardPrice = standardPrice;
	}

//	public Double getMarketPrice() {
//		return marketPrice;
//	}
//
//	public void setMarketPrice(Double marketPrice) {
//		this.marketPrice = marketPrice;
//	}

	public Integer getNumberOfStocks() {
		return numberOfStocks;
	}

	public void setNumberOfStocks(Integer numberOfStocks) {
		this.numberOfStocks = numberOfStocks;
	}
	
	

}

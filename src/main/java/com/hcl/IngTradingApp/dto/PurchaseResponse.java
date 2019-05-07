package com.hcl.IngTradingApp.dto;

public class PurchaseResponse {
	
	private String price;
	private String fees;
	private double standardPrice;
	private double marketPrice;
	private String message;
	
	
	
	public double getStandardPrice() {
		return standardPrice;
	}
	public void setStandardPrice(double standardPrice) {
		this.standardPrice = standardPrice;
	}
	public double getMarketPrice() {
		return marketPrice;
	}
	public void setMarketPrice(double marketPrice) {
		this.marketPrice = marketPrice;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getFees() {
		return fees;
	}
	public void setFees(String fees) {
		this.fees = fees;
	}
	
	
	@Override
	public String toString() {
		return "PurchaseResponse [price=" + price + ", fees=" + fees + ", standardPrice=" + standardPrice
				+ ", marketPrice=" + marketPrice + ", message=" + message + "]";
	}
	
	
	
	

}

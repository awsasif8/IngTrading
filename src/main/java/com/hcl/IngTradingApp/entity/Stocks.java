package com.hcl.IngTradingApp.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stocks_info")
public class Stocks implements Serializable{
	
	
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long stockId;
	
	@Column(name="COMPANY_NAMAE")
    private String companyName;
	
	@Column(name="STANDARD_PRICE")
	private Double standardPrice;
	
	@Column(name="MARKET_PRICE")
	private Double marketPrice;
	
	@Column(name="NUMBER_OF_STOCKS")
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
	public Double getMarketPrice() {
		return marketPrice;
	}
	public void setMarketPrice(Double marketPrice) {
		this.marketPrice = marketPrice;
	}
	public Integer getNumberOfStocks() {
		return numberOfStocks;
	}
	public void setNumberOfStocks(Integer numberOfStocks) {
		this.numberOfStocks = numberOfStocks;
	}
	
	
	
	
	
	

}

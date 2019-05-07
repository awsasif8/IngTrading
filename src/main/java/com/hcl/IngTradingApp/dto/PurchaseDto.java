package com.hcl.IngTradingApp.dto;

import java.io.Serializable;
import java.util.Date;

public class PurchaseDto implements Serializable {
	
	
	
	private static final long serialVersionUID = 1L;

	private Long stockId;
	private Long userid;	
	private Integer volumeofstock;
	
	

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

	public Integer getVolumeofstock() {
		return volumeofstock;
	}

	public void setVolumeofstock(Integer volumeofstock) {
		this.volumeofstock = volumeofstock;
	}


	
	

}

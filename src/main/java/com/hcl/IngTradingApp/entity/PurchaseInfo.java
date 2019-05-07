package com.hcl.IngTradingApp.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="purchase_info")
public class PurchaseInfo  implements Serializable{

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long purchseId	;
	
	@Column(name="STOCK_ID")
	private Long stockId;
	
	@Column(name="USER_ID")
	private Long userid;
	
	@Column(name="VOLUME_OF_STOCKS")
	private Integer volumeofstock;
	
	@Column(name="STOCK_PURCHASE_PRICE")
	private Double stockpurchasedprice;	
	
	@Column(name="STOCK_PURCHASE_DATE")
	private Date stockpurchaseddate;
	
	@Column(name="TOTAL_PRICE")
	private Double totalprice;	
	
	@Column(name="FEES")
	private Double fees;
	
	@Column(name="CONFIRM_ORDER")
	private Character confirmOrder;
	
	public Long getPurchseId() {
		return purchseId;
	}
	public void setPurchseId(Long purchseId) {
		this.purchseId = purchseId;
	}
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
	public Double getStockpurchasedprice() {
		return stockpurchasedprice;
	}
	public void setStockpurchasedprice(Double stockpurchasedprice) {
		this.stockpurchasedprice = stockpurchasedprice;
	}
	public Date getStockpurchaseddate() {
		return stockpurchaseddate;
	}
	public void setStockpurchaseddate(Date stockpurchaseddate) {
		this.stockpurchaseddate = stockpurchaseddate;
	}
	public Double getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(Double totalprice) {
		this.totalprice = totalprice;
	}
	public Double getFees() {
		return fees;
	}
	public void setFees(Double fees) {
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "PurchaseInfo [purchseId=" + purchseId + ", stockId=" + stockId + ", userid=" + userid
				+ ", volumeofstock=" + volumeofstock + ", stockpurchasedprice=" + stockpurchasedprice
				+ ", stockpurchaseddate=" + stockpurchaseddate + ", totalprice=" + totalprice + ", fees=" + fees + "]";
	}	

	
	
	
	

	
}

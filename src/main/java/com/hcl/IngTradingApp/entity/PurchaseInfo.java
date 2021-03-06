package com.hcl.IngTradingApp.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="purchase_info")
//@NamedQuery(name="deleteCancelOrder", query = "DELETE e from PurchaseInfo e where e.stockId=:stockid and e.userid=:userid")
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
	
	@Column(name="STOCK_PURCHASE_DATE")
	private Date stockpurchasedDate;
	
	@Column(name="TOTAL_PRICE")
	private Double totalprice;	
	
	@Column(name="FEES")
	private Double fees;
	
	@Column(name="CONFIRM_ORDER")
	private Character confirmOrder;
	
	
	public Character getConfirmOrder() {
		return confirmOrder;
	}
	public void setConfirmOrder(Character confirmOrder) {
		this.confirmOrder = confirmOrder;
	}
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

	public Date getStockpurchasedDate() {
		return stockpurchasedDate;
	}
	public void setStockpurchaseddate(Date stockpurchasedDate) {
		this.stockpurchasedDate = stockpurchasedDate;
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
				+ ", volumeofstock=" + volumeofstock + ", stockpurchasedDate=" + stockpurchasedDate + ", totalprice="
				+ totalprice + ", fees=" + fees + ", confirmOrder=" + confirmOrder + "]";
	}
	
	
	
	
	

	
}

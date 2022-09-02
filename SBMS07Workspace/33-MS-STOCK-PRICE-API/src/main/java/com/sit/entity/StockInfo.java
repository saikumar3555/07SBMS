package com.sit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STOCK_INFO")
public class StockInfo {

	@Id
	private Integer stockInfoId;
	
	@Column(name = "COMP_NAME")
	private String compName;
	
	@Column(name = "STOCK_PRICE")
	private Double stockPrice;

	public Integer getStockInfoId() {
		return stockInfoId;
	}

	public void setStockInfoId(Integer stockInfoId) {
		this.stockInfoId = stockInfoId;
	}

	public String getCompName() {
		return compName;
	}

	public void setCompName(String compName) {
		this.compName = compName;
	}

	public Double getStockPrice() {
		return stockPrice;
	}

	public void setStockPrice(Double stockPrice) {
		this.stockPrice = stockPrice;
	}

	@Override
	public String toString() {
		return "StockInfo [stockInfoId=" + stockInfoId + ", compName=" + compName + ", stockPrice=" + stockPrice + "]";
	}

}

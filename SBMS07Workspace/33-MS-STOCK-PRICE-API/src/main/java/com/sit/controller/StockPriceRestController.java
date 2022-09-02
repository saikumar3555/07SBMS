package com.sit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sit.entity.StockInfo;
import com.sit.service.IStockInfoService;

@RestController
public class StockPriceRestController {

private IStockInfoService stockPriceService;

   @Autowired
	public void setStockPriceService(IStockInfoService stockPriceService) {
	this.stockPriceService = stockPriceService;
}

	@GetMapping(value = "/getStockPrice/{compName}")
	public Double getStockPriceByCompName(@PathVariable String compName) {
	          Double stockPrice =null;                              
		StockInfo stockInfo = stockPriceService.getStockPriceByCompName(compName) ;
		System.out.println("Stock Price::::::::::::::::"+stockInfo);
		if(null != stockInfo) {
			stockPrice=stockInfo.getStockPrice();
		}
		return stockPrice;
	}
	
	
}

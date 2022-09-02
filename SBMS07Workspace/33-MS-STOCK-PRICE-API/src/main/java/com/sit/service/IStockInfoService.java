package com.sit.service;

import com.sit.entity.StockInfo;

public interface IStockInfoService {

	public StockInfo getStockPriceByCompName(String compName);
}

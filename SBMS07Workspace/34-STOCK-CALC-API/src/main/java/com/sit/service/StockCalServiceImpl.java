package com.sit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sit.client.StockPriceFeignClient;

@Service
public class StockCalServiceImpl implements IStockCalcService {

	@Autowired
	private StockPriceFeignClient stockPriceFeignClient;

	@Override
	public Double getTotalStockPrice(String compName, Integer quantity) {

		Double stockPrice = stockPriceFeignClient.invokeStockPriceApi(compName);
		Double totalStockPrice = stockPrice * quantity;

		return totalStockPrice;
	}

}

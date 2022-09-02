package com.sit.service;

import org.springframework.stereotype.Service;

import com.sit.entity.StockInfo;
import com.sit.repository.IStockPriceRepository;

@Service
public class StockInfoServiceImpl implements IStockInfoService{
	
	private IStockPriceRepository stockPriceRepo;
	
   // constructor Injection
	public StockInfoServiceImpl(IStockPriceRepository stockPriceRepo) {		
		this.stockPriceRepo = stockPriceRepo;
	}


	@Override
	public StockInfo getStockPriceByCompName(String compName) {
		StockInfo  stockInfo = stockPriceRepo.findByCompName(compName);
		return stockInfo;
	}

}

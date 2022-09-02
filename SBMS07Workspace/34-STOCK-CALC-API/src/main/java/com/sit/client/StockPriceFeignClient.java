package com.sit.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "STOCK-PRICE-API")
public interface StockPriceFeignClient {
	
	@GetMapping("/getStockPrice/{compName}")///
	public Double invokeStockPriceApi(@PathVariable String compName);

}

package com.sit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sit.service.IStockCalcService;

@RestController
public class StockCalcController {
	
	@Autowired
	private IStockCalcService stockCalcService;

	@GetMapping(value = "/getTotalStockPrice/{compName}/{quantity}")
	public String getTotalStockPrice(@PathVariable String compName, @PathVariable Integer quantity)
	{
		
		Double totalStockPrice = stockCalcService.getTotalStockPrice(compName, quantity);
		
		return "Total Stock Price for <b> "+compName +" </b> for <b>"+quantity + " </b>quantities  is :: <b>" 
		+totalStockPrice+"</b>";
	}
	
	
}

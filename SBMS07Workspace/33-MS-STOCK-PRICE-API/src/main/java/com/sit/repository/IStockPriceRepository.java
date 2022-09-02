package com.sit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sit.entity.StockInfo;

@Repository
public interface IStockPriceRepository extends CrudRepository<StockInfo, Serializable>{
	
	@Query("from StockInfo where compName = :compName")
	public StockInfo findByCompName(String compName);
	
	

}

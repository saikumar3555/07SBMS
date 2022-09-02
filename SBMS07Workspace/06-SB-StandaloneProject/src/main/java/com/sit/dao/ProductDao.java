package com.sit.dao;

import java.sql.Types;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;

import com.sit.service.ProductVO;

@Repository
public class ProductDao {
			
	public JdbcTemplate template =null ;
	
	public ProductDao(JdbcTemplate template) {
		this.template=template;
	}
	
	public int insertProductDetails(ProductVO productVO) {
		int isRecordsInserted=0;
		
		 
		 Object[] params = new Object[] {productVO.getProdId(), productVO.getProdName(),productVO.getProdQuantity() };
		 
		 // define SQL types of the arguments
	        int[] types = new int[] { Types.VARCHAR, Types.VARCHAR ,Types.VARCHAR};
	     // execute insert query to insert the data
	        // return number of row / rows processed by the executed query
	        int row = template.update("insert into productsDet values(?,?,?)", params,types);
	        
		 return isRecordsInserted;
	}
	
	

}

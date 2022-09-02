package com.sit.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sit.dao.ProductDao;

@Service
public class ProductService {
	public ProductDao productDao=null;
	
	@Autowired
	public void setProductDao(ProductDao productDao) {
		this.
		productDao = productDao;
	}

	public int insertProductDetails() throws IOException {
		int isrecordsInserted=0;
		String line="";
	
		   // Reading Data from CSV File
			BufferedReader bReader=new BufferedReader(new FileReader("D:\\ProductDetails.csv"));
			
			while((line=bReader.readLine() )!=null) {
				String[] prodDetails = line.split(",");
				ProductVO product = new ProductVO();
				product.setProdId(prodDetails[0].substring(1));
				product.setProdName(prodDetails[1]);
				product.setProdQuantity((prodDetails[2].substring(0,(prodDetails[2].length()-1))));
				productDao.insertProductDetails(product);
			}
		
				
		
		return isrecordsInserted;
	}

}

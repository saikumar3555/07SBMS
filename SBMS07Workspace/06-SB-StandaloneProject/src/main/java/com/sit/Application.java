package com.sit;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sit.dao.ProductDao;
import com.sit.service.ProductService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws IOException {
		ApplicationContext context= SpringApplication.run(Application.class, args);
		ProductService prodServiceObj = context.getBean(ProductService.class);
		prodServiceObj.insertProductDetails();
		
	}

}

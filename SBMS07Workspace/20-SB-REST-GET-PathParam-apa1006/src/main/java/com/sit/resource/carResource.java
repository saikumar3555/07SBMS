package com.sit.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class carResource {
	
	
	@GetMapping(value = "getName/{cId}")
	public String getCarName(@PathVariable("cId") Integer carId) {
		String cName="";
		cName=String.valueOf(carId);
		
		return cName;
		
	}

}

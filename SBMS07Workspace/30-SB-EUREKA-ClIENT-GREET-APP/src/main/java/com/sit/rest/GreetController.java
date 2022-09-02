package com.sit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {
	
	
	@GetMapping(value = "/greet")
	public String welcomeMsg() {
		
		String msg= "Good Morning";
		return msg;
	}

}

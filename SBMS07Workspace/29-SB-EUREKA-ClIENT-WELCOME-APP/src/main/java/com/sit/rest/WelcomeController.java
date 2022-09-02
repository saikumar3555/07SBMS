package com.sit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sit.client.GreetFeignClient;

@RestController
public class WelcomeController {
	
//@Autowired
//private GreetFeignClient greetClient;
	
	@GetMapping(value = "/welcome")
	public String welcomeMsg() {
		
		String msg= "Welcome";
		
//	String greetResp=	greetClient.invokeGreetApi();
	
	
		return msg;//+ "  "+greetResp;
	}

}

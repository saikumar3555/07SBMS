package com.sit.resources;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/api")
public class WelcomeResource {

	@GetMapping("welcome")
	public String getWelcomeMsg() {
		String msg="Welcome to Restful services";
		
		return msg;
	}
	
}

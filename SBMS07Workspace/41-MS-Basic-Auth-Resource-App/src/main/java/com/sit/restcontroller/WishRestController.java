package com.sit.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WishRestController {

	@GetMapping(value = "/welcome")
	public String getMsg() {
		
		String msg="Welcome to APA............";
		return msg;
	}
}

package com.sit.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {

	
	
	@GetMapping(value = "/hello")
	public String getMsg() {
		 String msg="Hello";
		return msg;
		
	}
}

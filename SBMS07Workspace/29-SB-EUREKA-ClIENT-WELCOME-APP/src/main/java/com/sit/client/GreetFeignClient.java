package com.sit.client;

import org.springframework.web.bind.annotation.GetMapping;

//@FeignClient(name="GREET-API")
public interface GreetFeignClient {
	
	@GetMapping(value = "/greet")
	public String invokeGreetApi();

}

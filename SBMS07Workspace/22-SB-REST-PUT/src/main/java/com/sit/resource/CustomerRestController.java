package com.sit.resource;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sit.request.Customer;

@RestController
public class CustomerRestController {

	@PutMapping(value = "/update" ,		
			consumes = {"application/xml","application/json"}
			)
	public String updateCustomer(@RequestBody Customer customer) {
		String msg = "";

		System.out.print(customer);

		if (customer.getCustomerId() < 1) {
			msg = "Record updated successfully...";
		} else {
			msg = "No records avilable";
		}
		return msg;

	}

}

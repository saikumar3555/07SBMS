package com.sit.resource;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sit.request.PassengerInfo;
import com.sit.response.Ticket;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api("Train Booking Rest Controller")
public class TrainResource {
	
	
	@ApiOperation("Book Train Ticker method")
	@PostMapping(value = "/book-ticket",
			consumes = {"application/xml", "application/json"},
			produces = {"application/xml", "application/json"}
			)
	public Ticket bookTicket(@RequestBody PassengerInfo passengerInfo) {
		
		System.out.println(passengerInfo);
		//Ticket booking Logic
		Ticket ticket = new Ticket();
		ticket.setTicketNumber(1006);
		ticket.setTicketPrice(1005.99);
		return ticket;
	}

}

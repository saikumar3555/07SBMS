package com.sit.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sit.domain.Flights;
import com.sit.service.FlightService;

@RestController
public class FlightController {

	private FlightService service;
	
	
	@Autowired
	public void setService(FlightService service) {
		this.service = service;
	}



	@GetMapping(value = "/flights",
			produces= {"application/json","application/xml"}
			//consumes = {"application/json","application/xml"}
			)
	public Flights  getFlightDetails() {
		
		Flights flightDetails = service.getFlightDetails();
		return flightDetails;
	}
	
	
}

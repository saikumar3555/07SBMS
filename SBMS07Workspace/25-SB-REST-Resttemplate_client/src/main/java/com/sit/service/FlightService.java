package com.sit.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sit.domain.Flights;

@Service
public class FlightService {

	
	public Flights getFlightDetails() {
		
		
		Flights flights=null;
		RestTemplate template = new RestTemplate();
		ResponseEntity<Flights> forEntity = template
				.getForEntity("http://mu.mulesoft-training.com/essentials/united/flights/", Flights.class);
		
		 int statusCodeValue = forEntity.getStatusCodeValue();
		System.out.println(statusCodeValue);
		if(statusCodeValue==200) {
			 flights = forEntity.getBody();
		}
		
		return flights;

		
	}
	
}

package com.sit.domain;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Flights {
 private List<Flight> flights=null;

@Override
public String toString() {
	return "Flights [flights=" + flights + "]";
}

public List<Flight> getFlights() {
	return flights;
}

public void setFlights(List<Flight> flights) {
	this.flights = flights;
}
}

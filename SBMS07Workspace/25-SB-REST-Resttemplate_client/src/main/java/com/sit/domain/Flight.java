package com.sit.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Flight {


	private String code;
	private Double price;
	private String origin;
	private String destination;
	private String departureDate;
	private String airlineName;
	private String planeType;
	private Integer emptySeats;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}
	public String getAirlineName() {
		return airlineName;
	}
	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}
	public String getPlaneType() {
		return planeType;
	}
	public void setPlaneType(String planeType) {
		this.planeType = planeType;
	}
	public Integer getEmptySeats() {
		return emptySeats;
	}
	public void setEmptySeats(Integer emptySeats) {
		this.emptySeats = emptySeats;
	}
	@Override
	public String toString() {
		return "Flight [code=" + code + ", price=" + price + ", origin=" + origin + ", destination=" + destination
				+ ", departureDate=" + departureDate + ", airlineName=" + airlineName + ", planeType=" + planeType
				+ ", emptySeats=" + emptySeats + "]";
	}
	 
}

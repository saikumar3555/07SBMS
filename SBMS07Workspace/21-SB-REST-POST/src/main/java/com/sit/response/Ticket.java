package com.sit.response;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Ticket {

	private Integer ticketNumber;
	private Double ticketPrice;
	public Integer getTicketNumber() {
		return ticketNumber;
	}
	public void setTicketNumber(Integer ticketNumber) {
		this.ticketNumber = ticketNumber;
	}
	public Double getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(Double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	@Override
	public String toString() {
		return "Ticket [ticketNumber=" + ticketNumber + ", ticketPrice=" + ticketPrice + "]";
	}
	
}

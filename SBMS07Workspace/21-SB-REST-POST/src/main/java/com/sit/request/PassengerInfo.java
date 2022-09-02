package com.sit.request;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PassengerInfo {

	private String passengerName;
	private Integer passengerAge;
	private String from;
	private String to;
	private String journeyDate;
	
	@Override
	public String toString() {
		return "PassengerInfo [passengerName=" + passengerName + ", passengerAge=" + passengerAge + ", from=" + from
				+ ", to=" + to + ", journeyDate=" + journeyDate + "]";
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getJourneyDate() {
		return journeyDate;
	}
	public void setJourneyDate(String journeyDate) {
		this.journeyDate = journeyDate;
	}
	
}

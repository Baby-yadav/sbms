package com.info.main.bindings;

import java.time.LocalDate;

public class TicketRequest {
	private String Name;
	private String aadharNo;
	private String dob;
	private LocalDate  date_of_journey;
	private  String from;
	private String to;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public LocalDate getDate_of_journey() {
		return date_of_journey;
	}
	public void setDate_of_journey(LocalDate date_of_journey) {
		this.date_of_journey = date_of_journey;
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
	
	
	

}

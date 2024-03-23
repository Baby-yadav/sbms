package com.info.main.bindings;

import java.time.LocalDate;

public class Reservation {
	
	private String Name;
	private String aadharNo;
	private String dob;
	private LocalDate  date_of_journey;
	private  String from;
	private String to;
	private Integer train_No;
	private Integer pnr_no;
	private String status;
	
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
	public Integer getTrain_No() {
		return train_No;
	}
	public void setTrain_No(Integer train_No) {
		this.train_No = train_No;
	}
	public Integer getPnr_no() {
		return pnr_no;
	}
	public void setPnr_no(Integer pnr_no) {
		this.pnr_no = pnr_no;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
}

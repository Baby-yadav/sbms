package com.info.main.service;

import java.util.Collection;

import com.info.main.bindings.Reservation;
import com.info.main.bindings.TicketRequest;

public interface PassangerService {
	
	
	public Reservation bookTicket(TicketRequest ticketReq);
	public Collection<Reservation> getAllTicket();
	
	

}

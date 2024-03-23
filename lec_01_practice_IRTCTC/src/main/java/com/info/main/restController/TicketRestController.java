package com.info.main.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.info.main.bindings.Reservation;
import com.info.main.bindings.TicketRequest;
import com.info.main.service.PassangerService;

@RestController
public class TicketRestController {
	
	@Autowired
	private PassangerService service;
	
	
	@PostMapping("/bookTicket")
	public ResponseEntity<Reservation> bookTicket(TicketRequest req){
		
		Reservation reserve=service.bookTicket(req);
		
		
		return new ResponseEntity<Reservation>(reserve, HttpStatus.OK);
		
	}
	
	
	

}

package com.info.main.service;

import java.util.Collection;
import java.util.Random;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.info.main.bindings.Reservation;
import com.info.main.bindings.TicketRequest;

@Service
public class PassangerServiceImpl implements PassangerService{

	@Override
	public Reservation bookTicket(TicketRequest ticketReq) {
		
		Reservation r= new Reservation();
		Random ran= new Random();
		int result=ran.nextInt(900000);
		r.setTrain_No(result);
		r.setStatus("Confirmed");
		
		int pnr=ran.nextInt(1000);
		 r.setPnr_no(pnr);
		// TODO Auto-generated method stub
		BeanUtils.copyProperties(ticketReq, r);
		return r;
	}

	@Override
	public Collection<Reservation> getAllTicket() {
		// TODO Auto-generated method stub
		return null;
	}

	

}

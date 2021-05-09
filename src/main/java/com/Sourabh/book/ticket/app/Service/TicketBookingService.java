package com.Sourabh.book.ticket.app.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sourabh.book.ticket.app.dao.TicketBookingDao;
import com.Sourabh.book.ticket.app.entity.Ticket;

@Service
public class TicketBookingService {

	@Autowired
	private TicketBookingDao ticketBookingDao;
	
	public Ticket createTicket(Ticket ticket) {	
		return ticketBookingDao.save(ticket);
	}

	
/*
 * public Ticket getTicketById(Integer ticketId) { return
 * ticketBookingDao.(ticketId); }
 * 
 * }
 */
}
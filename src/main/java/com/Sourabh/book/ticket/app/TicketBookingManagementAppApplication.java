package com.Sourabh.book.ticket.app;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.Sourabh.book.ticket.app.Service.TicketBookingService;
import com.Sourabh.book.ticket.app.entity.Ticket;

@SpringBootApplication
public class TicketBookingManagementAppApplication {

	public static void main(String[] args) {
ConfigurableApplicationContext applicationContext=SpringApplication.run(TicketBookingManagementAppApplication.class, args);
	
	
	TicketBookingService ticketBookingService=
applicationContext.getBean("ticketBookingService", TicketBookingService.class);
	
	Ticket ticket=new Ticket();
	
	ticket.setPassengerName("Sourabh Gupta");
	ticket.setSourceStation("Delhi");
	ticket.setDestStation("Mumbai");
	ticket.setBookingDate(new Date());
	ticket.setEmail("sourabh@gmail.com");
	
	ticketBookingService.createTicket(ticket);
	
	
	}

}

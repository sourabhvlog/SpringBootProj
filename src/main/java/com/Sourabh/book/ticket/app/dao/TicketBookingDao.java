package com.Sourabh.book.ticket.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Sourabh.book.ticket.app.entity.Ticket;

@Repository
public interface TicketBookingDao extends CrudRepository<Ticket,Integer>{

}

package com.harsh.TicketingSystem.dao;

import com.harsh.TicketingSystem.model.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketDAO extends CrudRepository<Ticket,Integer> {
}

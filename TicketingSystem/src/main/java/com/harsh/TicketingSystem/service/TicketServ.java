package com.harsh.TicketingSystem.service;

import com.harsh.TicketingSystem.model.Ticket;

import java.util.List;
import java.util.Optional;

public interface TicketServ {
    String bookTic(List<Ticket> tickets);
    List<Ticket> getTickets();
    Optional<Ticket> getTicketById(Integer id);

}

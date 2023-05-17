package com.harsh.TicketingSystem.service;

import com.harsh.TicketingSystem.dao.TicketDAO;
import com.harsh.TicketingSystem.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;


@Component
public class TicketServImpl implements TicketServ {
    @Autowired
    private TicketDAO td;
    @Override
    public String bookTic(List<Ticket> tickets) {
        td.saveAll(tickets);
        return "Ticket Booked Successfuly";
    }

    @Override
    public List<Ticket> getTickets() {
        return (List<Ticket>) td.findAll();
    }

    @Override
    public Optional<Ticket> getTicketById(Integer id) {
        return td.findById(id);
    }
    public List<Ticket> updateTicket() {
        return (List<Ticket>) td.;
    }
}

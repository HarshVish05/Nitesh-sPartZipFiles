package com.harsh.TicketingSystem.controler;

import com.harsh.TicketingSystem.model.Ticket;
import com.harsh.TicketingSystem.service.TicketServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TicketController {

    @Autowired
    private TicketServ ticketService;

    @PostMapping("/bookTickets")
    public String bookTickets(@RequestBody List<Ticket> tickets) {
        return ticketService.bookTic(tickets);
    }


    @GetMapping("/getTickets")
    public List<Ticket> bookTickets() {
        return ticketService.getTickets();
    }


    @GetMapping("/getTicket")
    public Optional<Ticket> bookTickets(@RequestParam("ticketId") Integer ticketId) {
        return ticketService.getTicketById(ticketId);
    }

    @PutMapping("/updatePrice")
    public List<Ticket> updateTickets(){

    }

}

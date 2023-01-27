package ru.otus.springboot.lesson7.dao;


import ru.otus.springboot.lesson7.model.Ticket;

public interface TicketDao {

    Ticket getTicket() throws TicketNotFoundException;

}

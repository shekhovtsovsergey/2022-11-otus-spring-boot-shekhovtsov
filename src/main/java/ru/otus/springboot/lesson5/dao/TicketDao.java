package ru.otus.springboot.lesson5.dao;


import ru.otus.springboot.lesson5.model.Ticket;

public interface TicketDao {

    Ticket getTicket() throws TicketNotFoundException;

}

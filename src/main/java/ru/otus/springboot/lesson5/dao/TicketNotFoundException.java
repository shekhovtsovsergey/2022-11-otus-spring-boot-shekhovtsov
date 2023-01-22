package ru.otus.springboot.lesson5.dao;

public class TicketNotFoundException extends RuntimeException {

    public TicketNotFoundException(String message, Exception e) {
        super(message,e);
    }
}

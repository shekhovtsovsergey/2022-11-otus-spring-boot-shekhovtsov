package ru.otus.springboot.lesson7.dao;

public class TicketNotFoundException extends RuntimeException {

    public TicketNotFoundException(String message, Exception e) {
        super(message,e);
    }
}

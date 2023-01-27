package ru.otus.springboot.lesson7.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Getter
@RequiredArgsConstructor

public class Ticket {

    private final List<Question> questions;

}

package ru.otus.springboot.lesson7.service.exam;


import ru.otus.springboot.lesson7.model.Answer;
import ru.otus.springboot.lesson7.model.Ticket;

public interface ExamService {

    boolean getExamResult(Ticket ticket, Answer answer);

}

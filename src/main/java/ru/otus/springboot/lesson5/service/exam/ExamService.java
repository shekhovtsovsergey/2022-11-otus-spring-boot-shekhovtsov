package ru.otus.springboot.lesson5.service.exam;


import ru.otus.springboot.lesson5.model.Answer;
import ru.otus.springboot.lesson5.model.Ticket;

public interface ExamService {

    boolean getExamResult(Ticket ticket, Answer answer);

}

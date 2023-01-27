package ru.otus.springboot.lesson7.service.runner;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.otus.springboot.lesson7.model.Answer;
import ru.otus.springboot.lesson7.model.Student;
import ru.otus.springboot.lesson7.model.Ticket;
import ru.otus.springboot.lesson7.service.exam.ExamService;
import ru.otus.springboot.lesson7.service.ioService.IOService;
import ru.otus.springboot.lesson7.service.student.StudentService;
import ru.otus.springboot.lesson7.service.ticketService.TicketService;

@Component
@RequiredArgsConstructor
public class RunnerServiceImpl implements RunnerService {


    private final TicketService ticketService;
    private final ExamService examService;
    private final StudentService studentService;
    private final IOService ioService;



    @Override
    public void run() {
        Student student = studentService.getStudent();
        Ticket ticket = ticketService.getTicket();
        boolean examResult = examService.getExamResult(ticket, getAnswers(ticket));
        ioService.printLocalizedString(examResult ? "examination.done" : "examination.fail", student.getFirstName());
    }


    private Answer getAnswers(Ticket ticket) {
        Answer answer = new Answer();
        ticket.getQuestions().forEach(question -> {
            ioService.outputString(String.valueOf(question));
            answer.putAnswer(question, ioService.inputString());
        });
        return answer;
    }

}

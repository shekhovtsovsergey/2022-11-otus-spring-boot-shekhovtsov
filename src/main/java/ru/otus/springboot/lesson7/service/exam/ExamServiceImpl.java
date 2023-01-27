package ru.otus.springboot.lesson7.service.exam;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.otus.springboot.lesson7.config.TicketConfig;
import ru.otus.springboot.lesson7.model.Answer;
import ru.otus.springboot.lesson7.model.Ticket;

@RequiredArgsConstructor
@Service
public class ExamServiceImpl implements ExamService {

    private final TicketConfig ticketConfig;

    @Override
    public boolean getExamResult(Ticket ticket, Answer answer) {
        long countCorrectStudentAnswers = ticket.getQuestions().stream()
                .filter(q -> answer.getAnswer(q).equalsIgnoreCase(q.getCorrectAnswer()))
                .count();
        return countCorrectStudentAnswers >= ticketConfig.getCorrect();
    }

}

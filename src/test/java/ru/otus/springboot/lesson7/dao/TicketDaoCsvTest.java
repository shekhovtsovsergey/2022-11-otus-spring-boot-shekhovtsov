package ru.otus.springboot.lesson7.dao;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.function.Executable;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.otus.springboot.lesson7.config.TicketConfig;
import ru.otus.springboot.lesson7.model.Ticket;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.ArrayList;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@DisplayName("класс TicketDaoCsv")
class TicketDaoCsvTest {


    @Mock
    private TicketConfig ticketConfig;
    private TicketDao ticketDao;


    @Test
    @DisplayName("корректно возвращает Ticket")
    void getTicket() {
        when(ticketConfig.getResourceName()).thenReturn("/questions_en.csv");
        ticketDao = new TicketDaoCsv(ticketConfig);
        Ticket ticket = ticketDao.getTicket();
        Collection<Executable> executables = new ArrayList<>();
        executables.add(() -> assertThat(ticket.getQuestions()).hasSize(5));
    }



    @Test
    @DisplayName("бросает TicketNotFoundException если отсутствует")
    public void getTicketTicketNotFoundException() {
        when(ticketConfig.getResourceName()).thenReturn("fakeQuestions.csv");
        ticketDao = new TicketDaoCsv(ticketConfig);
        assertThrows(TicketNotFoundException.class, () -> ticketDao.getTicket());
    }




}
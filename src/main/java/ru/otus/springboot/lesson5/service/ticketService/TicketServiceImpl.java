package ru.otus.springboot.lesson5.service.ticketService;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.otus.springboot.lesson5.dao.TicketDao;
import ru.otus.springboot.lesson5.model.Ticket;

@RequiredArgsConstructor
@Service
public class TicketServiceImpl implements TicketService {

    private final TicketDao ticketDao;

    @Override
    public Ticket getTicket() {
        return ticketDao.getTicket();
    }

}

package ru.otus.springboot.lesson5.service.student;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.otus.springboot.lesson5.model.Student;
import ru.otus.springboot.lesson5.service.ioService.IOService;

@RequiredArgsConstructor
@Service
public class StudentServiceImpl implements StudentService {

    private final IOService ioService;

    @Override
    public Student getStudent() {
        ioService.printLocalizedString("examination.hello");
        String firstName = ioService.inputString();
        return new Student(firstName);
    }

}

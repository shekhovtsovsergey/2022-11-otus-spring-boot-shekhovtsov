package ru.otus.springboot.lesson5.service.ioService;

public interface IOService {

    void outputString(String str);

    String inputString();

    void printLocalizedString(String code, Object... args);

}

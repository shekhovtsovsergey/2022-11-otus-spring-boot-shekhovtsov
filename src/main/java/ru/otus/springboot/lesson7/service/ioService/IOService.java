package ru.otus.springboot.lesson7.service.ioService;

public interface IOService {

    void outputString(String str);

    String inputString();

    void printLocalizedString(String code, Object... args);

}

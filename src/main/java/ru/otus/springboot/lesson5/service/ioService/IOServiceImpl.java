package ru.otus.springboot.lesson5.service.ioService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import ru.otus.springboot.lesson5.service.local.LocalizeService;

import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

@Service
public class IOServiceImpl implements IOService {

    private final PrintStream printStream;
    private final InputStream inputStream;
    private Scanner scanner;
    private final LocalizeService localizeService;

    public IOServiceImpl(@Value("#{ T(java.lang.System).out}") PrintStream printStream,
                         @Value("#{ T(java.lang.System).in}") InputStream inputStream, LocalizeService localizeService) {
        this.printStream = printStream;
        this.inputStream = inputStream;
        this.localizeService = localizeService;
    }

    @Override
    public void outputString(String str) {
        printStream.println(str.toString());

    }

    @Override
    public String inputString() {
        return getScanner().next();
    }


    @Override
    public void printLocalizedString(String code, Object... args) {
        this.outputString(localizeService.localized(code, args));
    }

    private Scanner getScanner() {
        if (scanner == null) {
            scanner = new Scanner(inputStream);
        }
        return scanner;
    }


}

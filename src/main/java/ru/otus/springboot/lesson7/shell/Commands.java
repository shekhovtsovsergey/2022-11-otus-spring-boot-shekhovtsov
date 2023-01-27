package ru.otus.springboot.lesson7.shell;


import lombok.RequiredArgsConstructor;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import ru.otus.springboot.lesson7.service.runner.RunnerService;

@RequiredArgsConstructor
@ShellComponent
public class Commands {

    private final RunnerService runnerService;

    @ShellMethod(value = "For exam run", key = {"r", "run"})
    public void run() {
        runnerService.run();
    }


}

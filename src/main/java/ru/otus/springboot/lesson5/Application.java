package ru.otus.springboot.lesson5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import ru.otus.springboot.lesson5.config.AppConfig;
import ru.otus.springboot.lesson5.config.TicketConfig;
import ru.otus.springboot.lesson5.service.runner.RunnerServiceImpl;

@EnableConfigurationProperties({TicketConfig.class, AppConfig.class})
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		try {
			ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
			RunnerServiceImpl runnerService = context.getBean(RunnerServiceImpl.class);
			runnerService.run();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

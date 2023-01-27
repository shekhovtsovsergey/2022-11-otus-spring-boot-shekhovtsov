package ru.otus.springboot.lesson7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import ru.otus.springboot.lesson7.config.AppConfig;
import ru.otus.springboot.lesson7.config.TicketConfig;

@EnableConfigurationProperties({TicketConfig.class, AppConfig.class})
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		try {
			SpringApplication.run(Application.class, args);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

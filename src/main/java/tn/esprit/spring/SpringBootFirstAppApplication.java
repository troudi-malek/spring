package tn.esprit.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBootFirstAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFirstAppApplication.class, args);
	}

}

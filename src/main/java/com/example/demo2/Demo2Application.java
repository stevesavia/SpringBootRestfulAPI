package com.example.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Demo2Application {

	public static void main(String[] args) {
		System.out.println("\n\n\n=============================== DEMO 2");
		SpringApplication.run(Demo2Application.class, args);
	}
}

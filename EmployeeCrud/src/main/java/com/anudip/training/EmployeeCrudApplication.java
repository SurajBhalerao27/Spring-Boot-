package com.anudip.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.anudip.training")
public class EmployeeCrudApplication {
	public static void main(String[] args) {
		SpringApplication.run(EmployeeCrudApplication.class, args);
		System.out.println("Project Running Perfectly !!!!");
	}
}

package com.anudip.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.anudip.springdemo")
public class AppConfig {
	@Bean
	public Engine engine() {
		return new Engine();
	}

	@Bean
	public Car car() {
		return new Car();
	}
}

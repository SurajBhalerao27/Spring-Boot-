package com.anudip.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Engine engine = context.getBean(Engine.class);
		engine.setEngineType("V8 Engine");

		Car car = context.getBean(Car.class);
		car.setCarName("Baverian Motar Work");

		System.out.println("Car: " + car.getCarName() + "\nEngine: " + engine.getEngineType());
	}
}

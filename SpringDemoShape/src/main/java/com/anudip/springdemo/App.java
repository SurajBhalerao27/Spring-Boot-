package com.anudip.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Performer performer = (Performer) context.getBean("modern");
//		Performer performer1 = (Performer) context.getBean("modern");

		performer.perform();
//		performer1.perform();
	}
}

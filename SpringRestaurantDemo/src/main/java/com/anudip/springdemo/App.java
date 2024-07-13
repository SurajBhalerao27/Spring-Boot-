package com.anudip.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world! Spring Framwork module Spring core- Ioc AOP Web data access
 *
 * core container intefaces implemeted classes BeanFactory extends
 * XmlBeanFactory ApplicationContext ClassPathXmlApplicationContext
 *
 * inteface ApplicationContext extends BeanFactory
 *
 * Configuratopm SessionFactory Session
 *
 *
 *
 */
public class App {
	public static void main(String[] args) {
		// this interface will get a bean for a application from a spring container
		ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");

		Restaurant res = (Restaurant) context.getBean("rest");
		res.greetMessage();
		res.prepareDrink();

	}
}

package com.spring.First;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/spring/First/kiran.xml");
		Employee e1 = (Employee) applicationContext.getBean("emp2");
		e1.show();

	}
}

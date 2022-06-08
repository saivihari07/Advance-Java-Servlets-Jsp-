package com.spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.First.Employee;

public class Test {

	public static void main(String[] args) {

		ApplicationContext apc = new ClassPathXmlApplicationContext("com/spring1/New.xml");
		Empolyee emp = apc.getBean("emp",Empolyee.class);
		System.out.println(emp);
		
		
	}

}

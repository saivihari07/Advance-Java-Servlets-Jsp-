package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {

	public static void main(String[] args) {

		ApplicationContext apc = new ClassPathXmlApplicationContext("config.xml");
		JdbcTemplate template= apc.getBean("Empolyee" , JdbcTemplate.class);
		
		String query="insert into Empolyee(id,name,city), values(? ? ?)";
		
		int result =template.update(query,2,"Jai","chennai");
		System.out.println("No.of rows "+result);
	}

}

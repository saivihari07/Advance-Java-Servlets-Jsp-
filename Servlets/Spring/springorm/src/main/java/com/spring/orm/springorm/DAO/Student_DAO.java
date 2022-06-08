package com.spring.orm.springorm.DAO;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.springorm.entities.Student;

public class Student_DAO {
	
	private HibernateTemplate hibernatetemplate;
	
	public int insert(Student student) {
		
		this.hibernatetemplate.save(student);
		return 1;
		
	}

}

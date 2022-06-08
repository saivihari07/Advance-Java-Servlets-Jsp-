package com.hibernate.first.HibernateFistPrg;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       //create configuration
    	Configuration config = new Configuration();
    	config.configure("com/hibernate/first/HibernateFistPrg/hibernate.cfg.xml");
    	//create session factory
    	SessionFactory sessionFactory = config.buildSessionFactory();
    	//intialize the session object
    	Session session =sessionFactory.openSession();
    	Transaction t = session.getTransaction();   
    	Student std = new Student();
//    	std.setId(1);
    	std.setName("nagraj");
    	std.setSubject("science");
    	std.setMarks(80);
    	
    	session.save(std);
    	t.commit();
    	session.close();
    	System.out.println("student details are saved..");
    }
}

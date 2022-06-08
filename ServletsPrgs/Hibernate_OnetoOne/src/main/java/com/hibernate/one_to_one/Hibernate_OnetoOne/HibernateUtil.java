package com.hibernate.one_to_one.Hibernate_OnetoOne;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
 
public class HibernateUtil {
    private static final SessionFactory sessionFactory = buildSessionFactory();
 
    private static SessionFactory buildSessionFactory() {
        try {
            
            return new Configuration().configure("com/hibernate/one_to_one/Hibernate_OnetoOne/hibernate.cfg.xml").buildSessionFactory();
        } catch (Exception e) {
           
            System.err.println("SessionFactory creation failed." + e);
            throw new ExceptionInInitializerError(e);
        }
    }
 
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
   
    public static void shutdown() {
        
        getSessionFactory().close();
    }
 
}
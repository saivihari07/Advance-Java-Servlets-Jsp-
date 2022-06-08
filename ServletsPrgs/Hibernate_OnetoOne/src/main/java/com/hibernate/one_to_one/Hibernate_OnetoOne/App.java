package com.hibernate.one_to_one.Hibernate_OnetoOne;

import java.util.Calendar;
import java.util.Date;
 
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
 
import com.hibernate.one_to_one.Hibernate_OnetoOne.Applicant;
import com.hibernate.one_to_one.Hibernate_OnetoOne.Passport;
import com.hibernate.one_to_one.Hibernate_OnetoOne.HibernateUtil;
 
public class App {
    public static void main(String[] args) {
        // Get session factory using Hibernate Util class
        SessionFactory sf = HibernateUtil.getSessionFactory();
        // Get session from Session factory
        Session session = sf.openSession();
 
        // Begin transaction
        Transaction t = session.beginTransaction();
       
        
        Applicant applicant = new Applicant();
        applicant.setName("SaiVihari");
        applicant.setAge(24);
        applicant.setCity("India");
 
        
        Passport passport = new Passport();
        passport.setPassportNumber("ABCDE1111Z");
        passport.setIssuedDate(new Date());
        Calendar date = Calendar.getInstance();
        date.setTime(new Date());
        date.add(Calendar.YEAR, 10);
        passport.setExpiryDate(date.getTime());
 
        applicant.setPassport(passport);
        passport.setApplicant(applicant);
        session.persist(applicant);
 
        
        t.commit();
        session.close();
        System.out.println("successfully persisted Applicant details");
    }
 
}
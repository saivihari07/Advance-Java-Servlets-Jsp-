package com.hibernate.one_to_many.Hibernate_OnetoMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
       Configuration cfg = new Configuration();
       cfg.configure("com/hibernate/one_to_many/Hibernate_OnetoMany/hibernate.cfg.xml");
       
       SessionFactory sft = cfg.buildSessionFactory();
       
       Session session = sft.openSession();
       
       Transaction tr = session.beginTransaction();
       
       //creating category object
       Category category = new Category("Computer");
       
       Product pc = new Product("DELL PC", "Quad-core PC", 1200, category);
        
       Product laptop = new Product("MacBook", "Apple High-end laptop", 2100, category);
        
       Product phone = new Product("iPhone 5", "Apple Best-selling smartphone", 499, category);
        
       Product tablet = new Product("iPad 3", "Apple Best-selling tablet", 1099, category);
        
       List<Product> products = new ArrayList<Product>();
       products.add(pc);
       products.add(laptop);
       products.add(phone);
       products.add(tablet);
        
       category.setProducts(products);
        
       session.save(category);
        
       session.getTransaction().commit();
       session.close();       
       
    }
}

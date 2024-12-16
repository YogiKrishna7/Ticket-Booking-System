package com.ticketbooking.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class TestMain {
    public static void main(String[] args) {
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

        SessionFactory factory = meta.getSessionFactoryBuilder().build();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();

        User u1 = new User();
        u1.setFirstName("Yogi");
        u1.setLastName("Ambati");
        u1.setPhno("9866709807");
        u1.setEmail("a.yogendra@65gmail.com");
        u1.setAddress("Ram nagar market");
        u1.setUserName("yogi");
        u1.setPassword("somePassword"); 

        session.save(u1);
        t.commit();
        System.out.println("successfully saved");
        
        factory.close();
        session.close();
    }
}


package com.test.hmb;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.ticketbooking.app.User;

public class ORMTest {
    public static void main(String[] args) {
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

        SessionFactory factory = meta.getSessionFactoryBuilder().build();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();

        User u1 = new User();
        u1.setUserId(1);
        u1.setName("Yogendra");
        u1.setPhno("9866709807");
        u1.setEmail("a.yogendra65@gmail.com");
        u1.setAddress("Ram nagar");
        u1.setUserName("yogi7");
        u1.setPassword("some_password"); 
        u1.setCreatedBy("Yogi");
        
        
        

        session.save(u1);
        t.commit();
        System.out.println("successfully saved");
        factory.close();
        session.close();

    }
}
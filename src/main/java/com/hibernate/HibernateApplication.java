package com.hibernate;


import com.hibernate.demo.Book;
import com.hibernate.demo.HibernateUtil;
import com.hibernate.demo.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibernateApplication {

    public static void main(String[] args) {

        //Book book = new Book("Lets Learn Java","Reshma");
        Person person = new Person("002","Juana","Lopez");


        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        //session.save(book);
        session.save(person);
        tx.commit();
        session.close();
        HibernateUtil.closeSessionFactory();

        System.out.println("Book record saved successfully");
        SpringApplication.run(HibernateApplication.class, args);

    }

}

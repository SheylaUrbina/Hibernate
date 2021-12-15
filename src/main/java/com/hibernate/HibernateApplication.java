package com.hibernate;


import com.hibernate.demo.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibernateApplication {

    public static void main(String[] args) {

        Book book = new Book();
        book.setBookName("hola");
        book.setBookAuthor("pedro");

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(book);
        tx.commit();
        session.close();
        sessionFactory.close();

        SpringApplication.run(HibernateApplication.class, args);
    }

}

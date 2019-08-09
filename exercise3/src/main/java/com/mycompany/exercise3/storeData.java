package com.mycompany.exercise3;

import java.util.*;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.SQLQuery;
import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.cfg.Configuration;

public class storeData {

    private static SessionFactory factory;

    public static void main(String[] args) {
        try {
            factory = new Configuration().addAnnotatedClass(helloWord.class).configure().buildSessionFactory();
            System.out.println("\n\ncom");
            storeData sd = new storeData();
            sd.addDescription("ROOT", "ROOT", "ROOT");
        } catch (Throwable ex) {
            //throw new ExceptionInInitializerError(ex);
        }

    }

    public void addDescription(String name, String email, String phone) {
        Session session = factory.openSession();
        session.beginTransaction();
        try {
            helloWord hWord = new helloWord(name, email, phone);
            System.out.println("\n\n\ndfdsf");
            session.saveOrUpdate(hWord);
            System.out.println("\n\n\ndfdsf");

            session.getTransaction().commit();
        } catch (HibernateException e) {

            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}

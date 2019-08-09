package com.mycompany.hibernateexample1;

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
            factory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex);
        }

        storeData sd = new storeData();

        sd.addDescription("Bhavin");
        Session session = factory.openSession();
        Transaction tx = null;
        //  Integer employeeID = null;

        try {
            tx = session.beginTransaction();
            String sql = "SELECT description FROM HelloWord where id=1";
            SQLQuery query = session.createSQLQuery(sql);
            query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
            List data = query.list();

            for (Object object : data) {
                Map row = (Map) object;
                System.out.println("Description " + row.get("description"));

            }
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }

    }

    public void addDescription(String des) {
        Session session = factory.openSession();
        Transaction tx = null;
        //Integer ID = null;

        try {
            tx = session.beginTransaction();
            helloWord hWord = new helloWord(des,1);
            session.save(hWord);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }

    }
}

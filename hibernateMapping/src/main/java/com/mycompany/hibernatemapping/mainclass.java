package com.mycompany.hibernatemapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 *
 * @author bhavin
 */
public class mainclass {

    public static void main(String[] args) {
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
        SessionFactory factory = meta.getSessionFactoryBuilder().build();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();
        address add = new address("str1", "str2", "amreli", "guj", "india");
        education edu = new education("temp", "remp", 2019, "guj");
        student stud = new student(add, edu, "bhavin", "vaghasiya", "rasikbhai", "mr", "kumar", "bhavin@gmail.com", "9574904148");
        session.save(stud);
        t.commit();
        session.close();

    }
}

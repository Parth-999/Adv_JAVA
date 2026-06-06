package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.*;



public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction tr = session.beginTransaction();
		
		Address addr = new Address(111,"Kothrud","Pune","Maharashtra");
		Address addr2 = new Address(333,"Yeravda","Pune","Maharashtra");
		
		Student s = new Student(11,"Prathames","66666",addr);
		Student s2 = new Student(33,"Shreyas","99999",addr2);
		
		session.persist(addr);
		session.persist(addr2);
		session.persist(s);
		session.persist(s2);
		
		tr.commit();
		session.close();
		Session session2 = sf.openSession();
		Transaction tr2 = session2.beginTransaction();
		Student s3 = session2.find(Student.class, 11);
		System.out.println(s3);
		tr2.commit();
		session2.close();
		sf.close();

	}

}

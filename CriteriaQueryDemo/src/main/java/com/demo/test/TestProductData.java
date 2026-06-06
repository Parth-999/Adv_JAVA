package com.demo.test;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.*;

public class TestProductData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		Product p1 = new Product(100,"Mobile",200.10,20,LocalDate.of(2026, 05, 02));
		Product p2 = new Product(101,"TV",650.20,5,LocalDate.now());
		Product p3 = new Product(102,"Tab",320.30,15,LocalDate.of(2026, 05, 02));
		session.persist(p1);
		session.persist(p2);
		session.persist(p3);
		tr.commit();
		session.close();
		sf.close();

	}

}

package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.*;

public class TestInheritanceSingleTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		Employee emp = new Employee(1,"Pranav","789",456123,10);
		Customer c = new Customer(99,"Sanket","123","Pune","Silver");
		session.persist(emp);
		session.persist(c);
		tr.commit();
		session.close();
		sf.close();

	}

}

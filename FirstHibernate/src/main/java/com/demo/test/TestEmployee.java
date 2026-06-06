package com.demo.test;

import java.time.LocalDate;
import com.demo.model.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		Employee e = new Employee("Sanket",2000,LocalDate.now());
		Employee e2 = new Employee("Atharva",5000,LocalDate.now());
		
		session.persist(e);
		session.persist(e2);
		
		tr.commit();
		session.close();
		sf.close();
	}

}

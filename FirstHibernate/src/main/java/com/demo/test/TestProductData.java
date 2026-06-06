package com.demo.test;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.*;

import com.demo.model.*;

public class TestProductData {

	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction tr = session.beginTransaction();
		
		MyProduct pd = new MyProduct(1,"Iphone",10);
		MyProduct pd1 = new MyProduct(2,"TV",5);
		
		session.persist(pd);
		session.persist(pd1);
		
		tr.commit();
		session.close();
		sf.close();
	}

}

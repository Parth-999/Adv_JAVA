package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.MyUser;



public class TestFindAndLoad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		
		Transaction tr = session.beginTransaction();
		
		System.out.println("Before Find");
		
		MyUser u11 = session.find(MyUser.class, 12);
		
		System.out.println("After Find");
		if(u11!=null)
		{
			System.out.println(u11);
		}else
		{
			System.out.println("not found");
			
		}
		tr.commit();
		session.close();
		sf.close();

	}

}

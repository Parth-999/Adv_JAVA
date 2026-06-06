package com.demo.test;

import com.demo.model.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestMyUserDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create connection with database by using hibernate.cfg.xml
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		//if your file name is other than hibernate.cfg.xml the add it in the cofiguration method
		//SessionFactory sf=new Configuration().configure("myconfig.xml").buildSessionFactory();
		//u1 and u2 are in transient state
		MyUser u1=new MyUser(11,"Sangeeta","2222222","dd@gmail.com");
		MyUser u2=new MyUser(12,"Kedar","333333","aa@gmail.com");
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		//session.save(u1);
		//u1 and u2 are in persistent state
		session.persist(u1);
		session.persist(u2);
		tr.commit();
		session.close();
		//retireve the data
		Session session1=sf.openSession();
		Transaction tr1=session1.beginTransaction();
		//MyUSer u11=session1.get(MyUSer.class, 2);
		System.out.println("before find");
		//early binding , egar fetchtype
		MyUser u11=session1.find(MyUser.class, 12);
		System.out.println("after  find");
		if(u11!=null)
		        System.out.println(u11);
		else
			    System.out.println("not found");
		tr1.commit();
		session1.close();
		sf.close();

	}

}

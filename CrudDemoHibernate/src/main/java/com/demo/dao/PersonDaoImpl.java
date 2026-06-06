package com.demo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.demo.model.Address;
import com.demo.model.Person;



public class PersonDaoImpl implements PersonDao {
	
	private SessionFactory sf;
	{
		sf=HibernateUtil.getMySessionFactory();
	}

	@Override
	public boolean savePerson(Person p) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.persist(p);
		tr.commit();
		session.close();
		
		return true;
	}

	@Override
	public Person findbyId(int id) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Person p=session.find(Person.class, id);
		tr.commit();
		session.close();
		
		return p;
	}

	@Override
	public boolean modifyPerson(int id, String n, String mob) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Person p = session.find(Person.class, id);
		if(p!=null)
		{
			p.setMobile(mob);
			p.setPname(n);
			session.merge(p);
		}
		tr.commit();
		session.close();
		return p!=null;
	}

	@Override
	public boolean deletePersonById(int pid) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Person p = session.find(Person.class, pid);
		if(p!=null)
		{
			session.remove(p);
		}
		tr.commit();
		session.close();
		return p!=null;
	}

	@Override
	public boolean addNewAddress(Address a) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.persist(a);
		tr.commit();
		session.close();
		return true;
	}

	@Override
	public Address findAddressById(int aid) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Address a = session.find(Address.class, aid);
		tr.commit();
		session.close();
		return a;
	}

	@Override
	public boolean updateAddressById(int aid, String ct, String st, String str) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Address a = session.find(Address.class, aid);
		if(a!=null)
		{
			a.setCity(ct);
			a.setState(st);
			a.setStreet(str);
			session.merge(a);
		}
		tr.commit();
		session.close();
		return a!=null;
	}

	@Override
	public boolean removeAddressById(int aid) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Address a = session.find(Address.class, aid);
		if(a!=null)
		{
			session.remove(a);
		}
		tr.commit();
		session.close();
		return a!=null;
	}

	@Override
	public boolean attachAddressToPerson(int pid, int aid) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Person p = session.find(Person.class, pid);
		boolean status = false;
		
		if(p!=null)
		{
			Address a = session.find(Address.class, aid);
			if(a!=null)
			{
				p.getAddrset().add(a);
				session.merge(p);
				status=true;
			}
		}
		tr.commit();
		session.close();
		return status;
	}

	@Override
	public boolean deleteAddressFromPerson(int pid, int aid) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Person p = session.find(Person.class, pid);
		boolean status = false;
		if(p!=null)
		{
			Address a = session.find(Address.class, aid);
			if(a!=null)
			{
				p.getAddrset().remove(a);
				session.merge(p);
				status=true;
			}
		}
		tr.commit();
		session.close();
		return status;
	}

	@Override
	public List<Person> findAll() {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Query q = session.createQuery("from Person",Person.class);
		List<Person> plist = q.list();
		tr.commit();
		session.close();
		return plist;
	}

	@Override
	public List<Person> findAllByCity(String ct) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		String hql="select distinct P from Person P join fetch P.addrset a where a.city=:c";
		List<Person> plist = session.createQuery(hql,Person.class).setParameter("c", ct).list();
		tr.commit();
		session.close();
		return plist;
	}

}

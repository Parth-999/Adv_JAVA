package com.demo.service;

import java.util.*;
import com.demo.dao.PersonDao;
import com.demo.dao.PersonDaoImpl;
import com.demo.model.Address;
import com.demo.model.Person;

public class PersonServiceImpl implements PersonService {
	Scanner sc = new Scanner(System.in);
	
	private PersonDao pdao;

	public PersonServiceImpl() {
		this.pdao = new PersonDaoImpl();
	}

	@Override
	public boolean addPerson() {
		
		System.out.println("Enter  ID:");
		int pid = sc.nextInt();
		System.out.println("Enter  Name:");
		String pname = sc.next();
		System.out.println("Enter Mobile:");
		String pmob = sc.next();
		
		Set<Address> addrset = new HashSet<>();
		String ans=null;
		
		do {
			System.out.println("Enter Address ID :");
			int aid = sc.nextInt();
			System.out.println("Enter Street:");
			String sr = sc.next();
			System.out.println("Enter City:");
			String ct = sc.next();
			System.out.println("Enter State:");
			String st = sc.next();
			
			Address a = new Address(aid,sr,ct,st,null);
			addrset.add(a);
			
			System.out.println("Do you want to continue (Y/N)");
			ans = sc.next();
			
		}while(ans.equals("Y"));
		Person p = new Person(pid,pname,pmob,addrset);
		return pdao.savePerson(p);
		
	}

	@Override
	public Person displayPerson(int id) {
		return pdao.findbyId(id);
	}

	@Override
	public boolean updatePerson(int id, String n, String mob) {
		return pdao.modifyPerson(id,n,mob);
	}

	@Override
	public boolean deleteById(int pid) {
		return pdao.deletePersonById(pid);
	}

	@Override
	public boolean addAddress() {
		System.out.println("Enter Address ID :");
		int aid = sc.nextInt();
		System.out.println("Enter State:");
		String st = sc.next();
		System.out.println("Enter City:");
		String ct = sc.next();
		System.out.println("Enter Street:");
		String str = sc.next();
		
		Address a = new Address(aid,str,ct,st,null);
		return pdao.addNewAddress(a);
	}

	@Override
	public Address displayAddress(int aid) {
		return pdao.findAddressById(aid);
	}

	@Override
	public boolean updateAddress(int aid, String ct, String st, String str) {
		return pdao.updateAddressById(aid,ct,st,str);
	}

	@Override
	public boolean deleteAddressById(int aid) {
		return pdao.removeAddressById(aid);
	}

	@Override
	public boolean addAddressToPerson(int pid, int aid) {
		return pdao.attachAddressToPerson(pid,aid);
	}

	@Override
	public boolean removeAddressFromPerson(int pid, int aid) {
		return pdao.deleteAddressFromPerson(pid,aid);
	}

	@Override
	public List<Person> getAll() {
		return pdao.findAll();
	}

	@Override
	public List<Person> getAllByCity(String ct) {
		return pdao.findAllByCity(ct);
	}

	
	
	

}

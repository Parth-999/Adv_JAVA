package com.demo.dao;

import java.util.List;

import com.demo.model.Address;
import com.demo.model.Person;

public interface PersonDao {

	boolean savePerson(Person p);

	Person findbyId(int id);

	boolean modifyPerson(int id, String n, String mob);

	boolean deletePersonById(int pid);

	boolean addNewAddress(Address a);

	Address findAddressById(int aid);

	boolean updateAddressById(int aid, String ct, String st, String str);

	boolean removeAddressById(int aid);

	boolean attachAddressToPerson(int pid, int aid);

	boolean deleteAddressFromPerson(int pid, int aid);

	List<Person> findAll();

	List<Person> findAllByCity(String ct);

}

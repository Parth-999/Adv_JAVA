package com.demo.service;

import java.util.List;

import com.demo.model.Address;
import com.demo.model.Person;

public interface PersonService {

	boolean addPerson();

	Person displayPerson(int id);

	boolean updatePerson(int id, String n, String mob);

	boolean deleteById(int pid);

	boolean addAddress();

	Address displayAddress(int aid);

	boolean updateAddress(int aid, String ct, String st, String str);

	boolean deleteAddressById(int aid);

	boolean addAddressToPerson(int pid, int aid);

	boolean removeAddressFromPerson(int pid, int aid);

	List<Person> getAll();

	List<Person> getAllByCity(String ct);

}

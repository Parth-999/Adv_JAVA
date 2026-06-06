package com.demo.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity

@DiscriminatorValue("Customer")
public class Customer extends Person{
	
	private String address;
	private String type;
	
	
	public Customer() {
		super();
	}


	public Customer(int pid, String pname, String mob, String address, String type) {
		super(pid,pname,mob);
		this.address = address;
		this.type = type;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	@Override
	public String toString() {
		return "Customer [address=" + address + ", type=" + type + "]";
	}
	
	
	

}

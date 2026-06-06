package com.demo.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {

	@Value("12")
	private int aid;
	@Value("Baner")
	private String street;
	@Value("Pune")
	private String city;
	
	public Address() {
		super();
	}

	public Address(int aid, String street, String city) {
		super();
		this.aid = aid;
		this.street = street;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [aid=" + aid + ", street=" + street + ", city=" + city + "]";
	}
	
	
	
	
}

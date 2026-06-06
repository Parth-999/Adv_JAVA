package com.demo.beans;

import java.time.LocalDate;

public class Product {

	private int pdid;
	private String pdname;
	private String qty;
	private double price;
	private LocalDate mfgdate;
	
	
	public Product() {
		super();
	}


	public Product(int pdid, String pdname, String qty, double price, LocalDate mfgdate) {
		super();
		System.out.println("in product parametrised constructor");
		this.pdid = pdid;
		this.pdname = pdname;
		this.qty = qty;
		this.price = price;
		this.mfgdate = mfgdate;
	}


	public int getPdid() {
		return pdid;
	}


	public void setPdid(int pdid) {
		this.pdid = pdid;
	}


	public String getPdname() {
		return pdname;
	}


	public void setPdname(String pdname) {
		this.pdname = pdname;
	}


	public String getQty() {
		return qty;
	}


	public void setQty(String qty) {
		this.qty = qty;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public LocalDate getMfgdate() {
		return mfgdate;
	}


	public void setMfgdate(LocalDate mfgdate) {
		this.mfgdate = mfgdate;
	}
	
	
}

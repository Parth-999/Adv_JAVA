package com.demo.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="new_product")
public class Product {
	
	@Id
	private int pid;
	private String pname;
	private Double price;
	private int qty;
	private LocalDate mfgdate;
	
	
	public Product() {
		super();
	}


	public Product(int pid, String pname, Double price, int qty, LocalDate mfgdate) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.qty = qty;
		this.mfgdate = mfgdate;
	}


	public int getPid() {
		return pid;
	}


	public void setPid(int pid) {
		this.pid = pid;
	}


	public String getPname() {
		return pname;
	}


	public void setPname(String pname) {
		this.pname = pname;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}


	public int getQty() {
		return qty;
	}


	public void setQty(int qty) {
		this.qty = qty;
	}


	public LocalDate getMfgdate() {
		return mfgdate;
	}


	public void setMfgdate(LocalDate mfgdate) {
		this.mfgdate = mfgdate;
	}


	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + ", qty=" + qty + ", mfgdate=" + mfgdate
				+ "]";
	}
	
	
	
	

}

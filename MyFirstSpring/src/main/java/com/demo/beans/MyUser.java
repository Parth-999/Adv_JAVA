package com.demo.beans;

public class MyUser {
	
	private int uid;
	private String uname;
	private String mob;
	
	
	public MyUser() {
		super();
		System.out.println("Default myuser Constructor is Called");
	}


	public MyUser(int uid, String uname, String mob) {
		super();
		System.out.println("Parameterized myuser Constructor is Called");
		this.uid = uid;
		this.uname = uname;
		this.mob = mob;
	}


	public int getUid() {
		System.out.println("In myuser uid setter method");
		return uid;
	}


	public void setUid(int uid) {
		this.uid = uid;
	}


	public String getUname() {
		 System.out.println("In myuser uname setter method");
		return uname;
	}


	public void setUname(String uname) {
		this.uname = uname;
	}


	public String getMob() {
		return mob;
	}


	public void setMob(String mob) {
		 System.out.println("In myuser mobile setter method");
		this.mob = mob;
	}


	@Override
	public String toString() {
		return "MyUser [uid=" + uid + ", uname=" + uname + ", mob=" + mob + "]";
	}
	
	

}

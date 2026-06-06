package com.demo.beans;

public class MyUser {
	
	private int uid;
	private String uname;
	private String mob;
	
	public MyUser() {
		super();
		System.out.println("In myuser default constructor");
	}
	
	public MyUser(int uid, String uname, String mob) {
		super();
		System.out.println("In myuser parametrized constructor");
		this.uid = uid;
		this.uname = uname;
		this.mob = mob;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
		System.out.println("In myuser uid setter method");
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
		 System.out.println("In myuser uname setter method");
	}
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
		System.out.println("In myuser mobile setter method");
	}
	@Override
	public String toString() {
		return "MyUser [uid=" + uid + ", uname=" + uname + ", mob=" + mob + "]";
	}
	
	

}

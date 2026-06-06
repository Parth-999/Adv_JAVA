package com.demo.model;

public class MyClass {
	private int id;
	private String nm;
	public MyClass() {
		super();
	}
	public MyClass(int id, String nm) {
		super();
		this.id = id;
		this.nm = nm;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNm() {
		return nm;
	}
	public void setNm(String nm) {
		this.nm = nm;
	}
	public void method1(int x) {
		System.out.println("in method 1 "+(id+x));
	}
	@Override
	public String toString() {
		return "MyClass [id=" + id + ", nm=" + nm + "]";
	}
	

}

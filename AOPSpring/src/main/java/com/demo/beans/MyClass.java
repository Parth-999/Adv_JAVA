package com.demo.beans;

import org.springframework.stereotype.Component;

@Component
public class MyClass {

	public void f1()
	{
		System.out.println("In Function f1");
	}
	public void f2()
	{
		System.out.println("In Function f2");
	}
	public void f3()
	{
		System.out.println("In Function f3");
	}
	public void m1(int x)
	{
		System.out.println("In Function m1" + x);
	}
	public void m2()
	{
		System.out.println("In Function m2");
	}
}

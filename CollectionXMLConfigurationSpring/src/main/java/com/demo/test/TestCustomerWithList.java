package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.*;

public class TestCustomerWithList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("myspringconfig.xml");
		Customer c = (Customer) ctx.getBean("c1");
		System.out.println(c);
		((ClassPathXmlApplicationContext)ctx).close();

	}

}

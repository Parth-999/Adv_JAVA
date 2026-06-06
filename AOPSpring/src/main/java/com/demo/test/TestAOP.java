package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.MyClass;

public class TestAOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("myspringconfig.xml");
		
		MyClass ob = (MyClass)ctx.getBean("myClass");
		
		//ob.f1();
		ob.m1(10);
		
		((ClassPathXmlApplicationContext)ctx).close();

	}

}

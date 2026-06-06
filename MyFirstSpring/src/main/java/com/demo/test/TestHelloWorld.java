package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.*;

public class TestHelloWorld {

	public static void main(String [] args)
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("myspringconfig.xml");
		System.out.println("After Creating context");
		HelloWorld hw = (HelloWorld) ctx.getBean("hello");
		System.out.println(hw.sayHello());
		MyUser u1 = (MyUser) ctx.getBean("u1");
		System.out.println(u1);
		Person p1 = (Person) ctx.getBean("per1");
		System.out.println(p1);
		((ClassPathXmlApplicationContext)ctx).close();
	}
}

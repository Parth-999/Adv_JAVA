package com.demo.test;

import com.demo.beans.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("myspringconfig.xml");
		
		Address addr1 = (Address) ctx.getBean("address");
		System.out.println(addr1);
		
		((ClassPathXmlApplicationContext)ctx).close();
	}

}

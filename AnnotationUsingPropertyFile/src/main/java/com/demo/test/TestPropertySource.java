package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.Product;
import com.demo.beans.MyUser;

public class TestPropertySource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("myspringconfig.xml");
		MyUser u1=(MyUser)ctx.getBean("myUser");
		System.out.println(u1);
		
		Product p = (Product)ctx.getBean(Product.class);
		System.out.println(p);
		
		((ClassPathXmlApplicationContext)ctx).close();

	}

}

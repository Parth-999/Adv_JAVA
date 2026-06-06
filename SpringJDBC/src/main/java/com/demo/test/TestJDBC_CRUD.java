package com.demo.test;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.Product;
import com.demo.service.*;

public class TestJDBC_CRUD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("myspringconfig.xml");
		
		ProductService pservice = (ProductService)ctx.getBean("productServiceImpl");
		Scanner sc = new Scanner(System.in);
		
		int choice=0;
		
		do {
			System.out.println("1. Add new product\n2. delete Product by id\n3. update product byid");
			System.out.println("4. display all\n5.display by id\n6. display by price\n7. exit\n choice :");
			System.out.println("Enter choice");
			
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1->{
				boolean status = pservice.addNewProduct();
				
				if(status)
				{
					System.out.println("New Product Added Successfully");
				}
				else
				{
					System.out.println("Not Added");
				}
			}
			
			case 2->{
				System.out.println("Enter Product ID to delete");
				int pid = sc.nextInt();
				boolean status = pservice.deleteProductById(pid);
				
				if(status)
				{
					System.out.println("Product Deleted Successfully");
				}
				else
				{
					System.out.println("Not Deleted");
				}
				}
			
			case 3->{
				System.out.println("Enter Product ID ");
				int pid = sc.nextInt();
				System.out.println("Enter Product QTY");
				int qty = sc.nextInt();
				System.out.println("Enter Product Price");
				double p = sc.nextDouble();
				
				boolean status = pservice.updateProduct(pid,qty,p);
				
				if(status)
				{
					System.out.println("Product Updated Successfully");
				}
				else
				{
					System.out.println("Not Updated");
				}
			}
			
			case 4->{
				List<Product> plist  = pservice.displayAll();
				
				plist.forEach(System.out::println);
			}
			
			case 5->{
				System.out.println("Enter Product Id To display");
				int pid = sc.nextInt();
				Product p  = pservice.findById(pid);
				if(p!=null)
				{
					System.out.println(p);
				}else
				{
					System.out.println("Not Found");
				}
				
			}
			
			case 6->{
				System.out.println("Enter Product Price ");
				double price = sc.nextDouble();
				List<Product> plist  = pservice.findByPrice(price);
				if(plist!=null)
				{
					plist.forEach(System.out::println);
				}else
				{
					System.out.println("List Empty");
				}
				
			}
			
			case 7->{
				System.out.println("Thank You For Visiting");
				sc.close();
				((ClassPathXmlApplicationContext)ctx).close();
			}
			}
			
		}while(choice!=7);

	}

}

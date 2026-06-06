package test.demo;

import service.demo.*;
import java.util.*;

public class TestCrud {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name:");
		String name = sc.next();
		System.out.println("Enter your Password:");
		String password = sc.next();
		
		LoginService lservice = new LoginServiceImpl();
		String role = lservice.ValidateUser(name, password);
		
		if(role.equals("dac54")){
			System.out.println(name + " is Admin");
		}
		else
		{
			System.out.println("Wrong Credentials");
		}
		
		sc.close();
	}

}

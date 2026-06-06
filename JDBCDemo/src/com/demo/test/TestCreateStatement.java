package com.demo.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class TestCreateStatement {

	public static void main(String[] args) {
		
		try {
			//step 1 register driver
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			
			//step 2 create connection
			String url="jdbc:mysql://192.168.10.112:3306/dac54?useSSL=false";
			Connection conn=DriverManager.getConnection(url,"dac54","welcome");
			
			//step 3 create a statement
			Statement st=conn.createStatement();
			
			//step 4 execute the statement
			ResultSet rs=st.executeQuery("select * from product");
			
			//step 5 navigate through resultset
			while(rs.next()) {
				System.out.println("Id : "+rs.getInt(1));
				System.out.println("Name  : "+rs.getString(2));
				System.out.println("Qty  : "+rs.getInt(3));
				System.out.println("price  : "+rs.getDouble(4));
				//to covert java sql date into LocalDate
				java.sql.Date dt=rs.getDate(5);
				LocalDate ldt=dt.toLocalDate();
				System.out.println("MFGDate : "+ldt.toString());
				System.out.println("----------------------------");
				
				
			}
			
			//to insert data
			int id=11;
			String name="xxxx";
			int qty=45;
			double price=456.56;
			LocalDate dt=LocalDate.now();
			String query="insert into product values("+id+",'"+name+"',"+qty+","+price+",'"+dt.toString()+"')";
			System.out.println(query);
			int n=st.executeUpdate(query);
			if(n>0) {
				System.out.println("insertion done");
			}else {
				System.out.println("insertion not done");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

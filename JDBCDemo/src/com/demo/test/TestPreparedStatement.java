package com.demo.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class TestPreparedStatement {

	public static void main(String[] args) {
		try {
			//step 1 register driver
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			
			//step 2 create connection
			String url="jdbc:mysql://192.168.10.112:3306/dac54?useSSL=false";
			Connection conn=DriverManager.getConnection(url,"dac54","welcome");
			//step 3 create statement
		    PreparedStatement pst=conn.prepareStatement("select * from product");
	        //step 4 execute query
		    ResultSet rs=pst.executeQuery();
		    while(rs.next()) {
		    	System.out.println("Id : "+ rs.getInt(1));
		    	System.out.println("Name  : "+ rs.getString(2));
		    	System.out.println("Qty : "+ rs.getInt(3));
		    	System.out.println("Price : "+ rs.getDouble(4));
		    	LocalDate ldt=rs.getDate(5).toLocalDate();
		    	System.out.println("mfgDate : "+ ldt.toString());
		    }
		    
		    //to insert data
		    int id=23;
		    String name="yyy";
		    int qty=44;
		    double price=4567.89;
		    LocalDate ldt=LocalDate.now();
		    PreparedStatement pst1=conn.prepareStatement("insert into product values(?,?,?,?,?)");
		    pst1.setInt(1, id);
		    pst1.setString(2, name);
		    pst1.setInt(3, qty);
		    pst1.setDouble(4, price);
		  //java.sql.Date dt=LocalDate.
		    pst1.setDate(5, null);
		    int n= pst1.executeUpdate();
		    if(n>0) {
		    	System.out.println("insertion done");
		    }else {
		    	System.out.println("insertion not done");
		    }
		}catch(SQLException e) {
			System.out.println(e.getMessage());
			 e.printStackTrace();
		}
		

	}

}

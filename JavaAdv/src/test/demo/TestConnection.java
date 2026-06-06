package test.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class TestConnection {

	public static void main(String[] args) {
		
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			String url = "jdbc:mysql://192.168.10.112:3306/dac54?useSSL=false";
			Connection conn = DriverManager.getConnection(url,"dac54", "welcome");
			if(conn!=null)
			{
				System.out.println("Connection Done");
			}
			else
			{
				System.out.println("Connection failed");
			}
			conn.close();
		} catch (SQLException e)
		{
			System.out.println("connection not done");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

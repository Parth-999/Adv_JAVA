package dao.demo;

import java.sql.Connection;

public class EmployeeDaoImpl implements EmployeeDao{
	
	static Connection conn;
	
	static {
		conn = Dbconnection.getMyConnection();
	}
	
	

}

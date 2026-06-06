package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDaoImpl implements LoginDao{
	static Connection conn;
	static {
		conn=DBUtil.getMyConnection();
	}
	@Override
	public String authenticateUser(String uname, String passwd) {
		try {
			PreparedStatement pst2=conn.prepareStatement("create Table abc(name VARCHAR(10))");
			pst2.executeUpdate();
			pst2=conn.prepareStatement("insert into abc values(?)");
			pst2.setString(1, uname);
			pst2.executeUpdate();
			PreparedStatement pst=conn.prepareStatement("select * from abc");
			
//			PreparedStatement pst2=conn.prepareStatement("create Table abc(name VARCHAR(10))");
//			pst.setString(1, uname);
//			pst.setString(2, passwd);
			ResultSet rs=pst.executeQuery();
			if(rs.next()) {
				return rs.getString(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public void closeMyConnection() {
		DBUtil.closeMyConnection();
		
	}

}

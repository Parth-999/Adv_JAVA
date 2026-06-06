package dao.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDaoImpl implements LoginDao {
	
	static Connection conn;
	
	static
	{
		conn = Dbconnection.getMyConnection();
	}

	@Override
	public String verifyUser(String name, String password) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement pst = conn.prepareStatement("select * from myuser where uname=? and passwd=?");
			pst.setString(1, name);
			pst.setString(2, password);
			ResultSet rs = pst.executeQuery();
			
			if(rs.next())
			{
				return rs.getString(3);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void closeMyConnection() {
		// TODO Auto-generated method stub
		
		Dbconnection.closeConnection();
		
	}


	
	
	

}

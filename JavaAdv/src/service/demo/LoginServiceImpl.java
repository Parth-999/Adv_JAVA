package service.demo;

import dao.demo.LoginDao;
import dao.demo.LoginDaoImpl;

public class LoginServiceImpl implements LoginService{
	
	private LoginDao ldao;
	
	
	public LoginServiceImpl()
	{
		super();
		this.ldao = new LoginDaoImpl();
	}
	
	public String ValidateUser(String name , String password)
	{
		return ldao.verifyUser(name,password);
		
	}
	
	public void closeMyConnection()
	{
		 ldao.closeMyConnection();
	}

}

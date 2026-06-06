package service.demo;

public interface LoginService {
	
	String ValidateUser(String name,String password);
	
	void closeMyConnection();

}

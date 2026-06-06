package model.demo;

public class User {

	private String uName;
	private String password;
	private String role;
	
	
	public User() {
		super();
	}


	public User(String uName, String password, String role) {
		super();
		this.uName = uName;
		this.password = password;
		this.role = role;
	}


	public String getuName() {
		return uName;
	}


	public void setuName(String uName) {
		this.uName = uName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	@Override
	public String toString() {
		return "User [uName=" + uName + ", password=" + password + ", role=" + role + "]";
	}
	
	
	
	
}

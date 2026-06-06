package com.demo.dao;

import com.demo.model.Product;

public interface LoginDao {

	String authenticateUser(String uname, String passwd);

	void closeMyConnection();

	

}

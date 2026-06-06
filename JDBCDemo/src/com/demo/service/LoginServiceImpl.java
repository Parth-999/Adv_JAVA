package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.demo.dao.LoginDao;
import com.demo.dao.LoginDaoImpl;
import com.demo.model.Product;

public class LoginServiceImpl implements LoginService{
	private LoginDao ldao;

	public LoginServiceImpl() {
		super();
		this.ldao = new LoginDaoImpl();
	}

	@Override
	public String validateUser(String uname, String passwd) {
		return ldao.authenticateUser(uname,passwd);
		
	}

	@Override
	public void closeMyConnection() {
		ldao.closeMyConnection();
		
	}

	
	

}

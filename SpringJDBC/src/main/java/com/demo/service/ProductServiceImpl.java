package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.ProductDao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

import com.demo.beans.*;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao pdao;
	
	Scanner sc = new Scanner(System.in);

	@Override
	public boolean addNewProduct() {
		
		System.out.println("Enter Product id");
		int pid = sc.nextInt();
		System.out.println("Enter Product Name");
		String pname = sc.next();
		System.out.println("Enter Product qty");
		int qty = sc.nextInt();
		System.out.println("Enter Product Price");
		Double price = sc.nextDouble();
		System.out.println("Enter Product MfgDate(dd-mm-yyyy)");
		String dt = sc.next();
		LocalDate ldt = LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		System.out.println("Enter cid");
		int cid = sc.nextInt();
		
		Product p = new Product(pid,pname,qty,price,ldt,cid);
		return pdao.saveProduct(p);
		
	}

	@Override
	public boolean deleteProductById(int pid) {
		return pdao.removeById(pid);
	}

	@Override
	public boolean updateProduct(int pid, int qty, double p) {
		return pdao.modifyById(pid,qty,p);
	}

	@Override
	public List<Product> displayAll() {
		return pdao.getAll();
	}

	@Override
	public Product findById(int pid) {
		return pdao.getById(pid);
	}

	@Override
	public List<Product> findByPrice(double price) {
		return pdao.getByPrice(price);
	}

	


	
}

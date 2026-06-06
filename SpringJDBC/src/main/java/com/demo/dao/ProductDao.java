package com.demo.dao;

import java.util.List;

import com.demo.beans.Product;

public interface ProductDao {

	boolean saveProduct(Product p);

	boolean removeById(int pid);

	boolean modifyById(int pid, int qty, double p);

	List<Product> getAll();

	Product getById(int pid);

	List<Product> getByPrice(double price);

}

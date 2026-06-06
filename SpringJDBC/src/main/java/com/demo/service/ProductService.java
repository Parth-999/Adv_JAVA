package com.demo.service;

import java.util.List;

import com.demo.beans.Product;

public interface ProductService {

	boolean addNewProduct();

	boolean deleteProductById(int pid);


	boolean updateProduct(int pid, int qty, double p);

	List<Product> displayAll();

	Product findById(int pid);

	List<Product> findByPrice(double price);

}

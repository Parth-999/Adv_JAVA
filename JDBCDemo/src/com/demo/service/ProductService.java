package com.demo.service;

import java.util.List;

import com.demo.model.Product;

public interface ProductService {

	boolean addNewProduct();

	List<Product> getAll();

	Product getById(int id);

	List<Product> getAllSortedByName();

	boolean modifyById(int pid, int qty, double pr);

	boolean deleteById(int pid);

}

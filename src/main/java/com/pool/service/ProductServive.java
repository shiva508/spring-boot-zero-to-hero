package com.pool.service;

import com.pool.model.Product;

public interface ProductServive {
	public void addProduct();
	public void addProduct(Product product);
	public void addProduct(String name,Integer id);
	public void addProduct(String name);
	public void addOrganization();
	public void getProduct(String productName,Integer orgId);
	public void setProduct(String productName,Integer orgId);
}

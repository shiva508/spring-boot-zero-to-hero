package com.pool.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pool.model.Product;
import com.pool.service.ProductServive;

@RestController
public class ProductController {
	@Autowired
	private ProductServive productServive; 
	@GetMapping("/aspect") 
	public String aspectController() {
		productServive.addOrganization();
		productServive.addProduct();
		Product product=new Product();
		product.setProductId(1);
		product.setProductName("INFINITY LAP");
		product.setProductType(1);
		product.setSaleType("LOW PRICE LAPTOP");
		productServive.addProduct(product);
		productServive.getProduct("TMC", 408);
		productServive.addProduct("TMC", 408);
		productServive.addProduct("MORE..");
		productServive.setProduct("", 408);
		return "/WORKING";
	}
}

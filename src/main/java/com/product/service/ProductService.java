package com.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.entity.Product;
import com.product.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository pr;
	
	public Product save(Product p) {
		return pr.save(p);
	}

	public Product findProductById(int id) {
		// TODO Auto-generated method stub
		return pr.findById(id).orElse(new Product());
	}
}

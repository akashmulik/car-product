package com.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.product.entity.Product;
import com.product.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService ps;
	
	@PostMapping("/product")
	public Product save(@RequestBody Product p) {
		return ps.save(p);
	}
	
	@GetMapping("/product/{id}")
	public Product getProductById(@PathVariable int id) {
		
		return ps.findProductById(id);
	}
}

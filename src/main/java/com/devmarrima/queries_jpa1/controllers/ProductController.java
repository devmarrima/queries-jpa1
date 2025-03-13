package com.devmarrima.queries_jpa1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devmarrima.queries_jpa1.entities.Product;
import com.devmarrima.queries_jpa1.repositories.ProductRepository;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

	@Autowired
	private ProductRepository productRepository;
	
	@GetMapping
	public Page<Product> findAll(Pageable pageable) {
		return productRepository.employeeWithCategory(pageable);
	}
}


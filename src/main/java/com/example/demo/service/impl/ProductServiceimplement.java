package com.example.demo.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.model.Product;
import com.example.demo.repo.ProductRepo;
import com.example.demo.service.Productinterface;
@Service
public class ProductServiceimplement implements Productinterface {
	
	@Autowired
	private ProductRepo productRepo;

	@Override
	public Product findbyid(int id) {
		Optional<Product> oProduct = productRepo.findById(id);
		if(oProduct.isPresent()) {
			
			return oProduct.get();
		}else {
			return null;
		}
	}
	
	
	
}

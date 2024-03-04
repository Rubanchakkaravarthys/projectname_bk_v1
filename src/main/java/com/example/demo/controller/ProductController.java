package com.example.demo.controller;

//import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.model.Product;
import com.example.demo.repo.ProductRepo;
import com.example.demo.service.Productinterface;

import jakarta.persistence.Id;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	private Productinterface productInterface;
	@Autowired
	private ProductRepo productRepo;
//	@GetMapping("/set")
//	public ResponseEntity<?> getProduct(@RequestParam String name ,@RequestParam 	String price,@RequestParam String id
//			,@RequestParam 	String description) {
//	
//		Product p1=new Product();
//		p1.setId(id);
//		p1.setName(name);
//		p1.setDescription(description);
//		p1.setPrice(price);
//	Product savedEntity = productRepo.save(p1);
//		productRepo.save(p1);
//		return ResponseEntity.status(HttpStatus.OK)
//				.body("savedEnitty");
//	}
	@GetMapping("/get/{id}")
	public ResponseEntity<Product> findById(@PathVariable int id
			) {
	        
		Product product= productInterface.findbyid(id);
		return ResponseEntity.status(HttpStatus.OK)
				.body(product);
			}
	@GetMapping("/findByName")
	public ResponseEntity<?> findByName(@RequestParam String name
			) {
		List<Product> products = productRepo.findByName(name);
				
		return ResponseEntity.status(HttpStatus.OK)
				.body(products);
			}
//	@GetMapping("/findPrice")
//	public ResponseEntity<?> findPrice(@RequestParam String p1,@RequestParam String p2
//			) {
//		List<Product> products = productRepo.findPrice(p1,p2);
//				
//		return ResponseEntity.status(HttpStatus.OK)
//				.body(products);
//			}
	@PostMapping("/set")
	public ResponseEntity<?> setProduct(@RequestBody Product product) {
	
		
	Product savedEntity = productRepo.save(product);
		
		return ResponseEntity.status(HttpStatus.OK)
				.body(savedEntity);
				
	
				
	}
	
	
}



//	@GetMapping("/list")
//	public ResponseEntity<?> getListproduct() {
//		Product p1=new Product();
//		p1.setId(1);
//		p1.setName("coffee");
//		p1.setDescription("narasu coffee");
//		p1.setPrice("85.50");
//		
//		Product p2=new Product();
//		p2.setId(2);
//		p2.setName("3roses");
//		p2.setDescription(" tea");
//		p2.setPrice("120.60");
//		
//		Product p3=new Product();
//		p3.setId(3);
//		p3.setName("tajmahal");
//		p3.setDescription(" tea");
//		p3.setPrice("210.50");
//		
//		
//		List<Product> pr = new ArrayList<>();
//		pr.add(p1);
//		pr.add(p2);
//		pr.add(p3);
//		return ResponseEntity.status(HttpStatus.OK)
//		.body(p1);
//		
//	}
//	@GetMapping("/controller")
//	public  ResponseEntity<?> getController( ){
//		
//		Product p2 = new Product();
//		p2.setId(2);
//		p2.setName("tajmahal");
//		p2.setDescription("taj");
//		p2.setPrice("150.60");
//		return ResponseEntity.status(HttpStatus.OK)
//				.body("your Successfully Completed!!");
//	}
//		
//	}



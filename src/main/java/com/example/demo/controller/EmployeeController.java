package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.repo.EmployeeRepo;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private EmployeeRepo employeeRepo; 
	@PostMapping("/set")
	public ResponseEntity<?> setEmployee(@RequestBody  Employee employee ) {
		Employee emplo = employeeRepo.save(employee);
		return ResponseEntity.status(HttpStatus.OK)
		   .body(emplo);
	}
}

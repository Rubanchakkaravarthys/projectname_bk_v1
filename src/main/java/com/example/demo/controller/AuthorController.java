package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Author;
import com.example.demo.repo.AuthorRepo;
//import com.example.demo.repo.BookRepo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/author")
public class AuthorController {
@Autowired
private AuthorRepo authorRepo;
//@Autowired
//private BookRepo bookRepo;
	@PostMapping("/add")
	public ResponseEntity<?> addAuthor(@RequestBody Author author){
		Author savedEntity = authorRepo.saveAndFlush(author);
		return ResponseEntity
				.status(HttpStatus.OK)
				.body(savedEntity);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<?> getAuthor(@PathVariable int id){
		Author author = authorRepo.findById(id).get();
		return ResponseEntity
				.status(HttpStatus.OK)
				.body(author);
	}
}

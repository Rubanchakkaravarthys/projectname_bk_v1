package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;
import com.example.demo.repo.BookRepo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("/post")
public class BookController {
@Autowired
private BookRepo bookRepo;
@PostMapping("/get/{id}")
public ResponseEntity<?> addBook(@PathVariable int id) {
	Book book =bookRepo.findById(id).get();
	return ResponseEntity.status(HttpStatus.OK)
			.body(book);
}
@PostMapping("/saveAndBook/{id}")
public ResponseEntity<?> saveAndBook(@PathVariable int id ,@RequestBody Book book) {
    Book book1 =bookRepo.findById(id).get();
    book1.getAuthor();
    return ResponseEntity
			.status(HttpStatus.OK)
			.body(book1);
    
}


}

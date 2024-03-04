package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.repo.UserRepo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserRepo userRepo;
@PostMapping("/save")
public ResponseEntity<?> saveUser(@RequestBody User user){
	User saveEntity = userRepo.save(user);
	return ResponseEntity.status(HttpStatus.OK)
			.body(saveEntity);
}

}

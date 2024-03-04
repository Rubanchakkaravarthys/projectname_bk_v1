package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Actor;
import com.example.demo.model.Movie;

//import com.example.demo.model.Actor;

import com.example.demo.repo.ActorRepo;
import com.example.demo.repo.MovieRepo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/actor")
public class ActorController {
@Autowired
private  ActorRepo actorRepo;
@Autowired
private MovieRepo movieRepo;

@PostMapping("/saveActor")
public ResponseEntity<?> saveActor(@RequestBody Actor actor){
	Actor savedEntity = actorRepo.saveAndFlush(actor);
	return ResponseEntity
			.status(HttpStatus.OK)
			.body(savedEntity);
}
//@GetMapping("/get/{actorId}")
//public ResponseEntity<?> getEmployee(@PathVariable int actorId){
//	Actor actor = actorRepo.findById(actorId).get();
//	return ResponseEntity
//			.status(HttpStatus.OK)
//			.body(employee);
//	
//}
@PostMapping("/saveAnActorUnderMovie/{projectId}")
public ResponseEntity<?> saveAnActorUnderMovie(@PathVariable int movieId, @RequestBody Actor actor){
	Movie movie = movieRepo.findById(movieId).get();
	 movie.getActors();
	return ResponseEntity
			.status(HttpStatus.OK)
			.body(movie);

}




}

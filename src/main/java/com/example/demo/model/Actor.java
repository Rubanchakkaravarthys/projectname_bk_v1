package com.example.demo.model;

import java.util.Set;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "actors")
public class Actor {
 @Id
 @GeneratedValue
 @Column(name="actor_id")
 public int actorId;
 public String name;
 public String city;
 @ManyToMany(cascade = CascadeType.ALL)
 private Set<Movie> movies;
public Set<Movie> getMovies() {
	return movies;
}
public void setMovies(Set<Movie> movies) {
	this.movies = movies;
}
public int getActorId() {
	return actorId;
}
public void setActorId(int actorId) {
	this.actorId = actorId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
 
 
 
 
 

}

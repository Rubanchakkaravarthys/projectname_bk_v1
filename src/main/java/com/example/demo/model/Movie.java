package com.example.demo.model;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="movies")
public class Movie {
@Id
@GeneratedValue
@Column(name="movie_id")
public int movieId;
public String title;
@ManyToMany(cascade = CascadeType.ALL)

private Set<Actor> actors;
public Set<Actor> getActors() {
	return actors;
}
public void setActors(Set<Actor> actors) {
	this.actors = actors;
}
public int getMovieId() {
	return movieId;
}
public void setMovieId(int movieId) {
	this.movieId = movieId;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}

}

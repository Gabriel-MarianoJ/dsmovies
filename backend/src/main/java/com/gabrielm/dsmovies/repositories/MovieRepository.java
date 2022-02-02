package com.gabrielm.dsmovies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrielm.dsmovies.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{
	
}

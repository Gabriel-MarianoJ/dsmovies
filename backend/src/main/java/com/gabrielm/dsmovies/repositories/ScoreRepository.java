package com.gabrielm.dsmovies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrielm.dsmovies.entities.Score;
import com.gabrielm.dsmovies.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{
	
}

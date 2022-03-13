package com.IvanEng2019.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.IvanEng2019.dsmovie.entities.Score;
import com.IvanEng2019.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{
	
}

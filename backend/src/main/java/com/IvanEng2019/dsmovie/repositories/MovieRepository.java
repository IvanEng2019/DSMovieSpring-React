package com.IvanEng2019.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.IvanEng2019.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{
	
}

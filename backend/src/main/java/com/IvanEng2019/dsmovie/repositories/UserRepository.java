package com.IvanEng2019.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.IvanEng2019.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByEmail(String email);
}

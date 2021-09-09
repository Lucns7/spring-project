package com.lucas.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucas.spring.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	

}

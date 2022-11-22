package com.knuckles.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.knuckles.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	

}

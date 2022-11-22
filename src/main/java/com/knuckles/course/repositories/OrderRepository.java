package com.knuckles.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.knuckles.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	

}

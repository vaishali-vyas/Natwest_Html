package com.natWest.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.natWest.demo.domain.Fruit;

@Repository
public interface FruitRepo extends JpaRepository<Fruit, Long> {


	
	
	
}

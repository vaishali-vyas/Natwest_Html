package com.natWest.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.natWest.demo.domain.Fruit;
import com.natWest.demo.repo.FruitRepo;

@Service
public class FruitService {

	public FruitRepo repo;

	public FruitService(FruitRepo repo) {
		super();
		this.repo = repo;
	}

//	//Read

	public List<Fruit> readAll() {
		// TODO Auto-generated method stub
		return this.repo.findAll();
	}
	
	
//find by Id
	public Fruit findbyId(Long Id) {
		return this.repo.findById(Id).orElseThrow();
				
	}

	//Create
	public Fruit create(Fruit fruit) {
		return this.repo.saveAndFlush(fruit);
	}
	
	//Delete
	public Boolean delete(Long id) {
		this.repo.deleteById(id);
		return this.repo.existsById(id);		
	}
	
	//Update			

	public Fruit update(Long id, Fruit fruit) {
		Fruit exists = this.repo.getById(id);
		exists.setType(fruit.getType());
		exists.setColour(fruit.getColour());
		Fruit updated = this.repo.save(exists);
		return updated;
	}
	
	
}

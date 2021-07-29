package com.natWest.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.natWest.demo.domain.Fruit;
import com.natWest.demo.service.FruitService;

@RestController
@RequestMapping("/fruit")
public class FruitController {

	private FruitService service;

	@Autowired
	public FruitController(FruitService service) {
		super();
		this.service = service;
	}
	
@GetMapping("/test")
public String test() {
	return "testing in progress";
	
}

@GetMapping("/get")
public Fruit getfruit() {
	return new Fruit("Apple", "Green");
	
}

@GetMapping(path = "readfromdb")
public ResponseEntity<List<Fruit>>getAll() {
	return new ResponseEntity<List<Fruit>>(this.service.readAll(),HttpStatus.OK);
	
}

@GetMapping("/findbyId/{id}")
public ResponseEntity<Fruit>findbyId(@PathVariable("id")Long id) {
	return new ResponseEntity<Fruit>(this.service.findbyId(id),HttpStatus.FOUND);
}

@PostMapping("/create")
public ResponseEntity<Fruit>create(@RequestBody Fruit fruit) {
	return new ResponseEntity<Fruit>(this.service.create(fruit),HttpStatus.CREATED);
}

@DeleteMapping("/delete/{id}")
public ResponseEntity<Boolean> update(@PathVariable Long id) {
	
	return new ResponseEntity<Boolean>(this.service.delete(id),HttpStatus.NO_CONTENT);
}

@PutMapping("/update/{id}")
public ResponseEntity<Fruit> update(@PathVariable("id")Long id, @RequestBody Fruit fruit) {
	return new ResponseEntity<Fruit>(this.service.update(id, fruit),HttpStatus.ACCEPTED);
}

	
}


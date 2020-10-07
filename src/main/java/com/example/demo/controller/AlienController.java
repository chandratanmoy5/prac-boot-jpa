package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.AlienRepo;
import com.example.demo.model.Alien;

@RestController
public class AlienController {
	
	@Autowired
	AlienRepo alien_repo;
	
	
	@RequestMapping("add")
	public String addAlien(Alien alien) {
		alien_repo.save(alien);
		return "Data Saved..!";
	}
	
	@RequestMapping("fetch")
	public Iterable<Alien> fetchAlien(Alien alien) {
		return alien_repo.findAll();
	}

}

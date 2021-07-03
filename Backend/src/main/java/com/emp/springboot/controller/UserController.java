package com.emp.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emp.springboot.model.UserDetails;
import com.emp.springboot.repository.UserRepository;

@RestController
@RequestMapping("/api/")
public class UserController {
	
	@Autowired
	private UserRepository userController;
	
	//get all employees
	@GetMapping("/users")
	public List<UserDetails> getAllUser(){
		return userController.findAll();
	}

}

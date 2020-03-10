package com.fr.adaming.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fr.adaming.entity.User;
import com.fr.adaming.service.UserService;

@RestController
@RequestMapping
public class UserController {
	
	private UserService service;
	
	@PostMapping (path ="auth/login")
	public ResponseEntity<User> login(@RequestBody User user) {
		
		
		return null;
		
		
	}

}

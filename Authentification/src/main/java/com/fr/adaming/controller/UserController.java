package com.fr.adaming.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fr.adaming.dto.LoginDto;
import com.fr.adaming.entity.User;
import com.fr.adaming.service.UserService;

@RestController
@RequestMapping
public class UserController implements IUserController{
	
	private UserService service;
	

	@Override
	public ResponseEntity<User> login(LoginDto dto) {
		
		User u = service.login(dto.getEmail(), dto.getPwd());
		return ResponseEntity.status(HttpStatus.OK).body(u);
	}
	
	
	
		
		
	}


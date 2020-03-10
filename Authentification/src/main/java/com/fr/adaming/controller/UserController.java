package com.fr.adaming.controller;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fr.adaming.dto.AfficherDto;
import com.fr.adaming.dto.LoginDto;
import com.fr.adaming.entity.User;
import com.fr.adaming.service.UserService;

@RestController
@RequestMapping (method = RequestMethod.GET)
public class UserController implements IUserController{
	
	private UserService service;
	

	@Override
	@PostMapping(path ="auth/login")
	public ResponseEntity<String> login(@RequestBody LoginDto dto) {
		
		User u = service.login(dto.getMail(), dto.getPassword());
		if (u != null) {
			return ResponseEntity.status(HttpStatus.OK).body("SUCCESS");
		} else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("FAIL");
		}
	
	}


	@Override
	@PostMapping (path="/nameUser")
	public ResponseEntity<Optional<User>> findUser(AfficherDto dto) {
		
		Optional<User> u = service.findById(dto.getId());
		
		return ResponseEntity.status(HttpStatus.OK).body(u);
	}
	
		
	}


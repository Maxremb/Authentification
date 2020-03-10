package com.fr.adaming.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import com.fr.adaming.dto.LoginDto;
import com.fr.adaming.entity.User;


public  interface IUserController {
	
	public ResponseEntity<User> login(@RequestBody LoginDto dto);
	

	
}

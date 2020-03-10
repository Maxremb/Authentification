package com.fr.adaming.controller;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import com.fr.adaming.dto.AfficherDto;
import com.fr.adaming.dto.LoginDto;
import com.fr.adaming.entity.User;


public  interface IUserController {
	
	public ResponseEntity<String> login(@RequestBody LoginDto dto);
	
	public ResponseEntity<Optional<User>> findUser(@RequestBody AfficherDto dto);
	
	
}

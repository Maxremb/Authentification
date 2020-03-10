package com.fr.adaming.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fr.adaming.entity.User;
import com.fr.adaming.repository.IUserRepository;

@Service
public class UserService {
	
	@Autowired
	private IUserRepository repo;
	//appel Dto

	public User login(String email, String pwd) {
		return repo.findByEmailAndPwd(email, pwd);
	}

	
	
}

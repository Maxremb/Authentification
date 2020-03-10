package com.fr.adaming.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fr.adaming.entity.User;
import com.fr.adaming.repository.IUserRepository;

@Service
public class UserService {
	
	@Autowired
	private IUserRepository repo;

	public User login(String email, String pwd) {
		
		return repo.findByEmailAndPwd(email, pwd);
	}

	public Optional<User> findById (Integer id) {
		return repo.findById(id);
		
	}
	
	
	public void CreateUser(User user) {
		repo.save(user);
	}
	
	public void DeleteUser(User user) {
		repo.delete(user);
	}
	
	
	
}

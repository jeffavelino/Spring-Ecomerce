package com.ecomerceweb.ecomerce.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ecomerceweb.ecomerce.entities.User;
import com.ecomerceweb.ecomerce.repositories.UserRepository;


public class UserService {
	
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll() {
		return repository.findAll();
		
	}
}

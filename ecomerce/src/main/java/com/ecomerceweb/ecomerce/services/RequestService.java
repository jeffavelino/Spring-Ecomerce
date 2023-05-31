package com.ecomerceweb.ecomerce.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ecomerceweb.ecomerce.entities.Request;
import com.ecomerceweb.ecomerce.repositories.RequestRepository;


public class RequestService {
	
	
	@Autowired
	private RequestRepository repository;
	
	public List<Request> findAll() {
		return repository.findAll();
		
	}
}

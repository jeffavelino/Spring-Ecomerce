package com.ecomerceweb.ecomerce.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecomerceweb.ecomerce.entities.User;

@RestController
@RequestMapping(value = "/Users")

public class UserResource {
	
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Maria", "maria@gmail.com","9999" );
		return ResponseEntity.ok().body(u);
		
	}

}

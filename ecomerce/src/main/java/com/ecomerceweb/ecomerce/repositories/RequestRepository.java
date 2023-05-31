package com.ecomerceweb.ecomerce.repositories;

import java.util.List;

import com.ecomerceweb.ecomerce.entities.Request;


public interface RequestRepository extends JpaRepository<Request, Long> {

	List<Request> findAll();
	
}

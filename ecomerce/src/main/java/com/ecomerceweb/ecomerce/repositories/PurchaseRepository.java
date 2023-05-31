package com.ecomerceweb.ecomerce.repositories;

import java.util.List;

import com.ecomerceweb.ecomerce.entitie.Purchase;

public interface PurchaseRepository<Purchase> extends JpaRepository<Purchase, Long> {

	List<Purchase> findAll();
	 
}

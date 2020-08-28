package com.inTouchAPIs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inTouchAPIs.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>
{
	//Since findByprodNAME() is not an inbuilt method so we have to create this method manually
	//Here findBy is inbuilt keyword and prodNAME is a property belongs to PRODUCT class
	List<Product> findByprodNAME(String name);
}

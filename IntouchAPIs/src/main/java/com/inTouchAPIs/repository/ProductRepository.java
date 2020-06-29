package com.inTouchAPIs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inTouchAPIs.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>
{

	List<Product> findByprodNAME(String name);

}

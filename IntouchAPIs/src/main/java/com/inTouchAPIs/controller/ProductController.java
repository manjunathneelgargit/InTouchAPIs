package com.inTouchAPIs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.inTouchAPIs.entity.Product;
import com.inTouchAPIs.services.ProductServices;

@RestController
public class ProductController 
{
	@Autowired
	private ProductServices services;
	
	//add product
	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product)
	{
		return services.addProduct(product);
	}
	
	//add products
	@PostMapping("/addProducts")
	public List<Product> addProducts(@RequestBody List<Product> product)
	{
		return services.addProducts(product);
	}
	
	//Find product by ID
	@GetMapping("/getProductByID/{id}")
	public Product getProductByID(@PathVariable int id)
	{
		return services.getProductById(id);
	}
	
	//Find product by name
	@GetMapping("/getProductByName/{name}")
	public List<Product> getProductByName(@PathVariable String name)
	{
		return services.getProductByName(name);
	}
	
	//Find all Products
	@GetMapping("/getAllProducts")
	public List<Product> getAllProducts()
	{
		return services.getAllProducts();
	}
	
	//Update product
	@PutMapping("/update")
	public Product updateProduct(@RequestBody Product product)
	{
		return services.updateProduct(product);
	}
	
	//Delete product
	@DeleteMapping("/deleteProduct/{id}")
	public String deleteProduct(@PathVariable int id)
	{
		return services.deleteProductById(id);
	}
	
	
}

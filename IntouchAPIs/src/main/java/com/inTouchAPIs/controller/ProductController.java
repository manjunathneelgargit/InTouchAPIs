package com.inTouchAPIs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.inTouchAPIs.entity.Product;
import com.inTouchAPIs.services.ProductServices;
@CrossOrigin(origins = "*")
@RestController
public class ProductController 
{
	@Autowired
	private ProductServices services;

	//add product

	@PostMapping("/addProduct")
	@CrossOrigin(origins = "http://localhost:4200")
	public Product addProduct(@RequestBody Product product)
	{
		return services.addProduct(product);
	}

	//add products

	@PostMapping("/addProducts")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Product> addProducts(@RequestBody List<Product> product)
	{
		return services.addProducts(product);
	}

	//Find product by ID

	@GetMapping("/getProductByID/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public Product getProductByID(@PathVariable int id)
	{
		return services.getProductById(id);
	}

	//Find product by name
	@GetMapping("/getProductByName/{name}")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Product> getProductByName(@PathVariable String name)
	{
		return services.getProductByName(name);
	}

	//Find all Products
	@GetMapping("/getAllProducts")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Product> getAllProducts()
	{
		return services.getAllProducts();
	}

	//Update product
	@PutMapping("/update")
	@CrossOrigin(origins = "http://localhost:4200")
	public Product updateProduct(@RequestBody Product product)
	{
		return services.updateProduct(product);
	}

	//Update product by ID
	@PatchMapping("/updateProductByID/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public Product updateProductByID(@RequestBody Product product, @PathVariable int id)
	{
		return services.updateProductById(product,id);
	}

	//Delete product
	@DeleteMapping("/deleteProduct/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public String deleteProduct(@PathVariable int id)
	{
		return services.deleteProductById(id);
	}
}

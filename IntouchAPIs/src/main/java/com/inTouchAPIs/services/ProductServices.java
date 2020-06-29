package com.inTouchAPIs.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inTouchAPIs.entity.Product;
import com.inTouchAPIs.repository.ProductRepository;

@Service
public class ProductServices 
{
	@Autowired
	private ProductRepository repository;
	
	//add product
	public Product addProduct(Product product)
	{
		return repository.save(product);
	}
	
	//add Products
	public List<Product> addProducts(List<Product> product)
	{
		return repository.saveAll(product);
	}
	
	//find by ID
	public Product getProductById(int id)
	{
		return repository.findById(id).orElse(null);
	}
	
	//Find by Name
	public List<Product> getProductByName(String name)
	{
		return repository.findByprodNAME(name);
	}
	
	//Find All products
	public List<Product> getAllProducts()
	{
		return repository.findAll();
	}
	
	//Delete By id
	public String deleteProductById(int id)
	{
		repository.deleteById(id);
		return "Product with ID : \""+id+"\" is deleted successfully...!";
	}
	
	//Update product
	public Product updateProduct(Product product)
	{
		Product existingProduct = repository.findById(product.getProdID()).orElse(null);
		existingProduct.setProdNAME(product.getProdNAME());
		existingProduct.setProdPRICE(product.getProdPRICE());
		existingProduct.setProdQTY(product.getProdQTY());
		return repository.save(existingProduct);	
	}
}

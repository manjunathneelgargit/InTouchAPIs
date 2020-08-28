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
		String msg = "";
		try
		{
			repository.deleteById(id);
			msg = "Product with ID : \""+id+"\" is deleted successfully.";
		}
		catch (Exception e) 
		{
			msg = "Product with ID : \""+id+"\" does not Exists.";
		}
		return msg;
	}
	
	//Update product
	//We have to manually create this logic because, this logic is not provided in inbuilt classes
	public Product updateProduct(Product product)
	{
		Product existingProduct = repository.findById(product.getProdID()).orElse(null);
		existingProduct.setProdNAME(product.getProdNAME());
		existingProduct.setProdPRICE(product.getProdPRICE());
		existingProduct.setProdQTY(product.getProdQTY());
		return repository.save(existingProduct);	
	}
	
	//UpdateProductById
	public Product updateProductById(Product product,int id)
	{
		Product existingProduct = repository.findById(id).orElse(null);
		if(product.getProdNAME()!=null)
		{
			existingProduct.setProdNAME(product.getProdNAME());
		}
		if(product.getProdPRICE()!=0) 
		{
			existingProduct.setProdPRICE(product.getProdPRICE());
		}
		if(product.getProdQTY()!=0) 
		{
			existingProduct.setProdQTY(product.getProdQTY());
		}
		
		return repository.save(existingProduct);	
	}
}

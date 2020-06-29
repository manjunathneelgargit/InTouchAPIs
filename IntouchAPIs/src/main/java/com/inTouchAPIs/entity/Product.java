package com.inTouchAPIs.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Product")
public class Product 
{
	@Id
	@GeneratedValue
	private int prodID;
	private String prodNAME;
	private int prodQTY;
	private double prodPRICE;
	
	public Product() 
	{
		super();
	}
	
	public Product(int prodID, String prodNAME, int prodQTY, double prodPRICE) 
	{
		super();
		this.prodID = prodID;
		this.prodNAME = prodNAME;
		this.prodQTY = prodQTY;
		this.prodPRICE = prodPRICE;
	}

	public int getProdID() 
	{
		return prodID;
	}

	public void setProdID(int prodID) 
	{
		this.prodID = prodID;
	}

	public String getProdNAME() 
	{
		return prodNAME;
	}

	public void setProdNAME(String prodNAME) 
	{
		this.prodNAME = prodNAME;
	}

	public int getProdQTY() 
	{
		return prodQTY;
	}

	public void setProdQTY(int prodQTY) 
	{
		this.prodQTY = prodQTY;
	}

	public double getProdPRICE() 
	{
		return prodPRICE;
	}

	public void setProdPRICE(double prodPRICE) 
	{
		this.prodPRICE = prodPRICE;
	}
	
	
	
}

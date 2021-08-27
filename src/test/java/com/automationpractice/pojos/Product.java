package com.automationpractice.pojos;

public class Product {
	
	//POJO/BEAN -> A Java class with properties and constructor, and getters and setters
	
	private String productName;
	private String quantity;
	private String condition;
	private String price;
	private String size;
	private String model;
	
	
	public Product(String productName, String quantity, String condition, String price, String size, String model) {
		super();
		this.productName = productName;
		this.quantity = quantity;
		this.condition = condition;
		this.price = price;
		this.size = size;
		this.model = model;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public String getQuantity() {
		return quantity;
	}


	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}


	public String getCondition() {
		return condition;
	}


	public void setCondition(String condition) {
		this.condition = condition;
	}


	public String getPrice() {
		return price;
	}


	public void setPrice(String price) {
		this.price = price;
	}


	public String getSize() {
		return size;
	}


	public void setSize(String size) {
		this.size = size;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}
	
	
	

}

package com.automationpractice.pojos;

public class Cart {
	
	private String productName;
	private double unitPrice;
	private int quantity;
	public Cart(String productName, double unitPrice, int quantity) {
		super();
		this.productName = productName;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
		
	}
	
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	

}

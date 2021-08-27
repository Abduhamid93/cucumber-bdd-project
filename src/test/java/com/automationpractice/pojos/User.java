package com.automationpractice.pojos;

public class User {
	
	private String firstName;
	private String lastName;
	private String password;
	private String address;
	private String city;
	private String zip;
	private String phoneNo;
	public User(String firstName, String lastName, String password, String address, String city, String zip,
			String phoneNo) 
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.address = address;
		this.city = city;
		this.zip = zip;
		this.phoneNo = phoneNo;
	}
	
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	

}





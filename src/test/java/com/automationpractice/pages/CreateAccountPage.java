package com.automationpractice.pages;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.automationpractice.utilities.Driver;

public class CreateAccountPage {
	
	public CreateAccountPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	
	}
	
	@FindBy (id = "customer_firstname")
	public WebElement firstName;
	
	@FindBy (id = "customer_lastname")
	public WebElement lastName;
	
	@FindBy (id = "passwd")
	public WebElement pass;
	
	@FindBy (id = "days")
	public WebElement days;
	
	@FindBy (id = "months")
	public WebElement months;
	
	@FindBy (id = "years")
	public WebElement years;
	
	@FindBy (id = "address1")
	public WebElement address;
	
	@FindBy (id = "city")
	public WebElement city;
	
	@FindBy (id = "postcode")
	public WebElement zip;
	
	@FindBy (id = "phone_mobile")
	public WebElement phone;
	
	
	@FindBy (id = "submitAccount")
	public WebElement registerButton;
	

	@FindBy (id = "id_state")
	public WebElement state;
	
	
	
	
	public void selectDob() {
		new Select(days).selectByValue((new Random().nextInt(31)+1) + "");
		new Select(months).selectByValue((new Random().nextInt(12)+1) + "");
		new Select(years).selectByValue((new Random().nextInt(121)+1900) + "");
		
	}
	
	
	public void selectState() {
		new Select(state).selectByValue((new Random().nextInt(50)+1) + "");
		
		
	}
	
	

}

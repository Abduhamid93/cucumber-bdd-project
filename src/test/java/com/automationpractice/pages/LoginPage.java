package com.automationpractice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationpractice.utilities.Driver;

public class LoginPage {
	
	
	
	public LoginPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	
	}
	
    @FindBy (xpath = "//a[@title='Log in to your customer account']")
    public WebElement signInButton;
    
    
    @FindBy (id = "email")
    public WebElement usernameField;
    
    @FindBy (id = "passwd")
    public WebElement passwordField;
    
    @FindBy (id = "SubmitLogin")
    public WebElement loginButton;

    @FindBy (id = "email_create")
    public WebElement registerEmail;
    
    @FindBy (id = "SubmitCreate")
    public WebElement createAccountButton;

    
    
	

}

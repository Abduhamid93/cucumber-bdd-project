package com.automationpractice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationpractice.utilities.Driver;

public class MyAccountPage {
	
	public MyAccountPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	
	}
	
	@FindBy (xpath = "//a[@title='View my customer account']")
	public WebElement customerNameLink;

}

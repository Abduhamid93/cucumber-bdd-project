package com.automationpractice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationpractice.utilities.Driver;

public class ShoppingCartPage {
	
	public ShoppingCartPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	
	}
	
	
	@FindBy (xpath = "//td//p[@class='product_name']//a")
    public WebElement productName;
	
	@FindBy (xpath = "(//span[@class='price'])[2]")
    public WebElement unitPrice;
	
	@FindBy (xpath = "input[@size='2']")
    public WebElement quantityBox;
	
	@FindBy (xpath = "(//span[@class='price'])[4]")
    public WebElement totalBefore;
	
	@FindBy (id = "total_price")
    public WebElement totalAfter;
	

}

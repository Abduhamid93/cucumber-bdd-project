package com.automationpractice.stepDefs;

import org.junit.Assert;

import com.automationpractice.pages.ProductPage;
import com.automationpractice.pages.ShoppingCartPage;
import com.automationpractice.pojos.Cart;
import com.automationpractice.utilities.BrowserUtilities;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShoppingCartStepDefs {
	
	
	@When("when I increase the quantity to {int} and add to cart and proceed to checkout")
	public void whenIIncreaseTheQuantityToAndAddToCartAndProceedToCheckout(Integer times) {
	   
		
	ProductPage pp = new ProductPage();
	
	    for (int i = 0; i<times-1; i++) {
	    	pp.plusButton.click();
	    	
	    }
	    
	    pp.addToCartButton.click();
	    
	    BrowserUtilities.waitFor(2);
	    
	    pp.proceedButton.click();
	    
	    BrowserUtilities.waitFor(2);
	    
	    
	}

	@Then("I verify the following the details of the cart and prices should be correct")
	public void iVerifyTheFollowingTheDetailsOfTheCart(Cart cart) {
	    
		ShoppingCartPage sp = new ShoppingCartPage();
		BrowserUtilities.waitForPageToLoad(5);
		
		Assert.assertEquals(cart.getProductName(), sp.productName.getText());
		Assert.assertEquals(cart.getUnitPrice()+"", sp.unitPrice.getText().replace("$",""));
		Assert.assertEquals(cart.getQuantity()+"", sp.quantityBox.getAttribute("value"));
		
		
		String expectedTotalBefore = (cart.getUnitPrice()* cart.getQuantity()) + "";
		String expectedTotalAfter = (cart.getUnitPrice()* cart.getQuantity() +2) + "";
		
		Assert.assertEquals(expectedTotalBefore, sp.totalBefore.getText().replace("$",""));
		Assert.assertEquals(expectedTotalAfter, sp.totalAfter.getText().replace("$",""));
	}


}

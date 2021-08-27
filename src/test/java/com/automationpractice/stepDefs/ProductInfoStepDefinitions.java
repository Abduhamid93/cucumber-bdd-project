package com.automationpractice.stepDefs;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.automationpractice.pages.HomePage;
import com.automationpractice.pages.ProductPage;
import com.automationpractice.pojos.Product;
import com.automationpractice.utilities.Driver;
import com.automationpractice.utilities.ExcelUtils;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductInfoStepDefinitions {
	
	
	String expectedProduct;
	int expectedQuantity;
	
	
	
	@When("I click on Blouse")
	public void i_click_on_blouse() {
		
		new HomePage().blouse.click();
	    
	}

	
	@Then("The product name should be Blouse in the product page")
	public void the_product_name_should_be_blouse_in_the_product_page() {
	    
		String actual = new ProductPage().product.getText();
		
		Assert.assertEquals("Blouse", actual);
		
		
		
		
	}
	
	
	
	
	
	@When("I click on {string}") //here we are parameterizing our steps, instead of hard coding, we are making it flexible
	//you write any product here(Scenario),(instead of just blouse), it will pass keyword to the string and find it
	public void i_click_on(String product) {	
	
		new HomePage().clickOnProduct(product);
	expectedProduct = product;
	}

	@Then("The product name should be correct")
	public void the_product_name_should_be_in_the_product_page() {
	    
	String actual = new ProductPage().product.getText();
	Assert.assertEquals(expectedProduct, actual); 
	
	
		
	}
	
	
	
	@Then("The product quantity should be {int}")
	public void the_product_quantity_should_be(Integer expected) {
	   
		String actual = new ProductPage().quantityBox.getAttribute("value");
		Assert.assertEquals(expected, Integer.valueOf(actual));
		
		
		
	}
	
	
	@Then("The product price should be {double}")
	public void the_product_price_should_be(Double expected) {
	    Double actual = Double.valueOf(new ProductPage().price.getText().replace("$", ""));
	    
	    
	    Assert.assertEquals(expected, actual);
	    
	    
	}
	
	
	
	
	
	
	
	@When("I click on {word} button {int} times")
	public void i_click_on_plus_button_times(String word, Integer times) {
		
		int quantityBefore = Integer.parseInt(new ProductPage().quantityBox.getAttribute("value"));
		
		for (int i = 0; i < times; i++) {
		if(word.equals("plus")) {
			new ProductPage().plusButton.click();
		}else if(word.equals("minus")){
			new ProductPage().minusButton.click();
		}
		}
		
		
		
		
		expectedQuantity = (word.equals("plus")) ? times+quantityBefore : quantityBefore-times;
		
		
	    
		
		
	}

	@Then("The quantity should be correct")
	public void the_quantity_should_be_correct() {
		
		int quantityActual = Integer.parseInt(new ProductPage().quantityBox.getAttribute("value"));
	    
		Assert.assertEquals(expectedQuantity, quantityActual);
		
		
	}
	
	
	@Then("The product details should be the following")
	public void theProductDetailsShouldBeTheFollowing(List<Map<String, String>> dataTable) {
	   
		ProductPage pp = new ProductPage();
		String actualPrice = pp.price.getText().replace("$", "");
		String actualName = pp.product.getText();
		String actualQuantity = pp.quantityBox.getAttribute("value");
		String actualSize = pp.returnFirstSelectedOption().getText();
		String actualCondition = pp.condition.getText();
		String actualModel = pp.model.getText();
		
		
		Map<String, String> map = dataTable.get(0);
		
		Assert.assertEquals(map.get("Price"), actualPrice);
		Assert.assertEquals(map.get("Condition"), actualCondition);
		Assert.assertEquals(map.get("Product name"), actualName);
		Assert.assertEquals(map.get("Size"), actualSize);
		Assert.assertEquals(map.get("Model"), actualModel);
		Assert.assertEquals(map.get("Quantity"), actualQuantity);
		
		
	}
	
	
	
	@Then("The product details should be the following using custom type")
	public void theProductDetailsShouldBeTheFollowingUsingCustomType(Product product) {
	    
		
		ProductPage pp = new ProductPage();
		String actualPrice = pp.price.getText().replace("$", "");
		String actualName = pp.product.getText();
		String actualQuantity = pp.quantityBox.getAttribute("value");
		String actualSize = pp.returnFirstSelectedOption().getText();
		String actualCondition = pp.condition.getText();
		String actualModel = pp.model.getText();
		
		
		
		Assert.assertEquals(product.getPrice(), actualPrice);
		Assert.assertEquals(product.getCondition(), actualCondition);
		Assert.assertEquals(product.getProductName(), actualName);
		Assert.assertEquals(product.getSize(), actualSize);
		Assert.assertEquals(product.getModel(), actualModel);
		Assert.assertEquals(product.getQuantity(), actualQuantity);
	}

	
	
	
	
	
	@Then("product name should be {string}")
	public void productNameShouldBe(String expected) {
	 String actual = new ProductPage().product.getText();
	 Assert.assertEquals(expected, actual);
	}

	
	@Then("product price should be {double}")
	public void productPriceShouldBe(Double expected) {
		
		Double actual = Double.valueOf(new ProductPage().price.getText().replace("$",""));
		Assert.assertEquals(expected, actual);
	    
	}
	
	
	
	@Then("The promoted products should be displayed")
	public void thePromotedProductsShouldBeDisplayed() {
		
		//Open and read from excelFile
		
		ExcelUtils sheet = new ExcelUtils("src/test/resources/com/automationpractice/testData/testData.xlsx", "Sheet1");
		
		List<Map<String, String>> dataAsMap = sheet.getDataAsMap();
		
		
		for (Map<String, String> map : dataAsMap) {
			
			if (map.get("Execute").equalsIgnoreCase("Y")) {
				
				String product = map.get("Product");
				System.out.println(product);
				Assert.assertTrue(new HomePage().getProduct(product).isDisplayed());
				
				
			}
			
		}
		
		
	    
	}

	@Then("The details of the promoted products should be correct")
	public void theDetailsOfThePromotedProductsShouldBeCorrect() {
		
		/*Frameworks are divided into 3 Categories:
		 * Data Driven framework, Keyword-Driven framework, Hybrid-driven framework
		 * Data Driven we did here, with cucumber future files. For large data we create the utilities(script) to read data
		 * Based on keywords we execute tests - Keyword framework
		 * Hybrid-driven framework - combination of Data driven framework and Hybrid-driven framework
		 */
	    
		

		ExcelUtils sheet = new ExcelUtils("src/test/resources/com/automationpractice/testData/testData.xlsx", "Sheet1");
		
		List<Map<String, String>> list = sheet.getDataAsMap();
		
		
		for (int i = 0; i < list.size(); i++) {
			
			
			Map<String, String> eachRow = list.get(i);
			
			if(eachRow.get("Execute").equalsIgnoreCase("Y")) {
				String expectedName = eachRow.get("Product");
				String expectedPrice = eachRow.get("Price");
				String expectedModel = eachRow.get("Model");
				String expectedStyle = eachRow.get("Styles");
				String expectedComposition = eachRow.get("Composition");
				String expectedDescription = eachRow.get("Description");
				String expectedProperties = eachRow.get("Properties");
				
				
				new HomePage().clickOnProduct(expectedName);
				
				ProductPage pp = new ProductPage();
				String actualName = pp.product.getText();
				String actualPrice = pp.price.getText();
				String actualModel = pp.model.getText();
				String actualStyle = pp.style.getText();
				String actualComposition = pp.composition.getText();
				String actualDescription = pp.description.getText();
				String actualProperties = pp.properties.getText();
			
				
				try {
					Assert.assertEquals(expectedName, actualName);
					Assert.assertEquals(expectedPrice, actualPrice);
					Assert.assertEquals(expectedModel, actualModel);
					Assert.assertEquals(expectedStyle, actualStyle);
					Assert.assertEquals(expectedComposition, actualComposition);
					Assert.assertEquals(expectedDescription, actualDescription);
					Assert.assertEquals(expectedProperties, actualProperties);
					
					sheet.setCellData("PASS", "Status", i+1);
				} catch (AssertionError e) {

					e.printStackTrace();
					sheet.setCellData("FAIL", "Status", i+1);
					throw e;
				}
				
				Driver.getDriver().navigate().back();
				
			}else { 
				sheet.setCellData("SKIPPED", "Status", i+1);
				
			}
			
			
			
		}
		
		
		
	}


	


}

package com.automationpractice.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderOfExecutionStepDefs {
	
	
	@Given("I am on the first step")
	public void i_am_on_the_first_step() {
	    System.out.println("First step Background");
	}

	@Given("I execute the second step")
	public void i_execute_the_second_step() {
	   
		System.out.println("Second step Background");
	}

	@When("I execute the third step of 1st Scenario")
	public void i_execute_the_third_step_of_1st_scenario() {
		System.out.println("Third step 1st Scenario");
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
		
		System.out.println("validate the outcome");
	   
		
		
	}

	@When("I execute the third step of 2nd Scenario")
	public void i_execute_the_third_step_of_2nd_scenario() {
		
		System.out.println("Third step 2nd Scenario");
	    
	}


}

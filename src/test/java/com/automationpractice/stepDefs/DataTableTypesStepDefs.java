package com.automationpractice.stepDefs;

import java.util.List;
import java.util.Map;

import io.cucumber.java.en.Then;

public class DataTableTypesStepDefs {
	
	
	@Then("I should be able to enter the following customer info")
	public void iShouldBeAbleToEnterTheFollowingCustomerInfo(List<Map<String, String>> table) {
	    
		System.out.println(table);
	}

	@Then("I should be able to see the following airport")
	public void iShouldBeAbleToSeeTheFollowingAirport(Map<String, String> dataTable) {
	   
		System.out.println(dataTable);
	}
	
	
	@Then("I should be able to see the following airports location info")
	public void iShouldBeAbleToSeeTheFollowingAirportsLocationInfo(Map<String, List<Double>> dataTable) {
	    
		System.out.println(dataTable);
	}
	
	
	@Then("I should be able to see the following airports location info with headers")
	public void iShouldBeAbleToSeeTheFollowingAirportsLocationInfoWithHeaders(Map<String, Map<String, String>> dataTable) {
		System.out.println(dataTable);
	}

}

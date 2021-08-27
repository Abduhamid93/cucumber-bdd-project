package com.automationpractice.stepDefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.automationpractice.utilities.ConfigReader;
import com.automationpractice.utilities.Driver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	
	@Before
	public void setUp() {
		
		Driver.getDriver().manage().timeouts().
		implicitlyWait(Long.parseLong(ConfigReader.getProperty("implicitWait")), TimeUnit.SECONDS);
		
		Driver.getDriver().manage().window().maximize();
		
		
		
	}
	
	@After
	public void tearDown(Scenario scenario) {
		
		if(scenario.isFailed()) { //We are using screenshots to provide pictures of failed tests
			byte[] screenshoot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshoot, "image/png", "screenshot");
		}
		
		
		
		
		
		
		Driver.quit();
		
		
	}
	

}

package com.automationpractice.runners;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;






@RunWith(Cucumber.class)

@CucumberOptions(
		

		features = "src/test/resources/com/automationpractice/parallel",
		glue = "com/automationpractice/stepDefs",
		
		
		plugin = {"summary", 
				"pretty", 
				//"rerun:target/failed.txt",
				"html:target/builtInReport",
				"json:target/Cucumber.json" //needed for pretty report
		
		} //summary -> generate unimplemented step definitions in the console
		//pretty -> more detailed output
		
		,monochrome = true //true if terminal output should be without colors.
		
		,snippets = SnippetType.CAMELCASE //to use Camelcase,to follow certain standards
		
		,stepNotifications = true
		
		//ctrl I - is used to align in pom.xml
		
		//To run it in CMD
		//mvn verify -Dcucumber.filter.tags="@plusminus"   - to run particular test with mentioning tags
		//or we change or plugin to <include>${runner}</include>  //to run it regular runner //mvn verify -Drunner="**/*CukeRunner.java"
		
		//How to re-run failed scenarios in Cucumber?
		/*1. Change the "pretty" to "rerun:target/failed.txt" then "@fail" tag to failed tests, 
		 *2. then "@fail" tag to failed tests,  and create a new class for "fail" tests
		 * 3. "Fail" runner class we add this line: features = "@target/failed.txt",
		 * 4. Finally, in POM xml Plugin, we add: <include>***FailedScenariosRunner.java</include>
		 * 5. We need change our driver from Singleton to Driver Pool
		 */
		
		//How to run parallel scenarios in Cucumber (Junit)?
		/*1. Create a separate folder for Parallel featureFiles to run it parallel
		 * 2. Create a runner class and indicate a Parallel folder in features: (features = "src/test/resources/com/automationpractice/parallel")
		 * 3. Add the following 2 lines in your surefire plugin: <parallel>methods</parallel> , <useUnlimitedThreads>true</useUnlimitedThreads>
		 */
		
		//alt+shift+a = to copy certain elements or work with them
		//https://mockaroo.com/ - to get sample of data
		
				//,dryRun = true //skips the step definition execution
		)





//in order to run our tests by using Cucumber tool


public class ParallelRunner {
		

}

package com.basic.TestRegistrationSD;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"src/test/resources/com/basic/TestRegistrationFF/RegistrationDetails.feature",
				//"src/test/resources/com/basic/TestRegistrationFF/FileAttched.feature",
				"src/test/resources/com/basic/TestRegistrationFF/PageTitle.feature"},
		glue={"com/basic/TestRegistrationSD/"},
		//dryRun = true,
		plugin={"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report51131.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport1.html"
		}
		
		)

public class RunnerRegistrationTest {

}

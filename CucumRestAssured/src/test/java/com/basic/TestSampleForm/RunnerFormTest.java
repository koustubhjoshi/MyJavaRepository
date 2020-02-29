package com.basic.TestSampleForm;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"src/test/resources/com/basic/TestSampleFormFF/FormData.feature",
				"src/test/resources/com/basic/TestSampleFormFF/EnterPersonalData.feature",
				"src/test/resources/com/basic/TestSampleFormFF/EnterUserPwd.feature"},
		glue={"com/basic/TestSampleForm/"},
		//dryRun = true,
		plugin={"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report51131.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport1.html"
		}
		
		)

public class RunnerFormTest {

}

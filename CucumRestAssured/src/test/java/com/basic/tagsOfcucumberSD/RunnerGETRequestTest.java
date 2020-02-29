package com.basic.tagsOfcucumberSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		tags={"@Important"}, //All scenario executed if this is tag for feature file
		//tags={"@Smoke"}, //only tag with @Smoke
		//tags={"@Smoke","@Regression"}, //AND condition
		//tags={"@Smoke,@Regression"} , // OR condiction
		//tags = {"~@Smoke"},  // this will exclude the scenario with @SmokeTest
		monochrome=true,
		dryRun=false,
		features= {"src/test/resources/com/basic/tagsOfcucumberFF/"},
		glue={"com/basic/tagsOfcucumberSD/"},
		plugin={"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report11121.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport1.html"
		}

		
		)

public class RunnerGETRequestTest {

}

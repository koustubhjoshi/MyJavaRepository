package com.basic.postStringJsonSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	
@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome=true,
		dryRun=false,
		plugin={"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report774.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport1.html"
		}
		
		)
		

public class RunMyPostFromTextFileTest {


}

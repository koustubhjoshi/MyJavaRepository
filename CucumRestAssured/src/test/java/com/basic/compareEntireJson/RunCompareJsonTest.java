package com.basic.compareEntireJson;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	
@RunWith(Cucumber.class)
@CucumberOptions(
			
		plugin={"pretty",
					"html:target/cucumber-htmlreport",
					"json:target/cucumber-report86105.json",
					"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport1.html"
			}
			
		)
		

public class RunCompareJsonTest {


}

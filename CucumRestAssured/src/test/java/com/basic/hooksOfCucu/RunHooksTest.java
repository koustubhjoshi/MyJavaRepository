package com.basic.hooksOfCucu;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.junit.Cucumber;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


	
@RunWith(Cucumber.class)
@CucumberOptions(
		plugin={"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report2439.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport1.html"
		})

public class RunHooksTest {
	
	


}

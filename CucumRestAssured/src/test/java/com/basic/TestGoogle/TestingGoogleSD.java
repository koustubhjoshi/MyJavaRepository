package com.basic.TestGoogle;

import org.junit.Assert;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import io.restassured.RestAssured;
import io.restassured.response.Response;


public class TestingGoogleSD {
	
	Response res;
	
	@Given("^I start rest assured testing$")
	public void i_start_rest_assured_testing()  {
		System.out.println("starting test case");
	}

	@When("^I hit google website$")
	public void i_hit_google_website()  {
		res = RestAssured.given().get("https://google.com");
	}

	@Then("^I check the status code from response$")
	public void i_check_the_status_code_from_response()  {
	   int stCode = res.getStatusCode();
	   Assert.assertTrue(stCode ==200);
	}

}

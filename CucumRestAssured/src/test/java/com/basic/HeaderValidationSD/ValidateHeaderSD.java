package com.basic.HeaderValidationSD;

import java.util.List;

import org.junit.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class ValidateHeaderSD {
	
	Response res;
	
	@Given("^user start the rest assured test$")
	public void user_start_the_rest_assured_test() {
			System.out.println("Starting of the GET script");
	
	}

	@Then("^user checks headers \"([^\"]*)\" have \"([^\"]*)\" value$")
	public void user_checks_headers_have_value(String headerName, String headerValue) throws Throwable {
	    
		res = RestAssured.given().relaxedHTTPSValidation().get("https://ergast.com/api/f1/2017/circuits.json");
		String completeResponse = res.asString();
		System.out.println("============"+completeResponse);
	
		Headers heads = res.getHeaders();
		String actualHeaderValue = heads.getValue(headerName);
		Assert.assertTrue(actualHeaderValue.equals(headerValue));
	}


	
}

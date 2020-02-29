package com.basic.authentication;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.Assert;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class MyAuthenticationstepdef {

	Response resp;
	
		
	@When("^user hit the get request with username and password$")
	public void user_hit_the_get_request_with_username_and_password(){
		//Response resp = 
		resp = RestAssured.given().auth().basic("username", "password").relaxedHTTPSValidation().
					when().get("http://www.google.com");
		System.out.println("first step done");
	}
	
	@Then("^user checks the status code$")
	public void user_checks_the_status_code(){
		
		int statCode = resp.getStatusCode();
		Assert.assertEquals(200, statCode);
	}
	
}

package com.basic.MyGoogleRestAssured;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestGoogleStatusCodeSD {
	
	Response res ;
	
	@Given("^User hit google applicaiton$")
	public void User_hit_google_applicaiton(){
		res = RestAssured.given().get("https://www.google.com");
	}
	
	
	@Then("^user checks \"([^\"]*)\" status code$")
	public void user_checks_status_code(String sCode){
		int expectedScode = Integer.parseInt(sCode);
		int statCode = res.getStatusCode();
		System.out.println("status code = "+statCode);
		Assert.assertTrue(expectedScode==statCode);
		
	}

}

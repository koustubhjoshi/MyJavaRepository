package com.basic.MyGoogleRestAssured;



import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class MyStefDef {
	
	Response res;
	
	@Given("^google have website$")
	public void google_have_website(){
		System.out.println("Yes");
	}
	
	@When("^I hit google application^")
	public void I_hit_google_application(){
		res = RestAssured.get("https://google.com/");
	}
	
	@Then("^I validate status code^")
	public void I_validate_status_code(){
		int actualStatCode = res.getStatusCode();
		System.out.println("actualStatCode ="+actualStatCode);
		Assert.assertTrue(200==actualStatCode);
	}

}

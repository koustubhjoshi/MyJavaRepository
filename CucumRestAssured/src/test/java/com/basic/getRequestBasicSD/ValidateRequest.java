package com.basic.getRequestBasicSD;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ValidateRequest {
	
	Response res;
	
	@Given("^race circuite application is running$")
	public void race_circuite_application_is_running() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Application is running");
	   
	}

	@When("^I hit get request to get response$")
	public void i_hit_get_request_to_get_response() {
	    // Write code here that turns the phrase above into concrete actions
		res = RestAssured.get("https://ergast.com/api/f1/2017/circuits.json");
		String actualData = res.getBody().asString();
		System.out.println("Data=    "+actualData);
		
	}

	@Then("^I validate circuite limit value$")
	public void i_validate_circuite_limit_value() {
	    // Write code here that turns the phrase above into concrete actions
		String limitvalue = res.body().jsonPath().getString("MRData.limit");
		Assert.assertTrue(limitvalue.equals("30"));
	}
	
	@Then("^I validate circuite ID value$")
	public void i_validate_circuite_ID_value() {
		String totalValue = res.body().jsonPath().getString("MRData.total");
		int totalIntV = Integer.parseInt(totalValue);
		
		for(int i=0;i<totalIntV;i++)
		{
		String idvalue = res.body().jsonPath().getString("MRData.CircuitTable.Circuits["+i+"].circuitId");
		if(idvalue.equals("americas")){
			Assert.assertTrue(idvalue.equals("americas"));
			break;
		}else{
			if(i==totalIntV-1){
				Assert.assertTrue(false);
			}
		}	
	}
}
	@Then("^I validate circuite total value$")
	public void i_validate_circuite_total_value() {
		String totalValue = res.body().jsonPath().getString("MRData.total");
		Assert.assertTrue(totalValue.equals("20"));
		
	}
	
	@Then("^I validate circuite \"([^\"]*)\" value as \"([^\"]*)\" present$")
	//using regular expression
	public void i_validate_circuite_value_as_present(String jpath, String ValtoValidate)
	{
	String attrValue = res.body().jsonPath().getString(jpath);
	Assert.assertTrue(attrValue.equals(ValtoValidate));
	}
}
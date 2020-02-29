package com.basic.datatableForGetRequestSD;

import java.util.List;

import org.junit.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class DatatableGETRequestTestSD {
	
	Response res;
	
	@Given("^user start the rest asured test$")
	public void user_start_the_rest_asured_test() throws Throwable {
		System.out.println("Starting of the GET script");
	}

	@When("^user hit the get request$")
	public void user_hit_the_get_request() throws Throwable {
		res = RestAssured.given().relaxedHTTPSValidation().get("https://ergast.com/api/f1/2017/circuits.json");
		String completeResponse = res.asString();
		System.out.println("================="+completeResponse);
	}
	@Then("^user checks the \"([^\"]*)\" count or size$")
	public void user_checks_the_count_or_size(String limit) throws Throwable {
	    String actualLiming = res.body().jsonPath().getString("MRData.limit");
	    Assert.assertTrue(actualLiming.equals(limit));
	}
	@Then("^user validate following in json$")
	public void user_validate_following_in_json(DataTable table) throws Throwable {
		List<List<String>> data = table.raw();
		//rows
		int rows = data.size();
		//columns
		int cols = data.get(0).size();
		//row 1
//		String values1 = data.get(0).get(0);
//		String values2 = data.get(0).get(1);
		for(int i = 0; i< rows;i++){
				String path = data.get(i).get(0);
				String value = data.get(i).get(1);
				String actualLiming = res.body().jsonPath().getString(path);
				Assert.assertTrue(actualLiming.equals(value));
		}
		
		
		
		
	//	String actualLiming = res.body().jsonPath().getString(jsnpath);
	//	Assert.assertTrue(actualLiming.equals(value));
		
		
		
		
		
		
	}

}

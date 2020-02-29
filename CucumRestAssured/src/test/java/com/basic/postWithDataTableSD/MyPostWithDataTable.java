package com.basic.postWithDataTableSD;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import org.json.JSONObject;
import org.junit.Assert;


public class MyPostWithDataTable {
	 
	Response resp ;
	
	@Given("^user hit the post request with \"([^\"]*)\" name$")
	public void user_hit_the_post_request_with_json_data(String username) throws IOException{
		
		//Read data from file
		String data = ""; 
	    data = new String(Files.readAllBytes(Paths.get("D:\\IBM\\workspace\\CucuRestAssured\\src\\test\\java\\com\\basic\\postFromTextFileSD\\user.json"))); 
	    System.out.println("json in String ==== " +data);
	    
	    //Update the data
	    JSONObject object=new JSONObject(data);
	    object.put("name", "Anil");
	    String newJsonStr = object.toString();
	    System.out.println("json in String ==== " +newJsonStr);
	    
	    //Do POST request
	    resp = RestAssured.given().accept(ContentType.JSON).relaxedHTTPSValidation().
				when().body(newJsonStr).post("https://reqres.in/api/users");
		

		
	}
	
	@Then("^user validate followind data$")
	public void user_validate_followind_data(DataTable table){
		
		
		
		List<List<String>> data = table.raw();
//		int i = data.size();
//		int j = data.get(0).size();
		
		//row 1
		String values1 = data.get(0).get(0);
		String values2 = data.get(0).get(1);
		
		//row 2
		String values3 = data.get(1).get(0);
		String values4 = data.get(1).get(1);
		
		String values5 = data.get(2).get(0);
		String values6 = data.get(2).get(1);
		
		int statusCode = resp.getStatusCode();
		int expStatusCode = Integer.parseInt(values6);
		
		Assert.assertTrue(expStatusCode==statusCode);
		
		//check id is greater than zero
		String idValue = resp.getBody().jsonPath().get("id");
		int idInt = Integer.parseInt(idValue);
		Assert.assertTrue(idInt > 0);
		
	}
	
	@Then("I will validate other parameter")
	public void I_will_validate_other_parameter(){
		System.out.println("last line of code ");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
 
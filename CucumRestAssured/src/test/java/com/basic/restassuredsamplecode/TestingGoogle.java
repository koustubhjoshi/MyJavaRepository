package com.basic.restassuredsamplecode;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestingGoogle {
	
	public static void main(String args[]){
		
		
		Response res = RestAssured.given().get("https://google.com/afd");
		int stCode = res.getStatusCode();
		System.out.println("Status code is = "+stCode);
		
		//Assert.asserttr
		
		
	}

}

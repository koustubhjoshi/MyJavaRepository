package com.basic.MyGoogleRestAssured;

import org.junit.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class MyBasicGoogleStatusCodeCheck {
	
	public static void main(String args[]){
		
		Response res = RestAssured.given().get("https://www.google.com/");
		int statCode = res.getStatusCode();
		System.out.println("status code = "+statCode);
		Assert.assertTrue(200==statCode);
		
	}

}

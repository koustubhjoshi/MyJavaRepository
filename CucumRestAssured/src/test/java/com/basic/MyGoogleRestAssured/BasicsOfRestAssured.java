package com.basic.MyGoogleRestAssured;


import org.junit.Assert;
//import org.testng.Assert;
//import org.testng.annotations.Test;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class BasicsOfRestAssured {

//	public static void main(String[] args) {
//		
//		
//		Response res = RestAssured.get("https://google.com/");
//		int actualStatCode = res.getStatusCode();
//		System.out.println("actualStatCode ="+actualStatCode);
//		Assert.assertTrue(200==actualStatCode);
//
//	}
	
	@Test
	public void TestGoogle() {
		Response res = RestAssured.get("https://google.com/");
		int actualStatCode = res.getStatusCode();
		System.out.println("actualStatCode ="+actualStatCode);
		Assert.assertTrue(200==actualStatCode);

	}
	
	@Test
	public void TestF1() {
		Response res = RestAssured.get("http://ergast.com/api/f1/2017/circuits.json");
		int actualStatCode = res.getStatusCode();
		System.out.println("actualStatCode ="+actualStatCode);
		Assert.assertTrue(200==actualStatCode);
		
		String actualData = res.getBody().asString();
		System.out.println("Data =    "+actualData);
		
		

	}

}

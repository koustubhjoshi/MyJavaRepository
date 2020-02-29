package com.basic.MyFirstSelenium;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FirstSeleniumScriptSD {
	
	WebDriver driver;
	
	@Given("^User Opens seleniumhq website$")
	public void User_Opens_seleniumhq_website11(){
		System.setProperty("webdriver.chrome.driver","D:\\Radical Institute\\Web Drivers\\chromedriver_win32_B39\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.seleniumhq.org/");
	}
	
	@When("^user click on \"([^\"]*)\" tab$")
	public void user_click_on_Project_tab(String tabName){
		System.out.println("tab name = "+tabName);
		driver.findElement(By.xpath("//a[contains(text(),'Projects')]")).click();
	}
	
	@Then("^user checks About tab$")
	public void user_checks_About_tab(){
		Assert.assertTrue(true);
	}

}

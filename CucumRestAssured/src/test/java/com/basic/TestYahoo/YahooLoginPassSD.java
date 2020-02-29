package com.basic.TestYahoo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class YahooLoginPassSD {
	
	WebDriver driver;
	
	@Given("^User Opens Yahoo website$")
	public void user_Opens_Yahoo_website() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Launching Yahoo.com");
		System.setProperty("webdriver.chrome.driver","D:\\Radical Institute\\Web Drivers\\chromedriver_win32_B39\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/?.src=ym&.lang=en-GB&.intl=gb&.done=https%3A%2F%2Fmail.yahoo.com%2Fd");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	}

	@When("^User uncheck stay signed in checkbox$")
	public void user_uncheck_stay_signed_in_checkbox() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User uncheck checkbox");
		driver.findElement(By.xpath("//div/div/span/label[contains(text(),'')]")).click();
		Thread.sleep(2000);
	}

	@Then("^User enters \"([^\"]*)\" and \"([^\"]*)\" to validate login$")
	public void user_enters_and_to_validate_login(String Uname, String Pass) throws InterruptedException  {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Entering yahoo username & pass");
		driver.findElement(By.xpath("//div/input[@id='login-username']")).sendKeys(Uname);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div/input[@id='login-signin']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div/input[@id='login-passwd']")).sendKeys(Pass);
	   	
	}	

}

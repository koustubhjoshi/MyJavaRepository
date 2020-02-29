package com.basic.TestSampleForm;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ValidateForm {

	WebDriver driver;
	
	@Given("^User Opens form website$")
	public void user_Opens_form_website() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","D:\\Radical Institute\\Web Drivers\\chromedriver_win32_B39\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
	}

	@When("^User navigate to registration form$")
	public void user_navigate_to_registration_form() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//a/img[@id='enterimg']")).click();
		Thread.sleep(3000);
	}

	@When("^User Validate web title$")
	public void user_Validate_web_title() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
		String Actualtitle = driver.getTitle();
	    String expecttile = "Register";
	    System.out.println(Actualtitle);
	    System.out.println(expecttile);
	    Assert.assertEquals(Actualtitle, expecttile);
	    Thread.sleep(1000);
	}
	
	@When("^User select the personal details$")
	public void user_select_the_personal_details() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div/label/input[@value='Male']")).click();
		//Check Box
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div/div/input[@value='Movies']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div/input[@value='Hockey']")).click();
		
		Thread.sleep(1000);
		WebElement ele = driver.findElement(By.xpath("//div/select[@id='Skills']"));
		Select sel = new Select(ele);
		//sel.selectByVisibleText("Android");
		sel.selectByIndex(4);
		
		Thread.sleep(1000);
		WebElement country = driver.findElement(By.xpath("//div/select[@id='countries']"));
		Select country1 = new Select(country);
		country1.selectByVisibleText("India");
		
	}

	@Then("^User enters values in \"([^\"]*)\" also \"([^\"]*)\" also \"([^\"]*)\" also \"([^\"]*)\" also \"([^\"]*)\" fields$")
	public void user_enters_values_in_also_also_also_also_fields(String fname, String lname, String adrs, String eadrs, String ph) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div/input[@placeholder='First Name']")).sendKeys(fname);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div/input[@placeholder='Last Name']")).sendKeys(lname);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div/textarea[@ng-model='Adress']")).sendKeys(adrs);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div/input[@type='email']")).sendKeys(eadrs);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div/input[@type='tel']")).sendKeys(ph);
		
	}

	@Then("^User enters values in \"([^\"]*)\" also \"([^\"]*)\" fields$")
	public void user_enters_values_in_also_fields(String pwd, String cpwd) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div/input[@id='firstpassword']")).sendKeys(pwd);
		driver.findElement(By.xpath("//div/input[@id='secondpassword']")).sendKeys(cpwd);
	}

	

}

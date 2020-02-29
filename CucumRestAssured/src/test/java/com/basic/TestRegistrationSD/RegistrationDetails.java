package com.basic.TestRegistrationSD;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegistrationDetails {
	
	WebDriver driver;	
	
	@Given("^User Opens form website$")
	public void user_Opens_form_website() throws InterruptedException  {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","D:\\Radical Institute\\Web Drivers\\chromedriver_win32_B39\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
	}

	@When("^User navigate to registration form$")
	public void user_navigate_to_registration_form() throws InterruptedException  {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.xpath("//a/img[@id='enterimg']")).click();
		 Thread.sleep(1000);
	}

	@Then("^User enters details$")
	public void user_enters_details(DataTable table) throws InterruptedException  {

		List<List<String>> data = table.raw();
		//rows
		int rows = data.size();
		//columns
		int cols = data.get(0).size();
		System.out.println("Total Rows = "+ rows);
		System.out.println("Total Coloums = "+ cols);
		
		//Enter Data
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div/input[@placeholder='First Name']")).sendKeys(data.get(1).get(1));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div/input[@placeholder='Last Name']")).sendKeys(data.get(2).get(1));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div/textarea[@ng-model='Adress']")).sendKeys(data.get(3).get(1));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div/input[@type='email']")).sendKeys(data.get(4).get(1));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div/input[@type='tel']")).sendKeys(data.get(5).get(1));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div/input[@id='firstpassword']")).sendKeys(data.get(6).get(1));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div/input[@id='secondpassword']")).sendKeys(data.get(7).get(1));
	}
	
	@When("^User select personal data$")
	public void user_select_personal_data() throws InterruptedException {
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
	
	@When("^Verify title of the page$")
	public void verify_title_of_the_page() {
	    // Write code here that turns the phrase above into concrete actions
	 String actual = driver.getTitle();
	 String expected = "Register";
	 Assert.assertEquals(actual, expected);
	 System.out.println("Actual title = "+ actual + "Expected title = " + expected);
	}

	@Given("^User provide attachment$")
	public void user_provide_attachment() throws InterruptedException, AWTException {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//div/input[@type='file']"));
		Thread.sleep(2000);
		StringSelection ss = new StringSelection("D:\\Radical Institute\\Attachments\\SamplePic.jpeg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		Robot robot =new Robot();
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		System.out.println("User attachment done");
	}

	
	
	
}


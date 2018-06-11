package stepDefinition;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	
	WebDriver driver;

	@Given("^I am in Login Page$")
	public void i_am_in_Login_Page() throws Throwable {
	    
		System.setProperty("webdriver.chrome.driver", "E://Automation Softwares//Unzipped Files//Drivers//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("http://opensource.demo.orangehrmlive.com");
	}

	@When("^I enter Invalid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_Invalid_and(String Username, String Password) throws Throwable {
	    
		driver.findElement(By.id("txtUsername")).sendKeys(Username);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
		driver.findElement(By.id("btnLogin")).click();
	}

	@Then("^I should not be able to login$")
	public void i_should_not_be_able_to_login() throws Throwable {
	    
		if(driver.getCurrentUrl().equalsIgnoreCase("http://opensource.demo.orangehrmlive.com/index.php/auth/login")) {
			System.out.println("Test Case Passed");
		} else {
			System.out.println("Test Case Failed");
		}
		driver.close();
	}

	@When("^I enter Valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_Valid_and(String Username1, String Password1) throws Throwable {
	   
		driver.findElement(By.id("txtUsername")).sendKeys(Username1);
		driver.findElement(By.id("txtPassword")).sendKeys(Password1);
		driver.findElement(By.id("btnLogin")).click();
	}

	@Then("^I should be able to login$")
	public void i_should_be_able_to_login() throws Throwable {
	    
		if(driver.getCurrentUrl().equalsIgnoreCase("http://opensource.demo.orangehrmlive.com/index.php/dashboard")) {
			System.out.println("Test Case Passed");
		} else {
			System.out.println("Test Case Failed");
		}
		driver.close();
	}
	
	
}

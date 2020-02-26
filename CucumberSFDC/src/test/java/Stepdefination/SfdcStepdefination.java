package Stepdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SfdcStepdefination {
	WebDriver driver;
	

@Given("^: lunch of browser and enter the sfdc url$")
public void lunch_of_browser_and_enter_the_sfdc_url() throws Throwable {
		
	
		System.setProperty("webdriver.chrome.driver","C:\\jyoti\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		 Thread.sleep(3000);
		
	}

	@When("^: enter the valid name and password$")
	public void enter_the_valid_name_and_password() throws Throwable {
		driver.findElement(By.id("username")).sendKeys("naik.jyoi12-tq3n@force.com");
		driver.findElement(By.id("password")).sendKeys("Ishi1234");
		driver.findElement(By.id("Login")).click();
		 
	}

	@Then("^: sfdc application homepage display$")
	public void sfdc_application_homepage_display() throws Throwable {
		System.out.println("Browser lunch is completed and user successfully login the page");
	   
	}

	@Given("^:username and password given$")
	public void username_and_password_given() throws Throwable {
		 lunch_of_browser_and_enter_the_sfdc_url();
	
	}

	@When("^: enter the invalid name and password$")
	public void enter_the_invalid_name_and_password() throws Throwable {
		driver.findElement(By.id("username")).sendKeys("naik.jyo12-tq3n@force.com");
		driver.findElement(By.id("password")).sendKeys("Isi1234");
		driver.findElement(By.id("Login")).click();
	}

	@Then("^: sfdc application does not open homepage$")
	public void sfdc_application_does_not_open_homepage() throws Throwable {
	    System.out.println("errormessage");

}

     @Given("^: only username given$")
	public void lunch_the_browser_and_url() throws Throwable {
		 lunch_of_browser_and_enter_the_sfdc_url();
	
	}

	@When("^: enter the valid name$")
	public void enter_the_valid_name() throws Throwable {
		driver.findElement(By.id("username")).sendKeys("naik.jyo12-tq3n@force.com");
		
	   
	}

	@Then("^:click on the forgot password$")
	public void click_on_the_forgot_password() throws Throwable {
		driver.findElement(By.id("forgot_password_link")).click();
	 
	}

	@Then("^: neviagate to forgot password page$")
	public void neviagate_to_forgot_password_page() throws Throwable {
	  
		  System.out.println("forgot password page display");
	}
}

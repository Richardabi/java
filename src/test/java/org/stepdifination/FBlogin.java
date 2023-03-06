package org.stepdifination;

import org.openqa.selenium.By;
import org.sam.BaseClass1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FBlogin extends BaseClass1 {
	
	@Given("To launch the chrome brower and maximize the windowe")
	public void to_launch_the_chrome_brower_and_maximize_the_windowe() {
	   launchBrowser();
	   windowMaximize();
	}

	@When("To launch the url of facebook application")
	public void to_launch_the_url_of_facebook_application() {
		launchUrl("https://en-gb.facebook.com/");
	  
	}

	@When("To pass valid username in email field")
	public void to_pass_valid_username_in_email_field() {
		driver.findElement(By.id("email")).sendKeys("abcdef@gmail.com");
	    
	}

	@When("To pass invalid password in password field")
	public void to_pass_invalid_password_in_password_field() {
		driver.findElement(By.id("pass")).sendKeys("12345");
	 
	}

	@When("To click the login button")
	public void to_click_the_login_button() {
		driver.findElement(By.xpath("//button[@name='login']")).click();
	   
	}

	@When("to check wheather navigate to the home page or not")
	public void to_check_wheather_navigate_to_the_home_page_or_not() {
	
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
		closeEntireBrowser();
	  
	}

}

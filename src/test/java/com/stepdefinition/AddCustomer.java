package com.stepdefinition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddCustomer {
	static WebDriver driver;
	@Given("user launches telecom home page")
	public void user_launches_telecom_home_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abdul\\OneDrive\\Desktop\\Cucumber\\target\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://adactin.com/HotelApp/");
	}

	@Given("User click on add customer button")
	public void user_click_on_add_customer_button(){
		driver.findElement(By.xpath("//a[text()='New User Register Here']")).click();
	}
	
	@When("User enters all the fields")
	public void user_enters_all_the_fields() {
			driver.findElement(By.id("username")).sendKeys("Maniakandan");
			driver.findElement(By.id("password")).sendKeys("12345");
			driver.findElement(By.id("re_password")).sendKeys("12345");
			driver.findElement(By.id("full_name")).sendKeys("ManikandanRaja");
			driver.findElement(By.id("email_add")).sendKeys("mr@gmail.com");
			String val = driver.findElement(By.id("captcha")).getText();
			driver.findElement(By.id("captcha-form")).sendKeys(val);
			driver.findElement(By.id("tnc_box")).click();
			
	}

	@When("User click on submit button")
	public void user_click_on_submit_button() {
		driver.findElement(By.id("Submit")).click();
	}

	@Then("User should be display cutomer id")
	public void user_should_be_display_cutomer_id() {
     
	}



}

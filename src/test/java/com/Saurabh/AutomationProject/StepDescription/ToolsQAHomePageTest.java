package com.Saurabh.AutomationProject.StepDescription;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.Saurabh.AutomationProject.Utilities.HelperClass;
import  io.cucumber.java.en.Given;
import  io.cucumber.java.en.Then;
import  io.cucumber.java.en.And;

public class ToolsQAHomePageTest extends HelperClass{
	
	public WebDriver driver;
	
	@Given("user loads the Tools QA website url")
	public void user_loads_the_Tools_QA_website_url() {
		try {
			driver=initializeDriver();
			driver.get(prop.getProperty("url"));
			
		} catch (IOException e) {
			Assert.assertFalse(true, e.getMessage());;
			
		}
		
	}
	
	@Then("user clicks on the elements tab")
	public void user_clicks_on_the_elements_tab() {
		//driver.findElement(By.xpath("//div[@class='avatar mx-auto white']")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String script="document.querySelector(\"#app > div > div > div.home-body > div > div:nth-child(1)\").click()";
		js.executeScript(script);
	}
	
	@And("validate elements page is loaded successfully")
	public void validate_elements_page_is_loaded_successfully() {
		System.out.println(driver.findElement(By.xpath("//div[@class='main-header']")).getText());
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class='main-header']")).getText().equalsIgnoreCase("Elements"));
		
	}

}
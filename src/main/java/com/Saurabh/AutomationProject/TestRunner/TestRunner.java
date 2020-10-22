package com.Saurabh.AutomationProject.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src\\main\\java\\com\\Saurabh\\AutomationProject\\Sceanrios\\homePage.feature",
glue="com\\Saurabh\\AutomationProject\\StepDescription")
public class TestRunner extends AbstractTestNGCucumberTests{
	
	
	

}

package com.Saurabh.AutomationProject.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class HelperClass {
	
	
	public  Properties prop;
	public WebDriver driver;
	public  WebDriver initializeDriver() throws IOException {
		
		FileInputStream fis=new FileInputStream(new File("src\\main\\java\\com\\Saurabh\\AutomationProject\\Utilities\\framework.properties"));
		prop=new Properties();
		prop.load(fis);
		
		if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\saura\\current selenium\\browsers\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(prop.getProperty("browser").equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\saura\\current selenium\\browsers\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else{
			System.setProperty("webdriver.ie.driver", "C:\\Users\\saura\\current selenium\\browsers\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		return driver;
	}
	

}

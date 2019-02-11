package com.rally.automation;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BasePageTest  {

	protected WebDriver driver;
	Properties properties;
	String userEmail;
	String userPassword;
	String path;

	public BasePageTest() {

		try {
			FileInputStream inputFile = new FileInputStream("C:\\Users\\Sravani Reddy\\Documents\\Selenium\\RallyThe4th\\configs\\browserConfig.properties");
			properties = new Properties();
			properties.load(inputFile);

		} catch (Exception exp) {

			System.out.println("file is not found");
		} 

	}

	public String setUpTest()
	{
		path = properties.getProperty("Chrome");
		System.out.println(path);

		return path;
	}
	public String userNameDetails()
	{
		userEmail = properties.getProperty("userName");
		return userEmail;

	}

	public String passwordDetails()
	{
		userPassword = properties.getProperty("password");
		return userPassword;

	}

}

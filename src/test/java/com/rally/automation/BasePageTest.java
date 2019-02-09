package com.rally.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class BasePageTest {
	
	protected WebDriver driver;
	LandingPage landingPage;
	
	
	@BeforeSuite
	public void beforeSuite() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sravani Reddy\\Documents\\Selenium\\chromedriver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--disable-notifications");

		driver = new ChromeDriver();

		driver.get("https://rally1.rallydev.com/slm/login.op");
		 landingPage = PageFactory.initElements(driver, LandingPage.class );
		landingPage.login();
		
	}
	

	@BeforeTest
	public void beforeTest() {
		
		
	}
	@Test
	public void inviteUsersFromLandingPage() {
		 landingPage = PageFactory.initElements(driver, LandingPage.class );
		 landingPage.inviteUsers();
		
		
	}
	@Test(priority=2)
	public void editProfile() {
		landingPage.editProfile();
	}
	
	
	
	@AfterTest
	public void afterTest() {
		driver.close();
		
	}
	
	
	
	
	

}

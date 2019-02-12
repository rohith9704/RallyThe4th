package com.rally.automation;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LandingPageTest extends BasePageTest {
	WebDriver driver;
	LandingPage landingPage;

	@BeforeTest
	public void intialisation(String browser) throws Exception{

		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--disable-notifications");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		driver.get("https://rally1.rallydev.com/slm/login.op");
		landingPage = PageFactory.initElements(driver, LandingPage.class );

		landingPage.doLogin(userEmail, userPassword);

	}

	@Test(priority=1, groups= {"Smoke"})
	public void inviteUsersFromLandingPage() {
		landingPage = PageFactory.initElements(driver, LandingPage.class );
		landingPage.inviteUsers();


	}
	@Test(priority=2, groups= {"Smoke"})
	public void editProfile() {
		landingPage.editProfile();
	}

	@AfterTest
	public void afterTest() {
		driver.close();

	}

}

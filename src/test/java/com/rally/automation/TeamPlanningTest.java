package com.rally.automation;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TeamPlanningTest {
	
	protected WebDriver driver;
	
	TeamPlanningPage teamPlanningPage = null;
	LoginPage loginPage = null;
	
	@BeforeTest
	public void initialize() throws IOException{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\win10\\Documents\\Automation\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://rally1.rallydev.com/#/282343664832d/teamplan");
		loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.login("madhoo@eaglesi.co", "123123Aa");
		teamPlanningPage = PageFactory.initElements(driver, TeamPlanningPage.class);
	}
	
	@Test(priority = 1)
	public void enterAddNew() {
		teamPlanningPage.clickOnAddNew();
	}
	@Test(priority = 2)
	public void enteringName() {
		teamPlanningPage.enterName("sairamreddy");
	}
	@Test(priority = 3)
	public void enteringDetails() {
		teamPlanningPage.enterDetails();
	}
	@Test(priority = 4)
	public void enteringCreateStory() {
		teamPlanningPage.enterCreateStory();
	}
	
	@AfterTest
	public void TeardownTest() {
		driver.quit();
	}

}

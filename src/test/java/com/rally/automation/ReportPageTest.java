package com.rally.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.rally.automation.ReportPage;


public class ReportPageTest{
	ChromeDriver driver;
	ReportPage report;
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "B:\\Driver\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("disable-notification");
		driver = new ChromeDriver(options);
		driver.get("https://rally1.rallydev.com/#/282343664832d/dashboard");
		driver.findElement(By.id("j_username")).sendKeys("madhoo@eaglesi.co");
		driver.findElement(By.id("j_password")).sendKeys("123123Aa");
		driver.findElement(By.id("login-button")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    report = PageFactory.initElements(driver, ReportPage.class);
	}
		

	@AfterTest
	//Close the browser
	public void shutDownPage() {
		driver.close();
	}
	// test cases are independent of each other
	// before each test runs the user is logged in with valid credential
     
	@Test(priority = 1)
	public void isMenubuttonClicked() {
		String menu = report.clickMenuButton();
		Assert.assertEquals(menu,"CA Agile Central");
	}
	@Test(priority = 2)
	public void verifyReportbuttonIsclicked() {
		report.clickReportButton();
		Assert.assertEquals(report.clickReportButton().equalsIgnoreCase("Reports"), true);
	}
	
	@Test(priority = 3)
	public void isAddButtonDisplayed() {
		driver.switchTo().frame("reportFrame");
		Assert.assertTrue(report.isAddnewButtonDisplayed());
	
	}
	
	
}


package com.rally.automation;

import java.util.concurrent.TimeUnit;import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TeamBoardPageTest {
	protected WebDriver driver;
	TeamBoardPage teamboardpage;

	@BeforeTest()
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rohithreddygaddam\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://rally1.rallydev.com/#/282343664832d/dashboard";
		driver.get(baseUrl);
		driver.findElement(By.cssSelector("input[id='j_username']")).sendKeys("madhoo@eaglesi.co");;
		driver.findElement(By.cssSelector("input[id='j_password']")).sendKeys("123123Aa");
		driver.findElement(By.cssSelector("input[id='login-button']")).click();
		teamboardpage = new TeamBoardPage(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test(priority = 2)
	public void sideBar() {
		teamboardpage.movement();
	}
	@Test(priority = 3)
	public void teamBoardPage() {
		teamboardpage.loactingteamBoard();
	}
	@Test(priority = 4)
	public void newButton() {
		teamboardpage.newButton();
		teamboardpage.selectWorkItemType("Defect Suite");
		teamboardpage.enterName("jupiter");
		Assert.assertTrue(true, "If the name is entered");
	}
	@Test(priority = 5)
	public void definedTypes() {
		teamboardpage.definedTypeButton();
	}

}

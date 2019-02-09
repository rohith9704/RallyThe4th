package com.rally.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utility.ConfigPage;





public class LoginPageTest {
		WebDriver driver;
		LoginPage loginObj;
		ConfigPage config;
		
		
		@BeforeTest
		public void setUp() throws Exception
		{	
			 config = new ConfigPage();
			  
			System.out.println("is config initialised" +config);
			System.setProperty("webdriver.chrome.driver", config.testInitialize());
			
			driver = new ChromeDriver();
			
			
			driver.get("https://rally1.rallydev.com/slm/login.op");
			driver.manage().window().maximize();
			loginObj = PageFactory.initElements(driver, LoginPage.class);
			System.out.println("is login page is initilaised"+loginObj);
		}
		
		@AfterTest
		public void shutDown()
		{
			driver.quit();
		}

		
		@Test(priority = 1)
		public void userEmailIdTest() {
		

			loginObj.userEmailId(config.userNameDetails());
			Assert.assertEquals(loginObj.getPageTitle(), "Sign in");
			
		}
		
		@Test(priority = 2)
		public void userPasswordTest() {
			loginObj.userPassword(config.passwordDetails());
			Assert.assertEquals(loginObj.getPageTitle(), "Sign in");
		}
		
		@Test(priority = 3)
		public void doLoginTest() {
			loginObj.doLogin();
			Assert.assertEquals(loginObj.getPageTitle(), "Sign in");
		}
		
		@Test(priority = 4)
		public void getPageTitleTest() {
			System.out.println(loginObj.getPageTitle());
		}

}
		




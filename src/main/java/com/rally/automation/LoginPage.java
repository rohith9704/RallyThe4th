package com.rally.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	
	@FindBy(css = "input[id='j_username']")
	WebElement userNameFeild;
	
	@FindBy(css = "input[id='j_password']")
	WebElement passwordFeild;
	
	@FindBy(css = "input[id='login-button']")
	WebElement loginButton;
	
	@FindBy(css = "h1[class='login-header']")
	WebElement pageTitle;
	

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	
	public String getPageTitle() {
		
		return pageTitle.getText();
	}
	
	public void userEmailId(String username) {
		userNameFeild.click();
		userNameFeild.sendKeys(username);
		
	}
	
	public void userPassword(String password) {
		passwordFeild.sendKeys(password);
		
	}
	
	public void doLogin() {
		loginButton.click();
	}

}

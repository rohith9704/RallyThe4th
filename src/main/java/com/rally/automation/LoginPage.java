package com.rally.automation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	@FindBy(id = "j_username")
	WebElement useNmae;
	
	@FindBy(id = "j_password")
	WebElement passWord;
	
	@FindBy(id = "login-button")
	WebElement signIn;
	
	@FindBy(css = "span[aria-label='Open Sidebar']")
	WebElement sideBar;
	
	@FindBy(css = "a[title='Team Planning']")
	WebElement teamPlanning;
	
	public void login(String uName, String Pass) {
		useNmae.sendKeys(uName);
		passWord.sendKeys(Pass);
		signIn.click();
	}
	
	public void clickSideBar() {
		sideBar.click();
	}
	public void clickTeamPlanning() {
		teamPlanning.click();
	}

}

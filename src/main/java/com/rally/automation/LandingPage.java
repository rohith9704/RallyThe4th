package com.rally.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends BasePage {
	@FindBy(css ="#j_username")
	WebElement email;
	
	@FindBy(css = "#j_password")
	WebElement passsword;
	
	@FindBy(css = "#login-button")
	WebElement signinButton;
	
	@FindBy(css ="span[aria-label='Invite Users']")
	WebElement inviteUsers;
	
	@FindBy(css = "input[aria-label='Email Address:']")
	WebElement emailFeild;
	
	@FindBy(css ="span:contains('Send Invites')")
	WebElement sendInviteButton;
	
	@FindBy(css = "span[class='smb-Button-children']")
	WebElement mySettingsButton;
	


	public LandingPage(WebDriver driver) {
		super(driver);
		
	}
	public void login() {
		email.sendKeys("madhoo@eaglesi.co");
		passsword.sendKeys("123123Aa");
		signinButton.click();
		
		
	}
public void inviteUsers() {
	
	inviteUsers.click();
	emailFeild.sendKeys("sravaneseelam@gmail.com");
	sendInviteButton.click();
	
}

public void editProfile() {
	
}
	@Override
	String getPageTitle() {
		
		return null;
	}
	
	
	

}

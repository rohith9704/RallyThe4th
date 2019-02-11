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

	@FindBy(css = "span:contains('Edit Profile')" )
	WebElement editProfileButton;


	@FindBy(css = "div[class='chr-QuickDetailAttributeEditorWrapper chr-QuickDetailAttributeEditorWrapper--displayName']")
	WebElement displayNameFeild;


	public LandingPage(WebDriver driver) {
		super(driver);

	}
	/*
	 * Login in to the user account
	 */
	 
	public void doLogin(String userEmail, String userPassword) {
		email.sendKeys(userEmail);
		passsword.sendKeys(userPassword);
		signinButton.click();


	}
	/*
	 * Invite users from the navigation bar
	 */
	public void inviteUsers() {

		inviteUsers.click();
		emailFeild.sendKeys("sravaneseelam@gmail.com");
		sendInviteButton.click();

	}
	/*
	 * Edit user profile information from the navigation bar
	 */

	public void editProfile() {
		mySettingsButton.click();
		editProfileButton.click();
		displayNameFeild.sendKeys("QA4");


	}
	@Override
	String getPageTitle() {

		return null;
	}




}

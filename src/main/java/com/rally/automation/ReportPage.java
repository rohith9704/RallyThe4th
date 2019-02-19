package com.rally.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReportPage extends BasePage {

	public ReportPage(WebDriver driver) {
		super(driver);
	}

	@Override
	String getPageTitle() {
		return null;
	}
	
	/**
	    * All WebElements are identified by @FindBy Annotation
	*/
	
	@FindBy(css = "a[title='Reports']")
	WebElement clickReportButton;
	
	@FindBy(css = "a.rbtn.blue.primary")
	WebElement addNewButton;
	
	@FindBy(css = "span[style='float:left;padding-right:5px;']")
	WebElement title;
	
	@FindBy(css = "span[aria-label='Open Sidebar']")
	WebElement menuButton;
	
	@FindBy(css = "h1.chr-ComponentsSideBar-headerTitle")
	WebElement verifyMenuButtonisClicked;
	
	
	
	public String clickMenuButton() {
		menuButton.click();
		return verifyMenuButtonisClicked.getText();
	}
	
	public String clickReportButton() {
		clickReportButton.click();
		return title.getText();
		
	}
	public boolean isAddnewButtonDisplayed() {
		return addNewButton.isDisplayed();
	}
	


}

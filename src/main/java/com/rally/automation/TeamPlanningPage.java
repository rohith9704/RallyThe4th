package com.rally.automation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TeamPlanningPage {
	
	
	@FindBy(xpath = "//span[text()='Add New']")
	WebElement addNew;
	
	@FindBy(css = "input[placeholder='Name']")
	WebElement name;
	
	@FindBy(xpath = "//span[text()='Add with Details']")
	WebElement addDetails;
	
	@FindBy(xpath ="//span[text()='Create']")
	WebElement createStory;
	
	
	@FindBy(id="rallydatefield-2222-inputEl")
	WebElement releseDate;
	
	
	
	public void clickOnAddNew() {
		addNew.click();
	}
	public void enterName(String sName) {
		name.sendKeys(sName);
	}
	public void enterDetails() {
		addDetails.click();
	}
	public void enterCreateStory() {
		createStory.click();
	}
	
			
			
			
			
}

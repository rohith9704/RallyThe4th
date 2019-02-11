package com.rally.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class TeamBoardPage extends BasePage {
	WebDriver wait;
	WebElement element;

	@FindBy(css = "input[id='j_username']")
	WebElement loginId;
	
	@FindBy(css = "input[id='j_password']")
	WebElement password;
	
	@FindBy(css = "input[id='login-button']")
	WebElement signInButton;
	
	@FindBy(css = "button[aria-label='Open Sidebar']")
	WebElement sideBar;
	
	@FindBy(css = "a[title='Team Board']")
	WebElement  teamBoardButton;
	
	@FindBy(css = "div[id='TOOLBAR_ADD_NEW_TRAY-trigger']")
	WebElement addNewButton;
	
	@FindBy(css="div[aria-label='Work Item Types']")
	WebElement workItemTypesDD;
	
	@FindBy(css="[id$='select-item-0']")
	WebElement workItemType_UserStory;
	
	@FindBy(css="[id$='select-item-1']")
	WebElement workItemType_Defect;
	
	@FindBy(css="[id$='select-item-2']")
	WebElement workItemType_TestSet;
	
	@FindBy(css="[id$='select-item-3']")
	WebElement workItemType_DefectSuite;
	
	
	@FindBy(css ="li#34-select-item-0.smb-DropdownItem")
	WebElement selectItem;
	
	@FindBy(css = "span[class='smb-Icon smb-Icon--downFull'][1]")
	WebElement workItems;
	
	@FindBy(css = "input[aria-label='Name']")
	WebElement name;
	
	@FindBy(css = "a[href='#/detail/userstory/282344492208']")
	WebElement definedTypes;


	//Intilializing my page objects 
	public TeamBoardPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void selectWorkItemType(String typeName) {
		workItemTypesDD.click();
		
		if(typeName.contains("User Story")) {
			workItemType_UserStory.click();
		} else if(typeName.contains("Defect")) {
			workItemType_Defect.click();
		} else if(typeName.contains("Test Set")) {
			workItemType_TestSet.click();
		} else if(typeName.contains("Defect Suite")) {
			workItemType_DefectSuite.click();
		} 
	}
	public void definedTypeButton() {
		definedTypes.click();
	}
	
	public void movement() {
		sideBar.click();
	}
	public void loactingteamBoard() {
		teamBoardButton.click();
	}
	public void newButton() {
		
		addNewButton.click();
	}
	public void itemTypes() {
		workItems.click();
	}
	public void enterName(String enter) {
		name.sendKeys("jupiter");
	}
	@Override
	String getPageTitle() {
		return null;
	}

}

package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class LeaveDefinationValidation extends BasePage {
	

	@FindBy(id="master")
	WebElement masterlink;
	
	@FindBy(xpath="//a[contains(text(),'Leave Definitions')]")
	WebElement ClickOnLeaveDefination;
	

	@FindBy(xpath="//input[@id='leave_definition_leave_name']")
	WebElement EnterLeaveName;
	
	@FindBy(xpath="//input[@id='leave_definition_short_name']")
	WebElement EnterShortName;
	
	@FindBy(xpath="//input[@name='commit']")
	WebElement ClickonCreateLeaveDefination;
	
	@FindBy(xpath="//div[@id='leave_definition_leave_name-error']")
	WebElement LeaveNameValidation;
	
	@FindBy(xpath="//div[@id='leave_definition_short_name-error']")
	WebElement ShortNameValidation;

	@FindBy(xpath="//li[contains(text(),'Leave name has already been taken')]")
	WebElement LeaveError;
	@FindBy(xpath="//li[contains(text(),'Short name has already been taken')]")
	WebElement ShortNameError;
	@FindBy(xpath="//strong[contains(text(),'Leave definition successfully created.')]")
	WebElement SuccMessage;
	

	public LeaveDefinationValidation(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	
	}


	public void navigateMaster() throws Exception{
		masterlink.click();
	}

	public void clickOnleavedefinitions() throws Exception{
		ClickOnLeaveDefination.click();
	}
	public void enterLeaveName(String value) throws Exception{
		EnterLeaveName.sendKeys(value);
	}
	public void enterShortName(String value) throws Exception{
		EnterShortName.sendKeys(value);
	}
	

	public void clickOncreateLeave() throws Exception{
		ClickonCreateLeaveDefination.click();

}
	public String getLeaveNameValidationMessage(){
		return LeaveNameValidation.getText();
	}

	
	public String getShortNameValidationMessage(){
		return ShortNameValidation.getText();
	}
	public String getLeaveErrrorMessage(){
		return LeaveError.getText();
	}
	
	public String getShortNameErrrorMessage(){
		return ShortNameError.getText();
	}
	public String getSuccessMessage(){
		return SuccMessage.getText();
	}

}


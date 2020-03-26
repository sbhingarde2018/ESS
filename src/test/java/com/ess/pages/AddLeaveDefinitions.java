package com.ess.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.ess.common.BasePage;

public class AddLeaveDefinitions extends BasePage {
	@FindBy(id="master")
	WebElement masterlink;
	
	@FindBy(xpath="//a[.='Leave Definitions']")
	WebElement LeaveDef;
	
	@FindBy(id="leave_definition_leave_name")
	WebElement LeaveName;
	
	@FindBy(id="leave_definition_short_name")
	WebElement ShortName;
	
	@FindBy(id="leave_definition_consider_for_setting")
	WebElement LeaveSetting;
	
	@FindBy(xpath="//input[@name='commit']")
	WebElement CreateLeave;
	
	@FindBy(xpath="//strong[contains(text(),'Leave definition successfully created.')]")
	WebElement successfullMessage;

	
	public AddLeaveDefinitions(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void navigateMaster() throws Exception{
		masterlink.click();
	}

	public void navigateLeaveDefinition() throws Exception{
		LeaveDef.click();
	}
	public void enterLeaveName(String uu) throws Exception{
		LeaveName.sendKeys(uu);
	}
	public void enterShortName(String uu) throws Exception{
		ShortName.sendKeys(uu);
	}
	public void selectLeaveSetting() throws Exception{
		LeaveSetting.click();
	}
	
	public void createLeave() throws Exception{
		CreateLeave.click();
	}
	public String getMessage(){
		return successfullMessage.getText();
	}
}

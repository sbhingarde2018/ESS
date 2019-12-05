package com.spp.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CheckForCarryOverInLeavePolicy extends BasePage{
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//a[text()='Leave Policy']")
	WebElement leavePolicy;
    @FindBy(xpath="//table/tbody/tr/td[contains(text(),'Default')]/parent::tr/td[4]/a")
	WebElement addLeaves;
    @FindBy(xpath="//div[2]/table/tbody/tr/td[contains(text(),'Casual Leave')]/parent::tr/td[3]/a")
    WebElement settingsLink;
    @FindBy(xpath="//*[@id='main']/div/div[3]/nav/ul/li[2]/a/span")
    WebElement LapseTab;
    @FindBy(xpath="//input[@id='leave_policy_head_wise_setting_carry_over_lapse_settings_carry_over']")
    WebElement CarryOver;
    @FindBy(id="update_carry_over_lapse")
    WebElement UpdateButton;
    @FindBy(xpath="//*[@id='leave_policy_head_wise_settings_response']/div/strong")
    WebElement SuccessfulMessage;
    @FindBy(id="leave")
    WebElement LeaveLink;
    @FindBy(linkText="Apply Leave")
    WebElement AppyLeaveLink;
    @FindBy(id="filter_head")
    WebElement Filter;
    @FindBy(xpath="//button[text()='LOAD']")
    WebElement Load;
    @FindBy(xpath="//tbody/tr/td[contains(text(),'Zain')]/parent::tr/td[3]/a")
    WebElement ApplyLeave;
	@FindBy(xpath="//span[contains(text(),'LEAVE SUMMARY')]")
	WebElement LeaveSummaryTab;
	
	public CheckForCarryOverInLeavePolicy(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}

	public void clickMastserLink(){
		masterLink.click();
	}

	public void selectLeavePolicy(){
		leavePolicy.click();
	}
	
	public void clickAddLeaves(){
		addLeaves.click();
	}
	
	public void clickSettingsLink(){
		settingsLink.click();
	}
	
	public void clickLapseTab(){
		LapseTab.click();
	}
	public void clickCarryOver(){ 
		jsclick(CarryOver);
	}
	public void clickUpdateButton(){
		UpdateButton.click();
	}
	public String getMessage1(){
		return SuccessfulMessage.getText();
	}
	public void clickLeaveLink(){
		LeaveLink.click();
	}
	public void clickAppyLeaveLink(){
		AppyLeaveLink.click();
	}
	public void clickFilter(){
		Filter.click();
	}
	
	public void clickLoad(){
		Load.click();
	}
	public void clickApplyLeave(){
		ApplyLeave.click();
	}
	public void clickLeaveSummaryTab(){
		jsclick(LeaveSummaryTab);
	}
	


}

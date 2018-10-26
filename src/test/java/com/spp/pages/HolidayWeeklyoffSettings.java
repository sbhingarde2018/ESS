package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class HolidayWeeklyoffSettings extends BasePage{
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//a[text()='Leave Policy']")
	WebElement leavePolicy;
    @FindBy(xpath="//div[@id='leave-policy-master-list']//tr[1]//td[4]//a[text()='Add Leaves']")
	WebElement addLeaves;
    @FindBy(xpath="//*[@id=\"leave_policy_setting_details\"]/div[2]/table/tbody/tr[5]/td[3]/a")
    WebElement settingsLink;
    @FindBy(xpath="//div[@id='main']//div[3]//li[3]//span[normalize-space(text()='Holiday/Weekly Off')]")
    WebElement holidayTab;
    @FindBy(xpath="(//input[@id='leave_policy_head_wise_setting_holiday_settings_consider_leave'])[2]")
    WebElement holidayCasualLeave;
    @FindBy(xpath="//*[@id=\"holidy_weekly_off_setting\"]/fieldset[1]/table/tbody/tr[2]/td[2]/input")
    WebElement noofCasualLeaves;
    @FindBy(xpath="//div[@id='holidy_weekly_off_setting']//fieldset[2]//h4")
    WebElement tab;
    @FindBy(id="leave_policy_head_wise_setting_holiday_settings_lev_ho_lev")
    WebElement sandwichLeave;
    @FindBy(xpath="(//input[@id='leave_policy_head_wise_setting_weekly_off_settings_consider_leave'])[2]")
    WebElement weeklyoffHoliday;
    @FindBy(id="leave_policy_head_wise_setting_weekly_off_settings_days")
    WebElement noofCasualLeavesforWeekly;
    @FindBy(id="leave_policy_head_wise_setting_weekly_off_settings_suffix")
    WebElement suffix;
    @FindBy(xpath="//div[@id='holidy_weekly_off_setting']//input[@value='Update']")
    WebElement updateButton;
    @FindBy(xpath="//strong[text()='Setting was successfully updated.']")
    WebElement successfullMessage;
    
	public HolidayWeeklyoffSettings(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
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
	
	public void clickHolidayTab(){
		holidayTab.click();
	}
	
	public void clickHolidayCasualLeave(){
		holidayCasualLeave.click();
	}
	
	public void enterNoofCasualLeaves(String value){
		noofCasualLeaves.clear();
		noofCasualLeaves.sendKeys(value);
	}
	
	public void clickTab(){
		tab.click();
	}
	
	public void clickSandwichLeave(){
		sandwichLeave.click();
	}
	
	public void clickWeeklyoffHoliday(){
		weeklyoffHoliday.click();
	}
	
	public void enterNoofCasualLeavesforWeekly(String value){
		noofCasualLeavesforWeekly.clear();
		noofCasualLeavesforWeekly.sendKeys(value);
	}
	
	public void clickSuffix(){
		suffix.click();
	}
	
	public void clickUpdateButton(){
		updateButton.click();
	}
	
	public String getMessage(){
		return successfullMessage.getText();
	}
}

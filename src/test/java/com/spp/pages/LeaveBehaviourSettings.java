package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class LeaveBehaviourSettings extends BasePage{
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//a[text()='Leave Policy']")
	WebElement leavePolicy;
    @FindBy(xpath="//*[@id=\"leave-policy-master-list\"]/table/tbody/tr/td[contains(text(),'newLeavepolicy_35091')]/parent::tr/td[4]/a")
	WebElement addLeaves;
    @FindBy(xpath="//*[@id=\"leave_policy_setting_details\"]/div[2]/table/tbody/tr[5]/td[3]/a")
    WebElement settingsLink;
    @FindBy(id="leave_policy_head_wise_setting_behaviour_settings_max_leave_month")
    WebElement casualLeaveallowedavaiformonth; 
    @FindBy(id="leave_policy_head_wise_setting_behaviour_settings_max_leave_year")
    WebElement casualLeaveallowedavailforyear;
    @FindBy(id="leave_policy_head_wise_setting_behaviour_settings_min_leave_year")
    WebElement casualLeavemustbeAvailedinYear;
    @FindBy(id="leave_policy_head_wise_setting_behaviour_settings_min_days_applied")
    WebElement daysshouldbeappliedtoavailtheCasualLeave;
    @FindBy(id="leave_policy_head_wise_setting_behaviour_settings_max_days_applied")
    WebElement casualLeavethatcanbeavailedforinstance ;
    @FindBy(id="leave_policy_head_wise_setting_behaviour_settings_prior_days")
    WebElement PriorDays ;
    @FindBy(id="leave_policy_head_wise_setting_behaviour_settings_backdate")
    WebElement backDate;
    @FindBy(id="leave_policy_head_wise_setting_behaviour_settings_allow_half")
    WebElement allowHalfDay;
    @FindBy(id="leave_policy_head_wise_setting_behaviour_settings_avail_excess_leave")
    WebElement allowExcessLeave;
    @FindBy(id="leave_policy_head_wise_setting_behaviour_settings_excess_setting_general_setting")
    WebElement considerasLOP;
    @FindBy(xpath="//div [@id='behaviour_policy_setting']//div[3]//input[@value='Update']")
    WebElement updateButton;
    @FindBy(xpath="//strong[text()='Setting was successfully updated.']")
    WebElement successfullMessage;
    

	public LeaveBehaviourSettings(WebDriver driver) {
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
	
	public void enterCasualLeaveallowedavaiformonth(String value){
		casualLeaveallowedavaiformonth.clear();
		casualLeaveallowedavaiformonth.sendKeys(value);
	}
	
	public void enterCasualLeaveallowedavailforyear(String value){
		casualLeaveallowedavailforyear.clear();
		casualLeaveallowedavailforyear.sendKeys(value);
	}
	
	public void enterCasualLeavemustbeAvailedinYear(String value){
		casualLeavemustbeAvailedinYear.clear();
		casualLeavemustbeAvailedinYear.sendKeys(value);
	}
	
	public void enterDaysshouldbeAppliedtoAvailtheCasualLeave(String value){
		daysshouldbeappliedtoavailtheCasualLeave.clear();
		daysshouldbeappliedtoavailtheCasualLeave.sendKeys(value);
	}
	
	public void enterCasualLeavethatcanbeAvailedforInstance(String value){
		casualLeavethatcanbeavailedforinstance.clear();
		casualLeavethatcanbeavailedforinstance.sendKeys(value);
	}
	
	public void enterPriorDays(String value){
		PriorDays.clear();
		PriorDays.sendKeys(value);
	}
	
	public void clickBackDate(){
		backDate.click();
	}
	
	public void clickAllowHalfDay(){
		allowHalfDay.click();
	}
	
	public void clickAllowExcessLeave(){
		allowExcessLeave.click();
	}
	
	public void clickConsiderasLOP(){
		considerasLOP.click();
	}
	
	public void clickUpdateButton(){
		updateButton.click();
	}
	
	public String getMessage(){
		return successfullMessage.getText();
	}
}

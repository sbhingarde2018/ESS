package com.spp.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CheckForPrioritySettingsInLeavePolicy extends BasePage{

	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//a[text()='Leave Policy']")
	WebElement leavePolicy;
    @FindBy(xpath="//table/tbody/tr/td[contains(text(),'ClonePolicy')]/parent::tr/td[4]/a")
	WebElement addLeaves;
    @FindBy(xpath="//div[2]/table/tbody/tr/td[contains(text(),'Casual Leave')]/parent::tr/td[3]/a")
    WebElement settingsLink;
    @FindBy(id="leave_policy_head_wise_setting_behaviour_settings_excess_setting_priority_setting")
    WebElement EarnedLeave;
    @FindBy(xpath="//*[@id=\"behaviour_policy_setting\"]/div[3]/input")
    WebElement UpdateButton;
    @FindBy(xpath="//*[@id=\"leave_policy_head_wise_settings_response\"]/div/strong")
    WebElement SuccessfulMessage;
    @FindBy(id="leave")
    WebElement LeaveLink;
    @FindBy(xpath="//a[contains(text(),'Apply Leave')]")
    WebElement AppyLeaveLink;
    @FindBy(id="filter_head")
    WebElement Filter;
    @FindBy(xpath="//*[@id=\"bf_form\"]/div/button[contains(text(),'LOAD')]")
    WebElement Load;
    @FindBy(xpath="//*[@id=\"leave_detail_for_employee\"]/table/tbody/tr/td[4]/a")
    WebElement View;
	@FindBy(id="leave_detail_leave_definition_id")
	WebElement LeaveType;
	@FindBy(id="leave_detail_from_date")
	WebElement FromDate;
	@FindBy(id="leave_detail_to_date")
	WebElement ToDate;
	@FindBy(id="apply")
	WebElement ApplyButton;
	@FindBy(xpath="//*[@id=\"apply_leave_response\"]/div/strong")
	WebElement Message2;
	@FindBy(xpath="//div[3]/nav/ul/li[3]/a/span")
	WebElement LeaveHistory;
	@FindBy(xpath="//*[@id=\"batch_details\"]/form/table[3]/tbody/tr[2]/td/input[3]")
	WebElement DeleteButton;
	@FindBy(id="leave_policy_head_wise_setting_behaviour_settings_avail_excess_leave")
	WebElement AllowAccessCasual;
	@FindBy(id="leave_policy_head_wise_setting_behaviour_settings_excess_setting_priority_setting")
	WebElement PrioritySettings;
	@FindBy(xpath="//td[contains(text(),'Compensatory Off')]")
	WebElement CompensatoryOff;
	@FindBy(xpath="//a[@class='tooltip-left']")
	WebElement AddNewLeaveEnc;
	@FindBy(xpath="//*[@id=\"leave_encashment_leave_definition_id\"]")
	WebElement SelectLeave;
	@FindBy(xpath="//tbody/tr/td[contains(text(),'LeaveB')]/parent::tr/td[3]/a")
	WebElement ApplyLeave;
	@FindBy(id="from_date")
	WebElement LeaveHistoryToDate;
	@FindBy(xpath="//*[@id='leave_range_data']/div[3]/div/div/input[2]")
	WebElement SearchButton;
	
	public CheckForPrioritySettingsInLeavePolicy(WebDriver driver) {
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
	
	public void clickEarnedLeave(){
		EarnedLeave.click();
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
	public void clickApplyLeave(){
		AppyLeaveLink.click();
	}
	public void clickFilter(){
		Filter.click();
	}
	
	public void clickLoad(){
		Load.click();
	}
	public void clickView(){
		View.click();
	}
	public void selectLeaveType(String value){
		dropDownSelect(LeaveType, value);
	}
	public void enterFromDate(String value){
		FromDate.sendKeys(value);
	}
	public void enterToDate(String value){
		ToDate.sendKeys(value);
		ToDate.sendKeys(Keys.TAB);
	}
	
	public void clickApplyButton(){
		ApplyButton.click();
	}
	public String getMessage2(){
		return Message2.getText();
	}
	public void selectLeaveHistory(){
		 jsclick(LeaveHistory);
	}
	public void clickDeleteButton(){
		DeleteButton.click();
		switchToPopUpAndAccept(driver);
	}
	public void clickAllowAccessCasual(){
		if(AllowAccessCasual.isSelected()) {
			System.out.println("Already Selected");
		}
		else {
			AllowAccessCasual.click();
		}
	}
	public void clickPrioritySettings(){
		if(PrioritySettings.isSelected()) {
			System.out.println("Already Selected");
		}
		else {
			PrioritySettings.click();
		}
	}
	public void clickCompensatoryOff(){
		CompensatoryOff.click();
	}
	
	public void clickAddNewLeaveEnc(){
		AddNewLeaveEnc.click();
	}
	public void clickSelectLeave(){
		SelectLeave.click();
	}
	public void ClickonApplyLeave() {
		ApplyLeave.click();
	}
	public void enterHistoryToDate(String value){
		LeaveHistoryToDate.clear();
		LeaveHistoryToDate.sendKeys(value);
		LeaveHistoryToDate.sendKeys(Keys.TAB);
	}
	public void clickSearchButton(){
		SearchButton.click();
	}
}

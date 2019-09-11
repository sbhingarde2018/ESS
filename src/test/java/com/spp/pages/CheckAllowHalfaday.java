package com.spp.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CheckAllowHalfaday extends BasePage{
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//*[@id=\"menu\"]/li[3]/div/div[3]/ul/li[2]/a")
	WebElement leavePolicy;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Default')]/parent::tr/td[4]/a")
	WebElement AddLeaves;
	@FindBy(xpath="//div[2]/table/tbody/tr/td[contains(text(),'Casual Leave')]/parent::tr/td[3]/a")
	WebElement settingsLink;
	@FindBy(xpath="//td//*[@id=\"leave_policy_head_wise_setting_behaviour_settings_allow_half\"]")
	WebElement ClickOnAllowHalfDay;
	@FindBy(xpath="//*[@id=\"behaviour_policy_setting\"]/div[3]/input")
	WebElement UpdateButton;
	@FindBy(xpath="//*[@id=\"leave_policy_head_wise_settings_response\"]/div/strong")
	WebElement SuccessfulMessage;
	@FindBy(id="leave")
	WebElement LeaveLink;
	@FindBy(linkText="Apply Leave")
	WebElement AppyLeaveLink;
	@FindBy(id="filter_head")
	WebElement Filter;
	@FindBy(xpath="//*[@id=\"bf_form\"]/div/button[contains(text(),'LOAD')]")
	WebElement Load;
	@FindBy(xpath="//tbody/tr/td[contains(text(),'Rihana')]/parent::tr/td[3]/a")
	WebElement ApplyLeave;
	@FindBy(id="leave_detail_leave_definition_id")
	WebElement LeaveType;
	@FindBy(id="leave_detail_from_date")
	WebElement FromDate;
	@FindBy(id="leave_detail_to_date")
	WebElement ToDate;
	@FindBy(xpath="//table[1]/tbody[1]/tr[1]/td[3]/input[1]")
	WebElement DisableFirstHalf;
	@FindBy(xpath="//*[@id=\"apply\"]")
	WebElement ApplyButton;
	@FindBy(xpath="//*[@id=\"apply_leave_response\"]/div/strong")
	WebElement Message2;
	
	
	public CheckAllowHalfaday(WebDriver driver) {
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
		AddLeaves.click();
	}
	
	public void clickSettingsLink(){
		settingsLink.click();
	}
	public void clickonallowhalfday() {
		if(ClickOnAllowHalfDay.isSelected()) {
			System.out.println("Already Selected");
		}
		else {
			ClickOnAllowHalfDay.click();
		}	
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
	public void enterFromDate(String value){
		FromDate.clear();
		FromDate.sendKeys(value);
	}
	public void enterToDate(String value) throws InterruptedException{
		ToDate.clear();
		ToDate.sendKeys(value);
		Thread.sleep(2000);
		ToDate.sendKeys(Keys.TAB);
		Thread.sleep(2000);
	}
	public String getMessage2(){
	return Message2.getText();
    }
	public void selectApplyButton(){
		ApplyButton.click();
	}
	public void selectLeaveType(String value){
		dropDownSelect(LeaveType, value);
	}
	public void disablefirsthalf() {
		DisableFirstHalf.click();
	}
	public void UncheckHalfDay() {
		ClickOnAllowHalfDay.click();
	}
	
}

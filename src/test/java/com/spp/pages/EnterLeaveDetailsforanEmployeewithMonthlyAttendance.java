package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class EnterLeaveDetailsforanEmployeewithMonthlyAttendance extends BasePage{
	@FindBy(id="leave")
	WebElement ClickOnLeave;
	@FindBy(xpath="//*[@id=\"menu\"]/li[5]/div/div/ul/li[4]/a")
	WebElement ClickOnMonthlyAttendance;
	@FindBy(id="paymonth_id")
	WebElement SelectPaymonth;
	@FindBy(id="leave_policy_master")
	WebElement SelectLeavePolicy;
	@FindBy(id="filter")
	WebElement ClickOnGetEmployees;
	@FindBy(xpath="//*[@id=\"bf_form\"]/div[9]/button[1]")
	WebElement ClickOnLoad;
	@FindBy(xpath="//*[@id=\"monthly_employee_list\"]/tbody/tr/td[5]/a")
	WebElement ClickOnMakeLeaveEntry;
	@FindBy(xpath="//*[@id=\"main\"]/div[3]/strong")
	WebElement successfullmessage;
	@FindBy(id="data_33_-2")
	WebElement EnterCompensatoryOff;
	@FindBy(xpath="//*[@id=\"main\"]/div[5]/form/table/tbody/tr[5]/td/input")
	WebElement UpdateValues;
	public EnterLeaveDetailsforanEmployeewithMonthlyAttendance(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);	
	}
	public void clickonleave() {
		ClickOnLeave.click();
	}
	public void clickonmonthlyattendance() {
		ClickOnMonthlyAttendance.click();
	}
	public void selectpaymonth(String value) {
		dropDownSelect(SelectPaymonth,value);
	}
	public void selectleavepolicy(String value) {
		dropDownSelect(SelectLeavePolicy, value);
	}
	public void clickongetemployees() {
		ClickOnGetEmployees.click();
	}
	public void clickonload() {
		ClickOnLoad.click();
	}
	public void clickonmakeleaveentry() {
		ClickOnMakeLeaveEntry.click();
	}
	public void entercompoff(String value) {
		EnterCompensatoryOff.clear();
		EnterCompensatoryOff.sendKeys(value);
	}
	public void clickonupdatevalues() {
		UpdateValues.click();
	}
	
	public String getMessage() {
		return successfullmessage.getText();
	}
}

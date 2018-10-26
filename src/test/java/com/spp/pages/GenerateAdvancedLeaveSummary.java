package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class GenerateAdvancedLeaveSummary extends BasePage{
	@FindBy(id="leave")
	WebElement ClickOnLeave;
	@FindBy(xpath="//*[@id=\"menu\"]/li[5]/div/div/ul/li[3]/a")
	WebElement ClickOnMonthlyLeaveSummary;
	@FindBy(id="advanced")
	WebElement SelectAdvanceLeaveSummary;
	@FindBy(id="leave_summary_month_year")
	WebElement SelectPaymonth;
	@FindBy(id="leave_policy")
	WebElement SelectLeavePolicy;
	@FindBy(id="leave_type")
	WebElement SelectLeaveType;
	@FindBy(id="filter")
	WebElement ClickOnGetEmployees;
	@FindBy(xpath="//*[@id=\"bf_form\"]/div[9]/button[1]")
	WebElement ClickOnLoad;
	@FindBy(id="select_all_employees")
	WebElement SelectallEmployees;
	@FindBy(xpath="//*[@id=\"new_standing_instruction_detail\"]/div[2]/input[3]")
	WebElement GenerateReport;
		public GenerateAdvancedLeaveSummary(WebDriver driver) {
			super(driver);
			PageFactory.initElements(driver, this);	
		}
		public void clickonleave() {
			ClickOnLeave.click();
		}
		public void clickonmonthlyleavesummary() {
			ClickOnMonthlyLeaveSummary.click();
		}
		public void selectadvanceleavesummary() {
			SelectAdvanceLeaveSummary.click();
		}
		public void selectpaymonth(String value) {
			dropDownSelect(SelectPaymonth, value);
		}
		public void selectleavepolicy(String value) {
			dropDownSelect(SelectLeavePolicy, value);
		}
		public void selectleavetype(String value) {
			dropDownSelect(SelectLeaveType, value);
		}
		public void clickongetemployees() {
			ClickOnGetEmployees.click();
		}
		public void clickonload() {
			ClickOnLoad.click();
		}
		public void selectallemployees() {
			SelectallEmployees.click();
		}
		public void generatereport() {
			GenerateReport.click();
		}
}

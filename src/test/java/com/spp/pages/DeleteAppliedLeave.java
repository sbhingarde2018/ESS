package com.spp.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class DeleteAppliedLeave extends BasePage{
	@FindBy(id="leave")
	WebElement ClickOnLeave;
	@FindBy(xpath="//div[@class='col_3']//a[contains(text(),'Apply Leave')]")
	WebElement ClickOnApplyLeave;
	@FindBy(id="filter_head")
	WebElement ClickOnFilterHead;
	@FindBy(xpath="//*[@id=\"bf_form\"]/div/button[contains(text(),'LOAD')]")
	WebElement ClickOnLoad;
	@FindBy(xpath="//tbody/tr/td[contains(text(),'Alex')]/parent::tr/td[3]/a")
	WebElement ApplyLeave;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/nav/ul/li[3]/a")
	WebElement SwitchLeaveHistory;
	@FindBy(xpath="//*[@id=\"leave_detail_for_employee\"]/table/tbody/tr/td[4]/a")
	WebElement ClickOnView;
	@FindBy(xpath="//*[@id=\"batch_details\"]/form/table[3]/tbody/tr[2]/td/input[3]")
	WebElement ClickOnDelete;
	@FindBy(xpath="//*[@id=\"apply_leave_response\"]/div/strong")
	WebElement successfullmessage;
	@FindBy(xpath="//span[contains(text(),'LEAVE HISTORY')]")
	WebElement CheckLeaveHistory;
	@FindBy(id="to_date")
	WebElement LeaveHistoryToDate;
	@FindBy(id="from_date")
	WebElement LeaveHistoryFromDate;	
	@FindBy(xpath="//*[@id='leave_range_data']/div[3]/div/div/input[2]")
	WebElement SearchButton;
	
	public DeleteAppliedLeave(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);	
	}
	public void clickonleave() {
		ClickOnLeave.click();
	}
	public void clickonapplyleave() {
		ClickOnApplyLeave.click();
	}
	public void clickonfilterhead() {
		ClickOnFilterHead.click();
	}
	public void clickonload() {
		ClickOnLoad.click();
	}
	public void applyleave() {
		ApplyLeave.click();
	}
	public void switchleavehistory() {
		SwitchLeaveHistory.click();
	}
	public void clickonview() {
		ClickOnView.click();
	}
	public void clickondelete() {
		ClickOnDelete.click();
	}
	public String getMessage(){
		return successfullmessage.getText();
	}
	public void checkleavehistory() {
		jsclick(CheckLeaveHistory);
	}
	public void enterHistoryToDate(String value){
		LeaveHistoryToDate.clear();
		LeaveHistoryToDate.sendKeys(value);
		LeaveHistoryToDate.sendKeys(Keys.TAB);
	}
	public void clickSearchButton(){
		SearchButton.click();
	}
	public void enterHistoryFromDate(String value){
		LeaveHistoryFromDate.clear();
		LeaveHistoryFromDate.sendKeys(value);
		LeaveHistoryFromDate.sendKeys(Keys.TAB);
	}
}

package com.spp.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.spp.common.BasePage;

public class ApplyDefaultLeave extends BasePage{
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
@FindBy(id="leave_detail_leave_definition_id")
WebElement SelectLeaveType;
@FindBy(id="leave_detail_from_date")
WebElement SelectFromDate;
@FindBy(id="leave_detail_to_date")
WebElement SelectToDate;
@FindBy(xpath="//*[@id='apply']")
WebElement ClickOnApply;
@FindBy(xpath="//*[@id=\"apply_leave_response\"]/div/strong")
WebElement successfullmessage;
@FindBy(xpath="//span[contains(text(),'LEAVE SUMMARY')]")
WebElement CheckLeaveSummary;
@FindBy(xpath="//span[contains(text(),'LEAVE HISTORY')]")
WebElement CheckLeaveHistory;
@FindBy(xpath="//*[@id=\"from_date\"]")
WebElement FromHistoryDate;
@FindBy(xpath="//div[3]/div/div/input[2]")
WebElement SearchBtn;
@FindBy(xpath="//div[2]//div/table/tbody/tr/td[4]/a")
WebElement View;
@FindBy(xpath="//form/table[3]/tbody/tr[2]/td/input[3]")
WebElement Delete;

public ApplyDefaultLeave(WebDriver driver) {
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
public void selectleavetype(String value) {
	dropDownSelect(SelectLeaveType, value);
}
public void selectfromdate(String value) {
	SelectFromDate.sendKeys(value);
	SelectFromDate.sendKeys(Keys.TAB);
}
public void selecttodate(String value) {
	SelectToDate.sendKeys(value);
	SelectToDate.sendKeys(Keys.TAB);
}
public void clickonapply() {
	ClickOnApply.click();	
}
public String getMessage(){
	return successfullmessage.getText();
}
public void checkleavesummary() {
	jsclick(CheckLeaveSummary);
}
public void clickleavehistory() {
	jsclick(CheckLeaveHistory);
}
public void EnterFromHistoryDate(String value) {
	FromHistoryDate.clear();
	FromHistoryDate.sendKeys(value);
	FromHistoryDate.sendKeys(Keys.TAB);
}
public void ClickSearch() {
	SearchBtn.click();
}
public void ClickView() {
	View.click();
}
public void ClickDelete() throws Exception {
	Delete.click();
	Thread.sleep(2000);
	switchToPopUpAndAccept(driver);
}
public void waitTillElementIsVisible(WebElement successfullmessage){
	new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(successfullmessage));
}
}

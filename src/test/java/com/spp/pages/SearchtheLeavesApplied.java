package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class SearchtheLeavesApplied extends BasePage{
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
	@FindBy(xpath="//span[contains(text(),'LEAVE HISTORY')]")
	WebElement CheckLeaveHistory;
	@FindBy(xpath="//*[@id=\"from_date\"]")
	WebElement SelectFromdate;
	@FindBy(id="to_date")
	WebElement SelectToDate;
	@FindBy(xpath="//*[@id=\"leave_range_data\"]/div[3]/div/div/input[2]")
	WebElement ClickOnSearch;
	@FindBy(xpath="//*[@id=\"from_date\"]")
	WebElement FromHistoryDate;
	@FindBy(xpath="//div[3]/div/div/input[2]")
	WebElement SearchBtn;
	@FindBy(xpath="//div[2]//div/table/tbody/tr/td[4]/a")
	WebElement View;
	@FindBy(xpath="//form/table[3]/tbody/tr[2]/td/input[3]")
	WebElement Delete;
	
	public SearchtheLeavesApplied(WebDriver driver) {
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
	public void checkleavehistory() {
		jsclick(CheckLeaveHistory);
	}
	public void selectfromdate(String value) {
		SelectFromdate.clear();
		SelectFromdate.sendKeys(value);
	}
	public void selectodate(String value) {
		SelectToDate.clear();
		SelectToDate.sendKeys(value);
	}
	public void clickonsearch() {
		ClickOnSearch.click();
	}
	public void ClickView() {
		View.click();
	}
	public void ClickDelete() throws Exception {
		Delete.click();
		Thread.sleep(2000);
		switchToPopUpAndAccept(driver);
	}
}

package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class DeleteWeeklyOff extends BasePage{
	@FindBy(id="emp_detail")
	WebElement ClickOnEmployee;
	@FindBy(xpath="//a[contains(text(),'Employee Details')]")
	WebElement ClickOnEmployeeDetails;
	@FindBy(id="filter_head")
	WebElement ClickonFilter;
	@FindBy(xpath="//*[@id=\"bf_form\"]/div/button[contains(text(),'LOAD')]")
	WebElement ClickOnLoad;
	@FindBy(xpath="//td[contains(text(),'Nisha')]/parent::tr/td[6]/a[1]")
	WebElement ClickonView;
	@FindBy(xpath="//h3[contains(text(),'General')]")
	WebElement ClickOnGeneral;
	@FindBy(xpath="//a[contains(text(),'Weekly Off Details')]")
	WebElement ClickOnWeeklyOffDetails;
	@FindBy(xpath="//table/tbody/tr/td[5]/a")
	WebElement ClickOnDelete;
	@FindBy(xpath="//*[@id=\"attendance_weekly_off_result_response\"]/div/strong")
	WebElement successfulmessage;
	
	
	public DeleteWeeklyOff(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	public void clickonemployee() {
		ClickOnEmployee.click();
	}
	public void clickonemployeedetails() {
		ClickOnEmployeeDetails.click();
	}
	public void clickonfilter() {
		ClickonFilter.click();
	}
	public void clickonload() {
		ClickOnLoad.click();
	}
	public void clickonview() {
		ClickonView.click();
	}
	
	public void clickongeneral() {
		ClickOnGeneral.click();
	}
	public void clickonweeklyoff() {
		ClickOnWeeklyOffDetails.click();
	}
	public void clickondelete() {
		ClickOnDelete.click();
	}
	public String getMessage(){
		return successfulmessage.getText();
	}
}

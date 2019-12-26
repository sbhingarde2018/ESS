package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;


public class UpdateWeeklyOff extends BasePage{
	
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
	@FindBy(xpath="//table/tbody/tr/td[4]/a")
	WebElement ClickOnEdit;
	@FindBy(id="eff_from")
	WebElement UpdateDate;
	@FindBy(xpath="//*[@value='Update Weekly Off']")
	WebElement UpdateWeeklyOff;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/strong")
	WebElement successfullmessage;
	
	
	public UpdateWeeklyOff(WebDriver driver) {
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
	public void clickonedit() {
		ClickOnEdit.click();
	}
	public void updatedate(String value) {
		UpdateDate.clear();
		UpdateDate.sendKeys(value);
	}
	public void updateweeklyoff() {
		UpdateWeeklyOff.click();
	}
	public String getMessage(){
		return successfullmessage.getText();
	}
}

package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class AddNewSalaryAllotment extends BasePage{

	@FindBy(id="emp_detail")
	WebElement ClickOnEmployee;
	@FindBy(xpath="//*[@id=\"menu\"]/li[4]/div/div/ul/li[4]/a")
	WebElement ClickOnSalaryRateDetails;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/nav/ul/li[2]/a/span")
	WebElement ClickonListingEmployee;
	@FindBy(id="filter_head")
	WebElement ClickonFilter;
	@FindBy(xpath="//*[@id=\"bf_form\"]/div[10]/button[1]")
	WebElement ClickOnLoad;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/nav/ul/li[1]/a") 
	WebElement SelectPageTwo;
	@FindBy(xpath="//*[@id=\"notalloted\"]/tbody/tr/td[contains(text(),'Raj')]/parent::tr/td[4]/a")
	WebElement ClickOnAllotSalary;
	@FindBy(id="month_year")
	WebElement SelectMonthYear;
	@FindBy(id="gross_sal_formula")
	WebElement EnterGrossSal;
	@FindBy(xpath="//*[@id=\"sal_allotment\"]/table/tbody/tr[3]/td/input[1]")
	WebElement ClickOnSave;
	@FindBy(xpath="//*[@id=\"main\"]/div[1]/strong")
	WebElement SuccessfullMessage;
	
	public AddNewSalaryAllotment(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	public void clickonemployee() {
		ClickOnEmployee.click();
	}
	public void clickonsalaryratedetails() {
		ClickOnSalaryRateDetails.click();
	}
	public void clickonlistingemployee() {
		ClickonListingEmployee.click();
	}
	public void clickonfilter() {
		ClickonFilter.click();
	}
	public void clickonload() {
		ClickOnLoad.click();
	}
	public void selectpagetwo() {
		SelectPageTwo.click();
	}
	public void clickonallotsalary() {
		ClickOnAllotSalary.click();
	}
	public void selectmonthyear(String value) {
		dropDownSelect(SelectMonthYear, value);
	}
	public void entergrosssal(String value) {
		EnterGrossSal.clear();
		EnterGrossSal.sendKeys(value);
	}
	public void clickonsave() {
		ClickOnSave.click();
	}
	public String getMessage() {
		return SuccessfullMessage.getText();
	}
	
}

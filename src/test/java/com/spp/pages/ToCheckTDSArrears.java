package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;

public class ToCheckTDSArrears extends BasePage {
	@FindBy(id="tds")
	WebElement TDS;
	@FindBy(xpath="//*[@id=\"menu\"]/li[7]/div/div/ul/li[2]/a")
	WebElement ComputationalDetails;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Rihana')]/parent::tr/td[4]/a")
	WebElement Details;
	@FindBy(xpath="//select[@id='computed_financial_year']")
	WebElement FinancialYear;
	@FindBy(xpath="//label[contains(text(),'Search:')]//input")
	WebElement Search;
	@FindBy(xpath="//div[@class='wrapper clearfix pt0']//li[6]//a[1]")
	WebElement Other;
	@FindBy(xpath="//*[@id=\"references\"]/*//tr[23]//td[2]//a[1]")
	WebElement ArrearSalary;
	
	public ToCheckTDSArrears(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	public void clickArrearSalary() {
		ArrearSalary.click();
	}
	public void clickonOther() {
		Other.click();
	}
	public void clickonTDS() {
		TDS.click();
	}
	public void clickonComputationalDetails() {
		ComputationalDetails.click();
	}
	public void clickonDetails() {
		Details.click();
	}
	public void selectFinancialYear(String value) throws Exception{
		dropDownSelect(FinancialYear, value);
	}
	public void enterSearch(String value) throws Exception{
		Search.sendKeys(value);
	}
	
}

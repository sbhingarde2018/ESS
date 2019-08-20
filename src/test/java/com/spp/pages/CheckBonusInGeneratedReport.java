package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CheckBonusInGeneratedReport extends BasePage{
	@FindBy(xpath="//a[@id='report']") 
	WebElement Report;
	@FindBy(xpath="//a[contains(text(),'Bonus Report')]")
	WebElement BonusReport;
	@FindBy(id="report_type")
	WebElement Reports;
	@FindBy(id="bonus_month")
	WebElement MonthYear;
	@FindBy(id="filter")
	WebElement GetEmployee;
	@FindBy(xpath="//form[@id='bf_form']//button[contains(text(),'LOAD')]")
	WebElement Load;
	@FindBy(id="exgratia_bonus_submit")
	WebElement GenerateReport;
	@FindBy(xpath="//table/tbody/tr[1]/td[1]/input[1]")
	WebElement Checkbox;
	
	
	public CheckBonusInGeneratedReport(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	public void clickReport(){
		Report.click();
	}
	
	public void selectBonusReport(){
		BonusReport.click();
	}
	public void clickReports(String value){
		dropDownSelect(Reports, value);
		
	}
	public void clickMonthYear(String value){
		dropDownSelect(MonthYear, value);
		
	}
	public void selectMonthYear(){
		MonthYear.click();
	}
	
	public void clickGetEmployee(){
		GetEmployee.click();
	}
	public void clickGetLoad(){
		Load.click();
	}
	public void clickOnCheckbox() {
		Checkbox.click();
	}
	public void clickGetGenerateReport(){
		GenerateReport.click();
	}
}

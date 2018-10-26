package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class AllotSalaryViaExcel extends BasePage {

	public AllotSalaryViaExcel(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="emp_detail")
	WebElement employeeLink;	
	@FindBy(linkText="Salary Rate Details")
	WebElement SalaryRateDetails;
	@FindBy(xpath="//*[@id=\"ui-accordion-accordion-panel-0\"]/li[2]/a")
	WebElement SalaryRateTemplate;	

	@FindBy(id="paymonth")
	WebElement MonthYear;
	@FindBy(id="salary_group_id")
	WebElement SalaryStructure;
	@FindBy(id="af_filter")
	WebElement GetClick;
	@FindBy(xpath="//*[@id='bf_form']/div[9]/button[1]")
	WebElement LoadButton;
	@FindBy(id="salary_rate_employees")
	WebElement GenerateFileButton;
	
	
	

public void clickEmployeeLink() {
	   employeeLink.click();
}
public void selectSalaryRateDetails(){
	SalaryRateDetails.click();
}
public void selectSalaryRateTemplate() {
	SalaryRateTemplate.click();
}	
public void selectMonthYear(String value){
		dropDownSelect(MonthYear, value);
}
public void selectSalaryStructure(String value){
	dropDownSelect(SalaryStructure, value);
}
public void selectGetClick() {
	GetClick.click();
}

public void selectLoadButton() {
	LoadButton.click();
}
public void selectGenerateFileButton() {
	GenerateFileButton.click();
}
}
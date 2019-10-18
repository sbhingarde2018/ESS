package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;

public class TocheckifTDSMonthlyDeductionsEmployeesSalaryEditorredirectstoSalaryEditorpage extends BasePage {
	@FindBy(id="tds")
	WebElement TDS;
	@FindBy(xpath="//li[7]/div/div/ul/li[4]/a")
	WebElement MonthlyDeductions;
	@FindBy(xpath="//*[@id=\"ui-id-2\"]/li/a")
	WebElement EmployeeSalaryEditor;
	@FindBy(id="month_year")
	WebElement PayMonth;
	@FindBy(id="salary_structure")
	WebElement SalaryStructure;
	@FindBy(id="get_salary")
	WebElement GetValues;
	@FindBy(xpath="//form[@id='bf_form']//button[contains(text(),'LOAD')]")
	WebElement Load;
	@FindBy(xpath="//table/tbody/tr[2]/td/div/div/div[1]/input")
	WebElement ProcessSalary;
	
	public TocheckifTDSMonthlyDeductionsEmployeesSalaryEditorredirectstoSalaryEditorpage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void ClickTDS() {
		TDS.click();
	}
	public void ClickMonthlyDeductions() {
		MonthlyDeductions.click();
	}
	public void ClickEmployeeSalaryEditor() {
		EmployeeSalaryEditor.click();
	}
	public void SelectPayMonth(String value) {
    	dropDownSelect(PayMonth, value);
	}
	public void SelectSalaryStructure(String value) {
    	dropDownSelect(SalaryStructure, value);
	}
	public void ClickGetValues() {
		GetValues.click();
	}
	public void ClickLoad() {
		Load.click();
	}
	public void ClickProcessSalary() {
		ProcessSalary.click();
	}
}


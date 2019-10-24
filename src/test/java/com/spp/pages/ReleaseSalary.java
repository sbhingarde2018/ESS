package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class ReleaseSalary extends BasePage{
	
	public ReleaseSalary(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="salary")
	WebElement Salary;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[3]/ul/li[1]/a")
	WebElement SalaryEditor;
	@FindBy(xpath="//a[contains(text(),'Release Salary')]")
	WebElement ReleaseSalary;
	@FindBy(xpath=" //select[@id='held_month_year']")
	WebElement SelecteMonth;
	@FindBy(xpath="//input[@id='save_content']")
	WebElement Save;
	@FindBy(xpath="//a[@id='report']")
	WebElement Report;
	@FindBy(xpath="//a[contains(text(),'Salary Sheet')]")
	WebElement SalarySheet;
	@FindBy(xpath=" //select[@id='sal_report_type']")
	WebElement selectSalarySheet;
	@FindBy(xpath="//button[@id='salary_sheet_filter']")
	WebElement GetEmp;
	@FindBy(xpath="//form[@id='bf_form']//button[contains(text(),'LOAD')]")
	WebElement Load;
	@FindBy(xpath="//input[@id='salary_sheet_submit']")
	WebElement GenerateReport;
	@FindBy(xpath="//select[@id='month_year']")
	WebElement PayMonth;
	@FindBy(xpath="//table/tbody/tr/td[4]/select")
	WebElement ReleaseMonth;
	
	
	
	public void ClickSalary() {
		Salary.click();
	}
	public void ClickSalaryEditor() {
		SalaryEditor.click();
	}
	public void ClickReleaseSalary() {
		ReleaseSalary.click();
	}
	public void selecteMonth(String value){
		dropDownSelect(SelecteMonth, value);
	}
	public void selectReleaseMonth(String value){
		dropDownSelect(ReleaseMonth, value);
	}
	public void ClickSave() {
		Save.click();
	}
	public void ClickReport() {
		Report.click();
	}
	public void ClickSalarySheet() {
		SalarySheet.click();
	}
	public void SelectSalarySheet(String value){
		dropDownSelect(selectSalarySheet, value);
	}
	public void ClickGetEmp() {
		GetEmp.click();
	}
	public void ClickGenerateReport() {
		GenerateReport.click();
	}
	public void ClickLoad() {
		Load.click();
	}
	public void selectPayMonth(String value){
		dropDownSelect(PayMonth, value);
	}
	
}
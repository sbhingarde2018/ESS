package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CheckSalarySheetReport extends BasePage{
	
	public CheckSalarySheetReport(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="salary")
	WebElement Salary;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[3]/ul/li[1]/a")
	WebElement SalaryEditor;
	@FindBy(xpath="//h3[contains(text(),'Reports')]")
	WebElement Reports;
	@FindBy(xpath="//ul[@id='ui-id-6']//a[contains(text(),'Salary Sheet')]")
	WebElement SalarySheet;
	@FindBy(xpath="//ul[@id='ui-id-4']//a[contains(text(),'Salary Sheet')]")
	WebElement SalarySheetReport;
	@FindBy(xpath="//select[@id='sal_report_type']")
	WebElement selectSalarySheet;
	@FindBy(xpath="//button[@id='salary_sheet_filter']")
	WebElement GetEmp;
	@FindBy(xpath="//form[@id='bf_form']//button[contains(text(),'LOAD')]")
	WebElement Load;
	@FindBy(xpath="//input[@id='salary_sheet_submit']")
	WebElement GenerateReport;
	@FindBy(xpath="//select[@id='month_year']")
	WebElement PayMonth;
	@FindBy(xpath="//input[@id='select_all_emp']")
	WebElement SelectAllEmp;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'HoldSal')]/parent::tr/td[1]/input")
	WebElement SelectEmp;
	@FindBy(xpath="//input[@id='salary_sheet_submit']")
	WebElement GenerateFile;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[3]/ul/li[4]/a")
	WebElement PublishedSalary;
	@FindBy(xpath=" //a[contains(text(),'Published Salary Notifications')]")
	WebElement PublishedSalaryNotifications;
	
	
	public void ClickSalary() {
		Salary.click();
	}
	public void ClickSalarySheetReport() {
		SalarySheetReport.click();
	}
	public void ClickSalaryEditor() {
		SalaryEditor.click();
	}
	public void selectPublishedSalary() {
		PublishedSalary.click();
	}
	public void ClickReports() {
		Reports.click();
	}
	public void ClickSalarySheet() {
		SalarySheet.click();
	}
	public void SelectSalarySheet(String value){
		dropDownSelect(selectSalarySheet, value);
	}
	public void selectPayMonth(String value){
		dropDownSelect(PayMonth, value);
	}
	public void ClickGetEmp() {
		GetEmp.click();
	}
	public void ClickLoad() {
		Load.click();
	}
	public void ClickSelectAllEmp() {
		SelectAllEmp.click();
	}
	public void ClickSelectEmp() {
		SelectEmp.click();
	}
	public void ClickGenerateFile() {
		GenerateFile.click();
	}
	public void ClickPublishedSalaryNotifications() {
		PublishedSalaryNotifications.click();
	}
}
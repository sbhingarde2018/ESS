package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CheckSalarySummary_FinancialYearReport extends BasePage{
	
	public CheckSalarySummary_FinancialYearReport(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="salary")
	WebElement Salary;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[3]/ul/li[1]/a")
	WebElement SalaryEditor;
	@FindBy(xpath="//h3[contains(text(),'Reports')]")
	WebElement Reports;
	@FindBy(xpath="//ul[@id='ui-id-6']//a[contains(text(),'Salary Summary')]")
	WebElement SalarySummary;
	@FindBy(xpath="//ul[@id='ui-id-4']//a[contains(text(),'Salary Summary')]")
	WebElement SalarySummaryReport;
	@FindBy(xpath="//select[@id='duration_type']")
	WebElement SalDurationType;
	@FindBy(xpath="//select[@id='financial_year']")
	WebElement FinancialYear;
	@FindBy(xpath="//select[@id='calendar_year']")
	WebElement CalendarYear;
	@FindBy(xpath="//select[@id='from_month']")
	WebElement FromYear;
	@FindBy(xpath="//select[@id='to_month']")
	WebElement ToYear;
	@FindBy(xpath="//input[@id='get_emp_sal']")
	WebElement GetEmp;
	@FindBy(xpath="//form[@id='bf_form']//button[contains(text(),'LOAD')]")
	WebElement Load;
	@FindBy(xpath="//tbody/tr[1]/td[1]/input")
	WebElement SelectEmp;
	@FindBy(xpath="//input[@id='submit-btn']")
	WebElement GenerateFile;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[3]/ul/li[4]/a")
	WebElement PublishedSalary;
	
	public void ClickSalary() {
		Salary.click();
	}
	public void ClickSalaryEditor() {
		SalaryEditor.click();
	}
	public void ClickReports() {
		Reports.click();
	}
	public void ClickSalarySummary() {
		SalarySummary.click();
	}
	public void ClickSalarySummaryReport() {
		SalarySummaryReport.click();
	}
	public void SelectSalDurationType(String value){
		dropDownSelect(SalDurationType, value);
	}
	public void SelectFinancialYear(String value){
		dropDownSelect(FinancialYear, value);
	}
	public void SelectCalendarYear(String value){
		dropDownSelect(CalendarYear, value);
	}
	public void SelectFromYear(String value){
		dropDownSelect(FromYear, value);
	}
	public void SelectToYear(String value){
		dropDownSelect(ToYear, value);
	}
	public void ClickGetEmp() {
		GetEmp.click();
	}
	public void ClickLoad() {
		Load.click();
	}
	public void ClickSelectEmp() {
		SelectEmp.click();
	}
	public void ClickGenerateFile() {
		GenerateFile.click();
	}
	public void selectPublishedSalary() {
		PublishedSalary.click();
	}
}
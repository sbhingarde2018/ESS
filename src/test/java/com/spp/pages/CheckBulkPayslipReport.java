package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CheckBulkPayslipReport extends BasePage{
	
	public CheckBulkPayslipReport(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}

	@FindBy(id="salary")
	WebElement Salary;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[3]/ul/li[1]/a")
	WebElement SalaryEditor;
	@FindBy(xpath="//h3[contains(text(),'Reports')]")
	WebElement Reports;
	@FindBy(xpath="//ul[@id='ui-id-6']//a[contains(text(),'Bulk Payslip')]")
	WebElement BulkPayslip;
	@FindBy(xpath="//ul[@id='ui-id-4']//a[contains(text(),'Bulk Payslip')]")
	WebElement BulkPayslipReport;
	@FindBy(xpath="//select[@id='month_year']")
	WebElement PayMonth;
	@FindBy(xpath="//select[@id='bp_salary_group_id']")
	WebElement SalStructure;
	@FindBy(xpath="//select[@id='payslip_type']")
	WebElement PayslipType;
	@FindBy(xpath="//input[@id='payslip_filter']")
	WebElement GetEmp;
	@FindBy(xpath="//form[@id='bf_form']//button[contains(text(),'LOAD')]")
	WebElement Load;
	@FindBy(xpath="//input[@id='select_all_emp']")
	WebElement SelectAllEmp;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'HoldSal')]/parent::tr/td[1]/input")
	WebElement SelectEmp;
	@FindBy(xpath="//input[@id='bulk_payslip_submit']")
	WebElement GenerateFile;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[3]/ul/li[4]/a")
	WebElement PublishedSalary;
	@FindBy(xpath=" //a[contains(text(),'Published Salary Notifications')]")
	WebElement PublishedSalaryNotifications;
	
	public void ClickSalary() {
		Salary.click();
	}
	public void ClickSalaryEditor() {
		SalaryEditor.click();
	}
	public void ClickReports() {
		Reports.click();
	}
	public void ClickBulkPayslip() {
		BulkPayslip.click();
	}
	public void ClickBulkPayslipReport() {
		BulkPayslipReport.click();
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
	public void selectPayMonth(String value){
		dropDownSelect(PayMonth, value);
	}
	public void selectSalStructure(String value){
		dropDownSelect(SalStructure, value);
	}
	public void selectPayslipType(String value){
		dropDownSelect(PayslipType, value);
	}
	public void ClickGenerateFile() {
		GenerateFile.click();
	}
	public void selectPublishedSalary() {
		PublishedSalary.click();
	}
	public void ClickPublishedSalaryNotifications() {
		PublishedSalaryNotifications.click();
	}
}
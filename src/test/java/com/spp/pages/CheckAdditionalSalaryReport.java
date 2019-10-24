package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CheckAdditionalSalaryReport extends BasePage{
	
	public CheckAdditionalSalaryReport(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="salary")
	WebElement Salary;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[3]/ul/li[1]/a")
	WebElement SalaryEditor;
	@FindBy(xpath="//h3[contains(text(),'Reports')]")
	WebElement Reports;
	@FindBy(xpath="//ul[@id='ui-id-6']//a[contains(text(),'Additional Salary Report')]")
	WebElement AdditionalSalary;
	@FindBy(xpath="//select[@id='paymonth_id']")
	WebElement PayMonth;
	@FindBy(xpath="//button[@id='addtional_salary_report_employees']")
	WebElement GetEmp;
	@FindBy(xpath="//form[@id='bf_form']//button[contains(text(),'LOAD')]")
	WebElement Load;
	@FindBy(xpath="//*[@id=\"employees_\"]")
	WebElement SelectEmp;
	@FindBy(xpath="//input[@id='addition_sal_report_submit']")
	WebElement GenerateReport;
	
	public void ClickSalary() {
		Salary.click();
	}
	public void ClickSalaryEditor() {
		SalaryEditor.click();
	}
	public void ClickReports() {
		Reports.click();
	}
	public void ClickAdditionalSalary() {
		AdditionalSalary.click();
	}
	public void SelectPayMonth(String value){
		dropDownSelect(PayMonth, value);
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
	public void ClickGenerateReport() {
		GenerateReport.click();
	}
	
}
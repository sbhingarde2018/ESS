package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CheckIncrementReport extends BasePage{
	
	public CheckIncrementReport(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="salary")
	WebElement Salary;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[3]/ul/li[1]/a")
	WebElement SalaryEditor;
	@FindBy(xpath="//h3[contains(text(),'Reports')]")
	WebElement Reports;
	@FindBy(xpath="//ul[@id='ui-id-6']//a[contains(text(),'Increment Report')]")
	WebElement IncrementReport;
	@FindBy(xpath="//ul[@id='ui-id-4']//a[contains(text(),'Increment Report')]")
	WebElement Increment;
	@FindBy(xpath="//select[@id='from_month_year']")
	WebElement FromYear;
	@FindBy(xpath="//select[@id='to_month_year']")
	WebElement ToYear;
	@FindBy(xpath="//button[@id='get_employees']")
	WebElement GetEmp;
	@FindBy(xpath="//form[@id='bf_form']//button[contains(text(),'LOAD')]")
	WebElement Load;
	@FindBy(xpath="//*[@id=\"employee_ids_\"]")
	WebElement SelectEmp;
	@FindBy(xpath="//input[@id='generate_report']")
	WebElement GenerateReport;
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
	public void CickIncrementReport() {
		IncrementReport.click();
	}
	public void CickIncrement() {
		Increment.click();
	}
	public void SelectFromYear(String value){
		dropDownSelect(FromYear, value);
	}
	public void SelectToYear(String value) {
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
	public void ClickGenerateReport() {
		GenerateReport.click();
	}
	public void selectPublishedSalary() {
		PublishedSalary.click();
	}
}
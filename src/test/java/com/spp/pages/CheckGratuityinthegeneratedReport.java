package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;

public class CheckGratuityinthegeneratedReport extends BasePage {
	@FindBy(xpath="//a[@id='salary']")
	WebElement Salary;
	@FindBy(xpath="//a[text()='Gratuity']")
	WebElement Gratuity;
	@FindBy(xpath="//ul[@id='ui-id-2']//a[contains(text(),'Gratuity Report')]")
	WebElement GratuityReport;
	@FindBy(xpath="//input[@id='filter']")
	WebElement GetEmp;
	@FindBy(xpath="//form[@id='bf_form']//button[contains(text(),'LOAD')]")
	WebElement Load;
	@FindBy(xpath="//input[@id='gratuity_report_employees_']")
	WebElement SelectEmp;
	@FindBy(xpath="//input[@id='preview_gratuity_report']")
	WebElement GenerateReport;
	
	public CheckGratuityinthegeneratedReport(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void ClickSalary() {
		Salary.click();
	}
	public void ClickGratuity() {
		Gratuity.click();
	}
	public void ClickReport() {
		GratuityReport.click();
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

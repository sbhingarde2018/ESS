package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;

import com.spp.common.BasePage;



public class GratuityReportredirectstoReportsmodule extends BasePage{
	public GratuityReportredirectstoReportsmodule(WebDriver driver) {
		
		super(driver);
		PageFactory.initElements(driver, this);
		}
	@FindBy(id="salary")
	WebElement ClickOnSalary;
	@FindBy(xpath="//a[text()='Gratuity']")
	WebElement ClickOnGratuity;
	@FindBy (xpath="//ul[@id='ui-id-2']//a[contains(text(),'Gratuity Report')]")
	WebElement GratuityReportLink;
	@FindBy(xpath="//select[@id='gratuity_report_report_type']")
	WebElement Reports;
	@FindBy(xpath="//input[@id='filter']")
	WebElement Filter;
	@FindBy(xpath="//form[@id='bf_form']//button[contains(text(),'LOAD')]")
	WebElement Load;
	@FindBy(xpath="//*[@id=\"gratuity_report_employees_\"]")
	WebElement SelectEmp;
	@FindBy(xpath="//input[@id='preview_gratuity_report']")
	WebElement GenerateReport;
	@FindBy(xpath="//div/table/tbody/tr/td[5]/a/img")
	WebElement Delete;
	
	public void clickonsalary() {
		ClickOnSalary.click();
	}
	public void clickongratutiy() {
		ClickOnGratuity.click();
	}
	public void ClickGratuityReportLink() {
		GratuityReportLink.click();
	}
	public void ClickFilter() {
		Filter.click();
	}
	public void selectReports(String value) {
		dropDownSelect(Reports, value);
	}
	public void ClickLoad(){
		Load.click();
	}
	public void ClickSelectEmp(){
		SelectEmp.click();
	}
	public void ClickGenerateReport(){
		GenerateReport.click();
	}
	public void clickDelete() {
		Delete.click();
		switchToPopUpAndAccept(driver);
	}
}

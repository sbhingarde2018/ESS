package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;

public class GenerateEmployeeMasterReport extends BasePage{

	public GenerateEmployeeMasterReport(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
		// TODO Auto-generated constructor stub
	}
		
	@FindBy(xpath="//a[@id='report']")
	WebElement Report;
	@FindBy(xpath="//a[contains(text(),'Employee Master Report')]")
	WebElement EmpMasterReport;
	@FindBy(xpath="//select[@id='report_type']")
	WebElement ReportType ;
	@FindBy(xpath="//button[@id='get_emp_data']")
	WebElement GetEmployee;
	@FindBy(xpath="//form[@id='bf_form']//button[contains(text(),'LOAD')]")
	WebElement LoadButton;
	@FindBy(xpath="//div[@id='master_report_filter']//input")
	WebElement Search;
	@FindBy(xpath="//*[@id=\"employee_id_\"]")
	WebElement Select;
	@FindBy(xpath=" //input[@id='post_emp_data']")
	WebElement GenerateReport;
	@FindBy(xpath="//*[@id=\"basic_info\"]")
	WebElement BasicInfo;
	@FindBy(xpath="//*[@id=\"contacts\"]")
	WebElement contacts;
	@FindBy(xpath="//label[@class='control-label']//input[@id='classification']")
	WebElement classification;
	@FindBy(xpath="//*[@id=\"statutory\"]")
	WebElement statutory;
	@FindBy(xpath="//*[@id=\"hr_category_\"]")
	WebElement HrCategory;
	
	
	public void ClickReport() {
		Report.click();
	}
	public void ClickEmpMasterReport() {
		EmpMasterReport.click();
	}
	public void SelectReportType(String value){
		dropDownSelect(ReportType, value);
	}
	public void ClickGetEmployee() {
		GetEmployee.click();
	}
	public void ClickLoadButton() {
		LoadButton.click();
	}
	public void SearchEmp(String value) throws Exception{
		Search.sendKeys(value);
	}
	public void SelectEmp() {
		Select.click();
	}
	public void ClickGenerateReport() {
		GenerateReport.click();
	}
	public void SelectBasicInfo() {
		BasicInfo.click();
	}
	public void Selectcontacts() {
		contacts.click();
	}
	public void Selectclassification() {
		classification.click();
	}
	public void Selectstatutory() {
		statutory.click();
	}
	public void SelectHrCategory() {
		HrCategory.click();
	}
}

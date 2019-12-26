package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CheckifEmployeeEmployeeDetailsReportsEmployeeStatutoryReportredirectstoReportmodule extends BasePage{
	@FindBy(id="emp_detail")
	WebElement ClickOnEmployee;
	@FindBy(xpath="//a[contains(text(),'Employee Details')]")
	WebElement ClickOnEmployeeDetails;
	@FindBy(xpath="//h3[contains(text(),'Reports')]")
	WebElement ClickOnReports;
	@FindBy(xpath="//ul[@class='subnav-menu']//a[contains(text(),'Employee Statutory Report')]")
	WebElement ClickOnEmployeeStatRept;
	@FindBy(xpath="//select[@id='st_report']")
	WebElement SelectReportType;
	@FindBy(xpath="//select[@id='pf_report_pf_group']")
	WebElement SelectGroup;
	@FindBy(xpath="//select[@id='order_by']")
	WebElement SelectOrderBy;
	@FindBy(xpath="//select[@id='month_year']")
	WebElement SelectPaymonth;
	@FindBy(xpath="//input[@name='commit']")
	WebElement ClickOnGenerateStatReport;
	
	public CheckifEmployeeEmployeeDetailsReportsEmployeeStatutoryReportredirectstoReportmodule(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void clickonemployee() {
		ClickOnEmployee.click();
	}
	public void clickonemployeedetails() {
		ClickOnEmployeeDetails.click();
	}
	public void clickonreports() {
		ClickOnReports.click();
	}
	public void clickonstatreport() {
		ClickOnEmployeeStatRept.click();
	}
	public void selectreporttype(String value) throws Exception{
		dropDownSelect(SelectReportType, value);
	}
	public void selectgroup(String value) throws Exception{
		dropDownSelect(SelectGroup, value);
	}
	public void selectorderby(String value) throws Exception{
		dropDownSelect(SelectOrderBy, value);
	}
	public void selectpaymonth(String value) throws Exception{
		dropDownSelect(SelectPaymonth, value);
	}
	public void generatestatreport() {
		ClickOnGenerateStatReport.click();
	}
	

}	

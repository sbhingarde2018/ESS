package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CheckifEmployeeEmployeeDetailsReportsEmployeeSummaryredirectstoReportmodule extends BasePage{
	@FindBy(id="emp_detail")
	WebElement ClickOnEmployee;
	@FindBy(xpath="//a[contains(text(),'Employee Details')]")
	WebElement ClickOnEmployeeDetails;
	@FindBy(xpath="//h3[contains(text(),'Reports')]")
	WebElement ClickOnReports;
	@FindBy(xpath="//ul[@class='subnav-menu']//a[contains(text(),'Employee Summary')]")
	WebElement ClickOnEmployeeSummary;
	@FindBy(xpath="//tr[1]//td[5]//a[1]")
	WebElement ClickOnViewSummary;
	@FindBy(xpath="//a[contains(text(),'Download PDF')]")
	WebElement DownloadPDF;
	@FindBy(xpath="//*[@id=\"main\"]/div[12]/a[2]")
	WebElement DownloadExcel;
		
	public CheckifEmployeeEmployeeDetailsReportsEmployeeSummaryredirectstoReportmodule(WebDriver driver) {
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
	public void clickonemployeesummary() {
		ClickOnEmployeeSummary.click();
	}
	public void clickonviewsummary() {
		ClickOnViewSummary.click();
	}
	public void downloadpdf() {
		DownloadPDF.click();
	}
	public void downloadexcel() {
		DownloadExcel.click();
		
	}
}

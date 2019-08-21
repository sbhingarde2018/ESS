package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;

public class CheckifSalaryFullAndFinalSettlementReportsFullandFinalReportredirectstoReports extends BasePage {
	@FindBy(xpath="//a[@id='salary']")
	WebElement Salary;
	@FindBy(xpath="//div[@class='dropdown_5columns salaries']//a[contains(text(),'Full and Final Settlement')]")
	WebElement FullFinalSettlement;
	@FindBy(xpath="//a[contains(text(),'Full And Final Report')]")
	WebElement FullFinalReport;
	@FindBy(xpath="//select[@id='ffs_report_months']")
	WebElement Paymonth;
	@FindBy(xpath="//button[@id='ffs_employees']")
	WebElement GetEmp;
	@FindBy(xpath="//form[@id='bf_form']//button[contains(text(),'LOAD')]")
	WebElement Load;
	@FindBy(xpath="//tbody/tr/td[3]/a/img")
	WebElement Downloadpdf;
	
	
	
	
	public CheckifSalaryFullAndFinalSettlementReportsFullandFinalReportredirectstoReports(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void ClickSalary() {
		Salary.click();
	}
	public void ClickFullFinalSettlement() {
		FullFinalSettlement.click();
	}
	public void ClickFullFinalReport() {
		FullFinalReport.click();
	}
	public void SelectPaymonth(String value) {
    	dropDownSelect(Paymonth, value);
	}
	public void ClickGetEmp() {
		GetEmp.click();
	}
	public void ClickLoad() {
		Load.click();
	}
	public void ClickDownloadpdf() {
		Downloadpdf.click();
	}
}

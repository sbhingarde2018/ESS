package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;

public class GenerateTDSReport extends BasePage {
	@FindBy(id="tds")
	WebElement TDS;
	@FindBy(xpath="//*[@id=\"menu\"]/li[7]/div/div/ul/li[5]/a")
	WebElement Reports;
	@FindBy(id="asst_year")
	WebElement Assessment;
	@FindBy(id="report_type")
	WebElement ReportType;
	@FindBy(id="get_employees")
	WebElement GetEmployees;
	@FindBy(xpath="//*[@id=\"bf_form\"]/div[10]/button[1]")
	WebElement Load;
	@FindBy(id="employee_ids_")
	WebElement SelectEmp;
	@FindBy(id="generate_report")
	WebElement GenerateReport;
	
	
	public GenerateTDSReport(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void ClickTDS() {
		TDS.click();
	}
	public void ClickReports() {
		Reports.click();
	}
	public void SelectAssessmenth(String value) {
    	dropDownSelect(Assessment, value);
	}
	public void SelectReportType(String value) {
    	dropDownSelect(ReportType, value);
	}
	public void ClickGetEmployees() {
		GetEmployees.click();
	}
	public void ClickLoad() {
		Load.click();
	}
	public void ClickGenerateReport() {
		GenerateReport.click();
	}
	public void ClickSelectEmp() {
		SelectEmp.click();
	}
}

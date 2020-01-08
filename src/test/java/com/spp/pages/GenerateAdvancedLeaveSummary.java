package com.spp.pages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;
import com.spp.generics.ExcelUtil;

public class GenerateAdvancedLeaveSummary extends BasePage{
	@FindBy(xpath="//a[@id='report']")
	WebElement Report;
	@FindBy(xpath="//a[contains(text(),'Monthly Leave Summary')]")
	WebElement ClickOnMonthlyLeaveSummary;
	@FindBy(xpath="//input[@id='advanced']")
	WebElement SelectAdvanceLeaveSummary;
	@FindBy(id="leave_summary_month_year")
	WebElement SelectPaymonth;
	@FindBy(id="leave_policy")
	WebElement SelectLeavePolicy;
	@FindBy(xpath="//select[@id='leave_type']")
	WebElement SelectLeaveType;
	@FindBy(id="filter")
	WebElement ClickOnGetEmployees;
	@FindBy(xpath="//form[@id='bf_form']//button[contains(text(),'LOAD')]")
	WebElement ClickOnLoad;
	@FindBy(id="select_all_employees")
	WebElement SelectallEmployees;
	@FindBy(xpath="//input[@value='Generate Report']")
	WebElement GenerateReport;
	@FindBy(id="order_by")
	WebElement SelectOrderBy;
	
		public GenerateAdvancedLeaveSummary(WebDriver driver) {
			super(driver);
			PageFactory.initElements(driver, this);	
		}
		public void clickonReport() {
			Report.click();
		}
		public void clickonmonthlyleavesummary() {
			ClickOnMonthlyLeaveSummary.click();
		}
		public void selectadvanceleavesummary() {
			SelectAdvanceLeaveSummary.click();
		}
		public void selectpaymonth(String value) {
			dropDownSelect(SelectPaymonth, value);
		}
		public void selectleavepolicy(String value) {
			dropDownSelect(SelectLeavePolicy, value);
		}
		public void selectleavetype(String value) {
			dropDownSelect(SelectLeaveType, value);
		}
		public void clickongetemployees() {
			ClickOnGetEmployees.click();
		}
		public void clickonload() {
			ClickOnLoad.click();
		}
		public void selectallemployees() {
			SelectallEmployees.click();
		}
		public void generatereport() {
			GenerateReport.click();
		}
		public void selectorderby(String value) {
			dropDownSelect(SelectOrderBy, value);
		}
		public ArrayList<String> getColumn() throws EncryptedDocumentException, InvalidFormatException, IOException {
			ExcelUtil exc = new ExcelUtil("C:\\Users\\Alfalabs\\Downloads\\excel_leave_report.xls");
			ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(exc.getColumn("C")));
			return arrayList;
					
		}
}

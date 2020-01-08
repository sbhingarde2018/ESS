package com.spp.pages;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;
import com.spp.generics.ExcelUtil;

public class GenerateMonthlyLeaveSummary extends BasePage {
@FindBy(xpath="//a[@id='report']")
WebElement Report;
@FindBy(xpath="//a[contains(text(),'Monthly Leave Summary')]")
WebElement ClickOnMonthlyLeaveSummary;
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

	public GenerateMonthlyLeaveSummary(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);	
	}
	public void clickonReport() {
		Report.click();
	}
	public void clickonmonthlyleavesummary() {
		ClickOnMonthlyLeaveSummary.click();
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
	public void selectorderby(String value) {
		dropDownSelect(SelectOrderBy, value);
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
	
	/*public ArrayList<String> getColumn() throws EncryptedDocumentException, InvalidFormatException, IOException {
		ExcelUtil exc = new ExcelUtil("C:\\Users\\Administrator\\Downloads\\excel_leave_report.xls","excel_leave_report", "JaiSriRam");
		ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(exc.getColumn("C")));
		return arrayList;			
	}*/
	
	/*public void readDownloadFile() throws URISyntaxException, IOException {
		String content = new String(Files.readAllBytes(Paths.get("C:\\Users\\Administrator\\Downloads\\excel_leave_report.xls")));
		Document doc = Jsoup.parse(content);
		doc.select(cssQuery);
	}*/
}

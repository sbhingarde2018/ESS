
package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class SalaryNotificationStatusDetails extends BasePage{
	
	public SalaryNotificationStatusDetails(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="salary")
	WebElement Salary;
	@FindBy(xpath=" //a[contains(text(),'Published Salary Notifications')]")
	WebElement PublishedSalaryNotifications;
	@FindBy(xpath="//select[@id='month_year']")
	WebElement PayMonth;
	@FindBy(xpath="//select[@id='notification_status']")
	WebElement notificationstatus;
	@FindBy(xpath="//select[@id='payslip_type']")
	WebElement Payslip;
	@FindBy(xpath="//button[@id='af_filter']")
	WebElement GetEmp;
	@FindBy(xpath="//form[@id='bf_form']//button[contains(text(),'LOAD')]")
	WebElement Load;
	@FindBy(xpath="//strong[contains(text(),'Employees Successfully Loaded.')]")
	WebElement Message;
	@FindBy(xpath="//input[@name='commit']")
	WebElement SendEMail;
	@FindBy(xpath="//*[@id=\"select_all_emp\"]")
	WebElement SelectAll;
	@FindBy(xpath="//*[@id=\"notification_employees__id\"]")
	WebElement SelectEmp;
	
	public void ClickSalary() {
		Salary.click();
	}
	public void ClickSendEMail() {
		SendEMail.click();
	}
	public void ClickPublishedSalaryNotifications() {
		PublishedSalaryNotifications.click();
	}
	public void SelectPayMonth(String value) {
		dropDownSelect(PayMonth, value);
	}
	public void Selectnotificationstatus(String value) {
		dropDownSelect(notificationstatus, value);
	}
	public void SelectPayslip(String value) {
		dropDownSelect(Payslip, value);
	}
	public void ClickGetEmp() {
		GetEmp.click();
	}
	public void ClickLoad() {
		Load.click();
	}
	public String getSuccessMessage(){
		return Message.getText();
	}
	public void ClickSelectAll() {
		SelectAll.click();
	}
	public void ClickSelectEmp() {
		SelectEmp.click();
	}
}
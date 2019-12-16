package com.spp.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;


public class AllotAvailDateSettingsDefaultSettingPage extends BasePage{
	public AllotAvailDateSettingsDefaultSettingPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//*[@id=\"menu\"]/li[3]/div/div[3]/ul/li[2]/a")
	WebElement leavePolicy;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'abc')]/parent::tr/td[4]/a")
	WebElement AddLeaves;
	@FindBy(xpath="//div[2]/table/tbody/tr/td[contains(text(),'Earned Leave')]/parent::tr/td[3]/a")
	WebElement settingsLink;
	@FindBy(xpath="//select[@id='non_saved_leaves']")
	WebElement LeaveType;
	@FindBy(xpath="//input[@name='commit']")
	WebElement Add;
	@FindBy(xpath="//table/tbody/tr[5]/td[contains(text(),'')]/parent::tr/td[4]/a/img")
	WebElement DeleteLeave;
	@FindBy(xpath="//span[contains(text(),'Allot/Avail Settings')]")
	WebElement Allot_Avail;
	@FindBy(xpath="//a[contains(text(),'Add Leaves')]")
	WebElement GoToAddLeave;
	@FindBy(xpath="//*[@id=\"menu\"]/li[8]/a")
	WebElement Report;
	@FindBy(xpath="//*[@id=\"menu\"]/li[8]/div/div[1]/ul/li[7]/a")
	WebElement AdvanceLeaveReport;
	@FindBy(id="leave_report_type")
	WebElement LeaveReport;
	@FindBy(xpath="//select[@id='leave_policy']")
	WebElement LeavePolicy;
	@FindBy(xpath="//input[@id='paymonth']")
	WebElement Paymonth;
	@FindBy(id="select_all_leaves")
	WebElement SelectAllCheckBox;
	@FindBy(id="leave_report_employees")
	WebElement GetEmployee;
	
	@FindBy(xpath="//*[@id=\"leave_report_table\"]/tbody/tr[1]/td[1]/input")
	WebElement Employee1;
	@FindBy(xpath="//*[@id=\"leave_report_table\"]/tbody/tr[2]/td[1]/input")
	WebElement Employee2;
	@FindBy(id="leave_report_submit")
	WebElement GenerateReport;
	 @FindBy(xpath="//form[@id='bf_form']//button[contains(text(),'LOAD')]")
	    WebElement Load;
	 
	public void clickMastserLink(){
		masterLink.click();
	}

	public void selectLeavePolicy(){
		leavePolicy.click();
	}
	public void clickAddLeaves(){
		AddLeaves.click();
	}
	
	public void clickSettingsLink(){
		settingsLink.click();
	}
	public void selectLeaveType(String value) {
		dropDownSelect(LeaveType, value);
	}
	public void clickAdd(){
		Add.click();
	}
	public void clickDeleteLeave(){
		DeleteLeave.click();
		switchToPopUpAndAccept(driver);
	}
	public void clickAllot_Avail(){
		Allot_Avail.click();
	}
	public void clickGoToAddLeave(){
		GoToAddLeave.click();
	}
	public void clickReport(){
		Report.click();
	}
	public void clickAdvanceLeaveReport(){
		AdvanceLeaveReport.click();
	}
	public void selectLeaveReport(String value) {
		dropDownSelect(LeaveReport, value);
	}
	public void selectLeavePolicy(String value) {
		dropDownSelect(LeavePolicy, value);
	}
	public void clickPaymonth(String value){
		Paymonth.clear();
		Paymonth.sendKeys(value);
	}
	public void clickSelectAllCheckBox(){
		SelectAllCheckBox.click();
	}
	public void clickGetEmployee(){
		GetEmployee.click();
	}
	public void clickLoad(){
		Load.click();
	}
	public void clickEmployee1(){
		Employee1.click();
	}
	
	public void clickEmployee2(){
		Employee2.click();
	}
	public void clickGenerateReport(){
		GenerateReport.click();
	}
}

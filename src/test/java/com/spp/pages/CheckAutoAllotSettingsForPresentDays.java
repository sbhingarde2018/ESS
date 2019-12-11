package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CheckAutoAllotSettingsForPresentDays extends BasePage{
	
	@FindBy(xpath="//*[@id=\"menu\"]/li[8]/a")
	WebElement Report;
	@FindBy(xpath="//*[@id=\"menu\"]/li[8]/div/div[1]/ul/li[7]/a")
	WebElement AdvanceLeaveReport;
	@FindBy(id="leave_report_type")
	WebElement LeaveReport;
	@FindBy(xpath="//select[@id='leave_policy']")
	WebElement LeavePolicy;
	
	@FindBy(id="from_date")
	WebElement FromDate;
	@FindBy(id="to_date")
	WebElement ToDate;
	@FindBy(xpath="//div[@class='emp_rate-col2']//div[3]//input[1]")
	WebElement CasualLeave;
	@FindBy(id="leave_report_employees")
	WebElement GetEmployee;
	@FindBy(xpath="//form[@id='bf_form']//button[contains(text(),'LOAD')]")
    WebElement Load;
	@FindBy(xpath="//*[@id=\"leave_report_table\"]/tbody/tr[1]/td[1]/input")
	WebElement Employee1;
	@FindBy(xpath="//*[@id=\"leave_report_table\"]/tbody/tr[2]/td[1]/input")
	WebElement Employee2;
	@FindBy(id="leave_report_submit")
	WebElement GenerateReport;
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//a[text()='Leave Policy']")
	WebElement leavePolicy;
    @FindBy(xpath="//table/tbody/tr/td[contains(text(),'ClonePolicy')]/parent::tr/td[4]/a")
	WebElement addLeaves;
   // @FindBy(xpath="//*[@id=\"leave_policy_setting_details\"]/div[2]/table/tbody/tr/td[2][contains(text(),'Earned')]/parent::tr/td[3]/a")
    @FindBy(xpath="//div[2]/table/tbody/tr/td[contains(text(),'Casual Leave')]/parent::tr/td[3]/a")
    WebElement settingsLink;
    @FindBy(xpath="//*[@id=\"main\"]/div/div[3]/nav/ul/li[4]/a/span")
    WebElement AutoAllotTab;
    @FindBy(id="auto_leave_allotment")
    WebElement LeaveAllotmentBox;
    @FindBy(xpath="//*[@id=\"auto_allot_setting\"]/table/tbody/tr[3]/td/input")
    WebElement UpdateButton;
    
	public CheckAutoAllotSettingsForPresentDays(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
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
	public void clickFromDate(String value){
		FromDate.clear();
		FromDate.sendKeys(value);
	}
	public void clickToDate(String value){
		ToDate.clear();
		ToDate.sendKeys(value);
	}
	public void clickSelectCasualLeave(){
		CasualLeave.click();
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
	public void clickMastserLink(){
		masterLink.click();
	}

	public void selectLeavePolicy(){
		leavePolicy.click();
	}
	
	public void clickAddLeaves(){
		addLeaves.click();
	}
	
	public void clickSettingsLink(){
		settingsLink.click();
	}
	public void clickAutoAllotTab(){
		AutoAllotTab.click();
	}
	public void clickLeaveAllotmentBox(){
		LeaveAllotmentBox.click();
	}
	public void clickUpdateButton(){
		UpdateButton.click();
	}
}

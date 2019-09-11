package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class AutoAllotSettings extends BasePage {
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//a[text()='Leave Policy']")
	WebElement leavePolicy;
    @FindBy(xpath="//table/tbody/tr/td[contains(text(),'Default')]/parent::tr/td[4]/a")
	WebElement addLeaves;
    @FindBy(xpath="//div[2]/table/tbody/tr/td[contains(text(),'Casual Leave')]/parent::tr/td[3]/a")
    WebElement settingsLink;
    @FindBy(xpath="//span[contains(text(),'Auto Allot Settings')]")
    WebElement autoAllot;
    @FindBy(id="auto_leave_allotment")
    WebElement leaveAllotment;
    @FindBy(id="leave_policy_head_wise_setting_auto_allot_settings_allot_type")
    WebElement allotType;
    @FindBy(xpath="(//select[@id='leave_policy_head_wise_setting_auto_allot_settings_allot_on'])[1]")
    WebElement allotOn;
    @FindBy(id="leave_policy_head_wise_setting_auto_allot_settings_round_off")
    WebElement roundOff;
    @FindBy(id="leave_policy_head_wise_setting_auto_allot_settings_effective_from")
    WebElement effectiveFrom;
    @FindBy(id="leave_policy_head_wise_setting_auto_allot_settings_no_of_days")
    WebElement numberOfDays;
    @FindBy(xpath="//form[@id='auto_allot_setting']//tr[3]//input[@value='Update']")
    WebElement updateButton;
	@FindBy(xpath="//strong[text()='Setting was successfully updated.']")
	WebElement successfullMessage;
	@FindBy(xpath="//a[@id='report']")
	WebElement Report;
	@FindBy(xpath="//a[contains(text(),'Advance Leave Report')]")
	WebElement AdvanceLeaveReport;
	@FindBy(id="leave_report_type")
	WebElement LeaveReport;
	@FindBy(id="leave_policy")
	WebElement LeavePolicy;
	@FindBy(id="paymonth")
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
	@FindBy(xpath="//*[@id=\"bf_form\"]/div/button[contains(text(),'LOAD')]")
    WebElement Load;
	
	public AutoAllotSettings(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
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
	
	public void clickAutoAllot(){
		autoAllot.click();
	}
	
	public void clickLeaveAllotment(){
		if(leaveAllotment.isSelected()) {
			System.out.println("Already Selected");
		}
		else {
			leaveAllotment.click();
		}
	}
	
	public void selectAllotType(String value){
		dropDownSelect(allotType, value);
	}
	
	public void selectAllotOn(String value){
		dropDownSelect(allotOn, value);
	}
	
	public void selectRoundOff(String value){
		dropDownSelect(roundOff, value);
	}
	
	public void selectEffectiveFrom(String value){
		dropDownSelect(effectiveFrom, value);
	}
	
	public void enterNumberOfDays(String value){
		numberOfDays.sendKeys(value);
	}
	
	public void clickUpdateButton(){
		updateButton.click();
	}
	
	public String getMessage(){
		return successfullMessage.getText();
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
	public void UncheckLeaveAllotment(){
		leaveAllotment.click();
	}
}

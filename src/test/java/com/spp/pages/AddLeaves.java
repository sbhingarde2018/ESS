package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class AddLeaves extends BasePage{
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//a[text()='Leave Policy']")
	WebElement leavePolicy;
    @FindBy(xpath="//table/tbody/tr/td[contains(text(),'LeavePolicyTest')]/parent::tr/td[4]/a")
	WebElement addLeaves;
	@FindBy(id="non_saved_leaves")
	WebElement leaveType;
    @FindBy(xpath="//input[@value='Add']")
    WebElement addButton;
    @FindBy(xpath="//strong[text()='Leave policy setting was successfully created.']")
    WebElement successsfullMessage;
    @FindBy(xpath="//a[text()='Add New Leave Policy']")
    WebElement addLeavePolicy;
	@FindBy(id="leave_policy_master_policy_name")
	WebElement policyName;
	@FindBy(id="leave_policy_master_attendance_type_id")
	WebElement leaveDropDown;
    @FindBy(id="leave_policy_master_remarks")
    WebElement remarks;
    @FindBy(xpath="//input[@value='Create Leave Policy Master']")
    WebElement createLeavePolicy;
    
	public AddLeaves(WebDriver driver) {
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
	
	public void selectLeaveType(String value){
		dropDownSelect(leaveType, value);
	}

	public void clickAddButton(){
		addButton.click();	
	}
	
	public String getMessage(){
		return successsfullMessage.getText();
	}
	public void clickAddLeavePolicy(){
		addLeavePolicy.click();
	}
	
	public void enterPolicyName(String value){
		policyName.sendKeys(value);
	}
	
	
	public void enterRemarks(String value){
		remarks.sendKeys(value);
	}
	
	public void clickCreateLeavePolicy(){
		createLeavePolicy.click();
	}
	
}

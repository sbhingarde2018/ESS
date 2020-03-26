package com.ess.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ess.common.BasePage;

public class CreateLeavePolicy extends BasePage {
	
	@FindBy(id="master")
	WebElement masterlink;

	@FindBy(xpath="//a[.='Leave Policy']")
	WebElement LeavePolicy;
	
	@FindBy(xpath="//a[.='Add New Leave Policy']")
	WebElement AddNewLeavePolicy;
	
	@FindBy(id="leave_policy_master_policy_name")
	WebElement PolicyName;
	@FindBy(id="leave_policy_master_attendance_type_id")
	WebElement PolicyType;
	@FindBy(name="commit")
	WebElement CreateButton;
	
	@FindBy(xpath="//strong[contains(text(),'Leave policy master successfully created')]")
	WebElement successfullMessage;
	
	public CreateLeavePolicy(WebDriver driver) {
		
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void navigateMaster() throws Exception{
		masterlink.click();
	}
	public void navigateLeavePolicy() throws Exception{
		LeavePolicy.click();
	}
	public void AddNewLeavePolicy() throws Exception{
		AddNewLeavePolicy.click();
	}
	public void EnterPolicyName(String LN) throws Exception{
		PolicyName.sendKeys(LN);
	}
	public void EnterPolicyType() throws Exception{
		
		Select s = new Select(PolicyType);
		s.selectByIndex(1);
	}
	public void CreateButton() throws Exception{
		CreateButton.click();
	}
	public String getMessage(){
		return successfullMessage.getText();
	}
	

}

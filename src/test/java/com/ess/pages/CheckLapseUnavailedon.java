package com.ess.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ess.common.BasePage;

public class CheckLapseUnavailedon extends BasePage {
	
	@FindBy(id="master")
	WebElement masterlink;

	@FindBy(xpath="//a[.='Leave Policy']")
	WebElement LeavePolicy;
	
	@FindBy(xpath="(//a[.='Add Leaves'])[1]")
	WebElement AddLeavesForPolicy;
	

	@FindBy(xpath="//td[@id='leave_2']//a[contains(text(),'Settings')]")
	WebElement settingforleavedefi;
	
	@FindBy(xpath="//li[@class='companies-tab-head']//span[contains(text(),'Lapse')]")
	WebElement clickOnLapse ;
	
	@FindBy(id="leave_policy_head_wise_setting_carry_over_lapse_settings_carry_over")
	WebElement clickOnCarryOver ;
	
	@FindBy(id="leave_policy_head_wise_setting_carry_over_lapse_settings_lapse_unavailed_on")
	WebElement selectlaps;
	
	@FindBy(id="leave_policy_head_wise_setting_carry_over_lapse_settings_lapse_type")
	WebElement selectlapstype;
	
	@FindBy(id="leave_policy_head_wise_setting_carry_over_lapse_settings_month")
	WebElement selectmonth;
	
	
	@FindBy(id="leave_policy_head_wise_setting_carry_over_lapse_settings_lapse_exceeding")
	WebElement LapsExceeding;
	
	@FindBy(xpath="//input[@id='update_carry_over_lapse']")
	WebElement UpdateButton;
	
	@FindBy(xpath="//strong[contains(text(),'Setting was successfully updated.')]")
	WebElement successfullMessage;
	

	public CheckLapseUnavailedon(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void navigateMaster() throws Exception{
		masterlink.click();
	}
	public void navigateLeavePolicy() throws Exception{
		LeavePolicy.click();
	}
	public void addLeavesForPolicy() throws Exception{
		AddLeavesForPolicy.click();
	}
	public void settingforleavedefi() throws Exception{
		settingforleavedefi.click();
	}
	public void clickOnLapse() throws Exception{
		clickOnLapse.click();
	}
	public void clickOnCarryOver() throws Exception{
		clickOnCarryOver.click();
	}
	public void selectlaps() throws Exception{
		selectlaps.click();
	} 
	public void selectlapstype() throws Exception{
	
		Select s = new Select(selectlapstype);
		s.selectByIndex(1);
	} 
	
	public void selectmonth() throws Exception{
		
		Select s = new Select(selectmonth);
		s.selectByIndex(5);
	} 
	public void lapsExceeding(String un) throws Exception{
		LapsExceeding.sendKeys(un);
	} 
	public void updateButtonlectlaps() throws Exception{
		UpdateButton.click();
	} 
	public String getMessage(){
		return successfullMessage.getText();
	}
	

}

package com.ess.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.ess.common.BasePage;

public class AllowHalfDay extends BasePage {
	


	@FindBy(id="master")
	WebElement masterlink;

	@FindBy(xpath="//a[.='Leave Policy']")
	WebElement LeavePolicy;
	
	@FindBy(xpath="(//a[.='Add Leaves'])[1]")
	WebElement AddLeavesForPolicy;
	
	@FindBy(xpath="//td[@id='leave_4']//a[contains(text(),'Settings')]")
	WebElement settingforleavedefi;
	
	@FindBy(xpath ="//table[@class='table all-white no-border gen_text']//input[@id='leave_policy_head_wise_setting_behaviour_settings_allow_half']")
	WebElement halfday;
	
	@FindBy(xpath="//div[@id='behaviour_policy_setting']//input[@name='commit']")
	WebElement Updatepolicy;

	@FindBy(id="leave")
	WebElement leavelink;
	
	@FindBy(xpath="//a[.='Apply Leave']")
	WebElement Selectapplyleave;
	
	@FindBy(xpath="//div[@id='filter_head']")
	WebElement advaneFilter;
	
	@FindBy(xpath="//form[@id='bf_form']//button[contains(text(),'LOAD')]")
	WebElement load;
	
	@FindBy(xpath="(//a[.='APPLY LEAVE'])[2]")
	WebElement applyLeaveForEmployee;
	
	@FindBy(id="leave_detail_leave_definition_id")
	WebElement leaveltype;
	
	@FindBy(id="leave_detail_from_date")
	WebElement selectFromdate;
	
	@FindBy(id="leave_detail_to_date")
	WebElement selectTodate;
	
	@FindBy(id="leave_detail_leave_data_2020-04-02_second_half")
	WebElement secondhalf;
	
	@FindBy(xpath="//input[@id='apply']")
	WebElement applytheLeave;
	
	@FindBy(xpath="//strong[contains(text(),'Leave applied successfully.')]")
	WebElement successfullMessageForLeave;

	public AllowHalfDay(WebDriver driver) {
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
	public void allowhalfday() throws Exception{
		halfday.click();
		}
	
	public void updatepolicy() throws Exception{
		Updatepolicy.click();
	
	}
	public void navigateleave() throws Exception{
		leavelink.click();
	
	}
	public void selectapplyleave() throws Exception{
		Selectapplyleave.click();
	}
	public void advaneFilter() throws Exception{
		advaneFilter.click();
	}
	public void load() throws Exception{
		load.click();
	}
	public void applyLeaveForEmployee() throws Exception{
		applyLeaveForEmployee.click();
	}
	
	public void selectleaveltype() throws Exception{
		
		Select s = new Select(leaveltype);
		s.selectByIndex(5);
	}
	public void selectFromdate(String un) throws Exception{
		selectFromdate.sendKeys(un);
	}
	
	public void selectTodate(String un) throws Exception{
		selectTodate.sendKeys(un);
	}
	
	public void unchecksecondhalf() throws Exception{
		secondhalf.click();
	}
	
	public void applytheLeave() throws Exception{
		applytheLeave.click();
	}
	
	public String getMessageLeave(){
		return successfullMessageForLeave.getText();	
	}
	
}


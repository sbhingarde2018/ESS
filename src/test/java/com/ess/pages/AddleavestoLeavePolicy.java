package com.ess.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ess.common.BasePage;

public class AddleavestoLeavePolicy extends BasePage{
	
	@FindBy(id="master")
	WebElement masterlink;

	@FindBy(xpath="//a[.='Leave Policy']")
	WebElement LeavePolicy;
	

	@FindBy(xpath="(//a[.='Add Leaves'])[1]")
	WebElement AddLeavesForPolicy;
	
	@FindBy(id="non_saved_leaves")
	WebElement SelectLeaveType ;
	
	@FindBy(name="commit")
	WebElement AddButton;
	
	@FindBy(xpath="//strong[contains(text(),'Leave policy setting was successfully created.')]")
	WebElement successfullMessage;

	public AddleavestoLeavePolicy(WebDriver driver) {
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
	public void selectLeaveType() throws Exception{
		
		Select s = new Select(SelectLeaveType);
		s.selectByIndex(1);
	}
	public void addButton() throws Exception{
		AddButton.click();
	}
	public String getMessage(){
		return successfullMessage.getText();
	}
	

}

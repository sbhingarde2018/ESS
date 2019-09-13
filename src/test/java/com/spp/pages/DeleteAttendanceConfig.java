package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class DeleteAttendanceConfig extends BasePage {
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//a[text()='Attendance Configuration']")
	WebElement attendanceConfiguration;
	@FindBy(xpath="//div[4]/table/tbody[2]/tr/td[contains(text(),'Hyderabad')]/parent::tr/td[6]/a")
	WebElement deleteButton;
	@FindBy(xpath="//div[text()='Attendance Configuration Successfully deleted']")
	WebElement successfullMessage;

	public DeleteAttendanceConfig(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}

	public void clickMastserLink(){
		masterLink.click();
	}
	
	public void selectAttendanceConfiguration(){
		attendanceConfiguration.click();
	}
	
	public void clickDeleteButton(){
		deleteButton.click();
	}
	
	public String getMessage(){
		return successfullMessage.getText();
	}
}

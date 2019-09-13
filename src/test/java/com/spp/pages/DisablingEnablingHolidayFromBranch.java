package com.spp.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class DisablingEnablingHolidayFromBranch extends BasePage{
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//a[text()='Holiday Lists']")
	WebElement holidayList;
	@FindBy(xpath="//tbody/tr/td[contains(text(),'default')]/parent::tr/td[3]/a")
	WebElement viewList;
	@FindBy(xpath="//table[1]/tbody/tr/td[contains(text(),'Christmas')]/parent::tr/td[5]/a[1]")
	WebElement DisableList;
	@FindBy(xpath="//*[@id=\"holiday_response\"]/div/strong")
	WebElement successfullyMessage;

	public DisablingEnablingHolidayFromBranch(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void clickMastserLink(){
		masterLink.click();
	}

	public void selectHolidayList(){
		holidayList.click();
	}

	public void clickView(){
		viewList.click();
	}
		
	public void clickFirstDisable() {
		DisableList.click();
	}
	public String getMessage(){
		return successfullyMessage.getText();
	}
}

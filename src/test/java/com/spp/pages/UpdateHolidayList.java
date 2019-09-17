package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class UpdateHolidayList extends BasePage{
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//a[text()='Holiday Lists']")
	WebElement holidayList;
	@FindBy(xpath="//tbody/tr/td[contains(text(),'Master List')]/parent::tr/td[3]/a")
	WebElement viewList;
	@FindBy(xpath="//tbody/tr/td[contains(text(),'MahaShivaratri')]/parent::tr/td[5]/a[1]")
	WebElement editLink;
	@FindBy(name="holiday_master_list[holiday_date]")
	WebElement date;
	@FindBy(id="holiday_master_list_description")
	WebElement description;
	@FindBy(xpath="//input[@value='Update Holiday']")
	WebElement updateHoliday;
	@FindBy(xpath="//strong[text()='Holiday Master List successfully updated']")
	WebElement successfullMessage;

	public UpdateHolidayList(WebDriver driver) {
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
	
	public void clickEditLink(){
		editLink.click();
	}
	
	public void enterDate(String value){
		date.clear();
		date.sendKeys(value);
	}

	public void enterDescription(String value){
		description.clear();
		description.sendKeys(value);
	}
	
	public void clickUpdateHoliday(){
		updateHoliday.click();
	}
	
	public String getMessage(){
		return successfullMessage.getText();
		
	}
}

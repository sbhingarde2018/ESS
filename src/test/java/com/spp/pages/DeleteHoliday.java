package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class DeleteHoliday extends BasePage {
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//a[text()='Holiday Lists']")
	WebElement holidayList;
	@FindBy(xpath="//tbody/tr/td[contains(text(),'Master List')]/parent::tr/td[3]/a")
	WebElement viewList;
	@FindBy(xpath="//tbody/tr/td[contains(text(),'Gandhi Jayanti')]/parent::tr/td[5]/a[2]/img")
	WebElement deleteButton;
	@FindBy(xpath="//strong[text()='Master holiday successfully deleted.']")
	WebElement successfullMessage;
	
	public DeleteHoliday(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
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
	
	public void clickDeleteButton() throws InterruptedException{
		deleteButton.click();
	}
	public String getMessage(){
		return successfullMessage.getText();
	}
}

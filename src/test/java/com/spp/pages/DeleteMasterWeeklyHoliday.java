package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class DeleteMasterWeeklyHoliday extends BasePage {
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//a[text()='Master Weekly Holiday']")
	WebElement masterWeekly;
	@FindBy(xpath="//tbody/tr/td[3]/a")
	WebElement viewLink;
	@FindBy(xpath="//span[contains(text(),'Weekly Off History')]")
	WebElement weeklyoffHistory;
	@FindBy(xpath="//div[2]/table/tbody/tr[1]/td[3]/a")
	WebElement deleteButton;
	@FindBy(xpath="//strong[text()='Master Weekly off Successfully Deleted.']")
	WebElement successfullMessage;
	
	public DeleteMasterWeeklyHoliday(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickMastserLink(){
		masterLink.click();
	}
	
	public void selectMasterWeekly(){
		masterWeekly.click();
	}
	
	public void clickViewLink(){
		viewLink.click();
	}
	
	public void clickWeeklyoffHistory(){
		jsclick(weeklyoffHistory);
	}
	
	public void clickDeleteButton(){
		deleteButton.click();
	}
	
	public String getMessage(){
		return successfullMessage.getText();
	}

}

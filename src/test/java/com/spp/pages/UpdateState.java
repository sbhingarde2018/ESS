package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class UpdateState extends BasePage{
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//a[text()='States']")
	WebElement state;
	@FindBy(xpath="//tr/td[1][text()='Andhra Pradesh']/parent::tr/td[2]/a")
	WebElement editIcon;
	@FindBy(id="state_state_name")
	WebElement stateName;
	@FindBy(xpath="//input[@value='Update State']")
	WebElement updateButton;
	@FindBy(xpath="//strong[text()='State was successfully updated.']")
	WebElement successfullMessage;

	public UpdateState(WebDriver driver) {
		super(driver);
        PageFactory.initElements(driver,this);
	}

	public void clickMastserLink(){
		masterLink.click();
	}
	
	public void selectState(){
		state.click();
	}
	
	public void clickEditIcon(){
		editIcon.click();
	}
	
	public void enterStateName(String value){
		stateName.sendKeys(value);
	}
	
	public void clickUpdateButton(){
		updateButton.click();
	}
	
	public String getMessage(){
		return successfullMessage.getText();
	}
}

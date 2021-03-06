package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class DeleteClassificationDetails extends BasePage{
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//a[text()='Classifications']")
	WebElement classifications;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'ClassificationTest')]/parent::tr/td[3]/a")
	WebElement detailsLink;
	@FindBy(xpath="//div[2]/table/tbody/tr/td[3]/a")
	WebElement deleteButton;
	@FindBy(xpath="//strong[text()='Classification was successfully deleted.']")
	WebElement successfullMessage;

	public DeleteClassificationDetails(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}

	public void clickMastserLink(){
		masterLink.click();
	}
	
	public void selectClassifications(){
		classifications.click();
	}
	
	public void clickDetailsLink(){
		detailsLink.click();
	}
	
	public void clickDeleteButton(){
		deleteButton.click();
		
	}
	
	public String getMessage(){
		return successfullMessage.getText();
	}
}

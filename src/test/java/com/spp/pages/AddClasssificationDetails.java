package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class AddClasssificationDetails extends BasePage{
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//a[text()='Classifications']")
	WebElement classifications;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'ClassificationTest')]/parent::tr/td[3]/a")
	WebElement detailsLink;
	@FindBy(id="classification_classification_name")
	WebElement classificationDetailName;
	@FindBy(xpath="//input[@class='btn2 btn-bglightblue']")
	WebElement createButton;
	@FindBy(xpath="//strong[text()='Classification created successfully.']")
	WebElement successfullMessage;

	public AddClasssificationDetails(WebDriver driver) {
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
	
	public void enterClassificationDetailName(String value){
		classificationDetailName.sendKeys(value);
	}
	
	public void clickCreateButton(){
		createButton.click();
	}
	
	public String getMessage(){
		return successfullMessage.getText();
	}
}


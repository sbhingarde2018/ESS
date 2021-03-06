package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class AddHRDetails extends BasePage {
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//a[text()='HR Category']")
	WebElement hrCategory;
	@FindBy(xpath="//div[@id='hr_category_list']//div[3]//a[1]")
	WebElement nextButton;
	@FindBy(xpath="//div[@id='hr_category_list']//div[2]//tr//td[2]//a[text()='Details']")
	WebElement detailsLink;
	@FindBy(id="hr_category_detail_name")
	WebElement labelName;
	@FindBy(id="hr_category_detail_required")
	WebElement requiredBox;
	@FindBy(xpath="//input[@value='Create HR Category Detail']")
	WebElement createButton;
	@FindBy(xpath="//strong[text()='HR Category Detail created successfully.']")
	WebElement successfullMessage;

	public AddHRDetails(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	public void clickMastserLink(){
		masterLink.click();
	}
	
	public void selectHRCategory(){
		hrCategory.click();
	}
	
	public void clickNextButton(){
		nextButton.click();
	}
	
	public void clickDetailsLink(){
		detailsLink.click();
	}

	public void enterLabelName(String value){
		labelName.sendKeys(value);
	}
	
	public void clickRequiredBox(){
		requiredBox.click();
	}
	public void clickCreateButton(){
		createButton.click();
	}
	
	public String getMessage(){
		return successfullMessage.getText();
	}
}

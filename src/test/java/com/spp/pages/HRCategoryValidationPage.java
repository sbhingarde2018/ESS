package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class HRCategoryValidationPage extends BasePage{
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//a[text()='HR Category']")
	WebElement hrCategory;
	@FindBy(id="hr_category_category_name")
	WebElement hrName;
	@FindBy(xpath="//input[@value='Create HR Category']")
	WebElement createButton;
	@FindBy(id="hr_category_category_name-error")
	WebElement HRCategoryMessage;
	@FindBy(xpath="//li[text()='Category name has already been taken']")
	WebElement DublicateHRCategoryMessage;

	public HRCategoryValidationPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}

	public void clickMastserLink(){
		masterLink.click();
	}
	
	public void selectHRCategory(){
		hrCategory.click();
	}
	
	public void enterHRName(String value){
		hrName.sendKeys(value);
	}
	
	public void clickCreateButton(){
		createButton.click();
	}
	
	public String getHRCateoryEmptyMessage(){
		return HRCategoryMessage.getText();
	}
	public String getDublicateHRCateoryMessage(){
		return DublicateHRCategoryMessage.getText();
	}
	
	
}

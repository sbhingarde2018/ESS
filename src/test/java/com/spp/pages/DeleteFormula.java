package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class DeleteFormula extends BasePage{
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//ul[@id='menu']//li[3]//div[4]//li[5]//a[text()='Formula Editor']")
	WebElement formulaEditor;
	@FindBy(xpath="(//img[@title='Delete formula'])[4]")
	WebElement deleteButton;
	@FindBy(xpath="//strong[text()='Formula is successfully deleted']")
	WebElement successfullMessage;

	public DeleteFormula(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}

	public void clickMastserLink(){
		masterLink.click();
	}
    
	public void selectFormulaEditor(){
		formulaEditor.click();
	}
	
	public void clickDeleteButton(){
		deleteButton.click();
		switchToPopUpAndAccept(driver);
	}
	
	public String getMessage(){
		return successfullMessage.getText();
	}
}

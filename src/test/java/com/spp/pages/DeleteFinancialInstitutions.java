package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class DeleteFinancialInstitutions extends BasePage{
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//a[text()='Financial Institution (Bank)']")
	WebElement financialInstitution;
	@FindBy(xpath="//tbody/tr/td[contains(text(),'Chennai')]/parent::tr/td[8]/a[2]")
	WebElement deleteButton;
	@FindBy(xpath="//strong[text()='Financial Institution was successfully deleted.']")
	WebElement successfullMessage;

	public DeleteFinancialInstitutions(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}

	public void clickMastserLink(){
		masterLink.click();
	}

	public void selectFinancialInstitution(){
		financialInstitution.click();
	}
	
	public void clickDeleteButton(){
		deleteButton.click();
		switchToPopUpAndAccept(driver);
	}
	
	public String getMessage(){
		return successfullMessage.getText();
	}
}

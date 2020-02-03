package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class DeleteBonusDefinition extends BasePage{
	@FindBy(id="salary") 
	WebElement Salary;
	@FindBy(xpath="//a[text()=\"Bonus\"]")
	WebElement Bonus;
	@FindBy(xpath="//div/table/tbody/tr/td[contains(text(),'Christmas')]/parent::tr/td[4]/a/img")
	WebElement ClickOnDelete;
	@FindBy(xpath="//strong[text()='Bonus successfully deleted']")
	WebElement successfullmessage;
	public DeleteBonusDefinition(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	
	public void clickSalary(){
		Salary.click();
	}
	
	public void selectBonus(){
		Bonus.click();
	}
	public void clickondelete() {
		ClickOnDelete.click();
	}
	public String getmessage() {
		return successfullmessage.getText();
	}
}

package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class EditBonusDefinition extends BasePage{
	@FindBy(id="salary") 
	WebElement Salary;
	@FindBy(xpath="//a[text()=\"Bonus\"]")
	WebElement Bonus;
	@FindBy(xpath="//div/table/tbody/tr/td[contains(text(),'Christmas')]/parent::tr/td[2]/a")
	WebElement ClickOnEdit;
	@FindBy(id="bonus_exgratia_definition_max_amount")
	WebElement EditMaxBonusAmt;
	@FindBy(id="create_heading_name")
	WebElement UpdateBonus;
	@FindBy(xpath="//strong[text()='Bonus successfully updated']")
	WebElement successfullmessage;
	
	public EditBonusDefinition(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	
	public void clickSalary(){
		Salary.click();
	}
	
	public void selectBonus(){
		Bonus.click();
	}
	public void clickonedit() {
		ClickOnEdit.click();
	}
	public void editmaxbonusamt(String value) {
		EditMaxBonusAmt.clear();
		EditMaxBonusAmt.sendKeys(value);
	}
	public void updatebonus() {
		UpdateBonus.click();
	}
	public String getmessage() {
		return successfullmessage.getText();
	}
}

package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;

public class UpdateGratuity extends BasePage {
	@FindBy(id="salary")
	WebElement ClickOnSalary;
	@FindBy(xpath="//a[text()='Gratuity']")
	WebElement ClickOnGratuity;
	@FindBy(xpath="//div/table/tbody/tr/td[4]/a")
	WebElement Edit;
	@FindBy(xpath="//select[@id='gratuity_payment_mode']")
	WebElement SelectMOP;
	@FindBy(id="gratuity_cheque_dd_no")
	WebElement ChequeNo;
	@FindBy(xpath="//input[@id='edit_gratuity']")
	WebElement UpdateGratuity;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/strong")
	WebElement SuccessMessage;
	
	
	public UpdateGratuity(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void clicksalary() {
		ClickOnSalary.click();
	}
	public void clickgratutiy() {
		ClickOnGratuity.click();
	}
	public void clickEdit() {
		Edit.click();
	}
	public void selectmodeofPayment(String value) {
		dropDownSelect(SelectMOP, value);
	}
	public void EnterChequeNo(String value) {
		ChequeNo.clear();
		ChequeNo.sendKeys(value);
	}
	public void ClickUpdateGratuity() {
		UpdateGratuity.click();
	}
	public String getMessage() {
    	return SuccessMessage.getText();
	}
}


package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class ArrearsValidation extends BasePage {
	
	@FindBy(id="salary")
	WebElement Salarylink;
	
	@FindBy(xpath="//a[.='Arrears']")
	WebElement clickonArrears;
	
	@FindBy(xpath="//a[.='Add New Arrear']")
	WebElement clickonAddNewArrears;
	
	@FindBy(id="arrear_arrear_name")
	WebElement EnterArrearName;
	
	@FindBy(id="arrear_arrear_description")
	WebElement EnterArreardescriptionName;
	
	@FindBy(id="arrear_arrear_from_month")
	WebElement FromMonth;
	
	@FindBy(id="to_month")
	WebElement ToMonth;
	
	@FindBy(id="ref_month")
	WebElement ReferMonth;
	
	@FindBy(id="arrear_arrear_paymonth")
	WebElement PayMonth;
	
	@FindBy(xpath="//input[@name='commit']")
	WebElement ClickonCreateArrear;
	
	@FindBy(xpath="//li[contains(text(),\"Arrear name can't be blank\")]")
	WebElement ArrearValidationMessage ;
	
	@FindBy(xpath="//li[contains(text(),\"Arrear from month can't be blank\")]")
	WebElement ArrearFromMonthValidationMessage;
	
	
	public ArrearsValidation(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	
	public void navigateSalary() throws Exception{
		Salarylink.click();
	}

	public void clickonArrears() throws Exception{
		clickonArrears.click();
	}
	public void clickonAddNewArrears() throws Exception{
		clickonAddNewArrears.click();
	}
	public void enterArrearName(String value) throws Exception{
		EnterArrearName.sendKeys(value);
	}
	public void enterArreardescriptionName(String value) throws Exception{
		EnterArreardescriptionName.sendKeys(value);
	}
	
	public void selectFromMonth(String value) throws Exception
	{
		dropDownSelect(FromMonth, value);
		
	}
	public void selectToMonth(String value) throws Exception
	{
		dropDownSelect(ToMonth, value);
		
	}
	public void selectReferMonth(String value) throws Exception
	{
		dropDownSelect(ReferMonth, value);
		
	}
	public void selectPayMonth(String value) throws Exception
	{
		dropDownSelect(PayMonth, value);
		
	}
	public void clickonCreateArrear() throws Exception{
		ClickonCreateArrear.click();
	}
	
	public String getArrearValidationMessage(){
		return ArrearValidationMessage.getText();
	}
	
	public String getArrearFromMonthValidationMessage(){
		return ArrearFromMonthValidationMessage.getText();
	}
	
	
	

}

package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class ComputeBonus extends BasePage{
	@FindBy(id="salary") 
	WebElement Salary;
	@FindBy(xpath="//a[text()=\"Bonus\"]")
	WebElement Bonus;
	@FindBy(xpath="//div/table/tbody/tr/td[contains(text(),'Holi12')]/parent::tr/td[3]/a")
	WebElement Compute;
	@FindBy(id="filter_head")
	WebElement ClickOnFilter;
	@FindBy(xpath="//form[@id='bf_form']//button[contains(text(),'LOAD')]")
	WebElement ClickOnLoad;
	@FindBy(xpath="//*[@id=\"bec_employees\"]/tbody/tr/td[7]/a")
	WebElement ClickOnEdit;
	@FindBy(id="bonus_exgratia_calculation_amount_given")
	WebElement EnterBonusAmount;
	@FindBy(css="input[type=submit]")
	WebElement ClickOnUpdate;
	public ComputeBonus(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	public void clickSalary(){
		Salary.click();
	}
	
	public void selectBonus(){
		Bonus.click();
	}
	public void clickCompute(){
		Compute.click();
	}
	public void clickonfilter() {
		ClickOnFilter.click();
	}
	public void clickonload() {
		ClickOnLoad.click();
	}
	public void clickonedit() {
		ClickOnEdit.click();
	}
	public void enterbonusamount(String value) {
		EnterBonusAmount.clear();
		EnterBonusAmount.sendKeys(value);
	}
	public void clickonupdatebutton() {
		ClickOnUpdate.click();
	}
	

}

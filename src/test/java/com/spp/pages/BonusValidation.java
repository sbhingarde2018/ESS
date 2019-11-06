package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class BonusValidation extends BasePage {
	@FindBy(id="salary") 
	WebElement Salary;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[1]/ul/li[11]/a")
	WebElement Bonus;
	@FindBy(xpath="//*[@id=\"bonus_definition_list\"]/div[1]/span/a")
	WebElement AddNewBonus;
	@FindBy(id="bonusHeadName")
	WebElement BonusHead;
	@FindBy(id="bonus_exgratia_definition_formula_id")
	WebElement SelectFormula;
	@FindBy(id="bonus_exgratia_definition_max_amount")
	WebElement MaxBonus;
	@FindBy(id="bonus_exgratia_definition_from_month")
	WebElement FromMonth;
	@FindBy(id="bonus_exgratia_definition_to_month")
	WebElement ToMonth;
	@FindBy(id="bonus_exgratia_definition_paymonth")
	WebElement Paymonth;
	@FindBy(id="bonus_exgratia_definition_salary_dependent")
	WebElement CheckSalaryDependent;
	@FindBy(id="bonus_exgratia_definition_round_off_nearest_rupee")
	WebElement CheckNearestrupee;
	@FindBy(id="create_heading_name")
	WebElement CreateBonus;
	@FindBy(xpath="//div[@id='bonusHeadName-error']")
	WebElement ValidationMessage;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/strong")
	WebElement SuccessfulMessage;
	@FindBy(xpath="//li[contains(text(),'Heading name has already been taken')]")
	WebElement ErrorMessage;
	
	public BonusValidation(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	public void clickSalary(){
		Salary.click();
	}
	
	public void selectBonus(){
		Bonus.click();
	}
	public void clickAddNewBonus(){
		AddNewBonus.click();
	}
	public void EnterBonusHead(String value){
		BonusHead.clear();
		BonusHead.sendKeys(value);
	}
	public void selectformula(){
		SelectFormula.click();
	}
	public void EnterMaxBonus(String value){
		MaxBonus.sendKeys(value);
	}
	public void SelectFromMonth(String value){
		dropDownSelect(FromMonth, value);
	}

	public void SelectToMonth(String value){
		dropDownSelect(ToMonth, value);
	}

	public void SelectPaymonth(String value){
		dropDownSelect(Paymonth, value);
	}
	public void SelectFormula(String value) {
		dropDownSelect(SelectFormula, value);
	}
	public void checksalarydependent() {
		CheckSalaryDependent.click();
	}
	public void checknearestrupee() {
		CheckNearestrupee.click();
	}
	public void clickCreateBonus(){
		CreateBonus.click();
	}
	public String getValidationMessage(){
		return ValidationMessage.getText();
	}
	public String getSucessfulMessage(){
		return SuccessfulMessage.getText();
	}
	public String getErrorButton(){
		return ErrorMessage.getText();
	}

}

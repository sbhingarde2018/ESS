package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class ExGratiaValidation extends BasePage{	
@FindBy(id="salary")
WebElement Salary;
@FindBy(linkText="Ex-Gratia")
WebElement ExGratia;
@FindBy(linkText="Add New Ex-Gratia Definition")
WebElement Addnewexgratia;
@FindBy(id="bonusHeadName")
WebElement Exgratiahead;
@FindBy(id="bonus_exgratia_definition_formula_id")
WebElement Formula;
@FindBy(id="bonus_exgratia_definition_from_month")
WebElement FromMonth;
@FindBy(id="bonus_exgratia_definition_to_month")
WebElement ToMonth;
@FindBy(id="bonus_exgratia_definition_paymonth")
WebElement PayMonth;
@FindBy(id="create_heading_name")
WebElement CreateExGratia;
@FindBy(xpath="//div/table/tbody/tr/td[contains(text(),'GratiaTest')]/parent::tr/td[4]/a/img")
WebElement Delete;
@FindBy(xpath="//*[@id=\"main\"]/div[2]/strong")
WebElement SuccessMessage;
@FindBy(xpath="//div[@id='bonusHeadName-error']")
WebElement ValidationMessage;
@FindBy(xpath="//li[contains(text(),'Heading name has already been taken')]")
WebElement ErrorMessage;


public ExGratiaValidation(WebDriver driver) {
	super(driver);
	PageFactory.initElements(driver,this);
}
public void Clicksalary() {
	Salary.click();
}
public void ClickExGratia() {
	ExGratia.click();
}
public void ClickAddnewexgratia() {
	Addnewexgratia.click();
}
public void EnterExgratiahead(String value) {
	Exgratiahead.clear();
	Exgratiahead.sendKeys(value);
}
public void SelectFormula(String value) {
	dropDownSelect(Formula, value);
}
public void SelectFromMonth(String value) {
	dropDownSelect(FromMonth, value);
}
public void SelectToMonth(String value) {
	dropDownSelect(ToMonth, value);
}
public void SelectPayMonth(String value) {
	dropDownSelect(PayMonth, value);
}
public void ClickCreateExGratiaBtn() {
	CreateExGratia.click();
}
public void ClickDeleteBtn() {
	Delete.click();
}
public String getValidationMessage() {
	return ValidationMessage.getText();
}
public String getErrorMessage() {
	return ErrorMessage.getText();
}
public String getSuccessMessage() {
	return SuccessMessage.getText();
}

}

package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class FormulaValidationPage extends BasePage{
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//ul[@id='menu']//li[3]//div[4]//li[6]//a[text()='Formula Editor']")
	WebElement formulaEditor;
	@FindBy(xpath="//a[text()='Add New Formula']")
	WebElement addFormula;
	@FindBy(id="formula_formulae_name")
	WebElement name;
	@FindBy(xpath="//*[@id='variables']/option[32]")
	WebElement basicFormula;
	@FindBy(id="formula_formulae")
	WebElement expression;
	@FindBy(xpath="//select[@id='operators']//option[3]")
	WebElement operator;
	@FindBy(xpath="//input[@value='Verify']")
	WebElement verifyButton;
	@FindBy(xpath="//strong[text()='Formula is verified.']")
	WebElement successfullVerify;
	@FindBy(xpath="//strong[text()='Formula does not have any expression!']")
	WebElement formulaExpressionValidation;
	@FindBy(xpath="//li[text()=\"Formulae name can't be blank\"]")
	WebElement formulaNameValidation;
	
	@FindBy(xpath="//input[@value='Save']")
	WebElement saveButton;
	@FindBy(xpath="//li[text()='Formulae name has already been taken']")
	WebElement formulaNameDublicateValidation;

	public FormulaValidationPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}

	public void clickMastserLink(){
		masterLink.click();
	}
    
	public void selectFormulaEditor(){
		formulaEditor.click();
	}
	
	public void clickAddFormula(){
		addFormula.click();
	}
	
	public void enterName(String value){
		name.clear();
		name.sendKeys(value);
	}
	
	public void clickBasicFormula(){
		doubleClickAction(driver,basicFormula);
	}
	
	public void enterExpression(String value){
		expression.sendKeys(value);
	}
	
	public void clickOperator(){
		doubleClickAction(driver, operator);
	}
	
	public void clickVerifyButton(){
		verifyButton.click();
	}
	
	public String getMessage(){
		return successfullVerify.getText();
	}
	
	public void  clickSaveButton(){
		saveButton.click();
	}
	
	public String getFormulaNameDublicateMessage(){
		return formulaNameDublicateValidation.getText();
	}
	public String getFormulaNameValidationMessage(){
		return formulaNameValidation.getText();
	}
	public String getFormulaExpressionValidationMessage(){
		return formulaExpressionValidation.getText();
	}
}

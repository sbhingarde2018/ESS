package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CreateLTAOpeningBalance extends BasePage{
	public CreateLTAOpeningBalance(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="salary")
	WebElement Salary;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[1]/ul/li[4]/a")
	WebElement ReimbursementClaim;
	@FindBy(linkText="LTA Opening Balance")
	WebElement LTABalance;
	@FindBy(linkText="Create Lta Opening Balance")
	WebElement CreateLTA;
	@FindBy(id="lta_opening_balance_financial_year")
	WebElement FinancialYear;
	@FindBy(id="lta_opening_balance_block_period")
	WebElement BlockPeriod;
	@FindBy(xpath="//*[@id=\"lta_opening_balance\"]/div/div/input")
	WebElement GetEmployees;
	@FindBy(xpath="//*[@id=\"employees_table\"]/tbody/tr[1]/td[3]/input")
	WebElement OpeningBalance;
	@FindBy(xpath="//*[@id=\"opening_balance_emp_list\"]/form/div[3]/input")
	WebElement SaveDetails;
	@FindBy(xpath="//*[@id=\"lta_result_response\"]/div/strong")
	WebElement SuccessfulMessage;
	
	
	public void selectSalary() {
		Salary.click();
	}
	public void selectReimbursementClaim() {
		ReimbursementClaim.click();
	}
	public void selectLTABalance() {
		LTABalance.click();
	}
	public void selectCreateLTA() {
		CreateLTA.click();
	}
	
	public void selectFinancialYear(String value){
		dropDownSelect(FinancialYear, value);
	}
	public void selectBlockPeriod(String value){
		dropDownSelect(BlockPeriod, value);
	}
	public void selectGetEmployees() {
		GetEmployees.click();
	}
	public void selectOpeningBalance(String Value) {
		OpeningBalance.clear();
		OpeningBalance.sendKeys(Value);
	}
	public void selectSaveDetails() {
		SaveDetails.click();
	}

	
	
	public String getMessage(){
		return SuccessfulMessage.getText();
	}
}

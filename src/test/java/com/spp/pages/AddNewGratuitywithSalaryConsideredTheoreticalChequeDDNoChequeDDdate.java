package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;

public class AddNewGratuitywithSalaryConsideredTheoreticalChequeDDNoChequeDDdate extends BasePage {
	@FindBy(id="salary")
	WebElement ClickOnSalary;
	@FindBy(xpath="//a[text()='Gratuity']")
	WebElement ClickOnGratuity;
	@FindBy(xpath="//a[text()='Add New Gratuity']")
	WebElement AddNewGratuity;
	@FindBy(id="gratuity_employee_id")
	WebElement SelectEmployee;
	@FindBy(xpath="//input[@id='gratuity_salary_considered_theoretical']")
	WebElement Theoretical;
	@FindBy(xpath="//input[@id='gratuity_salary_considered_earned']")
	WebElement Earned;
	@FindBy(xpath="//select[@id='gratuity_payment_mode']")
	WebElement SelectMOP;
	@FindBy(id="gratuity_salary_considered_earned")
	WebElement SalaryConsidered;
	@FindBy(id="gratuity_date_of_payment")
	WebElement DateofPayment;
	@FindBy(id="gratuity_cheque_dd_no")
	WebElement ChequeNo;
	@FindBy(id="gratuity_cheque_dd_date")
	WebElement ChequeDate;
	@FindBy(xpath="//button[contains(text(),'Compute')]")
	WebElement Compute;
	@FindBy(xpath="//input[@id='create_gratuity']")
	WebElement CreateGratuity;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/strong")
	WebElement SuccessMessage;
	@FindBy(xpath="//div/table/tbody/tr/td[5]/a/img")
	WebElement Delete;
	
	public AddNewGratuitywithSalaryConsideredTheoreticalChequeDDNoChequeDDdate(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void clickonsalary() {
		 ClickOnSalary.click();
	}
	public void clickongratutiy() {
		ClickOnGratuity.click();
	}
	public void addnewgratuity() {
		AddNewGratuity.click();
	}
	public void selectEmployee(String value) {
		dropDownSelect(SelectEmployee, value);
	}
	public void selectmodeofPayment(String value) {
		dropDownSelect(SelectMOP, value);
	}
	public void EnterChequeNo(String value) {
		ChequeNo.clear();
		ChequeNo.sendKeys(value);
	}
	public void selectSalaryConsideredTheoretical() {
		Theoretical.click();
	}
	public void selectSalaryConsideredEarned() {
		Earned.click();
	}
	public void enterdateofpayment(String value) {
		DateofPayment.sendKeys(value);
	}
	public void EnterChequeDate(String value) {
		ChequeDate.clear();
		ChequeDate.sendKeys(value);
	}
	public void clickCompute() {
		Compute.click();
	}	
	public void clickCreateGratuity() {
		CreateGratuity.click();
	}
	public String getMessage() {
    	return SuccessMessage.getText();
	}	
	public void clickDelete() {
		Delete.click();
		switchToPopUpAndAccept(driver);
	}
}

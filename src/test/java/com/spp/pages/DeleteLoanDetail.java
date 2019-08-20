package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class DeleteLoanDetail extends BasePage{
	@FindBy(id="salary")
	WebElement salarylink;
	@FindBy(linkText="Loan Detail")
	WebElement LoanDetails;
	@FindBy(xpath="//*[@id=\"add_employees\"]")
	WebElement AddEmployee;
	@FindBy(xpath="//*[@id=\"bf_form\"]/div/button[contains(text(),'LOAD')]")
	WebElement Load;
	@FindBy(id="filter")
	WebElement MultiAllotment;
	@FindBy(xpath="//tbody/tr[9]/td[contains(text(),'Jaya')]/parent::tr/td[6]/a")
	WebElement View;
	@FindBy(xpath="//div[2]/table/tbody/tr[1]/td[8]/a")
	WebElement Delete;
	@FindBy(id="popup_ok")
	WebElement YesButton;
	
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/strong")
	WebElement SuccessfulMessage;
	
	public DeleteLoanDetail(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void navigatesalary() throws Exception{
		salarylink.click();
	}
	
	public void clickLoanDetails() throws Exception{
		LoanDetails.click();
	}
	public void clickAddEmployee() throws Exception{
		AddEmployee.click();	
	}
	public void clickLoad() throws Exception{
		Load.click();
	}
	public void clickMultiAllotment() throws Exception{
		MultiAllotment.click();
	}
	public void clickView() throws Exception{
		View.click();
	}
	public void clickDelete() throws Exception{
		Delete.click();
	}
		
	public void clickYesButton() throws Exception{
		YesButton.click();
		}
	public String getMessage() {
		return SuccessfulMessage.getText();
	}

}

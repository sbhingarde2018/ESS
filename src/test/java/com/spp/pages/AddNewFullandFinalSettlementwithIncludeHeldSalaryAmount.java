package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class AddNewFullandFinalSettlementwithIncludeHeldSalaryAmount extends BasePage{
	@FindBy(id="salary")
	WebElement ClickOnSalary;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[2]/ul/li[2]/a")
	WebElement ClickOnFNF;
	@FindBy(xpath="//*[text()='Add New Full and Final Settlement']")
	WebElement AddNewFNF;
	@FindBy(id="full_and_final_settlement_specific_details_")
	WebElement IncludePendingAdvanceamount;
	@FindBy(id="full_and_final_settlement_employee_id")
	WebElement SelectEmployee;
	@FindBy(id="full_and_final_settlement[specific_details][]")
	WebElement IncludeHeldSalaryAmount;
	@FindBy(id="full_and_final_settlement_include_last_sal")
	WebElement IncludeLastSalary;
	@FindBy(id="full_and_final_settlement_last_sal_option_detailed_salary")
	WebElement IncludeDetailSalary;
	@FindBy(id="full_and_final_settlement_last_sal_option_salary_summary")
	WebElement IncludeSalarySummary;
	@FindBy(id="full_and_final_settlement_specific_details_")
	WebElement IncludeOpenComponent;
	@FindBy(id="full_and_final_settlement_pending_loan_amount")
	WebElement IncludePendingLoanAMount;
	@FindBy(id="create_ffs")
	WebElement CreateFNF;
	@FindBy(xpath="//strong[text()='Full And Final Settlement successfully created']")
	WebElement SuccessMessage;
	@FindBy(xpath="//*[@id=\"employees\"]/tbody/tr/td[6]/a")
	WebElement ClickDelete;
	public AddNewFullandFinalSettlementwithIncludeHeldSalaryAmount(WebDriver driver) {
		super(driver);
		PageFactory.initElements( driver, this);
	}
	
	public void clickonsalary() {
		ClickOnSalary.click();
	}
	public void clickonFNF() {
		ClickOnFNF.click();
	}
	public void AddnewFNF() {
		AddNewFNF.click();
	}
	public void SelectEmployee(String value) {
		dropDownSelect(SelectEmployee, value);
	}
	public void includeheldsalamount() {
		if(!IncludeHeldSalaryAmount.isSelected()) {
			IncludeHeldSalaryAmount.click();
		}
	}
	public void includelastsalamount() {
		if(!IncludeLastSalary.isSelected()) {
			IncludeLastSalary.click();
		}
	}
	public void includedetailsalamount() {
		if(!IncludeDetailSalary.isSelected()) {
			IncludeDetailSalary.click();
		}
	}
	public void includesalsummaryamount() {
		if(!IncludeSalarySummary.isSelected()) {
			IncludeSalarySummary.click();
		}
	}
	public void includeopencomponent() {
		if(!IncludeOpenComponent.isSelected()) {
			IncludeOpenComponent.click();
		}
	}
	public void includependingloanamount() {
		if(!IncludePendingLoanAMount.isSelected()) {
			IncludePendingLoanAMount.click();
		}
	}
	public void includependingadvanceamount() {
		if(!IncludePendingAdvanceamount.isSelected()) {
			IncludePendingAdvanceamount.click();
		}
	}
	public void createfnf() {
		CreateFNF.click();
	}
	
	public String getmessage() {
		
		return SuccessMessage.getText();
	}
	public void clickdelete() {
		ClickDelete.click();
		switchToPopUpAndAccept(driver);
	}
	

}

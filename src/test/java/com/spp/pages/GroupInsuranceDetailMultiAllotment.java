package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class GroupInsuranceDetailMultiAllotment extends BasePage{
	@FindBy(id="salary")
	WebElement salarylink;
	@FindBy(xpath="//a[contains(text(),'Group Insurance Detail')]")
	WebElement GroupInsuranceDetails;
	@FindBy(xpath="//*[@id=\"add_employees\"]")
	WebElement AddEmployee;
	@FindBy(xpath="//form[@id='bf_form']//button[contains(text(),'LOAD')]")
	WebElement Load;
	@FindBy(xpath="//*[@id=\"si_detail_employees\"]/tbody/tr[1]/td[6]/a")
	WebElement View;
	@FindBy(xpath="//*[@id=\"standing_detail_list\"]/div[1]/span/a")
	WebElement AddNewGroup;
	@FindBy(xpath="//*[@id='si_detail_employees']/thead/tr/th[1]/input")
	WebElement UnTick;
	@FindBy(xpath="//tr//td[contains(text(),'LeaveA')]/parent::tr/td[1]/input")
	WebElement Tick1;
	@FindBy(xpath="//tr//td[contains(text(),'LeaveB')]/parent::tr/td[1]/input")
	WebElement Tick2;
	@FindBy(xpath="//input[@id='select_all']")
	WebElement SelectAll;
	@FindBy(id="filter")
	WebElement MultiAllotmentButton;
	@FindBy(id="standing_instruction_detail_standing_instruction_master_id")
	WebElement GroupInsuranceName;
	@FindBy(id="standing_instruction_detail_actual_amount")
	WebElement Amount ;
	@FindBy(xpath="//input[@id='dpMonthYear1']")
	WebElement StartMonth;
	@FindBy(xpath="//input[@id='dpMonthYear']")
	WebElement EndMonth;
	@FindBy(id="standing_instruction_detail_loan_account_no")
	WebElement AccountNumber;
	@FindBy(id="standing_instruction_detail_financial_institution_id")
	WebElement InstitutionName;
	@FindBy(id="standing_instruction_detail_loan_account_no")
	WebElement InsuranceNo;
	@FindBy(id="standing_instruction_detail_remarks")
	WebElement Remark;
	@FindBy(xpath="//*[@id=\"new_standing_instruction_detail\"]/fieldset/table/tbody/tr/td[2]/label/input")
	WebElement Monthly;
	@FindBy(id="update_save")
	WebElement CreateButton;	
	@FindBy(id="proceed")
	WebElement Proceed;
	@FindBy(xpath="//*[@id=\"main\"]/div[3]/strong")
	WebElement SuccessfulMessage;
	@FindBy(xpath="//*[@id=\"standing_detail_list\"]/div[2]/table/tbody/tr[1]/td[9]/a")
	WebElement DeleteButton;
	@FindBy(xpath="//a[contains(text(),'Jan')]")
	WebElement Month;
	@FindBy(xpath="//a[contains(text(),'Feb')]")
	WebElement Month2;
	
	public GroupInsuranceDetailMultiAllotment(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void navigatesalary() throws Exception{
		salarylink.click();
	}
	
	public void clickGroupInsuranceDetails() throws Exception{
		GroupInsuranceDetails.click();
	}
	public void clickAddEmployee() throws Exception{
		AddEmployee.click();
	}
	public void clickLoad() throws Exception{
		Load.click();
	}

	public void clickView() throws Exception{
		View.click();
	}
	public void clickAddNewGroup() throws Exception{
		AddNewGroup.click();
	}
	public void selectall() {
		SelectAll.click();
	}
	
	public void clickInsuranceNo(String value) throws Exception{
			InsuranceNo.sendKeys(value);
	}
	
	public void clickUnTick() throws Exception{
		UnTick.click();
	}
	public void clickTick1() throws Exception{
		Tick1.click();
	}
	public void clickTick2() throws Exception{
		Tick2.click();
	}
	public void clickMultiAllotmentButton() throws Exception{
		MultiAllotmentButton.click();
	}
	public void clickGroupInsuranceName(String value) throws Exception{
		dropDownSelect(GroupInsuranceName,value);
		
	}
	public void clickAmount(String value) throws Exception{
			Amount.sendKeys(value);
	}
	
	public void clickStartMonth() throws Exception{
		StartMonth.click();
	}
	public void clickEndMonth() throws Exception{
		EndMonth.click();
	}
	public void clickAccountNumber(String value) throws Exception{
		AccountNumber.sendKeys(value);
	}
	public void selectInstitutionName(String value){
		dropDownSelect(InstitutionName, value);
	}
	public void clickRemark(String value) throws Exception{
		Remark.sendKeys(value);
	}
	public void clickMonthly() throws Exception{
		Monthly.click();
	}
	public void clickCreateButton() throws Exception{
		CreateButton.click();
	}
	public void clickProceed() throws Exception{
		Proceed.click();
	}
	public String getMessage() {
		return SuccessfulMessage.getText();
	}
	public void clickDeleteButton() throws Exception{
		DeleteButton.click();
		switchToPopUpAndAccept(driver);
	}
	public void selectStartMonth() throws Exception{
		Month.click();
	}
	public void selectEndkMonth() throws Exception{
		Month2.click();
	}
}

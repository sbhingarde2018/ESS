package com.spp.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class SalaryAdvanceDetailMultiAllotment extends BasePage		{
	@FindBy(id="salary")
	WebElement salarylink;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[1]/ul/li[7]/a")
	WebElement AdvanceDetails;
	@FindBy(xpath="//*[@id=\"add_employees\"]")
	WebElement AddEmployee;
	@FindBy(xpath="//*[@id=\"bf_form\"]/div/button[contains(text(),'LOAD')]")
	WebElement Load;
	@FindBy(id="filter")
	WebElement MultiAllotment;
	@FindBy(xpath="//*[@id=\"si_detail_employees\"]/tbody/tr[1]/td[6]/a")
	WebElement View;
	@FindBy(xpath="//*[@id=\"standing_detail_list\"]/div[1]/span/a")
	WebElement AddNewAdvanceDetails;
	@FindBy(id="standing_instruction_detail_standing_instruction_master_id")
	WebElement AdvanceName;
	@FindBy(id="standing_instruction_detail_actual_amount")
	WebElement Amount;
	@FindBy(id="inst")
	WebElement NoOfInstallments;
	@FindBy(id="sal_date")
	WebElement AdvanceDate;
	@FindBy(id="standing_instruction_detail_lumpsum_amount")
	WebElement InstallmentAmount;
	@FindBy(xpath="//*[@id=\"new_standing_instruction_detail\"]/div[3]/fieldset/div[5]/div/input")
	WebElement RecoverFrom;
	@FindBy(id="update_save")
	WebElement CreateButton;
	@FindBy(id="proceed")
	WebElement Proceed;
	@FindBy(xpath="//*[@id=\"main\"]/div[3]/strong")
	WebElement SuccessfulMessage;
	@FindBy(xpath="//*[@id=\"standing_detail_list\"]/div[2]/table/tbody/tr[1]/td[8]/a")
	WebElement DeleteButton;
	@FindBy(xpath="//input[@id='select_all']")
	WebElement DeselectEmp;
	@FindBy(xpath="//tr//td[contains(text(),'LeaveA')]/parent::tr/td[1]/input")
	WebElement Emp1;
	@FindBy(xpath="//tr//td[contains(text(),'LeaveB')]/parent::tr/td[1]/input")
	WebElement Emp2;
	
	public SalaryAdvanceDetailMultiAllotment(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void navigatesalary() throws Exception{
		salarylink.click();
	}
	
	public void clickAdvanceDetails() throws Exception{
		AdvanceDetails.click();
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
	public void AddNewAdvanceDetails() throws Exception{
		AddNewAdvanceDetails.click();
	}
	public void clickAdvanceName(String value) throws Exception{
		dropDownSelect(AdvanceName,value);
		
	}
	public void clickAmount(String value) throws Exception{
			Amount.sendKeys(value);
	}
	public void clickNoOfInstallments() throws Exception{
		NoOfInstallments.click();
	}
	
	
	public void clickSAdvanceDate(String value) throws Exception{
		AdvanceDate.sendKeys(value);
		AdvanceDate.sendKeys(Keys.TAB);
	}
	public void clickInstallmentAmount(String value) throws Exception{
		InstallmentAmount.sendKeys(value);
		//InstallmentAmount.sendKeys(Keys.TAB);
	}
	public void clickRecoverFrom(String value) throws Exception{
		RecoverFrom.sendKeys(value);
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
	public void clickDSEmp() throws Exception{
		DeselectEmp.click();
	
	}
	public void clickEmp1() throws Exception{
		Emp1.click();
	
	}
	public void clickEmp2() throws Exception{
		Emp2.click();
	}
}

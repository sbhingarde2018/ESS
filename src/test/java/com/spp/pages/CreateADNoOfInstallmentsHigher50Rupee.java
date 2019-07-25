package com.spp.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CreateADNoOfInstallmentsHigher50Rupee extends BasePage{
	@FindBy(id="salary")
	WebElement salarylink;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[1]/ul/li[7]/a")
	WebElement AdvanceDetails;
	@FindBy(xpath="//*[@id=\"add_employees\"]")
	WebElement AddEmployee;
	@FindBy(xpath="//*[@id=\"bf_form\"]/div[10]/button[1]")
	WebElement Load;
	@FindBy(xpath="//*[@id=\"si_detail_employees\"]/tbody/tr[2]/td[6]/a")
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
	@FindBy(id="standing_instruction_detail_no_of_instalment")
	WebElement NoInstallment;
	@FindBy(id="dpMonthYear")
	WebElement RecoverFrom;
	@FindBy(id="standing_instruction_detail_round_off_50")
	WebElement Higher50Rupee;
	@FindBy(id="update_save")
	WebElement CreateButton;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/strong")
	WebElement SuccessfulMessage;
	@FindBy(xpath="//div[2]/table/tbody/tr[1]/td[8]/a")
	WebElement DeleteButton;
	
	public CreateADNoOfInstallmentsHigher50Rupee(WebDriver driver){
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
	public void clickNoInstallment(String value) throws Exception{
		NoInstallment.clear();
		NoInstallment.sendKeys(value);
	}
	public void clickRecoverFrom(String value) throws Exception{
		RecoverFrom.sendKeys(value);
	}
	public void clickHigher50Rupee() throws Exception{
		Higher50Rupee.click();
	}
	
		public void clickCreateButton() throws Exception{
		CreateButton.click();
	}
	public String getMessage() {
		return SuccessfulMessage.getText();
	}
	public void clickDeleteButton() throws Exception{
		DeleteButton.click();
		switchToPopUpAndAccept(driver);
	}
}

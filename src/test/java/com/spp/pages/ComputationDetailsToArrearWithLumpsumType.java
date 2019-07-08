package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;
import com.spp.generics.Utility;

public class ComputationDetailsToArrearWithLumpsumType extends BasePage{
	
	@FindBy(id="salary")
	WebElement SalaryLink;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[1]/ul/li[3]/a")
	WebElement Arrears;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Salary_ArrearTest1')]/parent::tr/td[4]/a")
	WebElement Computaion;
	@FindBy(id="manual_arrears_lumpsum")
	WebElement AddEmployee;
	@FindBy(xpath="//*[@id=\"bf_form\"]/div[10]/button[1]")
	WebElement Load;
	@FindBy(xpath="//*[@id=\"show_message\"]/div/strong")
	WebElement successfullMessage;
	@FindBy(id="save_employee_arrear")
	WebElement Save;
	@FindBy(xpath="//*[@id=\"manual_lumpsum\"]/tbody/tr/td[7]/a")
	WebElement MoreLink;
	@FindBy(xpath="//tbody/tr[2]/td[1]/input")
	WebElement Basic;
	@FindBy(id="deduction10")
	WebElement DearnessAllowance;
	@FindBy(xpath="//*[@id=\"main\"]/div[3]/fieldset/table/tbody/tr[3]/td/span")
	WebElement UpdateButton;
	@FindBy(xpath="//div[@id='main']/section/p/a[2]")
	WebElement Employee;
	@FindBy(id="select_all")
	WebElement SelectAll;
	@FindBy(xpath="//*[@id=\"main\"]/section/p/a[2]")
	WebElement SelectEmp;
		
	public ComputationDetailsToArrearWithLumpsumType(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	public void clickSalaryLink(){
		SalaryLink.click();
	}
	
	public void selectArrears(){
		Arrears.click();
	}
	public void selectComputaion(){
		Computaion.click();
	}
	public void EnterAddEmployee(){
		AddEmployee.click();
	}
	public void ClickLoad(){
		Load.click();
	}
	
	
	public void ClickSave(){
		Save.click();
	}
	public void ClickMoreLink(){
		MoreLink.click();
	}
	public void EnterBasic(String value){
		Basic.clear();
		Basic.sendKeys(value);
	}
	public void EnterDearnessAllowance(String value){
		DearnessAllowance.clear();
		DearnessAllowance.sendKeys(value);
	}
	public void UpdateButton(){
		UpdateButton.click();
	}
	public void ClickEmployee(){
		String link = Employee.getAttribute("href");
		driver.navigate().to(link); 
	}

	public String getMessage(){
		return successfullMessage.getText();
	}
	public void ClickSelectAll(){
		SelectAll.click();
	}
	public void ClickSelectEmpl(){
		SelectEmp.click();
	}

}

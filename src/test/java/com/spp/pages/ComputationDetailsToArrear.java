package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class ComputationDetailsToArrear extends BasePage{
	@FindBy(id="salary")
	WebElement SalaryLink;
	@FindBy(xpath="//div[@class='dropdown_5columns salaries']//a[contains(text(),'Arrears')]")
	WebElement Arrears;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Salary_ArrearTest')]/parent::tr/td[4]/a")
	WebElement Computaion;
	@FindBy(id="manual_arrears")
	WebElement AddEmployee;
	@FindBy(xpath="//*[@id=\"bf_form\"]/div/button[contains(text(),'LOAD')]")
	WebElement Load;
	@FindBy(xpath="//*[@id=\"show_message\"]/div/strong")
	WebElement successfullMessage;
	@FindBy(id="save_employee_arrear")
	WebElement Save;
	@FindBy(xpath="//tbody/tr/td[contains(text(),'JOHN')]/parent::tr/td[7]/a")
	WebElement MoreLink;
	@FindBy(xpath="//table/tbody/tr[3]/td[1]/table/tbody/tr/td/input")
	WebElement Basic;
	@FindBy(xpath="//*[@id=\"main\"]/div[3]/fieldset/table/tbody/tr[3]/td[2]/table/tbody/tr[1]/td/table[1]/tbody/tr[2]/td/input")
	WebElement DearnessAllowance;
	@FindBy(xpath="//span[@class='btn2 btn-bglightblue']")
	WebElement UpdateButton;
	@FindBy(xpath="//div[@id='main']/section/p/a[2]")
	WebElement Employee;
	@FindBy(xpath="//*[@id=\"select_all\"]")
	WebElement SelectAll;
	@FindBy(xpath="//tbody/tr/td[contains(text(),'JOHN')]/parent::tr/td[1]/input")
	WebElement SelectEmp;
	@FindBy(xpath="//div[@id='arrear_add_emp_filter']//input")
	WebElement Search;
	
	public ComputationDetailsToArrear(WebDriver driver) {
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
	public void EnterSearch(String value){
		Search.sendKeys(value);
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
		driver.navigate().to(link); //ye try maar ok
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

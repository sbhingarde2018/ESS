package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class ComputationDetailsToArrear extends BasePage{
	@FindBy(id="salary")
	WebElement SalaryLink;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[1]/ul/li[3]/a")
	WebElement Arrears;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/table/tbody/tr[1]/td[4]/a")
	WebElement Computaion;
	@FindBy(id="manual_arrears")
	WebElement AddEmployee;
	
	@FindBy(xpath="//*[@id=\"bf_form\"]/div[9]/button[1]")
	WebElement Load;
	
	@FindBy(xpath="//*[@id=\"show_message\"]/div/strong")
	WebElement successfullMessage;
	
	
	@FindBy(xpath="//*[@id=\"EmployeesArrears\"]/div[3]/div/div/input")
	WebElement Save;
	
	@FindBy(xpath="//*[@id=\"manual_headwise_arrears\"]/tbody/tr[1]/td[7]/a")
	WebElement MoreLink;
	@FindBy(xpath="//*[@id=\"main\"]/div[3]/fieldset/table/tbody/tr[3]/td[1]/table[1]/tbody/tr[2]/td/input")
	WebElement Basic;
	@FindBy(xpath="//*[@id=\"main\"]/div[3]/fieldset/table/tbody/tr[3]/td[2]/table/tbody/tr[1]/td/table[1]/tbody/tr[2]/td/input")
	WebElement DearnessAllowance;
	@FindBy(xpath="//*[@id=\"main\"]/div[3]/fieldset/table/tbody/tr[6]/td/table/tbody/tr/td/span")
	WebElement UpdateButton;
	@FindBy(xpath="//div[@id='main']/section/p/a[2]")
	WebElement Employee;
		
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

}

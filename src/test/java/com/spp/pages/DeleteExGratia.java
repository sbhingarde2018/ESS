package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;


public class DeleteExGratia extends BasePage {
	@FindBy(id="salary")
	WebElement Salary;
	@FindBy(linkText="Ex-Gratia")
	WebElement ExGratia;
	@FindBy(xpath="//div/table/tbody/tr[1]/td[3]/a")
	WebElement Compute;
	@FindBy(xpath="//tbody/tr[1]/td[12]/a")
	WebElement Delete;
	@FindBy(id="bonus_exgratia_calculation_amount_given")
	WebElement ExgratiaGiven;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/strong")
	WebElement SuccessMessage;
	@FindBy(xpath="//button[@id='add_employees']")
	WebElement AddEmp;
	@FindBy(xpath="//form[@id='bf_form']//button[contains(text(),'LOAD')]")
	WebElement Load;
	
	public DeleteExGratia(WebDriver driver) {
	super(driver);
	PageFactory.initElements(driver,this);
	}
	public void Clicksalary() {
	Salary.click();
	}
	public void ClickExGratia() {
	ExGratia.click();
	}
	public void ClickCompute() {
	Compute.click();
	}
	public void ClickDelete() {
	Delete.click();
	}
	public String getMessage() {
    	return SuccessMessage.getText();
	}
	public void ClickAddEmp() {
		AddEmp.click();
	}
	public void ClickLoad() {
		Load.click();
	}
}

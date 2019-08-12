package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;

public class UpdateExGratiaComputation extends BasePage {
	@FindBy(id="salary")
	WebElement Salary;
	@FindBy(linkText="Ex-Gratia")
	WebElement ExGratia;
	@FindBy(xpath="//div/table/tbody/tr[1]/td[3]/a")
	WebElement Compute;
	@FindBy(xpath="//tbody/tr[1]/td[11]/a")
	WebElement Edit;
	@FindBy(id="bonus_exgratia_calculation_amount_given")
	WebElement ExgratiaGiven;
	@FindBy(xpath="//div[4]/input[4]")
	WebElement UpdateComputation;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/strong")
	WebElement SuccessMessage;
	
	public UpdateExGratiaComputation(WebDriver driver) {
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
	public void ClickEdit() {
		Edit.click();
	}
	public void EnterExgratiaGiven(String value) {
		ExgratiaGiven.clear();
		ExgratiaGiven.sendKeys(value);
	}
	public void ClickUpdateComputation() {
		UpdateComputation.click();
	}
	public String getMessage() {
    	return SuccessMessage.getText();
	}
}



package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;

public class ComputeExGratia extends BasePage {
	@FindBy(id="salary")
	WebElement Salary;
	@FindBy(linkText="Ex-Gratia")
	WebElement ExGratia;
	@FindBy(xpath="//div/table/tbody/tr[1]/td[3]/a")
	WebElement Compute;
	
	public ComputeExGratia(WebDriver driver) {
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
}

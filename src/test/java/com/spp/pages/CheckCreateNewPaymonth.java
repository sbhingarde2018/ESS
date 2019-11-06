package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CheckCreateNewPaymonth extends BasePage{
	
	public CheckCreateNewPaymonth(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="salary")
	WebElement Salary;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[3]/ul/li[1]/a")
	WebElement SalaryEditor;
	@FindBy(xpath="//h3[contains(text(),'General Link')]")
	WebElement GeneralLink;
	@FindBy(xpath="//ul[@id='ui-id-8']//a[contains(text(),'Paymonths')]")
	WebElement Paymonths;
	@FindBy(xpath="//ul[@id='ui-id-6']//a[contains(text(),'Paymonths')]")
	WebElement PublishPaymonths;
	@FindBy(xpath="//div[@class='text-center bottom-space']//input[@name='commit'] ")
	WebElement CreatePaymonth;
	@FindBy(xpath="//strong[contains(text(),'Paymonth created successfully')]")
	WebElement SuccMessage;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[3]/ul/li[4]/a")
	WebElement PublishedSalary;
	@FindBy(xpath=" //a[contains(text(),'Published Salary Notifications')]")
	WebElement PublishedSalaryNotifications;
	
	public void ClickSalary() {
		Salary.click();
	}
	public void ClickSalaryEditor() {
		SalaryEditor.click();
	}
	public void ClickGeneralLink() {
		GeneralLink.click();
	}
	public void ClickPaymonth() {
		Paymonths.click();
	}
	public void ClickPublishPaymonths() {
		PublishPaymonths.click();
	}
	public void ClickCreatePaymonth() {
		CreatePaymonth.click();
	}
	public String getSuccessMessage(){
		return SuccMessage.getText();
	}
	public void selectPublishedSalary() {
		PublishedSalary.click();
	}
	public void ClickPublishedSalaryNotifications() {
		PublishedSalaryNotifications.click();
	}
}
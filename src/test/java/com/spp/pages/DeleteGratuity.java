package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class DeleteGratuity extends BasePage{
	@FindBy(id="salary")
	WebElement Salary;
	@FindBy(linkText="Gratuity")
	WebElement Gratuity;
	@FindBy(xpath="//div/table/tbody/tr/td[5]/a/img")
	WebElement Delete;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/strong")
	WebElement SuccessMessage;

	public DeleteGratuity(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void clickSalary(){
		Salary.click();
	}

	public void ClickGratuity(){
		Gratuity.click();
	}
	public void clickDelete(){
		Delete.click();
	}
	public String getTextMessage(){
		return SuccessMessage.getText();
	}

}

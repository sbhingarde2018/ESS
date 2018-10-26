package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class ComputeBonus extends BasePage{
	@FindBy(id="salary") 
	WebElement Salary;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[1]/ul/li[10]/a")
	WebElement Bonus;
	@FindBy(xpath="//*[@id=\"bonus_or_exgratia\"]/div/table/tbody/tr[1]/td[3]/a")
	WebElement Compute;
	
	public ComputeBonus(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	public void clickSalary(){
		Salary.click();
	}
	
	public void selectBonus(){
		Bonus.click();
	}
	public void clickCompute(){
		Compute.click();
	}
	

}

package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class DeleteGroupInsuranceDetail extends BasePage{
	@FindBy(id="master")
	WebElement masterlink;
	@FindBy(xpath="//a[contains(text(),'Group Insurance Detail')]")
	WebElement GroupInsurance;
	@FindBy(id="salary")
	WebElement salarylink;
	@FindBy(xpath="//a[contains(text(),'Group Insurance Detail')]")
	WebElement GroupInsuranceDetails;
	@FindBy(xpath="//*[@id=\"add_employees\"]")
	WebElement AddEmployee;
	@FindBy(xpath="//form[@id='bf_form']//button[contains(text(),'LOAD')]")
	WebElement Load;
	@FindBy(xpath="//tbody/tr/td[contains(text(),'Donald')]/parent::tr/td[6]/a")
	WebElement View;
	@FindBy(xpath="//div[2]/table/tbody/tr/td[9]/a/img")
	WebElement Delete;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/strong")
	WebElement SuccessfulMessage;
	@FindBy(xpath="//*[@id=\"standing_instr_list\"]/div[2]/table/tbody/tr/td[4]/a")
	WebElement DeleteMaster;
	
	public DeleteGroupInsuranceDetail(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void navigateMaster() throws Exception{
		masterlink.click();
	}
	public void deletemaster() {
		DeleteMaster.click();
	}
	
	public void clickGroupInsurance() throws Exception{
		GroupInsurance.click();
	}
	public void navigatesalary() throws Exception{
		salarylink.click();
	}
	
	public void clickGroupInsuranceDetails() throws Exception{
		GroupInsuranceDetails.click();
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
	public void clickDelete1() throws Exception{
		Delete.click();
		switchToPopUpAndAccept(driver);
	}
	public String getMessage() {
		return SuccessfulMessage.getText();
	}
	
}

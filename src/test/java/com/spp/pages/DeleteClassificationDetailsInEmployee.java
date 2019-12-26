package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class DeleteClassificationDetailsInEmployee extends BasePage{

	@FindBy(id="emp_detail")
	WebElement ClickOnEmployee;
	@FindBy(xpath="//*[@id=\"menu\"]/li[4]/div/div/ul/li[1]/a")
	WebElement ClickOnEmployDetails;
	@FindBy(id="filter_head")
	WebElement ClickOnFilterHead;
	@FindBy(xpath="//form[@id='bf_form']//button[contains(text(),'LOAD')]")
	WebElement ClickOnLoad;
	@FindBy(xpath="//*[@id=\"bf_non_classified_emp_form\"]/div[2]/button[1]")
	WebElement Load2;
	@FindBy(xpath="//td[contains(text(),'Nisha')]/parent::tr/td[6]/a[2]")
	WebElement DeleteEmployee;
	@FindBy(xpath="//td[contains(text(),'Nisha')]/parent::tr/td[6]/a[2]")
	WebElement DeleteEmployee1;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'')]/parent::tr/td[7]/a")
	WebElement DeletButton1;
	@FindBy(xpath="//div[@id='employees_dtable_filter']//input")
	WebElement Search;
	@FindBy(xpath="//strong[text()='Employee detail was successfully deleted.']")
	WebElement successfullMessage2;
	@FindBy(xpath="//td[contains(text(),'EMPA')]/parent::tr/td[6]/a[1]")
	WebElement ViewButton;
	@FindBy(xpath="//*[@id=\"classification_details\"]/a")
	WebElement ClassificationDetails;
	    
	public DeleteClassificationDetailsInEmployee(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	public String getMessage(){
		return successfullMessage2.getText();
		}
	public void clickonemployee() {
		ClickOnEmployee.click();
	}
	public void clickonemployeedetails() {
		ClickOnEmployDetails.click();
	}
	public void clickonfilter() {
		ClickOnFilterHead.click();
	}
	public void clickonload() {
		ClickOnLoad.click();
	}
	public void clickonload2() {
		Load2.click();
	}
	
	public void DeleteEmployee() {
		DeleteEmployee.click();
	}
	public void DeleteEmployee1() {
		DeleteEmployee1.click();
	}	
	public void ClickDeleteButton1(){
		DeletButton1.click();
	}
	public void SearchEmp(String value) {
		Search.sendKeys(value);
	}
	public void selectClassificationDetails(){
		ClassificationDetails.click();
	}
	public void selectViewButton(){
		ViewButton.click();
	}
	
}

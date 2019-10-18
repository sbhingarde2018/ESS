package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class EditSalaryRateDetailsDOL extends BasePage{
	public EditSalaryRateDetailsDOL(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="emp_detail")
	WebElement employeeLink;	
	@FindBy(xpath="//*[@id=\"menu\"]/li[4]/div/div/ul/li[4]/a")
	WebElement SalaryRateDetails;
	@FindBy(xpath="//span[contains(text(),'Listing Employee (Salary allotted)')]")
	WebElement ListingEmployee;
	@FindBy(id="filter_head")
	WebElement AdvancedFilterIcon;
	@FindBy(xpath="//form[@id='bf_form']//button[contains(text(),'LOAD')]")
	WebElement LoadButton;
	@FindBy(xpath="//*[@id=\"alloted\"]/tbody/tr/td[4]/a")
	WebElement EditButton;
	@FindBy(xpath="//select[@id='month_year']")
	WebElement EffectiveFrom;
	@FindBy(xpath="//div[@class='form-field']//input[@name='commit']")
	WebElement GetRate;
	@FindBy(xpath="//input[@id='gross_sal_formula']")
	WebElement GrossSal;
	@FindBy(xpath="//table/tbody/tr[2]/td[4]/input")
	WebElement Basic;
	@FindBy(xpath="//*[@id=\"sal_allotment\"]/table/tbody/tr[4]/td[4]/input")
	WebElement Mess;
	
//	@FindBy(xpath="//*[@id=\"sal_allotment\"]/table/tbody/tr[7]/td/input")
//	WebElement PopulateButton;
	@FindBy(xpath="//table[@class='table']//input[@name='commit']")
	WebElement SaveButton;
	@FindBy(xpath="//*[@id=\"main\"]/div[1]/strong")
	WebElement successfullMessage;
	@FindBy(xpath="//span[contains(text(),'Listing Employee (Salary allotted)')]")
	WebElement SalaryAlloted;
	@FindBy(xpath="//*[@id=\"alloted\"]/tbody/tr[1]/td[4]/a")
	WebElement Edit;
	@FindBy(xpath="//div[@id='alloted_filter']//input")
	WebElement Search;
	
	
	public void SearchEmp(String value) throws Exception{
		Search.sendKeys(value);
	}
	public void clickEmployeeLink() {
		   employeeLink.click();
	}
	public void selectSalaryRateDetails(){
		SalaryRateDetails.click();
	}
	public void selectListingEmployee(){
		ListingEmployee.click();
	}
	public void selectAdvancedFilterIcon() {
		AdvancedFilterIcon.click();
	}
	public void selectLoadButton() {
		LoadButton.click();
	}
	public void selectEditButton() {
		EditButton.click();
	}
	public void selectEffectiveFrom(String value){
		dropDownSelect(EffectiveFrom, value);
	}

	public void selectGetRate() {
		GetRate.click();
	}

	 public void enterGrossSal(String value) {
		 GrossSal.clear();
		 GrossSal.sendKeys(value);
	}

	public void enterBasic(String value) throws Exception {
		Basic.clear();
		Basic.sendKeys(value);
	}
	public void enterMess(String value) {
	Mess.sendKeys(value);
	}
	//public void selectPopulateButton() {
//		PopulateButton.click();
	//}
	public void SelectSaveButton() {
		SaveButton.click();
	}

	public String getMessage(){
		return successfullMessage.getText();
	}
	public void ClickSalaryAlloted() {
	    SalaryAlloted.click();
	}
	public void ClickEdit() {
		Edit.click();
	}

}

package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CreateArrearNoOfDaysDifferenceInstruments extends BasePage {
	@FindBy(id="salary") 
	WebElement SalaryLink;
	@FindBy(xpath="//div[@class='dropdown_5columns salaries']//a[contains(text(),'Arrears')]")
	WebElement Arrears;
	@FindBy(xpath="//*[@id=\"main\"]/div[1]/span/a[2]")
	WebElement CreateArrear;
	@FindBy(id="arrear_arrear_name")
	WebElement ArrearName;
	@FindBy(id="arrear_arrear_description")
	WebElement ArrearDescription;
	@FindBy(xpath="//*[@id=\"tabs-3\"]/div/table/tbody/tr[2]/td/fieldset/table/tbody/tr/td[1]/table/tbody/tr/td[1]/input")
	WebElement AutomationCheckBox;
	@FindBy(id="arrear_no_of_days")
	WebElement NoOfDays;
	@FindBy(id="arrear_days")
	WebElement Number;
	@FindBy(id="dummy_difference")
	WebElement Difference;
	@FindBy(id="arrear_arrear_from_month")
	WebElement ArrearFrom;
	@FindBy(id="to_month")
	WebElement ArrearTo;
	@FindBy(id="ref_month")
	WebElement RefMonth;
	@FindBy(id="arrear_arrear_paymonth")
	WebElement Paymonth;
	@FindBy(id="arrear_mode_of_payment_0")
	WebElement IndependentOfSalary;
	@FindBy(id="arrear_salary_independent_component_1")
	WebElement Instruments;
	@FindBy(xpath="//*[@id=\"new_arrear\"]/div[3]/nav/ul/li[2]/a/span")
	WebElement AdvancedSettingsTab;
	@FindBy(id="arrear_pt")
	WebElement Statutory;
	@FindBy(xpath="//*[@id=\"new_arrear\"]/div[4]/div[2]/input")
	WebElement CreateButton;
	@FindBy(xpath="//*[@id=\"main\"]/div[1]/strong")
	WebElement successfullMessage;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Salary_ArrearSal')]/parent::tr/td[6]/a/img")
	WebElement DeleteButton;
	
public CreateArrearNoOfDaysDifferenceInstruments(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	public void clickSalaryLink(){
		SalaryLink.click();
	}
	
	public void selectArrears(){
		Arrears.click();
	}
	public void selectCreateArrear(){
		CreateArrear.click();
	}
	public void EnterArrearName(String value){
		ArrearName.sendKeys(value);
	}
	public void EnterArrearDescription(String value){
		ArrearDescription.sendKeys(value);
	}

	public void ClickAutomationCheckBox(){
		AutomationCheckBox.click();
	}
	public void ClickNoOfDays(){
		NoOfDays.click();
	}
	public void ClickNumber(String value){
		Number.sendKeys(value);
	}
	public void ClickDifference(){
		Difference.click();
	}
	public void selectArrearFrom(String value){
		dropDownSelect(ArrearFrom, value);
	}
	public void selectArrearTo(String value){
		dropDownSelect(ArrearTo, value);
	}
	public void selectRefMonth(String value){
		dropDownSelect(RefMonth, value);
	}
	public void selectPaymonth(String value){
		dropDownSelect(Paymonth, value);
	}
	public void ClickIndependentOfSalary(){
		IndependentOfSalary.click();
	}
	public void ClickInstruments(){
		Instruments.click();
	}

	public void ClickAdvancedSettingsTab(){
		AdvancedSettingsTab.click();
	}

	public void ClickStatutory(){
		Statutory.click();
	}
	public void ClickCreateButton(){
		CreateButton.click();
	}
	public String getMessage(){
		return successfullMessage.getText();
	}

	
	public void selectDeleteButton() throws InterruptedException{
	    DeleteButton.click();
	    Thread.sleep(2000);
	    switchToPopUpAndAccept(driver);

	}
}

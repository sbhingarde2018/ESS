package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;

public class ComputeTDS extends BasePage {
	@FindBy(id="tds")
	WebElement TDS;
	@FindBy(xpath="//*[@id=\"menu\"]/li[7]/div/div/ul/li[1]/a")
	WebElement Computation;
	@FindBy(id="tds_financial_year")
	WebElement FinancialYear;
	@FindBy(id="filter_head")
	WebElement Filter;
	@FindBy(xpath="//form[@id='bf_form']//button[contains(text(),'LOAD')]")
	WebElement Load;
	@FindBy(xpath="//*[@id=\"employee_tax_compute\"]/div[5]/input")
	WebElement ComputeBtn;
	@FindBy(xpath="//div[@class='alert alert-info']")
	WebElement SuccessMessage;
	
	public ComputeTDS(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);

}
	public void ClickTDS() {
		TDS.click();
	}
	public void ClickComputation() {
		Computation.click();
	}
	public void SelectFinancialYear(String value) {
		dropDownSelect(FinancialYear, value);
	}
	public void ClickFilter() {
		Filter.click();
	}
	public void ClickLoad() {
		Load.click();
	}
	public void ClickComputeBtn() {
		ComputeBtn.click();
	}
	public String getMessage() {
		return SuccessMessage.getText();
	}
	}

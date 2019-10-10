package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;

public class MapEMItoTDS extends BasePage {
	@FindBy(id="tds")
	WebElement TDS;
	@FindBy(xpath="//li[7]/div/div/ul/li[4]/a")
	WebElement MonthlyDeductions;
	@FindBy(xpath="//select[@id='fin_month_year']")
	WebElement MonthYear;
	@FindBy(id="salary_group_id")
	WebElement SalaryStructure;
	@FindBy(id="get_tds_employees")
	WebElement GetEmployees;
	@FindBy(xpath="//form[@id='bf_form']//button[contains(text(),'LOAD')]")
	WebElement Load;
	@FindBy(id="map_emi")
	WebElement MapEmitoTds;
	@FindBy(xpath="//*[@id=\"show_message\"]/div/strong")
	WebElement UpdateSuccess;
	@FindBy(xpath="//*[@id='tds_fin_year']")
	WebElement Year;
	
	public MapEMItoTDS(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void ClickTDS() {
		TDS.click();
	}
	public void ClickMonthlyDeductions() {
		MonthlyDeductions.click();
	}
	public void SelectMonthYear(String value) {
    	dropDownSelect(MonthYear, value);
	}
	public void SelectSalaryStructure(String value) {
    	dropDownSelect(SalaryStructure, value);
	}
	public void ClickGetEmployees() {
		GetEmployees.click();
	}
	public void ClickLoad() {
		Load.click();
	}
	public void ClickMapEmitoTds() {
		MapEmitoTds.click();
	}
	public String getMessage() {
    	return UpdateSuccess.getText();
	}
	public void SelectYear(String value) {
    	dropDownSelect(Year, value);
	}
}

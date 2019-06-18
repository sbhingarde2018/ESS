package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;


public class DeleteLetOutProperty extends BasePage {
	@FindBy(id="tds")
	WebElement TDS;
	@FindBy(xpath="//*[@id=\"menu\"]/li[7]/div/div/ul/li[2]/a")
	WebElement ComputationDetails;
	@FindBy(xpath="//*[@id=\"computed_employee_tds\"]/tbody/tr/td [contains(text(),'Tina')]/parent::tr/td[4]/a")
	WebElement Details;
	@FindBy(xpath="//*[@id=\"ui-id-3\"]/h3")
	WebElement HouseRentProperty;
	@FindBy(xpath="//*[@id=\"ui-id-4\"]/li[1]/a")
	WebElement LetOutProperty;
	@FindBy(xpath="//tbody/tr/td[5]/a[2]")
	WebElement Delete;
	
	public DeleteLetOutProperty(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
}
	public void ClickTDS() {
		TDS.click();
	}
	public void ClickComputationDetails() {
		ComputationDetails.click();
	}
	public void ClickDetails() {
		Details.click();
	}
	public void ClickHouseRentProperty() {
		HouseRentProperty.click();
	}
	public void ClickLetOutProperty() {
		LetOutProperty.click();
	}
	public void ClickDelete() {
		Delete.click();
	}
}

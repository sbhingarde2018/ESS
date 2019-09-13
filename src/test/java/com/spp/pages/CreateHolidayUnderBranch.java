package com.spp.pages;

//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CreateHolidayUnderBranch extends BasePage {
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//a[text()='Holiday Lists']")
	WebElement holidayList;
	@FindBy(xpath="//tbody/tr/td[contains(text(),'default')]/parent::tr/td[3]/a")
	WebElement viewList;
	@FindBy(linkText="Add New Holiday")	
	WebElement addHolidayLink;
	@FindBy(id="hdd")
	WebElement date;
	@FindBy(id="holiday_description")
	WebElement description;
	@FindBy(id="holiday_national_holiday")
	WebElement nationalHoliday;
	@FindBy(xpath="//*[@id=\"new_holiday\"]/fieldset/div[4]/div/input")
	WebElement createButton;
	@FindBy(xpath="//*[@id=\"main\"]/div[3]/strong")
	WebElement successfullyMessage;
	@FindBy(xpath="//tbody/tr/td[contains(text(),'Diwali')]/parent::tr/td[5]/a[2]/img")
	WebElement DeleteButton;
	 
	public CreateHolidayUnderBranch(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void clickMastserLink(){
		masterLink.click();
	}

	public void selectHolidayList(){
		holidayList.click();
	}

	public void clickView(){
		viewList.click();
	}
	public void clickAddHoliday(){
		addHolidayLink.click();
	}

	public String enterDate(String value){
		date.clear();
		date.sendKeys(value);
		//date.sendKeys(Keys.TAB);
		return value;
	}
	
	public void enterDescription(String value){
		description.clear();
		description.sendKeys(value);
	}
	public void clickNationalHoliday(){
		nationalHoliday.click();
	}
	public void clickCreateButton(){
		createButton.click();
	}
	public String getMessage(){
		return successfullyMessage.getText();
	}
	public void clickDeleteButton(){
		DeleteButton.click();
		switchToPopUpAndAccept(driver);
	}
}
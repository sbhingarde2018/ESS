package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class EditEMIDetailsGroupInsuranceDetails extends BasePage{
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
	@FindBy(xpath="//div[2]/table/tbody/tr/td[8]/a")
	WebElement Details;
	@FindBy(xpath="//table/tbody/tr[1]/td[4]/a")
	WebElement Edit;
	@FindBy(id="modified_amount")
	WebElement Amount;
	@FindBy(id="update")
	WebElement Update;
	@FindBy(xpath="//*[@id=\"show_message\"]/div/strong")
	WebElement SuccessfulMessage;
	
	public EditEMIDetailsGroupInsuranceDetails(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void navigatesalary() throws Exception{
		salarylink.click();
	}
	
	public void clickgroupInsuranceDetails() throws Exception{
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
	public void clickDetails() throws Exception{
		Details.click();
	}
	public void clickEdit() throws Exception{
		Edit.click();
	}
	public void clickAmount(String value) throws Exception{
		//Amount.sendKeys("");
		Amount.clear();
		Amount.sendKeys(value);
		//Amount.sendKeys(Keys.TAB);
	}
	public void clickUpdate() throws Exception{
		Update.click();
	}
   public String getMessage() {
	   return SuccessfulMessage.getText();
   }

public void navigateMaster() {
	// TODO Auto-generated method stub
	
}

}

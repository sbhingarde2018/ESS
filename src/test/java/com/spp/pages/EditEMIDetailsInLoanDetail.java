package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class EditEMIDetailsInLoanDetail extends BasePage{
	@FindBy(id="salary")
	WebElement salarylink;
	@FindBy(linkText="Loan Detail")
	WebElement LoanDetails;
	@FindBy(xpath="//*[@id=\"add_employees\"]")
	WebElement AddEmployee;
	@FindBy(xpath="//*[@id=\"bf_form\"]/div/button[contains(text(),'LOAD')]")
	WebElement Load;
	@FindBy(id="filter")
	WebElement MultiAllotment;
	@FindBy(xpath="//tbody/tr/td[contains(text(),'abcLeavePolicy')]/parent::tr/td[6]/a")
	WebElement View;
	@FindBy(xpath="//div[2]/table/tbody/tr/td[7]/a")
	WebElement Detail;
	@FindBy(xpath="//span[contains(text(),'EMI details')]")
	WebElement EmiDetail;
	@FindBy(xpath="//table/tbody/tr[1]/td[4]/a")
	WebElement Edit;
	@FindBy(id="modified_amount")
	WebElement Amount;
	@FindBy(id="update")
	WebElement UpdateButton;
	@FindBy(id="popup_ok")
	WebElement YesButton;
	
	
	@FindBy(xpath="//*[@id=\"show_message\"]/div/strong")
	WebElement SuccessfulMessage;
	
	public EditEMIDetailsInLoanDetail(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void navigatesalary() throws Exception{
		salarylink.click();
	}
	
	public void clickLoanDetails() throws Exception{
		LoanDetails.click();
	}
	public void clickAddEmployee() throws Exception{
		AddEmployee.click();	
	}
	public void clickLoad() throws Exception{
		Load.click();
	}
	public void clickMultiAllotment() throws Exception{
		MultiAllotment.click();
	}
	public void clickView() throws Exception{
		View.click();
	}
	public void ClickDetail() throws Exception{
		Detail.click();
	}
	public void ClickEmiDetail() throws Exception{
		EmiDetail.click();
	}
	public void clickEdit() throws Exception{
		Edit.click();
	}
	public void clickAmount(String value) throws Exception{
		Amount.clear();	
		Amount.sendKeys(value);
	}
	public void clickUpdateButton() throws Exception{
		UpdateButton.click();
	}
	
	public void clickYesButton() throws Exception{
		boolean popupvisible=isVisible(YesButton);
		if (popupvisible)
		{
			YesButton.click();}
			}
	public String getMessage() {
		return SuccessfulMessage.getText();
	}
}

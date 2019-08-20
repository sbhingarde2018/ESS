package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class DeleteEMIDetailsInAdvanceDetail extends BasePage{
	@FindBy(id="salary")
	WebElement salarylink;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[1]/ul/li[7]/a")
	WebElement AdvanceDetails;
	@FindBy(xpath="//*[@id=\"add_employees\"]")
	WebElement AddEmployee;
	@FindBy(xpath="//*[@id=\"bf_form\"]/div/button[contains(text(),'LOAD')]")
	WebElement Load;
	@FindBy(id="filter")
	WebElement MultiAllotment;
	@FindBy(xpath="//tbody/tr/td[contains(text(),'Reya')]/parent::tr/td[6]/a")
	WebElement View;
	@FindBy(xpath="//div[2]/table/tbody/tr/td[7]/a")
	WebElement Detail;
	@FindBy(xpath="//table/tbody/tr[1]/td[contains(text(),'Aug/2019')]/parent::tr/td[5]/a")
	WebElement Delete;
	@FindBy(id="popup_ok")
	WebElement YesButton;
	@FindBy(xpath="//*[@id=\"show_message\"]/div/strong")
	WebElement SuccessfulMessage;
	@FindBy(xpath="//span[contains(text(),'EMI details')]")
	WebElement EmiDetils;
	@FindBy(xpath="//a[contains(text(),'Reya(TATA643666)')]")
	WebElement GoToAdvance;
	@FindBy(xpath="//div[2]/table/tbody/tr/td[8]/a")
	WebElement DeleteAdvance;
	
	public DeleteEMIDetailsInAdvanceDetail(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void navigatesalary() throws Exception{
		salarylink.click();
	}
	
	public void clickAdvanceDetails() throws Exception{
		AdvanceDetails.click();
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
	public void ClickDelete() throws Exception{
		Delete.click();
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
	public void clickEmiDetils() throws Exception{
		EmiDetils.click();
		}
	public void ClickGoToAdvance() throws Exception{
		GoToAdvance.click();
	}
	public void ClickDeleteAdvance() throws Exception{
		DeleteAdvance.click();
	}
}

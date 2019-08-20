package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class DeleteSiReceiptInLoanDetail extends BasePage{
	@FindBy(id="salary")
	WebElement salarylink;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[1]/ul/li[6]/a")
	WebElement AdvanceDetails;
	@FindBy(linkText="Loan Detail")
	WebElement LoanDetails;
	@FindBy(xpath="//*[@id=\"add_employees\"]")
	WebElement AddEmployee;
	@FindBy(xpath="//*[@id=\"bf_form\"]/div/button[contains(text(),'LOAD')]")
	WebElement Load;
	@FindBy(id="filter")
	WebElement MultiAllotment;
	@FindBy(xpath="//tbody/tr/td[contains(text(),'Tina')]/parent::tr/td[6]/a")
	WebElement View;
	@FindBy(xpath="//div[2]/table/tbody/tr/td[contains(text(),'03 July 2019')]/parent::tr/td[7]/a")
	WebElement Detail;
	@FindBy(xpath="//span[contains(text(),'Receipt details')]")
	WebElement ReceiptDetail;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'July')]/parent::tr[1]/td[5]/a")
	WebElement Delete;
	@FindBy(id="popup_ok")
	WebElement YesButton;
	@FindBy(xpath="//*[@id=\"show_message\"]/div/strong")
	WebElement SuccessfulMessage;
	@FindBy(xpath="//div/section/p/a[2]")
	WebElement Back;
	@FindBy(xpath="//div[2]/table/tbody/tr[1]/td[8]/a")
	WebElement DeleteLoan;
	
	public DeleteSiReceiptInLoanDetail(WebDriver driver){
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
	public void ClickReceiptDetail() throws Exception{
		ReceiptDetail.click();
	}
	public void clickDelete() throws Exception{
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
	public void clickBack() throws Exception{
		Back.click();
	}
	public void clickDeleteLoan() throws Exception{
		DeleteLoan.click();
	}

}

package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class UpdateSiReceiptInAdvanceDetail extends BasePage{
	@FindBy(id="salary")
	WebElement salarylink;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[1]/ul/li[6]/a")
	WebElement AdvanceDetails;
	@FindBy(xpath="//*[@id=\"add_employees\"]")
	WebElement AddEmployee;
	@FindBy(xpath="//*[@id=\"bf_form\"]/div[9]/button[1]")
	WebElement Load;
	@FindBy(id="filter")
	WebElement MultiAllotment;
	@FindBy(xpath="//*[@id=\"si_detail_employees\"]/tbody/tr[1]/td[6]/a")
	WebElement View;
	@FindBy(xpath="//*[@id=\"standing_detail_list\"]/div[2]/table/tbody/tr[1]/td[7]/a")
	WebElement Detail;
	@FindBy(xpath="//*[@id=\"main\"]/div/div[2]/nav/ul/li[2]/a/span")
	WebElement ReceiptDetail;
	@FindBy(xpath="//*[@id=\"si_receipts\"]/table/tbody/tr[1]/td[4]/a")
	WebElement Edit;
	@FindBy(id="receipt_amount")
	WebElement Amount;
	@FindBy(id="update_receipt")
	WebElement UpdateButton;
	@FindBy(id="popup_ok")
	WebElement YesButton;
	
	
	@FindBy(xpath="//*[@id=\"show_message\"]/div/strong")
	WebElement SuccessfulMessage;
	
	public UpdateSiReceiptInAdvanceDetail(WebDriver driver){
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
	public void ClickReceiptDetail() throws Exception{
		ReceiptDetail.click();
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
		YesButton.click();
		}
	public String getMessage() {
		return SuccessfulMessage.getText();
	}

}

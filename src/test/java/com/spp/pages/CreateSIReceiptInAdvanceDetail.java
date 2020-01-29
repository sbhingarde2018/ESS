package com.spp.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CreateSIReceiptInAdvanceDetail extends BasePage{
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
	@FindBy(xpath="//tbody/tr/td[contains(text(),'Donald')]/parent::tr/td[6]/a")
	WebElement View;
	@FindBy(xpath="//div[2]/table/tbody/tr/td[contains(text(),'Default1')]/parent::tr/td[7]/a")
	WebElement Detail;
	@FindBy(xpath="//span[contains(text(),'Receipt details')]")
	WebElement ReceiptDetail;
	@FindBy(id="si_date")
	WebElement Date;
	@FindBy(id="receipt_amount")
	WebElement Amount;
	@FindBy(xpath="//button[@id='confirm_receipt']")
	WebElement confirmButton;
	@FindBy(id="popup_ok")
	WebElement YesButton;
	@FindBy(xpath="//*[@id=\"show_message\"]/div/strong")
	WebElement SuccessfulMessage;
	@FindBy(xpath="//*[@id=\"standing_detail_list\"]/div[2]/table/tbody/tr/td[2][contains(text(),'Periodic_12')]/parent::tr/td[8]/a")
	WebElement DeleteButton;
	public CreateSIReceiptInAdvanceDetail(WebDriver driver){
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
	public void clickDate(String value) throws Exception{
		Date.sendKeys(value);
}
	public void clickAmount(String value) throws Exception{
			Amount.sendKeys(value);
	}
	public void clickconfirmButton() throws Exception{
		confirmButton.click();
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
	public void clickDeleteButton() throws Exception{
		DeleteButton.click();
		switchToPopUpAndAccept(driver);
	}
}

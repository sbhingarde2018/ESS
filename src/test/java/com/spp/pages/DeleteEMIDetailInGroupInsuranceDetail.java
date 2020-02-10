package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class DeleteEMIDetailInGroupInsuranceDetail extends BasePage{
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
	WebElement Detail;
	@FindBy(xpath="//table/tbody/tr[1]/td[5]/a")
	WebElement Delete;
	@FindBy(id="popup_no")
	WebElement NoButton;
	@FindBy(id="popup_ok")
	WebElement YesButton;
	@FindBy(xpath="//*[@id=\"show_message\"]/div/strong")
	WebElement SuccessfulMessage;
	@FindBy(xpath="//a[contains(text(),'Donald')]")
	WebElement NavigateBack;
	@FindBy(xpath="//div[2]/table/tbody/tr/td[9]/a/img")
	WebElement DeleteGi;
	
	public DeleteEMIDetailInGroupInsuranceDetail(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void navigatesalary() throws Exception{
		salarylink.click();
	}
	
	public void clickGroupInsuranceDetails() throws Exception{
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
	public void clickDetail() throws Exception{
		Detail.click();
	}

	public void clickDelete() throws Exception{
		Delete.click();
		//switchToPopUpAndAccept(driver);
	}
	public void clickNoButton() throws Exception{
		NoButton.click();
	}
	public void clickYesButton() throws Exception{
		YesButton.click();
	}
	public String getMessage() {
		return SuccessfulMessage.getText();
	}
	public void NavigateBack() throws Exception{
		NavigateBack.click();
	}
	public void ClickDeleteGi() throws Exception{
		DeleteGi.click();
	}

}

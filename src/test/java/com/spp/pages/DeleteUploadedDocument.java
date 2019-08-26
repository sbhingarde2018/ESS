package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class DeleteUploadedDocument extends BasePage {
	public DeleteUploadedDocument(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id="master")
	WebElement masterlink;
	@FindBy(xpath="//ul[@id='menu']//a[text()='Company']")
	WebElement companylink;
	@FindBy(xpath="//a[contains(text(),'Documents')]")
	WebElement DocumentLink;
	@FindBy(xpath="//div[3]/table/thead/tr[2]/td[6]/a")
	WebElement DeleteButton; 
	@FindBy(xpath="//*[@id=\"main\"]/div[1]/strong")
	WebElement SuccessfulMessage;
	
	public void navigateMaster() throws Exception{
		masterlink.click();
	}

	public void clickCompanayLink() throws Exception{
		companylink.click();
	}

	public void clickDocumentLink() throws Exception{
		DocumentLink.click();
    }
	public void clickDeleteButton() throws Exception{
		DeleteButton.click();
		//switchToPopUpAndAccept(driver);
    }
	 public String getMessage() {
		 return SuccessfulMessage.getText();
	 }
}
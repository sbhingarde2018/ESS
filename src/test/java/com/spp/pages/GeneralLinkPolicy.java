package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class GeneralLinkPolicy extends BasePage {
	@FindBy(id="master")
	WebElement masterLink;
	@FindBy(xpath="//a[text()='Leave Policy']")
	WebElement leavePolicy;
	@FindBy(xpath="//h3[contains(text(),'General Links')]")
	WebElement generaLink;
	@FindBy(xpath="//ul[@id='ui-id-4']//a[contains(text(),'Leave Definitions')]")
	WebElement leaveDefinitionLink;
	@FindBy(xpath="//div[@id='main']//p")
	WebElement successfullMessage;
	
	public GeneralLinkPolicy(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}

	public void clickMastserLink(){
		masterLink.click();
	}

	public void selectLeavePolicy(){
		leavePolicy.click();
	}
	
	public void  clickGeneraLink(){
		generaLink.click();
	}
	
	public void clickLeaveDefinitionLink(){
		leaveDefinitionLink.click();
	}
	
	public String getMessage(){
		return successfullMessage.getText();
	}
}

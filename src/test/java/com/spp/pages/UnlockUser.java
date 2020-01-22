package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class UnlockUser extends BasePage{
@FindBy(xpath="//span[@class='profile-image username-text']")
WebElement Superuser;
@FindBy(xpath="//a[contains(text(),'User Management')]")
WebElement ClickOnUserManagement;
@FindBy(xpath="//span[contains(text(),'Unlock User')]")
WebElement SelectOnUnlockUser;
@FindBy(xpath="//table[@id='user_roles_unlock']//input[@id='users_']")
WebElement SelectEmployee;
@FindBy(xpath="//input[@id='user_management']")
WebElement ClickOnUnlockUser;
@FindBy(xpath="//*[@id=\"main\"]/div[1]/strong")
WebElement successfullmessage;
public UnlockUser(WebDriver driver) {
	super(driver);
	PageFactory.initElements(driver, this);
}
	public void clickonsuperuser() {
		Superuser.click();
	}
	public void clickonusermanagement() {
		ClickOnUserManagement.click();
	}
	public void selectunlockuser() {
		SelectOnUnlockUser.click();
	}
	public void selectemployee() {
		SelectEmployee.click();
	}
	public void clickonunlockuser() {
		ClickOnUnlockUser.click();
	}
	public String getMessage() {
		return successfullmessage.getText();
	}
}

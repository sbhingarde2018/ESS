package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class VerifyLockUser extends BasePage{
		@FindBy(xpath="//span[@class='profile-image username-text']")
		WebElement Superuser;
		@FindBy(xpath="//a[contains(text(),'User Management')]")
		WebElement ClickOnUserManagement;
		@FindBy(xpath="//span[contains(text(),'Lock User')]")
		WebElement SelectOnLockUser;
		@FindBy(xpath="//table[@id='user_roles_lock']//input[@id='users_']")
		WebElement SelectEmployee;
		@FindBy(xpath="//input[@id='lock_users']")
		WebElement ClickOnlockUser;
		@FindBy(xpath="//*[@id=\"main\"]/div[1]/strong")
		WebElement successfullmessage;
		public VerifyLockUser(WebDriver driver) {
			super(driver);
			PageFactory.initElements(driver, this);
		}
			public void clickonsuperuser() {
				Superuser.click();
			}
			public void clickonusermanagement() {
				ClickOnUserManagement.click();
			}
			public void selectLockuser() {
				SelectOnLockUser.click();
			}
			public void selectemployee() {
				SelectEmployee.click();
			}
			public void clickonlockuser() {
				ClickOnlockUser.click();
			}
			public String getMessage() {
				return successfullmessage.getText();
			}
	
}

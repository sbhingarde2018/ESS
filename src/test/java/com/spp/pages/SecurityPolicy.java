package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class SecurityPolicy extends BasePage{
	@FindBy(xpath="//span[@class='profile-image username-text']")
	WebElement Superuser;
	@FindBy(xpath="//a[contains(text(),'Security Policy')]")
	WebElement SecurityPolicy;
	@FindBy(id="general_security_policy_password_strength")
	WebElement PasswordStrength;
	@FindBy(id="general_security_policy_password_expiry_days")
	WebElement PasswordExpiryDate;
	@FindBy(id="general_security_policy_form_update_button")
	WebElement UpdateButton;
	@FindBy(id="general_security_policy_remind_password_expiry_before")
	WebElement PasswordExpiryReminder;
	@FindBy(id="general_security_policy_minimum_password_length")
	WebElement MinimumPasswordLength;
	@FindBy(id="general_security_policy_max_login_attempts")
	WebElement MaximumFailLogin;
	@FindBy(id="general_security_policy_login_type_employee_id")
	WebElement LoginType;
	@FindBy(xpath="//*[@id=\"general_security_policy_form\"]/div[8]/div/label[3]")
	WebElement SessionManager;
	@FindBy(xpath="//*[@id=\"show_message\"]/div/strong")
	WebElement successfullMessage;
	
	public SecurityPolicy(WebDriver driver) {
	super(driver);
	PageFactory.initElements(driver, this);
}
	public void navigateSuperuser1() {
		Superuser.click();
	}
	public void clickSecurityPolicy() {
		SecurityPolicy.click();
	}
	public void selectpasswordstrength (String value) throws Exception {
		
		dropDownSelect(PasswordStrength, value);
	}
	public void enterPasswordExpiryDay (String value) throws Exception{
		PasswordExpiryDate.clear();
		PasswordExpiryDate.sendKeys(value);
	}
	public void enterPasswordExpiryReminder (String value) throws Exception{
		PasswordExpiryReminder.clear();
		PasswordExpiryReminder.sendKeys(value);
	}
	public void enterMinimumPasswordLength (String value) throws Exception{
		MinimumPasswordLength.clear();
		MinimumPasswordLength.sendKeys(value);
	}
	public void enterMaximumFailLogin (String value) throws Exception{
		MaximumFailLogin.clear();
		MaximumFailLogin.sendKeys(value);
	}
	public void selectLoginType() throws Exception{
		LoginType.click();
	}
	public void clickSessionManager() throws Exception{
		SessionManager.click();
	}
	public void clickupdatebutton() throws Exception{
		UpdateButton.click();
	}
	public String getMessage()throws Exception{
		return successfullMessage.getText();
	}
}



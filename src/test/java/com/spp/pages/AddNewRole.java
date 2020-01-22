package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class AddNewRole extends BasePage {

	@FindBy(xpath="//span[@class='profile-image username-text']")
	WebElement SuperUser;
	@FindBy(xpath="//a[contains(text(),'Role And Screen Permission')]")
	WebElement RolePermission;
	@FindBy(xpath="//a[contains(text(),'Add New Role')]")
	WebElement AddNewRole;
	@FindBy(xpath="//input[@id='role_name']")
	WebElement RoleName;
	@FindBy(id="SPP_Cloud_permissions_company_statutory_create")
	WebElement CSCreate;
	@FindBy(id="SPP_Cloud_permissions_company_statutory_read")
	WebElement CSRead;
	@FindBy(id="SPP_Cloud_permissions_company_statutory_update")
	WebElement CSUpdate;
	@FindBy(xpath="//*[@id=\"role_screen\"]/div[8]/input[1]")
	WebElement Submit;
	@FindBy(xpath="//input[@class='btn2 btn-bglightblue']")
	WebElement Update;
	@FindBy(id="SPP_Cloud_permissions_company_statutory_destroy")
	WebElement CSDelete;
	@FindBy(xpath="//strong[contains(text(),'Screen Permission is successfully created')]")
	WebElement successfullMessage;
	@FindBy(xpath="//tbody/tr/td[contains(text(),'ABCD')]/parent::tr/td[5]/span[2]/a")
	WebElement Delete;
	@FindBy(xpath="//tbody/tr/td[contains(text(),'ABC')]/parent::tr/td[5]/span[1]/a")
	WebElement Edit;
	@FindBy(xpath="//strong[contains(text(),'Screen Permission is successfully updated')]")
	WebElement UpdateMessage;
	
	
	public AddNewRole(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	public void clickSuperUser(){
		SuperUser.click();
	}
	
	public void selectRolePermission(){
		RolePermission.click();
	}

	public void selectAddNewRole(){
		AddNewRole.click();
	}
	
	public void EnterRoleName(String value){
		RoleName.sendKeys(value);
		
	}
	public void selectCSCreate(){
		CSCreate.click();
	}
	public void selectCSRead(){
		CSRead.click();
	}
	public void selectCSUpdate(){
		CSUpdate.click();
	}
	public void selectCSDelete(){
		CSDelete.click();
	}
	public void clickSubmit(){
		Submit.click();
	}
	public void clickUpdate(){
		Update.click();
	}
	public void clickEdit(){
		Edit.click();
	}
	public void clickDelete(){
		Delete.click();
	}
	public String getMessage(){
		return successfullMessage.getText();
	}
	public String getUpdateMessage(){
		return UpdateMessage.getText();
	}
}

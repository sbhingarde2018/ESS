package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class AddPFGroup extends BasePage{
	@FindBy(id="master")
	WebElement masterlink;
	@FindBy(xpath="//a[text()='Company Statutories']")
	WebElement companystatutorylink;
	@FindBy(xpath="//a[text()='Add New PF Group']")
	WebElement addpf;
	@FindBy(id="pf_group_id")
	WebElement pfgruopname;
	@FindBy(id="pf_group_pf_number")
	WebElement pfnumber;
	@FindBy(id="pf_group_db_file_code")
	WebElement pfdbfilecode;
	@FindBy(id="pf_group_extension")
	WebElement pfextension;
	@FindBy(id="pf_group_address")
	WebElement pfaddress;
	@FindBy(xpath="//input[@value='Create PF Group']")
	WebElement pfcreatebutton;
	@FindBy(xpath="//span[contains(text(),'PF Rate')]")
	WebElement pfratelink;
	@FindBy(id="pf_group_rate_paymonth_id")
	WebElement effectivedate;
	@FindBy(xpath="//input[@value='Create PF Group Rate']")
	WebElement pfratebutton;
	@FindBy(xpath="//strong[text()='PF group rate successfully created.']")
	WebElement successfullMessage;
	@FindBy(xpath="//h3[contains(text(),'Listing PF Group')]")
	WebElement VerifyListingPF;
	@FindBy(xpath="//h3[contains(text(),'Add New PF Group')]")
	WebElement VerifyAddNewPF;
	@FindBy(xpath="//div[@id='pf_group_id-error']")
	WebElement PFGroupError;
	@FindBy(xpath="//div[@id='pf_group_pf_number-error']")
	WebElement PFNumberError;
	@FindBy(xpath="//div[@id='pf_group_address-error']")
	WebElement PFAddressError;
	@FindBy(xpath="//li[contains(text(),'Pf group has already been taken')]")
	WebElement PFError1;
	@FindBy(xpath="//li[contains(text(),'Pf number has already been taken')]")
	WebElement PFError2;
	
	public AddPFGroup(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void navigateMaster() throws Exception{
		masterlink.click();
	}
	
	public void clickCompanayLink() throws Exception{
		companystatutorylink.click();
	}
	
	public void clickAddPFLink() throws Exception{
		addpf.click();
	}
	
	public void enterPFGroupName(String value) throws Exception{
		pfgruopname.sendKeys(value);
	}
	
	public void enterPFNumber(String value) throws Exception{
		pfnumber.sendKeys(value);
	}
	
	public void enterDBFileCode(String value) throws Exception{
		pfdbfilecode.sendKeys(value);
	}
	
	public void enterExtension(String value) throws Exception{
		pfextension.sendKeys(value);
	}
	
	public void enterPFAddress(String value) throws Exception{
		pfaddress.sendKeys(value);
	}
	
	public void clickPFCreateButton() throws Exception{
		pfcreatebutton.click();
	}
	
	public void clickPFRateLinkButton() throws Exception{
		pfratelink.click();
	}
	
	public void selectEffectiveDate(String value) throws Exception{
		effectivedate.sendKeys(value);
	}
	
	public void clickPFGroupRateButton() throws Exception{
		pfratebutton.click();
	}
	public String getMessage(){
		return successfullMessage.getText();
	}
	public String getVerifyListingPF(){
		return VerifyListingPF.getText();
	}
	public String getVerifyAddNewPF(){
		return VerifyAddNewPF.getText();
	}
	public String getPFGroupError(){
		return PFGroupError.getText();
	}
	public String getPFNumberError(){
		return PFNumberError.getText();
	}
	public String getPFAddressError(){
		return PFAddressError.getText();
	}
	public String getPFError1(){
		return PFError1.getText();
	}
	public String getPFError2(){
		return PFError2.getText();
	}
}

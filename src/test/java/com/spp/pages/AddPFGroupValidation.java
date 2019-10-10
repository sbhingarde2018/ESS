package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class AddPFGroupValidation extends BasePage{
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
	@FindBy(xpath="//td[text()='PF_Test']//following::td[3]//span/a")
	WebElement pfgroupedit;
	@FindBy(xpath="//td[text()=\"PF_Test\"]//following::td[3]//span[2]//a")
	WebElement PFDeletebutton;
	@FindBy(xpath="//span[contains(text(),'PF Rate')]")
	WebElement pfratelink;
	@FindBy(id="pf_group_rate_paymonth_id")
	WebElement effectivedate;
	@FindBy(id="pf_group_rate_epf")
	WebElement Epfa;
	@FindBy(id="pf_group_rate_cutoff")
	WebElement cutoff;
	@FindBy(id="pf_group_rate_account_number_02")
	WebElement accountno2;
	@FindBy(id="pf_group_rate_pension_fund")
	WebElement pensionfund;
	@FindBy(id="pf_group_rate_account_number_21")
	WebElement accountno21;
	@FindBy(id="pf_group_rate_account_number_22")
	WebElement accountno22;
	@FindBy(xpath="//input[@value='Create PF Group Rate']")
	WebElement pfratebutton;
	@FindBy(xpath="//strong[text()='PF group rate successfully created.']")
	WebElement successfullMessage;
	@FindBy(id="pf_group_rate_paymonth_id-error")
	WebElement Effectiveftom;
	@FindBy(id="pf_group_id-error")
	WebElement Pfgrounamevalidation;
	@FindBy(id="pf_group_pf_number-error")
	WebElement Pfnovalidation;
	@FindBy(id="pf_group_address-error")
	WebElement Pfaddressvalidation;
	@FindBy(xpath="//div[' alert alert-danger']/li[1]")
	WebElement dublicatepfname;
	@FindBy(xpath="//div[' alert alert-danger']/li[2]")
	WebElement dublicatepfno;
	@FindBy(id="pf_group_rate_paymonth_id-error")
	WebElement PFgroupPaymonth;
	@FindBy(id="pf_group_rate_epf-error")
	WebElement epfavalidation;
	@FindBy(id="pf_group_rate_cutoff-error")
	WebElement cutoffvalidation;
	@FindBy(id="pf_group_rate_account_number_02-error")
	WebElement accountno2validation;
	@FindBy(id="pf_group_rate_pension_fund-error")
	WebElement pensionfundvalidation;
	@FindBy(id="pf_group_rate_account_number_21-error")
	WebElement accountno21validation;
	@FindBy(id="pf_group_rate_account_number_22-error")
	WebElement accountno22validation;
	@FindBy(id="pf_group_rate_employer_epf")
	WebElement epfa_b;
	
	
	public AddPFGroupValidation(WebDriver driver){
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
		pfnumber.clear();
		pfnumber.sendKeys(value);
	}
	
	public void enterDBFileCode(String value) throws Exception{
		pfdbfilecode.sendKeys(value);
	}
	
	public void enterExtension(String value) throws Exception{
		pfextension.sendKeys(value);
	}
	
	public void enterPFAddress(String value) throws Exception{
		pfaddress.clear();
		pfaddress.sendKeys(value);
	}
	
	public void clickPFCreateButton() throws Exception{
		pfcreatebutton.click();
	}
	public void clickPFgroupEdit() throws Exception{
		pfgroupedit.click();
	}
	public void clickPFRateLinkButton() throws Exception{
		pfratelink.click();
	}
	
	public void selectEffectiveDate(String value) throws Exception{
		effectivedate.sendKeys(value);
	}
	public void enterepfa(String value) throws Exception{
		Epfa.clear();
		Epfa.sendKeys(value);
	}
	public void entercutoff(String value) throws Exception{
		cutoff.clear();
		cutoff.sendKeys(value);	
	}
	public void enteraccountno2(String value) throws Exception{
		accountno2.clear();
		accountno2.sendKeys(value);	
	}
	public void enterpensionfund(String value) throws Exception{
		pensionfund.clear();
		pensionfund.sendKeys(value);	
	}
	public void enteraccountno21(String value) throws Exception{
		accountno21.clear();
		accountno21.sendKeys(value);	
	}
	public void enteraccountno22(String value) throws Exception{
		accountno22.clear();
		accountno22.sendKeys(value);	
	}
	public void clickPFGroupRateButton() throws Exception{
		pfratebutton.click();
	}
	public void clickDeletePFButton() throws Exception{
		PFDeletebutton.click();
		switchToPopUpAndAccept(driver);
	}
	
public String getMessagePaymonthEmpty() {
		
		return PFgroupPaymonth.getText();
	}
public String getMessageepf() {
	
	return epfavalidation.getText();
}
public String getMessagecutoff() {
	
	return cutoffvalidation.getText();
}
public String getMessagePensionfun() {
	
	return pensionfundvalidation.getText();
}

public String getMessageaccountno2() {
	
	return accountno2validation.getText();
}
public String getMessageaccountno21() {
	
	return accountno21validation.getText();
}
public String getMessageaccountno22() {
	
	return accountno22validation.getText();
}
	public String getMessage(){
		return successfullMessage.getText();
	}
	public String getMessage_Pfname(){
		return Pfgrounamevalidation.getText();
	}
	public String getMessage_Pfno(){
		return Pfnovalidation.getText();
	}
	public String getMessage_Pfaddress(){
		return Pfaddressvalidation.getText();
	}
	public String getMessage_Pfnamedublicate(){
		return dublicatepfname.getText();
	}
	public String getMessage_Pfnodublicate(){
		return dublicatepfno.getText();
	}
	public String getMessageverifyepfa_b() {
		return epfa_b.getAttribute("value");
	}
	
	
}


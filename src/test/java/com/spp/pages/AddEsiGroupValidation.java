package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class AddEsiGroupValidation extends BasePage {
	@FindBy(id="master")
	WebElement masterlink;
	@FindBy(xpath="//a[text()='Company Statutories']")
	WebElement companystatutorylink;
	@FindBy(xpath="//a[text()='ESI Group']")
	WebElement esilink;
	@FindBy(xpath="//a[text()='Add New ESI Group']")
	WebElement addesilink;
	@FindBy(id="esi_group_id")
	WebElement esiname;
	@FindBy(id="esi_group_esi_no")
	WebElement esinumber;
	@FindBy(id="esi_group_address")
	WebElement esiaddress;
	@FindBy(id="esi_group_esi_local_office")
	WebElement esioffice;
	@FindBy(xpath="//input[@value='Create ESI Group']")
	WebElement createesibutton;
	@FindBy(xpath="//span[contains(text(),'ESI Rate')]")
	WebElement esiratelink;
	@FindBy(id="esi_group_rate_paymonth_id")
	WebElement effdate;
	@FindBy(xpath="//*[@id=\"new_esi_group_rate\"]/div[2]/div[9]/input")
	WebElement createesirate;
	@FindBy(xpath="//strong[text()='ESI group rate successfully created.']")
	WebElement successfulmsg;
	@FindBy(id="esi_group_id-error")
	WebElement esigroupnamemsg;
	@FindBy(id="esi_group_esi_no-error")
	WebElement esigroupnomsg;
	@FindBy(id="esi_group_address-error")
	WebElement esigroupaddressmsg;
	@FindBy(id="esi_group_rate_employee_rate")
	WebElement employeerate;
	@FindBy(id="esi_group_rate_employer_rate")
	WebElement employerrate;
	@FindBy(id="esi_group_rate_cut_off")
	WebElement cutoff;
	@FindBy(id="esi_group_rate_round_off")
	WebElement rounoff;
	@FindBy(xpath="//td[text()='ESI_ATest']//following::td[3]//span[1]/a")
	WebElement editesigroup;
	@FindBy(xpath="//div[' alert alert-danger']/li[1]")
	WebElement dublicateesiname;
	@FindBy(id="esi_group_rate_paymonth_id-error")
	WebElement effectivefrommsg;
	@FindBy(id="esi_group_rate_employee_rate-error")
	WebElement employeeratemsg;
	@FindBy(id="esi_group_rate_employer_rate-error")
	WebElement employerratemsg;
	@FindBy(id="esi_group_rate_cut_off-error")
	WebElement cutoffmsg;
	@FindBy(id="esi_group_rate_round_off-error")
	WebElement roundoffmsg;
	@FindBy(xpath="//li[text()='Employee rate is not a number']")
	WebElement employeeratenotno;
	@FindBy(xpath="//li[text()='Employer rate is not a number']")
	WebElement employerratenotno;
	@FindBy(xpath="//li[text()='Cut off is not a number']")
	WebElement cutoofnotno;
	@FindBy(xpath="//td[text()='ESI_ATest']//following::td[3]//span[2]/a[1]")
	WebElement deleteesigroup;
	public AddEsiGroupValidation(WebDriver driver){
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void navigateMaster() throws Exception{
      	masterlink.click();
	}
	
	public void clickCompanayLink() throws Exception{
		companystatutorylink.click();
	}
	
	public void clickESILink() throws Exception{
		esilink.click();
	}
	
	public void clickAddressLink() throws Exception{
		addesilink.click();
	}
	
	public void enterESIName(String value) throws Exception{
	     esiname.sendKeys(value);
	}
	
	public void enterESINumber(String value) throws Exception{
		esinumber.sendKeys(value);
	}
	
	public void enterESIAddress(String value) throws Exception{
		esiaddress.sendKeys(value);
	}
	
	public void enterESIOffice(String value) throws Exception{
		esioffice.sendKeys(value);
	}
	
	public void clickCreateESI() throws Exception{
		createesibutton.click();
	}
	
	public void clickESIRateLink() throws Exception{
		esiratelink.click();
	}
	
	public void selectESIEffectiveDate(String value) throws Exception{
		dropDownSelect(effdate, value);
	}
	
	public void clickCreateESIRate() throws Exception{
		
		createesirate.click();
	}
	public void enteremployeerate(String value) throws Exception{
		employeerate.clear();
		employeerate.sendKeys(value);
	}
	public void enteremployerrate(String value) throws Exception{
		employerrate.clear();
		employerrate.sendKeys(value);
	}
	public void entercutoff(String value) throws Exception{
		cutoff.clear();
		cutoff.sendKeys(value);
	}
	public void enterroundoff(String value) throws Exception{
		dropDownSelect(rounoff, value);
	}
	public String getMessage(){
		return successfulmsg.getText();
	}
	public String getesigroupnameMessage(){
		return esigroupnamemsg.getText();
	}
	public String getesigroupnoMessage(){
		return esigroupnomsg.getText();
	}
	public String getesigroupaddressMessage(){
		return esigroupaddressmsg.getText();
	}
	public void editESIgroup() throws Exception{
		editesigroup.click();
	}
	public String getdublicateesiname(){
		return dublicateesiname.getText();
	}
	public String geteffectivedatemsg(){
		return effectivefrommsg.getText();
	}
	public String getempoyeeratemsg(){
		return employeeratemsg.getText();
	}
	public String getempoyeratemsg(){
		return employerratemsg.getText();
	}
	public String getcutoffmsg(){
		return cutoffmsg.getText();
	}
	public String getrounoffmsg(){
		return roundoffmsg.getText();
	}
	public String getempoyeeratenotnomsg(){
		return employeeratenotno.getText();
	}
	public String getempoyerratenotnomsg(){
		return employerratenotno.getText();
	}
	public String getcutoffnotnomsg(){
		return cutoofnotno.getText();
	}
	public void deleteESIgroup() throws Exception{
		deleteesigroup.click();
		switchToPopUpAndAccept(driver);

	}
}

package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class PTGroupValidation extends BasePage {

		@FindBy(id="master")
		WebElement masterlink;
		@FindBy(xpath="//a[text()='Company Statutories']")
		WebElement companystatutorylink;
		@FindBy(xpath="//a[text()='PT Group']")
		WebElement ptlink;
		@FindBy(xpath="//a[text()='Add New PT Group']")
		WebElement addptlink;
		@FindBy(id="pt_group_id")
		WebElement ptgroupname;
		@FindBy(id="pt_group_state_id")
		WebElement state;
		@FindBy(id="pt_group_address")
		WebElement ptaddress;
		@FindBy(id="pt_group_pto_circle_no")
		WebElement ptocirclenum;
		@FindBy(id="pt_group_certificate_no")
		WebElement certificatenum;
		@FindBy(id="pt_group_return_period")
		WebElement returnperiod;
		@FindBy(xpath="//input[@value='Create PT Group']")
		WebElement creatept;
		@FindBy(xpath="//span[contains(text(),'PT Rate')]")
		WebElement ptratelink;
		@FindBy(id="pt_group_rate_paymonth_id")
		WebElement effectivefrom;
		@FindBy(xpath="//input[@value='Create PT Group Rate']")
		WebElement createptgruoprate;
		@FindBy(xpath="//a[text()='Settings']")
		WebElement settingslink;
		@FindBy(xpath="//button[text()='Fill Default']")
		WebElement filldefaultbutton;
		@FindBy(xpath="//strong[text()='Default PT Slab Successfully Created.']")
		WebElement successfullMessage;
		@FindBy(id="pt_group_id-error")
		WebElement PTGroupmsg;
		@FindBy(id="pt_group_state_id-error")
		WebElement PTStatemsg;
		@FindBy(id="pt_group_address-error")
		WebElement PTaddressmsg; 
		@FindBy(id="pt_group_return_period-error")
		WebElement PTreturnperiodsmsg; 
		@FindBy(xpath="//div[@class=' alert alert-danger']//li")
		WebElement DublicatePTGroup;
		@FindBy(xpath="//td[text()='PT_Bangalore']//following::td[3]//span[1]//a[1]")
		WebElement EditPTgroup;
		@FindBy(xpath="//div[@class=' alert alert-danger']//li")
		WebElement DublicatePTEffectiveDate;
		@FindBy(id="pt_group_rate_paymonth_id-error")
		WebElement PTEffDatemsg; 
		@FindBy(xpath="//div[@class='bottom-space']//input[@name='commit']")
		WebElement CreatePTRate;
		@FindBy(xpath="//div[@class=' alert alert-danger']//li[1]")
		WebElement Minimumsalarymsg;
		@FindBy(xpath="//div[@class=' alert alert-danger']//li[3]")
		WebElement PTamountmsg;
		@FindBy(id="pt_rate_min_sal_range")
		WebElement MinimumSalary;
		@FindBy(id="pt_rate_pt")
		WebElement PtAmount;
		@FindBy(xpath="//div[@class=' alert alert-danger']//li[1]")
		WebElement Minimumsalarynotanomsg;
		@FindBy(xpath="//div[@class=' alert alert-danger']//li[2]")
		WebElement PTAmountnotanomsg;
		public PTGroupValidation(WebDriver driver){
			super(driver);
			PageFactory.initElements(driver, this);
		}
		
		public void navigateMaster() throws Exception{
		    masterlink.click();
		}
		
		public void clickCompanayLink() throws Exception{
			companystatutorylink.click();
		}
		
		public void clickPTLink() throws Exception{
			ptlink.click();
		}
		
		public void clickAddPTLink() throws Exception{
			addptlink.click();
		}
		
		public void enterPTGroupName(String value) throws Exception{
			ptgroupname.sendKeys(value);
		}
		
		public void selectState(String value) throws Exception{
			state.sendKeys(value);
		}
		
		public void enterPTAddress(String value) throws Exception{
			ptaddress.sendKeys(value);
		}
		
		public void enterPTOCircleNumber(String value) throws Exception{
			ptocirclenum.sendKeys(value);
		}
		
		public void enterPTCertificateNumber(String value) throws Exception{
			certificatenum.sendKeys(value);
		}
		
		public void selectReturnType(String value) throws Exception{
			returnperiod.sendKeys(value);
		}
		
		public void clickCreatePT() throws Exception{
			creatept.click();
		}
		
		public void clickPTRate() throws Exception{
			ptratelink.click();
		}
		
		public void selectEffectiveFrom(String value) throws Exception{
			effectivefrom.sendKeys(value);
		}
		
		public void clickPTGroupRateButton() throws Exception{
			createptgruoprate.click();
		}
		
		public void clickSettingsLink() throws Exception{
			settingslink.click();
		}
		
		public void clickFillDefaultButton() throws Exception{
			filldefaultbutton.click();
			switchToPopUpAndAccept(driver);
		}
		
		public void clickCreatePTRate() throws Exception{
			CreatePTRate.click();
		}
		public String getMessage(){
			return successfullMessage.getText();
		}
		public String getPTGroupMessage(){
			return PTGroupmsg.getText();
		}
		public String getPTAddressMessage(){
			return PTaddressmsg.getText();
		}
		
		public String getPTSateMessage(){
			return PTStatemsg.getText();
		}
		public String getPTreturnperiodMessage(){
			return PTreturnperiodsmsg.getText();
		}
		public String getPTGroupDublicateMessage(){
			return DublicatePTGroup.getText();
		}
		public void EditPTGroupButton() throws Exception{
			EditPTgroup.click();
		}	
		public String geteEffDateDublicateMessage(){
			return DublicatePTEffectiveDate.getText();
		}
		public String getPTEffDateMessage(){
			return PTEffDatemsg.getText();
		}
		
		public String getPTMinimumSalaryMessage(){
			return Minimumsalarymsg.getText();
		}
		public String getPTAmountMessage(){
			return PTamountmsg.getText();
		}
		public void enterMinimumSalary(String value) throws Exception{
			MinimumSalary.sendKeys(value);
		}
		public void enterPTAmount(String value) throws Exception{
			PtAmount.sendKeys(value);
		}
		
		public String getMinSalaryNotaNoMessage(){
			return Minimumsalarynotanomsg.getText();
		}
		public String getPTNotaNoMessage(){
			return PTAmountnotanomsg.getText();
		}
}

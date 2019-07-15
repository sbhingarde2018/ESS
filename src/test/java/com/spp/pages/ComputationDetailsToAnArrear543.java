package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.spp.common.BasePage;


public class ComputationDetailsToAnArrear543 extends BasePage {
	@FindBy(id="salary") 
	WebElement SalaryLink;
	@FindBy(xpath="//*[@id=\"menu\"]/li[6]/div/div[1]/ul/li[3]/a")
	WebElement Arrears;
	@FindBy(xpath="//table/tbody/tr/td[contains(text(),'Salary_ArrearSal5')]/parent::tr/td[4]/a")
	WebElement computation;
	@FindBy(linkText="Add Employees")
	WebElement AddEmployee;
	@FindBy(xpath="//*[@id=\"bf_form\"]/div[10]/button[1]")
	WebElement Load;
	@FindBy(xpath="//*[@id=\"show_message\"]/div/strong")
	WebElement SuccessfullMessage;
	@FindBy(xpath="//*[@id=\"arrear_add_emp\"]/thead/tr/th[1]/input")
	WebElement SelectAll;
	@FindBy(xpath="//*[@id=\"arrear_add_emp\"]/tbody/tr[1]/td[1]")
	WebElement Employee;
	@FindBy(id="save_employee_arrear")
	WebElement Save;
	@FindBy(xpath="//tbody/tr[1]/td[7]/a")
	WebElement More;
    @FindBy(xpath="//*[@id=\"main\"]/div[3]/fieldset/table/tbody/tr[2]/td[1]/input")
    WebElement Basic;
	@FindBy(xpath="//*[@id=\"main\"]/div[3]/fieldset/table/tbody/tr[3]/td[2]/table/tbody/tr[1]/td/table/tbody/tr[2]/td[1]/input")
	WebElement Leave;
	@FindBy(xpath="//*[@id=\"main\"]/div[3]/fieldset/table/tbody/tr[3]/td/span")
	WebElement Update;
	@FindBy(xpath="//*[@id=\"main\"]/section/p/a[2]")
	WebElement NewArrear;
	@FindBy(xpath="//tbody/tr[1]/td[6]/a")
	WebElement Delete;
		
		
	public ComputationDetailsToAnArrear543(WebDriver driver) {
			super(driver);
			PageFactory.initElements(driver,this);
		}
		
		public void clickSalaryLink(){
			SalaryLink.click();
		}
		
		public void selectArrears(){
			Arrears.click();
		}
		public void selectComputation(){
			computation.click();
		}
		public void SelectAddEmployee(){
			AddEmployee.click();
		}
		
		public void ClickLoad(){
			Load.click();
		}
		public String getMessage1(){
			return SuccessfullMessage.getText();
		}
		public void ClickSelectAll(){
			SelectAll.click();
		}
		
		public void ClickEmployee(){
			Employee.click();
		}
		public void ClickSave(){
			Save.click();
		}
		public void ClickMore(){
			More.click();
		}
		public void selectBasic(String value){
			Basic.clear();
			Basic.sendKeys(value);
		}
		public void selectLeave(String value){
			Leave.clear();
			Leave.sendKeys(value);
		}
		public void ClickUpdate(){
			Update.click();
		}
		public void ClickNewArrear(){
			NewArrear.click();
		}
		public void ClickDelete(){
			Delete.click();
			switchToPopUpAndAccept(driver);
		}
}


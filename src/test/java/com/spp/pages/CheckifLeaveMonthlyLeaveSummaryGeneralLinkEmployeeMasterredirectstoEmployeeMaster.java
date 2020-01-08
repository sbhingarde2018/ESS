package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class CheckifLeaveMonthlyLeaveSummaryGeneralLinkEmployeeMasterredirectstoEmployeeMaster extends BasePage{
	
	@FindBy(xpath="//a[@id='report']")
	WebElement Report;
	@FindBy(xpath="//a[contains(text(),'Monthly Leave Summary')]")
	WebElement ClickOnMonthlyLeaveSummary;
	@FindBy(xpath="//*[@id=\"ui-accordion-accordion-header-1\"]/h3")
	WebElement ClickOnGeneralLinks;
	@FindBy(xpath="//ul[@id='ui-id-2']//a[contains(text(),'Employee Master')]")
	WebElement ClickOnEmployeeMaster;
	@FindBy(xpath="//a[contains(text(),'Add New Employee')]")
	WebElement AddNewEmployee;
	@FindBy(id="employee_emp_id")
	WebElement employeeid;
	@FindBy(id="employee_refno")
	WebElement employeeref;
	@FindBy(id="employee_empname")
	WebElement employeename;
	@FindBy(id="employee_father_name")
	WebElement employeefather;
	@FindBy(id="dob")
	WebElement DateofBirth;
	@FindBy(id="employee_gender")
	WebElement Gender;
	@FindBy(id="marital_status")
	WebElement MaritalStatus;
	@FindBy(id="doj")
	WebElement DateofJoining;
	@FindBy(xpath="//*[@id=\"create_employee_form\"]/div[2]/div/nav/ul/li[1]/a")
	WebElement PresentAddress;
	@FindBy(id="employee_present_state_id")
	WebElement State;
	@FindBy(xpath="//*[@id=\"create_employee_form\"]/div[2]/div/nav/ul/li[7]/a/span")
	WebElement SelectClassficationDetail;
	@FindBy(id="employee_detail_salary_group_id")
	WebElement SelectSalaryGroup;
	@FindBy(id="employee_detail_branch_id")
	WebElement SelectBranch;
	@FindBy(id="employee_detail_attendance_configuration_id")
	WebElement SelectAttendanceConfigId;
	@FindBy(id="employee_detail_leave_policy_master_id")
	WebElement SelectLeavyPolicyId;
	@FindBy(id="employee_detail_financial_institution_id")
	WebElement SelectFinanacialInstitution;
	@FindBy(id="employee_detail_classification_1")
	WebElement SelectDesignation;
	@FindBy(xpath="//*[@id=\"create_employee_form\"]/div[2]/div/div/div[8]/input")
	WebElement CreateEmployee;
	@FindBy(xpath="//*[@id=\"main\"]/div[2]/strong")
	WebElement successfullmessage;
	@FindBy(xpath="//a[@id='emp_detail']")
	WebElement EmpMod;
	@FindBy(xpath="//a[contains(text(),'Employee Details')]")
	WebElement Empdetails;
	@FindBy(id="filter_head")
	WebElement Filter;
	@FindBy(xpath="//*[@id=\"bf_form\"]/div/button[contains(text(),'LOAD')]")
	WebElement Load;
	@FindBy(xpath="//td[contains(text(),'Arihant')]/parent::tr/td[6]/a[2]")
	WebElement Delete;
	@FindBy(xpath="//div[@id='employees_dtable_filter']//input")
	WebElement Search;
	
	public CheckifLeaveMonthlyLeaveSummaryGeneralLinkEmployeeMasterredirectstoEmployeeMaster(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);	
	}
	public void clickonReport() {
		Report.click();
	}
	public void clickonmonthlyleavesummary() {
		ClickOnMonthlyLeaveSummary.click();
	}
	public void clickongenerallinks() {
		ClickOnGeneralLinks.click();
	}
	public void clickonemployeemaster() {
		ClickOnEmployeeMaster.click();
	}
	public void addnewemployee() {
		AddNewEmployee.click();
	}
	public void enterEmployeeid(String value) throws Exception{
	    	employeeid.sendKeys(value);
	}
	public void enterSearch(String value) throws Exception{
		Search.sendKeys(value);
	}  
	public void enterEmployeeref(String value) throws Exception{
	    	employeeref.sendKeys(value);
	} 
	public void enterEmployeename(String value) throws Exception {
	    	employeename.sendKeys(value);
	}
    public void enterEmployeefather(String value) throws Exception{
	    	employeefather.sendKeys(value);
	}
    public void selectDateofBirth(String value) throws Exception {
	    	DateofBirth.sendKeys(value);
	}
	public void selectGender(String value){
			dropDownSelect(Gender, value);
	}
	public void selectMaritalStatus(String value){
			dropDownSelect(MaritalStatus, value);
	}
	public void selectDateofJoining(String value) throws Exception {
			DateofJoining.sendKeys(value);
	}	
	public void clickPresentAddress(){
			PresentAddress.click();
	}
	public void selectState(String value){
			dropDownSelect(State, value);
	}		
	public void selectclassificationdetail(){
    	SelectClassficationDetail.click();
    }
    public void selectsalstructure(String value) {
    	dropDownSelect(SelectSalaryGroup, value);
    }
    public void selectbranch(String value) {
    	dropDownSelect(SelectBranch, value);
    }
    public void selectattendancestructure(String value) {
    	dropDownSelect(SelectAttendanceConfigId, value);
    }
    public void selectbank(String value) {
    	dropDownSelect(SelectFinanacialInstitution, value);
    }
    public void selectleavepolicy(String value) {
    	dropDownSelect(SelectLeavyPolicyId, value);
    }
    public void selectdesignation(String value) {
    	dropDownSelect(SelectDesignation, value);
    }
    public void createemployee() {
    	CreateEmployee.click();
    }
    public String getMessage(){
		return successfullmessage.getText();
	}
    public void ClickEmpMod() {
    	EmpMod.click();
    }
    public void ClickEmpdetails() {
    	Empdetails.click();
    }
    public void ClickFilter() {
    	Filter.click();
    }
    public void ClickLoad() {
    	Load.click();
    }
    public void ClickDelete() throws Exception {
    	Delete.click();
    	Thread.sleep(2000);
    	switchToPopUpAndAccept(driver);
    }
}

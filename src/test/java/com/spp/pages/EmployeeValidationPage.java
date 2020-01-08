package com.spp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spp.common.BasePage;

public class EmployeeValidationPage extends BasePage{
	
	@FindBy(id="emp_detail")
	WebElement Employee;
	@FindBy(xpath="//*[@id=\"menu\"]/li[4]/div/div/ul/li[1]/a")
	WebElement EmployeeDetails;
	@FindBy(xpath="//*[@id=\"ui-id-2\"]/ul/li[1]/a")
	WebElement AddNewEmployee;
	@FindBy(xpath="//*[@id=\"create_employee_form\"]/div[2]/div/div/div[8]/input")
	WebElement CreateEmployee;
	
	@FindBy(id="employee_empname-error")
	WebElement Employeenameblank;
	@FindBy(id="employee_refno-error")
	WebElement Employeerefnoblank;
	@FindBy(id="employee_gender-error")
	WebElement Employeegenderblank;
	@FindBy(id="doj-error")
	WebElement Employeedojblank;
	@FindBy(id="sal_date-error")
	WebElement Employeesaldateblank;
	@FindBy(id="employee_present_state_id-error")
	WebElement Employeestateblank;
	@FindBy(id="employee_detail_salary_group_id-error")
	WebElement SalaryStructureblank;
	@FindBy(id="employee_detail_branch_id-error")
	WebElement Branchblank;
	@FindBy(id="employee_detail_attendance_configuration_id-error")
	WebElement AttendanceConfigurationblank;
	@FindBy(id="employee_detail_financial_institution_id-error")
	WebElement Bankblank;
	@FindBy(id="employee_detail_leave_policy_master_id-error")
	WebElement LeavePolicyblank;

	@FindBy(xpath="//*[@id=\"create_employee_form\"]/div[2]/div/nav/ul/li[7]/a/span")
	WebElement SelectClassficationDetail;
	
	public EmployeeValidationPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements( driver, this);

		// TODO Auto-generated constructor stub
	}

	public void navigateEmployee() throws Exception{
		Employee.click();
	}
	public void clickEmployeeDetails() throws Exception{
		EmployeeDetails.click();
	}
	public void clickAddNewEmployee() throws Exception{
		AddNewEmployee.click();
	}
	public void createemployee() {
	    CreateEmployee.click();
	}
	public String getMessageEmployeeNameBlank(){
	    return Employeenameblank.getText();
	}
	public String getMessageEmployeeNoBlank(){
	    return Employeerefnoblank.getText();
	}
	
	public String getMessageEmployeeGenderBlank(){
	    return Employeegenderblank.getText();
	}
	public String getMessageEmployeeDOJBlank(){
	    return Employeedojblank.getText();
	}
	public String getMessageEmployeeSalDateBlank(){
	    return Employeesaldateblank.getText();
	}
	public String getMessageEmployeeStateBlank(){
	    return Employeestateblank.getText();
	}
	
	
	public void selectclassificationdetail(){
	    SelectClassficationDetail.click();
	}
	public String getMessageSalaryStructureblank(){
	    return SalaryStructureblank.getText();
	}
	public String getMessageBranchblank(){
	    return Branchblank.getText();
	}
	public String getMessageAttendanceConfigurationblank(){
	    return AttendanceConfigurationblank.getText();
	}
	public String getMessageBankdetailsblankblank(){
	    return Bankblank.getText();
	}
	public String getMessageLeavePolicyblank(){
	    return LeavePolicyblank.getText();
	}
	
}
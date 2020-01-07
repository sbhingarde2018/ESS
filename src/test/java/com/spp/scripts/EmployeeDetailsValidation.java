package com.spp.scripts;



import org.testng.Assert;
import org.testng.annotations.Test;
import com.spp.common.BaseTest;

import com.spp.pages.EmployeeValidationPage;



public class EmployeeDetailsValidation extends BaseTest{
	
	@Test(priority=0)
	public void CreationofEmployeeValidation_SC_1986() throws Exception{
		EmployeeValidationPage at=new EmployeeValidationPage(driver);
		Thread.sleep(1000);
		at.navigateEmployee();
		at.clickEmployeeDetails();
		at.clickAddNewEmployee();
		Thread.sleep(1000);
		at.createemployee();
		String s=at.getMessageEmployeeNameBlank();
		Assert.assertEquals(s, "Employee Name can't be blank");
		
		String s1=at.getMessageEmployeeNoBlank();
		Assert.assertEquals(s1, "Ref. No. can't be blank");
		String s2=at.getMessageEmployeeGenderBlank();
		Assert.assertEquals(s2, "Please select gender");
		String s3=at.getMessageEmployeeDOJBlank();
		Assert.assertEquals(s3, "Date of Joining can't be blank");
		String s4=at.getMessageEmployeeSalDateBlank();
		Assert.assertEquals(s4, "Date of Salary can't be blank");
		String s5=at.getMessageEmployeeStateBlank();
		Assert.assertEquals(s5, "Please select State");
		
		at.selectclassificationdetail();
		at.createemployee();
		String s6=at.getMessageSalaryStructureblank();
		Assert.assertEquals(s6, "This field is required.");
		String s7=at.getMessageBranchblank();
		Assert.assertEquals(s7, "This field is required.");
		String s8=at.getMessageAttendanceConfigurationblank();
		Assert.assertEquals(s8, "This field is required.");
		String s9=at.getMessageBankdetailsblankblank();
		Assert.assertEquals(s9, "This field is required.");
		String s10=at.getMessageLeavePolicyblank();
		Assert.assertEquals(s10, "This field is required.");
	}
	
	
}
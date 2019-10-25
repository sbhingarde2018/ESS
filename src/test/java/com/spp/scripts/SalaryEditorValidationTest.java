package com.spp.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.spp.common.BaseTest;
import com.spp.pages.SalaryEditorValidation;

public class SalaryEditorValidationTest extends BaseTest {
	@Test
	public void Salary_Editor_Validation_SC_1810() throws InterruptedException{
		SalaryEditorValidation sl = new SalaryEditorValidation(driver);
		sl.selectSalary();
		sl.selectSalaryEditor();
		sl.selectGetValues();
		String s = sl.getPaymonthValidationMessage();
		Assert.assertEquals(s, "Paymonth was not selected");
		
		Thread.sleep(2000);
		sl.selectSalary();
		sl.selectSalaryEditor();
		sl.selectPayMonth("Mar/2019");
		sl.selectGetValues();
		String s1 = sl.getSalaryStructureValidationMessage();
		Assert.assertEquals(s1, "Salary Structure was not selected");
		
		Thread.sleep(2000);
		sl.selectSalary();
		sl.selectSalaryEditor();
		sl.selectPayMonth("Mar/2019");
		sl.selectSalaryStructure("Structure_Bangalore_ON_Gross");
		sl.selectGetValues();
		sl.resizeWindow();
		Thread.sleep(2000);
		sl.selectLoad();
		String s2 = sl.getNoEmployeeMessage();
		Assert.assertEquals(s2, "No Employees Found.");
		
		Thread.sleep(2000);
		sl.selectSalary();
		sl.selectSalaryEditor();
		sl.selectPayMonth("Aug/2019");
		sl.selectSalaryStructure("Structure_Bangalore_ON_Gross");
		sl.selectGetValues();
		sl.resizeWindow();
		Thread.sleep(2000);
		sl.selectLoad();
		Thread.sleep(2000);
		String s3 = sl.getSucessfulMessage();
		Assert.assertEquals(s3, "Employees Added Successfully.");
		sl.deSelectCheckBox();
		sl.clickOnProcess();
		String s4=sl.getPleaseSelectEmpMassage();
		Assert.assertEquals(s4, "Please select employees to process salary");
		
		sl.selectSalary();
		sl.selectSalaryEditor();
		sl.selectPayMonth("Aug/2019");
		sl.selectSalaryStructure("Structure_Bangalore_ON_Gross");
		sl.selectGetValues();
		sl.resizeWindow();
		Thread.sleep(2000);
		sl.selectLoad();
		Thread.sleep(2000);
		String s5 = sl.getSucessfulMessage();
		Assert.assertEquals(s5, "Employees Added Successfully.");
		sl.clickOnProcess();
//		String s6 = sl.getSalaryProcessSucessfulMessage();
//		Assert.assertEquals(s6, "Please select employees to process salary");
		
	}

}

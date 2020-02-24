package com.spp.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.spp.common.BaseTest;
import com.spp.pages.AdvanceDetailsValidation;

public class AdvanceDetailsValidationTest  extends BaseTest {
	
	@Test(priority=0)
	public void AdvanceDetailsValidationn_sc_1996() throws Exception{
		
		AdvanceDetailsValidation AD = new AdvanceDetailsValidation(driver);
		
		AD.navigateSalary();
	
		AD.clickonAdnanceDeails();
	
		AD.clickOnAddNewEmployees();
		
		AD.clickOnLoad();

		AD.clickOnView();
		
		AD.clickOnAddNewAdvanceDetails();
		
		AD.CreateAdvance();
		
		String s1 = AD.getAdvanceNameValidationMessage();
		
		Assert.assertEquals(s1, "Please select Advance Name");
		
		String s2 = AD.getAdvanceDateValidationMessage();
		
		Assert.assertEquals(s2, "Please enter Advance Date");
		String s3 = AD.getAmountValidationMessage();
		
		Assert.assertEquals(s3, "Please enter Amount");
		String s4 = AD.getInstallmentAmountValidationMessage();

		Assert.assertEquals(s4, "Please enter Installment Amount");
		String s5 = AD.getRecoverFromValidationMessage();
		
		Assert.assertEquals(s5, "Please select Recover From");
		
		Thread.sleep(5000);
	
	}
	}






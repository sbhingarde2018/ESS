package com.spp.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.spp.common.BaseTest;
import com.spp.pages.AdvanceDetailsValidation;

public class AdvanceDetailsValidationn extends BaseTest{
	@Test(priority=0)
	public void AdvanceDetailsValidationn_sc_1996() throws Exception{
		
		AdvanceDetailsValidation AD = new AdvanceDetailsValidation(driver);
		
		AD.navigateSalary();
		Thread.sleep(1000);
		AD.clickonAdnanceDeails();
		Thread.sleep(1000);
		AD.clickOnAddNewEmployees();
		Thread.sleep(2000);
		AD.clickOnLoad();
		Thread.sleep(1000);
		AD.clickOnView();
		Thread.sleep(1000);
		AD.clickOnAddNewAdvanceDetails();
		Thread.sleep(1000);
		AD.CreateAdvance();
		Thread.sleep(1000);
		String s1 = AD.getAdvanceNameValidationMessage();
		Thread.sleep(1000);
		Assert.assertEquals(s1, "Please select Advance Name");
		Thread.sleep(1000);
		String s2 = AD.getAdvanceDateValidationMessage();
		Thread.sleep(1000);
		Assert.assertEquals(s2, "Please enter Advance Date");
		String s3 = AD.getAmountValidationMessage();
		Thread.sleep(1000);
		Assert.assertEquals(s3, "Please enter Amount");
		String s4 = AD.getInstallmentAmountValidationMessage();
		Thread.sleep(1000);
		Assert.assertEquals(s4, "Please enter Installment Amount");
		String s5 = AD.getRecoverFromValidationMessage();
		Thread.sleep(1000);
		Assert.assertEquals(s5, "Please select Recover From");
		
		Thread.sleep(5000);
		
		
		
		
		
		
		
	}
	}



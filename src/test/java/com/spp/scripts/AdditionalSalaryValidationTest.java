package com.spp.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.spp.common.BaseTest;
import com.spp.pages.AdditionalSalaryValidation;

public class AdditionalSalaryValidationTest extends BaseTest{
	@Test(priority=0)
	public void AdditionalSalaryValidation_SC_1837() throws InterruptedException{
		AdditionalSalaryValidation cc=new AdditionalSalaryValidation(driver);
		cc.clickSalaryLink();
		cc.selectAdditionalSalary();
		Thread.sleep(2000);
		cc.clickAddNewSalaryHeading();
		cc.clickCreateButton();
		String s=cc.getValidationMessage();
		Assert.assertEquals(s, "Additional Heading Name can't be blank");
		
		Thread.sleep(5000);
		
		cc.clickSalaryLink();
		cc.selectAdditionalSalary();
		Thread.sleep(2000);
		cc.clickAddNewSalaryHeading();
		cc.ClickPayMonths("Jun/2019");
		cc.SelectSalaryType("Special Earning");
		cc.enterAdditionalHeadingName("Special_Earning_Bangalore");
		cc.clickCreateButton();
		String s1=cc.getSucessfulMessage();
		Assert.assertEquals(s1, "Additional salary head successfully created");
		
		Thread.sleep(5000);
		
		cc.clickSalaryLink();
		cc.selectAdditionalSalary();
		Thread.sleep(2000);
		cc.clickAddNewSalaryHeading();
		cc.ClickPayMonths("Jun/2019");
		cc.SelectSalaryType("Special Earning");
		cc.enterAdditionalHeadingName("Special_Earning_Bangalore");
		cc.clickCreateButton();
		String s2=cc.getErrorMessage();
		Assert.assertEquals(s2, "Heading name has already been taken");
	}

}

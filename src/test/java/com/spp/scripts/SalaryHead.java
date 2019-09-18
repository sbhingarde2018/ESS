package com.spp.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.spp.common.BaseTest;
import com.spp.pages.SalaryHeadValidation;

public class SalaryHead extends BaseTest {
	@Test(priority=0)
	public void SalaryHeadValidation_sc_1739() throws Exception{
		SalaryHeadValidation sh=new SalaryHeadValidation(driver);
		Thread.sleep(5000);
		sh.navigateMaster();
		sh.clickSalaryHeadsLink();
		sh.clickAddSalaryHeadsLink();
		sh.enterSalaryHeadName("");
		sh.enterSalaryHeadShortName("");
		sh.clickOpenComponentRadioButton();
		sh.clickCalcultaiveFieldRadioButton();
		sh.clickConsiderForGratuity();
		sh.clickConsiderForLeaveEncahment();
		sh.clickCreateSalaryHeadButton();
		String s1=sh.getHeadNameMessage();
		String s2=sh.getShortNameMessage();
		Assert.assertEquals(s1,"Salary Head Name can't be blank");
		Assert.assertEquals(s2,"Short Name can't be blank");
		Thread.sleep(5000);
		sh.navigateMaster();
		sh.clickSalaryHeadsLink();
		sh.clickAddSalaryHeadsLink();
		sh.enterSalaryHeadName("Head");
		sh.enterSalaryHeadShortName("h1");
		sh.clickOpenComponentRadioButton();
		sh.clickCalcultaiveFieldRadioButton();
		sh.clickConsiderForGratuity();
		sh.clickConsiderForLeaveEncahment();
		sh.clickCreateSalaryHeadButton();
		String s3=sh.getHeadNameErrorMessage();
		System.out.println(s3);
		Assert.assertEquals(s3,"2 errors prohibited this form from being saved:");
	}
}

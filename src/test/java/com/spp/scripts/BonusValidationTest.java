package com.spp.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.spp.common.BaseTest;
import com.spp.pages.BonusValidation;

public class BonusValidationTest extends BaseTest{
	@Test
	public void BonusValidation_SC_1848() throws Exception{
		BonusValidation bv=new BonusValidation(driver);
		bv.clickSalary();
		bv.selectBonus();
		bv.clickAddNewBonus();
		bv.clickCreateBonus();
		String s=bv.getValidationMessage();
		Assert.assertEquals(s, "Bonus Head can't be blank");
		
		Thread.sleep(5000);
		
		bv.clickSalary();
		bv.selectBonus();
		bv.clickAddNewBonus();
		bv.EnterBonusHead("Diwali");
		bv.EnterMaxBonus("5000");
		bv.SelectFormula("Bonus");
		bv.SelectFromMonth("Aug/2019");
		bv.SelectToMonth("Aug/2019");
		bv.SelectPaymonth("Aug/2019");
		bv.checksalarydependent();
		bv.checknearestrupee();
		bv.clickCreateBonus();
		String s1=bv.getSucessfulMessage();
		Assert.assertEquals(s1, "Bonus successfully created");
		
		Thread.sleep(5000);
		
		bv.clickSalary();
		bv.selectBonus();
		bv.clickAddNewBonus();
		bv.EnterBonusHead("Diwali");
		bv.EnterMaxBonus("5000");
		bv.SelectFormula("Bonus");
		bv.SelectFromMonth("Aug/2019");
		bv.SelectToMonth("Aug/2019");
		bv.SelectPaymonth("Aug/2019");
		bv.checksalarydependent();
		bv.checknearestrupee();
		bv.clickCreateBonus();
		String s2=bv.getErrorButton();
		Assert.assertEquals(s2, "Heading name has already been taken");
		


	}

}

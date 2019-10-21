package com.spp.scripts;

import org.testng.annotations.Test;

import com.spp.common.BaseTest;
import com.spp.pages.ExGratiaValidation;

import junit.framework.Assert;

public class ExGratiaValidationTest extends BaseTest {
	@Test
	public void Ex_Gratia_Validation_SC_1801() throws Exception{
		ExGratiaValidation cc=new ExGratiaValidation(driver);
		cc.Clicksalary();
		cc.ClickExGratia();
		cc.ClickAddnewexgratia();
		cc.ClickCreateExGratiaBtn();
		String s=cc.getValidationMessage();
		Assert.assertEquals(s, "Ex-Gratia Head can't be blank");
		
		cc.Clicksalary();
		cc.ClickExGratia();
		cc.ClickAddnewexgratia();
		cc.EnterExgratiahead("Gratia_Test");
		cc.SelectFormula("Bonus");
		cc.SelectFromMonth("Jun/2019");
		cc.SelectToMonth("Jul/2019");
		cc.SelectPayMonth("Jul/2019");
		cc.ClickCreateExGratiaBtn();
		String s1=cc.getSuccessMessage();
		Assert.assertEquals(s1, "Ex-Gratia successfully created");
		
		cc.Clicksalary();
		cc.ClickExGratia();
		cc.ClickAddnewexgratia();
		cc.EnterExgratiahead("Gratia_Test");
		cc.SelectFormula("Bonus");
		cc.SelectFromMonth("Jun/2019");
		cc.SelectToMonth("Jul/2019");
		cc.SelectPayMonth("Jul/2019");
		cc.ClickCreateExGratiaBtn();
		String s2=cc.getErrorMessage();
		Assert.assertEquals(s2, "Heading name has already been taken");
		}

}

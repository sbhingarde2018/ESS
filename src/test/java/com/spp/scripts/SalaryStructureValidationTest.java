package com.spp.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.spp.common.BaseTest;
import com.spp.pages.SalaryStructureValidation;

public class SalaryStructureValidationTest extends BaseTest {
	
	@Test
	public void SalaryStructureValidation_sc_1791() throws Exception {
		SalaryStructureValidation ss = new SalaryStructureValidation(driver);
		
 		ss.navigateMaster();
 		ss.clickSalaryStructureLink();
 		ss.clickAddSalaryStructureLink();	
 		ss.enterSalaryStructureName("");
 		ss.clickBasedOnGross();
 		ss.clickCreateButton();
 		String s=ss.getValidationMessage();
 		Assert.assertEquals(s, "Salary Structure can't be blank");
		
 		ss.navigateMaster();
 		ss.clickSalaryStructureLink();
 		ss.clickAddSalaryStructureLink();	
 		ss.enterSalaryStructureName("Strecture");
 		ss.clickBasedOnGross();
 		ss.clickCreateButton();
 		String s1=ss.getMessage();
 		Assert.assertEquals(s1, "Salary group successfully created");
 		
 		ss.navigateMaster();
 		ss.clickSalaryStructureLink();
 		ss.clickAddSalaryStructureLink();	
 		ss.enterSalaryStructureName("Strecture");
 		ss.clickBasedOnGross();
 		ss.clickCreateButton();
 		String s2=ss.getErrorMessage();
 		Assert.assertEquals(s2, "Salary group name has already been taken");
	}

}

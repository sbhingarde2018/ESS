package com.spp.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.spp.common.BaseTest;
import com.spp.pages.AddFinancialInstitutions;
import com.spp.pages.AssignFinancialInstitutionandTryToDelete;
import com.spp.pages.CreateFinancialInstitutionwithIFSCCode;
import com.spp.pages.FinancialInstitutionsPage;
import com.spp.pages.GetFinancialListAccordingToAllFinancialInstituions;
import com.spp.pages.GetListAccordingToInsurance;
import com.spp.pages.GetListAccordingToLoan;



public class FinancialInstitutionBankValidation extends BaseTest{
	@Test(priority=0)
	public void FinancialInstitutionsValidation_SC_1871() throws Exception{
		FinancialInstitutionsPage a=new FinancialInstitutionsPage(driver);
		a.clickMastserLink();
		a.selectFinancialInstitution();
		a.clickAddFinancialInst();
		a.clickCreateButton();
		String s=a.getAccountTypeMessage();
		Assert.assertEquals(s, "Select Account Type");
		String s1=a.getInstNameMessage();
		Assert.assertEquals(s1, "Name can't be blank");
		String s2=a.getBranchCodeMessage();
		Assert.assertEquals(s2, "Branch/MICR Code can't be blank");
		String s3=a.getAddressMessage();
		Assert.assertEquals(s3, "Address can't be blank");
		Thread.sleep(1000);
		a.selectAccoutType("Salary Account");
		a.enterInstName("BOI Bank_Bangalore");
		a.enterBranchCode("22324");
		a.enterAddress("Chennai");
		a.clickCreateButton();
		a.clickMastserLink();
		a.selectFinancialInstitution();
		a.clickAddFinancialInst();
		a.clickCreateButton();
		a.clickCreateButton();
		a.selectAccoutType("Salary Account");
		a.enterInstName("BOI Bank_Bangalore");
		a.enterBranchCode("22324");
		a.enterAddress("Chennai");
		a.clickCreateButton();
		String s4=a.getDublicateInstNameMessage();
		Assert.assertEquals(s4, "Name can't be same");
		
	}
	
	
	
	
	
}

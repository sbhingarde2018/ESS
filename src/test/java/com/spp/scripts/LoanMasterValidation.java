package com.spp.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.spp.common.BaseTest;
import com.spp.pages.LoanMasterValidationn;

public class LoanMasterValidation extends BaseTest {
	
	@Test(priority=0)
	public void LoanMasterValidation_sc_1761() throws Exception{
		
		LoanMasterValidationn LM = new LoanMasterValidationn(driver);
		LM.navigateMaster();
		LM.clickOnLoanMaster();
		LM.clickOnAddNewLoanMaster();
		LM.enterLoanMasterName("");
		LM.selectCheckBox();
		LM.enterIntrestRate("");
		LM.enterMaxAmount("");
		LM.enterEmiRecove("");
		LM.clickOnCreateLoan();
		String s1 = LM.getLoanNameErorMessage();
		Assert.assertEquals(s1, "Loan Name can't be blank");
		
		Thread.sleep(5000);
		
		LM.navigateMaster();
		LM.clickOnLoanMaster();
		LM.clickOnAddNewLoanMaster();
		LM.enterLoanMasterName("bike loan");
		LM.selectCheckBox();
		LM.enterIntrestRate("15");
		LM.enterMaxAmount("25000");
		LM.enterEmiRecove("10");
		LM.clickOnCreateLoan();
		Thread.sleep(2000);
		String s2 = LM.getLoanMasterErorMessage();
		Assert.assertEquals(s2, "Loan name already have taken");
	
		Thread.sleep(5000);
		
		LM.navigateMaster();
		LM.clickOnLoanMaster();
		LM.clickOnAddNewLoanMaster();
		LM.enterLoanMasterName("House Loan");
		LM.selectCheckBox();
		LM.enterIntrestRate("15");
		LM.enterMaxAmount("25000");
		LM.enterEmiRecove("10");
		LM.clickOnCreateLoan();
		String s3 = LM.getSuccessMessageMessage();
		Thread.sleep(2000);
		Assert.assertEquals(s3, "Loan successfully created");
	
		
	}

}

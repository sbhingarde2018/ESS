package com.spp.scripts;

import org.testng.annotations.Test;

import com.spp.common.BaseTest;
import com.spp.generics.Utility;
import com.spp.pages.BulkReimbursementClaim;
import com.spp.pages.BulkReimbursementClaimDelete;
import com.spp.pages.CheckReimbursementAllotmentRedirectsToEmployee;
import com.spp.pages.CheckReimbursementClaimRedirectsToMasterModule;
import com.spp.pages.CheckReimbursementClaimRedirectsToReportModule;
import com.spp.pages.CreateLTAOpeningBalance;
import com.spp.pages.CreateReimbursementAllotment;
import com.spp.pages.CreateReimbursementClaim;
import com.spp.pages.CreateReimbursementClaimPaymentModeCash;
import com.spp.pages.CreateReimbursementClaimPaymentModeCheque;
import com.spp.pages.CreateReimbursementClaimPaymentModeDD;
import com.spp.pages.DeleteReimbursementClaim;
import com.spp.pages.EditReimbursementClaim;
import com.spp.pages.GetBulkReimbursementErrorLog;
import com.spp.pages.GetBulkReimbursementErrorLogExcel;

import junit.framework.Assert;

public class ReimbursementClaim extends BaseTest{
	
	 /*@Test(priority=0)
		public void CreateReimbursementAllotment_SC_289() throws Exception{
		 CreateReimbursementAllotment rt = new CreateReimbursementAllotment(driver);
		 rt.clickMastserLink();
			rt.clickReimbursementMaster();
			rt.clickAddReimbursementMaster();
			rt.selectReimbursementType("Other Reimbursement");
			rt.selectModeOfPayment("Paid in Salary");
			rt.selectLumpsumType();
			Thread.sleep(5000);
			rt.enterReimbursementName("ReimbursementMaster");
			Thread.sleep(3000);
			rt.clickCreateReimbursementMaster();
			Thread.sleep(5000);
			rt.selectEmployee();
			rt.selectReimbursementAllotment();
			rt.selectNewReimbursement();
			rt.selectAddEmployee();
			rt.selectAllotButton();
			rt.selectName("ReimbursementMaster (Other Reimbursement)");
			Thread.sleep(2000);
			rt.selectFinancialYear("2013/2014");
			rt.selectAllotmentDate("15 April 2013");
			rt.ClickOnFunctionKey();
			Thread.sleep(5000);
			rt.EnterSumAmount("3000");
			Thread.sleep(5000);
			rt.selectCreateReimbursementButton();
			String e=rt.getMessage();
			Assert.assertEquals(e, "Reimbursement Allotment was successfully created");
		}	
			
	@Test(priority=1)
		public void CreateReimbursementClaim_SC_290() throws Exception{
		 CreateReimbursementClaim rt = new CreateReimbursementClaim(driver);
		 rt.selectSalary();
		 rt.selectReimbursementClaim();
		 rt.selectNewReimbursement();
		 rt.selectAddEmployee();
		 rt.selectClaimButton();
		 rt.selectName("ReimbursementMaster (Other Reimbursement)");
		 rt.selectFinancialYear("2013/2014");
		 rt.selectPaymentMode("Paid in Salary");
		 rt.selectPaidMonth("Apr/2013");
		 rt.selectClaimDate("15 April 2013");
		 rt.selectPaidDate("30 April 2013");
		 rt.selectAmount("");
		 rt.selectCreateReimbursementButton();
		 String t=rt.getMessage();
		 Assert.assertEquals(t, "Reimbursement Claim was successfully created");
		 Thread.sleep(4000);
		 rt.clickDeleteButton();
		 
}
	
	@Test(priority=2)
	public void BulkReimbursementClaim_SC_370() throws Exception{
	 BulkReimbursementClaim rt = new BulkReimbursementClaim(driver);
	 rt.selectSalary();
	 rt.selectReimbursementClaim();
	 rt.selectBulkReimbursementClaim();
	 rt.selectName("ReimbursementMaster (Other Reimbursement)");
	 rt.selectFinancialYear("2013/2014");
	 rt.selectIssuedOn("Apr/2013");
	 rt.selectClaimDate("15 April 2013");
	 rt.selectGetEmployee();
	 rt.selectCheckBox();
	 rt.selectAmount("100");
	 rt.selectPaymonth("Apr/2013");
	 rt.selectClaimReimbursementButton();
	 Thread.sleep(2000);
	 String e=rt.getMessage();
	 Assert.assertEquals(e, "Reimbursement Claims were successfully created");
}
	
	@Test(priority=3)
	  public void BulkReimbursementClaimDelete_SC_371() throws Exception{
		  BulkReimbursementClaimDelete rt = new BulkReimbursementClaimDelete(driver);
	   rt.selectSalary();
	   rt.selectReimbursementClaim();
	   rt.selectBulkReimbursementClaimDelete();
	   rt.selectSelectBox();
	   rt.selectDeleteButton();
	   String y=rt.getMessage();
	   Assert.assertEquals(y, "Reimbursement Claims were successfully deleted");
	} 
	
@Test(priority=4)
	public void GetBulkReimbursementErrorLog_SC_372() throws Exception{
	GetBulkReimbursementErrorLog rt = new GetBulkReimbursementErrorLog(driver);
	 rt.selectSalary();
	 rt.selectReimbursementClaim();
	 rt.selectBulkReimbursementErrorLog();
	 rt.selectReimbursementModuleType("Reimbursement claims");
	 rt.selectLogDate("27 October 2018");
	 rt.selectGetErrors();
	 
}
 
@Test(priority=5)
 	public void GetBulkReimbursementErrorLogExcel_SC_373() throws Exception{
 	GetBulkReimbursementErrorLogExcel rt = new GetBulkReimbursementErrorLogExcel(driver);
 	 rt.selectSalary();
 	 rt.selectReimbursementClaim();
 	 rt.selectBulkReimbursementErrorLog();
 	 rt.selectReimbursementModuleType("Reimbursement claims");
 	 rt.selectLogDate("27 October 2018");
 	 rt.selectExportToExcel();
}
	
	
	@Test(priority=6)
	public void CreateReimbursementClaimPaymentModeCash_SC_592() throws Exception{
		CreateReimbursementClaimPaymentModeCash cm= new CreateReimbursementClaimPaymentModeCash(driver);
		cm.selectEmployee();
		cm.selectReimbursementAllotment();
		cm.clickDeleteAllotmentButton();
		Thread.sleep(2000);
		cm.clickMastserLink();
		cm.clickReimbursementMaster();
		cm.clickDeleteMasterButton();
		Thread.sleep(5000);
		cm.clickMastserLink();
		cm.clickReimbursementMaster();	
		cm.clickAddReimbursementMaster();
		cm.selectReimbursementType("LTA");
		cm.selectModeOfPayment("Bank Advise");
		cm.selectAllotmentType();
		Thread.sleep(2000);
		cm.enterReimbursementName("ReimbursementMaster");
		cm.clickCreateReimbursementMaster();
		Thread.sleep(5000);
		cm.selectEmployee();
		cm.selectReimbursementAllotment();
		cm.selectNewReimbursementAllotment();
		cm.selectAddEmployeeAllotment();
		cm.selectAllotButton();
		cm.selectAlllotmentName("Reim. LTA (LTA)");
		cm.SelectBlockPeriod("2010/2013");
		cm.selectFinancialYearAllotment("2013/2014");
		cm.selectAllotmentDate("15 April 2013");
		cm.ClickOnFunctionKey();
		Thread.sleep(5000);
		cm.EnterSumAmount("2000");
		Thread.sleep(5000);
		cm.selectCreateReimbursementAllotmentButton();	
		Thread.sleep(5000);
		cm.selectSalary();
		cm.selectReimbursementClaim();
		cm.selectNewReimbursement();
		cm.selectAddEmployee();
		cm.selectClaimButton();
		cm.selectName("Reim. LTA (LTA)");
		cm.selectFinancialYear("2013/2014");
		Thread.sleep(1000);
		cm.selectPaymentModeforClaim("Cash");
		cm.selectClaimBlockPeriod("2010/2013");
		//cm.selectPaidMonth("April 2013");
		cm.selectPaidDate("30 April 2013");
		cm.selectClaimDate("15 April 2013");
		cm.selectAmount("");
		cm.selectCreateReimbursementButton();
		String t=cm.getMessage();
		Assert.assertEquals(t, "Reimbursement Claim was successfully created");
		
		
				
	}
	  @Test(priority=7)
		public void EditReimbursementClaim_SC_556() throws Exception{
		 EditReimbursementClaim rt = new EditReimbursementClaim(driver);
		 rt.selectSalary();
		 rt.selectReimbursementClaim();
		 rt.selectEdit();
		 rt.selectAmount("50");
		 rt.selectUpdateButton();
		 String e=rt.getMessage();
		 Assert.assertEquals(e, "Reimbursement Claim was successfully updated"); 
	}
	  @Test(priority=8)
	 	public void DeleteReimbursementClaim_SC_557() throws Exception{
	 	  DeleteReimbursementClaim rt = new DeleteReimbursementClaim(driver);
	 	 rt.selectSalary();
	 	 rt.selectReimbursementClaim();
	 	 rt.selectDeleteButton();
	 	 rt.switchToPopUpAndDismiss(driver);
	 	 rt.selectDeleteButton();
	 	 rt.switchToPopUpAndAccept(driver);
	 	String e=rt.getMessage();
		Assert.assertEquals(e, "Reimbursement Claim was successfully deleted."); 
		Thread.sleep(5000);
		rt.clickonemployee();
		rt.clickonreimbursement();
		rt.clickDeleteAllotmentButton();
		Thread.sleep(5000);
		rt.clickMastserLink();
		rt.clickReimbursementMaster();
		rt.clickDeleteMasterButton();
		
	  }
	
	
	  @Test(priority=9)
	  public void CreateReimbursementClaimPaymentModeCheque_SC_593() throws Exception{
		CreateReimbursementClaimPaymentModeCheque cm=new CreateReimbursementClaimPaymentModeCheque(driver);
		cm.clickMastserLink();
		cm.selectFinancialInst();
		cm.addnewfinanInsti();
		cm.selectAccoutType("Salary Account");
		cm.enterInstName("HDFC Bank");
		cm.enterBranchCode("FORT MUMBAI");
		cm.enterEmail("hdfc@gmail.com");
		cm.enterAddress("FORT MUMBAI");
		cm.enterPinCode("400085");
		cm.enterIFSCCode("HDFC0000060");
		cm.createfinanceinsti();
		Thread.sleep(10000);
		cm.clickMastserLink();
		cm.clickReimbursementMaster();
		cm.clickAddReimbursementMaster();
		cm.selectReimbursementType("LTA");
		cm.selectModeOfPayment("Bank Advise");
		cm.selectAllotmentType();
		Thread.sleep(2000);
		cm.enterReimbursementName("ReimbursementMaster");
		cm.clickCreateReimbursementMaster();
		Thread.sleep(5000);
		cm.selectEmployee();
		cm.selectReimbursementAllotment();
		cm.selectNewReimbursementAllotment();
		cm.selectAddEmployeeAllotment();
		cm.selectAllotButton();
		cm.selectAlllotmentName("Reim. LTA (LTA)");
		cm.SelectBlockPeriod("2010/2013");
		cm.selectFinancialYearAllotment("2013/2014");
		cm.selectAllotmentDate("15 April 2013");
		cm.ClickOnFunctionKey();
		Thread.sleep(5000);
		cm.EnterSumAmount("2000");
		Thread.sleep(5000);
		cm.selectCreateReimbursementAllotmentButton();	
		Thread.sleep(5000);
		cm.selectSalary();
		cm.selectReimbursementClaim();
		cm.selectNewReimbursement();
		cm.selectAddEmployee();
		cm.selectClaimButton();
		cm.selectName("Reim. LTA (LTA)");
		cm.selectFinancialYear("2013/2014");
		Thread.sleep(1000);
		cm.selectPaymentModeforClaim("Cheque");
		cm.selectClaimBlockPeriod("2010/2013");
		cm.selectPaidDate("30 April 2013");
		cm.selectClaimDate("15 April 2013");
		cm.selectAmount("");
		cm.SelectBank("HDFC Bank");
		cm.enterChequeno("2356");
		cm.selectCreateReimbursementButton();
		String t=cm.getMessage();
		Assert.assertEquals(t, "Reimbursement Claim was successfully created");
		Thread.sleep(3000);
		cm.clickDeleteButton();
	
	}
	
	  @Test(priority=10)
	public void CreateReimbursementClaimPaymentModeDD_SC_593() throws Exception{
	CreateReimbursementClaimPaymentModeDD cm=new CreateReimbursementClaimPaymentModeDD(driver);
	cm.selectSalary();
	cm.selectReimbursementClaim();
	cm.selectNewReimbursement();
	cm.selectAddEmployee();
	cm.selectClaimButton();
	cm.selectName("Reim. LTA (LTA)");
	cm.selectFinancialYear("2013/2014");
	Thread.sleep(1000);
	cm.selectPaymentModeforClaim("DD");
	cm.selectClaimBlockPeriod("2010/2013");
	cm.selectPaidDate("30 April 2013");
	cm.selectClaimDate("15 April 2013");
	cm.selectAmount("");
	cm.SelectBank("HDFC Bank");
	cm.enterChequeno("2356");
	cm.selectCreateReimbursementButton();
	String t=cm.getMessage();
	Assert.assertEquals(t, "Reimbursement Claim was successfully created");
	Thread.sleep(5000);
	cm.clickDeleteButton();
	}
	
	  	@Test(priority=11)
	public void CreateReimbursementClaimPaymentModeBankAdvise_SC_593() throws Exception{
	CreateReimbursementClaimPaymentModeDD cm=new CreateReimbursementClaimPaymentModeDD(driver);
	cm.selectSalary();
	cm.selectReimbursementClaim();
	cm.selectNewReimbursement();
	cm.selectAddEmployee();
	cm.selectClaimButton();
	cm.selectName("Reim. LTA (LTA)");
	cm.selectFinancialYear("2013/2014");
	Thread.sleep(1000);
	cm.selectPaymentModeforClaim("Bank Advise");
	cm.selectClaimBlockPeriod("2010/2013");
	cm.selectPaidDate("30 April 2013");
	cm.selectClaimDate("15 April 2013");
	cm.selectAmount("");
	cm.SelectBank("HDFC Bank");
	cm.enterChequeno("2356");
	cm.selectCreateReimbursementButton();
	String t=cm.getMessage();
	Assert.assertEquals(t, "Reimbursement Claim was successfully created");
	Thread.sleep(5000);
	cm.clickDeleteButton();
	}*/
	
	  	/*	@Test(priority=12)
	public void CheckReimbursementClaimRedirectsToReportModule_SC_504() throws Exception{
	 CheckReimbursementClaimRedirectsToReportModule rt = new CheckReimbursementClaimRedirectsToReportModule(driver);
	 rt.selectSalary();
	 rt.selectReimbursementClaim();
	 Thread.sleep(2000);
	 rt.selectReport();
	 rt.selectBankReimbursement();
	 rt.selectBank();
	 rt.selectCheckBox();
	 rt.selectFromDate("05 June 2018");
	 rt.selectToDate("10 June 2018");
	 rt.selectGenerateReport();
}*/
	
	 /*@Test(priority=13)
		public void CreateLTAOpeningBalance_SC_559() throws Exception{
		  CreateLTAOpeningBalance rt = new CreateLTAOpeningBalance(driver);
		 rt.selectSalary();
		 rt.selectReimbursementClaim();
		 rt.selectLTABalance();
		 rt.selectCreateLTA();
		 rt.selectFinancialYear("2013/2014");
		 rt.selectBlockPeriod("2018/2021");
		 rt.selectGetEmployees();
		 rt.selectOpeningBalance("1000");
		 rt.selectSaveDetails();
		 String e=rt.getMessage();
		 Assert.assertEquals(e, "Created Successfully!"); 
		 Thread.sleep(3000);
		 rt.DeleteLTA();
	}*/
	 
	/*@Test(priority=14)
		public void SaveLTAAdjustment_SC_558() throws Exception{
		  CreateLTAOpeningBalance rt = new CreateLTAOpeningBalance(driver);
		 rt.selectSalary();
		 rt.selectReimbursementClaim();
		 rt.selectLTABalance();
		 rt.selectCreateLTA();
		 rt.selectFinancialYear("2013/2014");
		 rt.selectBlockPeriod("2018/2021");
		 rt.selectGetEmployees();
		 rt.selectOpeningBalance("1000");
		 rt.selectSaveDetails();
		 String e=rt.getMessage();
		 Assert.assertEquals(e, "Created Successfully!"); 
		 Thread.sleep(3000);
		 rt.DeleteLTA();
	}*/
	 
	 
	 
	  @Test(priority=15)
		public void CheckReimbursementAllotmentRedirectsToEmployee_SC_506() throws Exception{
		  CheckReimbursementAllotmentRedirectsToEmployee rt = new CheckReimbursementAllotmentRedirectsToEmployee(driver);
		 rt.selectEmployee();
		 rt.selectReimbursementAllotment();
		 rt.clickDeleteButton();
		 Thread.sleep(3000);
		 rt.selectSalary();
		 rt.selectReimbursementClaim();
		 rt.selectGeneralLink();
		 Thread.sleep(3000);
		 rt.selectReimAllotment();
		 rt.selectNewReimbursement();
		 rt.selectAddEmployee();
		 rt.selectAllotButton();
		 rt.selectAlllotmentName("Reim. LTA (LTA)");
			rt.SelectBlockPeriod("2010/2013");
			rt.selectFinancialYearAllotment("2013/2014");
			rt.selectAllotmentDate("15 April 2013");
			rt.ClickOnFunctionKey();
			Thread.sleep(5000);
			rt.EnterSumAmount("2000");
			Thread.sleep(5000);
			rt.selectCreateReimbursementAllotmentButton();	
		 String e=rt.getMessage();
		 Assert.assertEquals(e, "Reimbursement Allotment was successfully created"); 
		 Thread.sleep(3000);
		 rt.clickDeleteButton();
	  }
	 
	 @Test(priority=16)
	 	public void CheckReimbursementClaimRedirectsToMasterModule_SC_505() throws Exception{
	 	 CheckReimbursementClaimRedirectsToMasterModule rt = new CheckReimbursementClaimRedirectsToMasterModule(driver);
	 	rt.clickMastserLink();
	 	rt.clickReimbursementMaster();
	 	rt.clickDeleteButton();
	 	Thread.sleep(3000);
	 	 rt.selectSalary();
	 	 rt.selectReimbursementClaim();
	 	 rt.selectGeneralLink();
	 	 Thread.sleep(2000);
	 	 rt.selectReimbursementMaster();
	 	 rt.clickAddReimbursementMaster();
	 	 rt.selectReimbursementType("Other Reimbursement");
	 	rt.selectModeOfPayment("Cash");
		rt.selectAllotmentType();
		Thread.sleep(5000);
		rt.enterReimbursementName("ReimbursementMaster");
		rt.clickCreateReimbursementMaster();
		String s=rt.getMessage();
		Assert.assertEquals(s, "Reimbursement Master is successfully created.");
		Thread.sleep(3000);
		rt.clickDeleteButton();
	}
	 
	 
	

} 	 
 	 
 	 
 	 
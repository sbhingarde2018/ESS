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
import com.spp.pages.CreateReimbursementClaim;
import com.spp.pages.DeleteReimbursementClaim;
import com.spp.pages.EditReimbursementClaim;
import com.spp.pages.GetBulkReimbursementErrorLog;
import com.spp.pages.GetBulkReimbursementErrorLogExcel;

import junit.framework.Assert;

public class ReimbursementClaim extends BaseTest{
/*	@Test(priority=0)
		public void CreateReimbursementClaim_SC_290() throws Exception{
		 CreateReimbursementClaim rt = new CreateReimbursementClaim(driver);
		 rt.selectSalary();
		 rt.selectReimbursementClaim();
		 rt.selectNewReimbursement();
		 rt.selectAddEmployee();
		 rt.selectClaimButton();
		 rt.selectName("reimbursement (Other Reimbursement)");
		 rt.selectFinancialYear("2017/2018");
		 rt.selectPaymentMode("Paid in Salary");
		 rt.selectPaidMonth("Dec/2017");
		 rt.selectClaimDate("14 November 2017");
		 rt.selectPaidDate("13 December 2017");
		 rt.selectAmount("2000");
		 rt.selectCreateReimbursementButton();
		 String t=rt.getMessage();
		 Assert.assertEquals(t, "Reimbursement Claim was successfully created");
		 //Thread.sleep(4000);
		// rt.clickDeleteButton();
		 
}
 @Test(priority=1)
	public void GetBulkReimbursementErrorLog_SC_372() throws Exception{
	GetBulkReimbursementErrorLog rt = new GetBulkReimbursementErrorLog(driver);
	 rt.selectSalary();
	 rt.selectReimbursementClaim();
	 rt.selectBulkReimbursementErrorLog();
	 rt.selectReimbursementModuleType("Reimbursement claims");
	 rt.selectLogDate("05 March 2018");
	 rt.selectGetErrors();
	 
}
  @Test(priority=2)
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
  @Test(priority=3)
 	public void GetBulkReimbursementErrorLogExcel_SC_373() throws Exception{
 	GetBulkReimbursementErrorLogExcel rt = new GetBulkReimbursementErrorLogExcel(driver);
 	 rt.selectSalary();
 	 rt.selectReimbursementClaim();
 	 rt.selectBulkReimbursementErrorLog();
 	 rt.selectReimbursementModuleType("Reimbursement claims");
 	 rt.selectLogDate("05 March 2018");
 	 rt.selectExportToExcel();
}
  @Test(priority=4)
	public void BulkReimbursementClaim_SC_370() throws Exception{
	 BulkReimbursementClaim rt = new BulkReimbursementClaim(driver);
	 rt.selectSalary();
	 rt.selectReimbursementClaim();
	 rt.selectBulkReimbursementClaim();
	 rt.selectName("reimbursement (Other Reimbursement)");
	 rt.selectFinancialYear("2018/2019");
	 rt.selectIssuedOn("Apr/2018");
	 rt.selectClaimDate("05 June 2018");
	 rt.selectGetEmployee();
	 rt.selectCheckBox();
	 rt.selectAmount("2000");
	 rt.selectPaymonth("Apr/2018");
	 rt.selectClaimReimbursementButton();
	 Thread.sleep(2000);
	 String e=rt.getMessage();
	 Assert.assertEquals(e, "Reimbursement Claims were successfully created");
} 
  @Test(priority=5)
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
}
  @Test(priority=6)
 	public void CheckReimbursementClaimRedirectsToMasterModule_SC_505() throws Exception{
 	 CheckReimbursementClaimRedirectsToMasterModule rt = new CheckReimbursementClaimRedirectsToMasterModule(driver);
 	 rt.selectSalary();
 	 rt.selectReimbursementClaim();
 	 rt.selectGeneralLink();
 	 rt.selectReimbursementMaster();
 	 rt.clickAddReimbursementMaster();
 	 rt.selectReimbursementType("Other Reimbursement");
 	rt.selectModeOfPayment("Cash");
	rt.selectAllotmentType();
	Thread.sleep(5000);
	rt.enterReimbursementName("Reimbursement1_"+Utility.getRandNum(100, 100000));
	rt.clickCreateReimbursementMaster();
	String s=rt.getMessage();
	Assert.assertEquals(s, "Reimbursement Master is successfully created.");
}*/
  @Test(priority=7)
	public void CheckReimbursementAllotmentRedirectsToEmployee_SC_506() throws Exception{
	  CheckReimbursementAllotmentRedirectsToEmployee rt = new CheckReimbursementAllotmentRedirectsToEmployee(driver);
	 rt.selectSalary();
	 rt.selectReimbursementClaim();
	 rt.selectGeneralLink();
	 rt.selectReimAllotment();
	 rt.selectNewReimbursement();
	 rt.selectAddEmployee();
	 rt.selectAllotButton();
	 rt.selectName("Reimbursement_32184 (Other Reimbursement)");
	 Thread.sleep(2000);
	 rt.selectFinancialYear("2018/2019");
	 rt.selectAllotmentDate("23 June 2018");
	 Thread.sleep(2000);
	 rt.selectAmount("3000");
	 rt.selectCreateReimbursementButton();
	 String e=rt.getMessage();
	 Assert.assertEquals(e, "Reimbursement Allotment was successfully created"); 
  }
  @Test(priority=7)
	public void EditReimbursementClaim_SC_556() throws Exception{
	  EditReimbursementClaim rt = new EditReimbursementClaim(driver);
	 rt.selectSalary();
	 rt.selectReimbursementClaim();
	 rt.selectEdit();
	 rt.selectAmount("5000");
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
  }
  @Test(priority=9)
	public void CreateLTAOpeningBalance_SC_559() throws Exception{
	  CreateLTAOpeningBalance rt = new CreateLTAOpeningBalance(driver);
	 rt.selectSalary();
	 rt.selectReimbursementClaim();
	 rt.selectLTABalance();
	 rt.selectCreateLTA();
	 rt.selectFinancialYear("2018/2019");
	 rt.selectBlockPeriod("2014/2017");
	 rt.selectGetEmployees();
	 rt.selectOpeningBalance("1000");
	 rt.selectSaveDetails();
	 String e=rt.getMessage();
	 Assert.assertEquals(e, "LTA Opening Balances were successfully"); 
}
 
} 	 
 	 
 	 
 	 
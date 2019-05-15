package com.spp.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.spp.common.BaseTest;
import com.spp.generics.Utility;
import com.spp.pages.AddNewLeaveEncashmentInFFS;
import com.spp.pages.AddNewLeaveEncashmentModeofPaymentCheque;
import com.spp.pages.AddNewLeaveEncashmentModeofPaymentDD;
import com.spp.pages.AddNewLeaveEncashmentwithContributionApplicableBasedonAmount;
import com.spp.pages.AddNewLeaveEncashmentwithContributionApplicableBasedonPercentage;
import com.spp.pages.CheckifLeaveLeaveEncashmentGeneralLinkEmployeeMasterredirectstoEmployeeMaster;
import com.spp.pages.DeleteLeaveEncashment;
import com.spp.pages.EditLeaveEncashment;
import com.spp.pages.LeaveEncashmentLumpsumUnitRate;
import com.spp.pages.LeaveencashmentModeofPaymentBankAdvise;
import com.spp.pages.LeaveencashmentModeofPaymentCash;
import com.spp.pages.LeaveencashmentUnitratebasedonFormula;
import com.spp.pages.LeaveencashmentUnitratebasedonRate;
import com.spp.pages.UpdateLeaveEncashmentBasedonAmounttoRemovevalueandInsertvalue;
import com.spp.pages.UpdateLeaveEncashmentBasedonPercentagetoRemovevalueandInsertvalue;


public class LeaveEncashment extends BaseTest{
	
	@Test(priority=0)
	public void LeaveEncashmentLumpsumUnitRate_SC_113() throws Exception{
		LeaveEncashmentLumpsumUnitRate lu=new LeaveEncashmentLumpsumUnitRate(driver);
		lu.clickonleave();
		lu.clickonleaveencashment();
		lu.resizeWindow();
		lu.clickonfilter();
		Thread.sleep(2000);
		lu.clickonload();
		Thread.sleep(2000);
		lu.clickonview();
		Thread.sleep(2000);
		lu.addnewleaveencashment();
		Thread.sleep(2000);
		lu.selectmonth("Mar/2019");
		Thread.sleep(2000);
		lu.selectleave("Casual Leave");
		Thread.sleep(2000);
		//lu.enternoofleaves("2");
		//Thread.sleep(2000);
		lu.enterunitrate("1000");
		Thread.sleep(2000);
		lu.checkshowinsalary();
		Thread.sleep(2000);
		lu.clickonsave();
		String s=lu.getMessage();
		Assert.assertEquals(s, "Leave encashment successfully created.");
		Thread.sleep(2000);
		lu.clickonSalary();
		lu.clickonsalaryeditor();
		Thread.sleep(2000);
		lu.selectSalEditorPaymonth("Mar/2019");
		Thread.sleep(2000);
		lu.selectSalEditorSalaryStructure("Structure");
		Thread.sleep(2000);
		lu.clickGetValues();
		Thread.sleep(2000);
		lu.clickonload();
		Thread.sleep(2000);
		lu.clickSelectAll();
		Thread.sleep(2000);
		lu.clickProcessSalary();
		Thread.sleep(5000);
		lu.clickonSalary();
		Thread.sleep(5000);
		lu.clickSalaryProcessList();
		Thread.sleep(5000);
		lu.editSalaryProcessList();
		Thread.sleep(5000);
		lu.clickSalaryReviewDetailView();
		Thread.sleep(2000);
		lu.clickonleave();
		lu.clickonleaveencashment();
		lu.clickonfilter();
		Thread.sleep(2000);
		lu.clickonload();
		Thread.sleep(2000);
		lu.clickonview();
		Thread.sleep(2000);
		lu.deleteEncashment();
		Thread.sleep(2000);
		lu.switchToPopUpAndAccept(driver);
		Thread.sleep(2000);
		lu.exitFullscreen();
		Thread.sleep(2000);
	}
	
	@Test(priority=1)
	public void AddNewLeaveEncashmentModeofPaymentCheque_SC_418() throws Exception{
		AddNewLeaveEncashmentModeofPaymentCheque lu=new AddNewLeaveEncashmentModeofPaymentCheque(driver);
		lu.clickonleave();
		lu.clickonleaveencashment();
		lu.clickonfilter();
		lu.resizeWindow();
		Thread.sleep(2000);
		lu.clickonload();
		Thread.sleep(3000);
		lu.clickonview();
		lu.addnewleaveencashment();
		Thread.sleep(1000);
		lu.selectmonth("Jan/2019");
		Thread.sleep(1000);
		lu.selectleave("Casual Leave");
		Thread.sleep(1000);
		//lu.enternoofleaves("2");
		//Thread.sleep(1000);
		lu.enterunitrate("500");
		Thread.sleep(2000);
		lu.selectmodeofpayment("Cheque");
		Thread.sleep(2000);
		lu.selectbank("State Bank of India");
		Thread.sleep(2000);
		lu.clickonsave();
		Thread.sleep(2000);
		String s=lu.getMessage();
		Assert.assertEquals(s, "Leave encashment successfully created.");
		lu.exitFullscreen();
		Thread.sleep(2000);
	}
	
	@Test(priority=2)
	public void EditLeaveEncashment_SC_419() throws Exception{
		EditLeaveEncashment lu=new EditLeaveEncashment(driver);
		lu.clickonleave();
		lu.clickonleaveencashment();
		Thread.sleep(2000);
		lu.resizeWindow();
		Thread.sleep(2000);
		lu.clickonfilter();
		Thread.sleep(2000);
		lu.clickonload();
		Thread.sleep(3000);
		lu.clickonview();
		Thread.sleep(3000);
		lu.clickonedit();
		Thread.sleep(3000);
		lu.selectmodeofpayment("Cash");
		Thread.sleep(3000);
		lu.clickonupdate();
		Thread.sleep(3000);
		String s=lu.getMessage();
		Assert.assertEquals(s, "Leave encashment successfully updated.");
		Thread.sleep(3000);
		lu.exitFullscreen();
	}
	
	@Test(priority=3)
	public void DeleteLeaveEncashment_SC_420() throws Exception{
		DeleteLeaveEncashment lu=new DeleteLeaveEncashment(driver);
		lu.clickonleave();
		lu.clickonleaveencashment();
		lu.clickonfilter();
		Thread.sleep(2000);
		lu.resizeWindow();
		Thread.sleep(2000);
		lu.clickonload();
		Thread.sleep(3000);
		lu.clickonview();
		Thread.sleep(3000);
		lu.clickondelete();
		Thread.sleep(3000);
		lu.switchToPopUpAndAccept(driver);
		Thread.sleep(3000);
		String s=lu.getMessage();
		Assert.assertEquals(s, "Leave encashment successfully deleted.");
		Thread.sleep(2000);
		lu.exitFullscreen();
		Thread.sleep(2000);
	}
	
	@Test(priority=4)
	public void CheckifLeaveLeaveEncashmentGeneralLinkEmployeeMasterredirectstoEmployeeMaster_SC_485() throws Exception{
		CheckifLeaveLeaveEncashmentGeneralLinkEmployeeMasterredirectstoEmployeeMaster la=new CheckifLeaveLeaveEncashmentGeneralLinkEmployeeMasterredirectstoEmployeeMaster(driver);
		la.clickonleave();
		la.clickonleaveencashment();
	//	la.clickongenerallinks();
		la.clickonemployeemaster();
		Thread.sleep(2000);
		la.addnewemployee();
		la.enterEmployeeid("ABC7208");
		la.enterEmployeeref("Ref-"+Utility.getRandNum(200, 300));
		la.enterEmployeename("Shyam");
		la.enterEmployeefather("Suresh");
		la.selectDateofBirth("06 June 1995");
		la.selectGender("Male");
		la.selectMaritalStatus("Single");
		la.selectDateofJoining("06 June 2018");
		Thread.sleep(2000);
		la.clickPresentAddress();
		la.selectState("Maharashtra");
		la.selectclassificationdetail();
		la.selectsalstructure("Structure");
		la.selectbranch("default");
		la.selectattendancestructure("Karnataka");
		la.selectbank("CASH");
		la.selectleavepolicy("Default");
		la.createemployee();
		String s=la.getMessage();
 		Assert.assertEquals(s, "Employee successfully created");
 		Thread.sleep(2000);
 		la.resizeWindow();
 		la.clickfilteremployee();
 		Thread.sleep(2000);
 		la.clickonload();
		Thread.sleep(2000);
 		la.clickdelete();
 		la.switchToPopUpAndAccept(driver);
 		la.exitFullscreen();
	}
	
	/*@Test(priority=3)
	public void AddNewLeaveEncashmentwithContributionApplicableBasedonAmount_SC_481() throws Exception{
		AddNewLeaveEncashmentwithContributionApplicableBasedonAmount lu=new AddNewLeaveEncashmentwithContributionApplicableBasedonAmount(driver);
		lu.clickonleave();
		lu.clickonleaveencashment();
		lu.clickonfilter();
		Thread.sleep(2000);
		lu.clickonload();
		Thread.sleep(3000);
		lu.clickonview();
		lu.addnewleaveencashment();
		Thread.sleep(1000);
		lu.selectmonth("Aug/2018");
		Thread.sleep(500);
		lu.selectleave("Earned Leave");
		Thread.sleep(1000);
		lu.enternoofleaves("2");
		Thread.sleep(1000);
		lu.enterunitrate("500");
		Thread.sleep(500);
		lu.checkshowinsalary();
		lu.checkcontribution();
		lu.selectsalaryhead("Basic");
		lu.enteramount("1000");
		lu.clickoninsert();
		Thread.sleep(500);
		lu.clickonsave();
		String s=lu.getMessage();
		Assert.assertEquals(s, "Leave encashment successfully created.");
	}
	
	
	@Test(priority=4)
	public void AddNewLeaveEncashmentwithContributionApplicableBasedonPercentage_SC_482() throws Exception{
		AddNewLeaveEncashmentwithContributionApplicableBasedonPercentage lu=new AddNewLeaveEncashmentwithContributionApplicableBasedonPercentage(driver);
		lu.clickonleave();
		lu.clickonleaveencashment();
		lu.clickonfilter();
		Thread.sleep(2000);
		lu.clickonload();
		Thread.sleep(3000);
		lu.clickonview();
		lu.addnewleaveencashment();
		Thread.sleep(1000);
		lu.selectmonth("Aug/2018");
		Thread.sleep(500);
		lu.selectleave("Earned Leave");
		Thread.sleep(1000);
		lu.enternoofleaves("1");
		Thread.sleep(1000);
		lu.enterunitrate("120");
		Thread.sleep(500);
		lu.checkshowinsalary();
		lu.checkcontribution();
		lu.checkbasedonpercent();
		lu.selectsalaryhead("Basic");
		lu.enteramount("100");
		lu.clickoninsert();
		Thread.sleep(500);
		lu.clickonsave();
		String s=lu.getMessage();
		Assert.assertEquals(s, "Leave encashment successfully created.");
	}
	@Test(priority=5)
	public void UpdateLeaveEncashmentBasedonAmounttoRemovevalueandInsertvalue_SC_483() throws Exception{
		UpdateLeaveEncashmentBasedonAmounttoRemovevalueandInsertvalue lu=new UpdateLeaveEncashmentBasedonAmounttoRemovevalueandInsertvalue(driver);
		lu.clickonleave();
		lu.clickonleaveencashment();
		lu.clickonfilter();
		Thread.sleep(2000);
		lu.clickonload();
		Thread.sleep(3000);
		lu.clickonview();
		lu.clickonedit();
		lu.clickonremove();
		lu.checkbasedonamount();
		Thread.sleep(2000);
		lu.selectsalaryhead("Dearness Allowance");
		lu.enteramount("2500");
		lu.clickoninsert();
		Thread.sleep(500);
		lu.clickonupdate();
		String s=lu.getMessage();
		Assert.assertEquals(s, "Leave encashment successfully updated.");
	}
	
	@Test(priority=6)
	public void UpdateLeaveEncashmentBasedonPercentagetoRemovevalueandInsertvalue_SC_484() throws Exception{
		UpdateLeaveEncashmentBasedonPercentagetoRemovevalueandInsertvalue lu=new UpdateLeaveEncashmentBasedonPercentagetoRemovevalueandInsertvalue(driver);
		lu.clickonleave();
		lu.clickonleaveencashment();
		lu.clickonfilter();
		Thread.sleep(2000);
		lu.clickonload();
		Thread.sleep(3000);
		lu.clickonview();
		lu.clickonedit();
		lu.clickonremove();
		lu.checkbasedonpercent();
		Thread.sleep(2000);
		lu.selectsalaryhead("Dearness Allowance");
		lu.enteramount("100");
		lu.clickoninsert();
		Thread.sleep(500);
		lu.clickonupdate();
		String s=lu.getMessage();
		Assert.assertEquals(s, "Leave encashment successfully updated.");
	}*/
	
	
	/*@Test(priority=1)
	public void LeaveencashmentUnitratebasedonFormula_SC_114() throws Exception{
		LeaveencashmentUnitratebasedonFormula lu=new LeaveencashmentUnitratebasedonFormula(driver);
		lu.clickonleave();
		lu.clickonleaveencashment();
		lu.clickonfilter();
		Thread.sleep(2000);
		lu.clickonload();
		Thread.sleep(3000);
		lu.clickonview();
		lu.addnewleaveencashment();
		Thread.sleep(1000);
		lu.selectmonth("Aug/2018");
		Thread.sleep(1000);
		lu.selectleave("Earned Leave");
		Thread.sleep(1000);
		lu.enternoofleaves("2");
		Thread.sleep(1000);
		lu.checkunitrate();	
		Thread.sleep(1000);
		lu.checkformula();
		lu.selectformula("Leave_Encash_Formula");
		Thread.sleep(500);
		lu.checkshowinsalary();
		Thread.sleep(500);
		lu.clickonsave();
		String s=lu.getMessage();
		Assert.assertEquals(s, "Leave encashment successfully created.");
	}
	
	@Test(priority=2)
	public void LeaveencashmentUnitratebasedonRate_SC_115() throws Exception{
		LeaveencashmentUnitratebasedonRate lu=new LeaveencashmentUnitratebasedonRate(driver);
		lu.clickonleave();
		lu.clickonleaveencashment();
		lu.clickonfilter();
		Thread.sleep(2000);
		lu.clickonload();
		Thread.sleep(3000);
		lu.clickonview();
		lu.addnewleaveencashment();
		Thread.sleep(1000);
		lu.selectmonth("Aug/2018");
		Thread.sleep(1000);
		lu.selectleave("Earned Leave");
		Thread.sleep(1000);
		lu.enternoofleaves("2");
		Thread.sleep(1000);
		lu.checkunitrate();
		Thread.sleep(1000);
		lu.selectrate();
		Thread.sleep(500);
		lu.checkhead();
		lu.checkshowinsalary();
		Thread.sleep(500);
		lu.clickonsave();
		String s=lu.getMessage();
		Assert.assertEquals(s, "Leave encashment successfully created.");
	}
	
	@Test(priority=3)
	public void LeaveencashmentModeofPaymentBankAdvise_SC_116() throws Exception{
		LeaveencashmentModeofPaymentBankAdvise lu=new LeaveencashmentModeofPaymentBankAdvise(driver);
		lu.clickonleave();
		lu.clickonleaveencashment();
		lu.clickonfilter();
		Thread.sleep(2000);
		lu.clickonload();
		Thread.sleep(3000);
		lu.clickonview();
		lu.addnewleaveencashment();
		Thread.sleep(1000);
		lu.selectmonth("Aug/2018");
		Thread.sleep(1000);
		lu.selectleave("Earned Leave");
		Thread.sleep(1000);
		lu.enternoofleaves("2");
		Thread.sleep(1000);
		lu.enterunitrate("500");
		Thread.sleep(500);
		lu.checkshowinsalary();
		Thread.sleep(500);
		lu.selectmodeofpayment("Bank Advise");
		lu.selectbank("State Bank of India");
		lu.clickonsave();
		String s=lu.getMessage();
		Assert.assertEquals(s, "Leave encashment successfully created.");
	}
	@Test(priority=4)
	public void LeaveencashmentModeofPaymentCash_SC_117() throws Exception{
		LeaveencashmentModeofPaymentCash lu=new LeaveencashmentModeofPaymentCash(driver);
		lu.clickonleave();
		lu.clickonleaveencashment();
		lu.clickonfilter();
		Thread.sleep(2000);
		lu.clickonload();
		Thread.sleep(3000);
		lu.clickonview();
		lu.addnewleaveencashment();
		Thread.sleep(1000);
		lu.selectmonth("Aug/2018");
		Thread.sleep(1000);
		lu.selectleave("Earned Leave");
		Thread.sleep(1000);
		lu.enternoofleaves("2");
		Thread.sleep(1000);
		lu.enterunitrate("500");
		Thread.sleep(3000);
		lu.selectmodeofpayment("Cash");
		lu.clickonsave();
		String s=lu.getMessage();
		Assert.assertEquals(s, "Leave encashment successfully created.");
	}
	
	
	@Test(priority=6)
	public void AddNewLeaveEncashmentModeofPaymentDD_SC_479() throws Exception{
		AddNewLeaveEncashmentModeofPaymentDD lu=new AddNewLeaveEncashmentModeofPaymentDD(driver);
		lu.clickonleave();
		lu.clickonleaveencashment();
		lu.clickonfilter();
		Thread.sleep(2000);
		lu.clickonload();
		Thread.sleep(3000);
		lu.clickonview();
		lu.addnewleaveencashment();
		Thread.sleep(1000);
		lu.selectmonth("Aug/2018");
		Thread.sleep(1000);
		lu.selectleave("Earned Leave");
		Thread.sleep(1000);
		lu.enternoofleaves("2");
		Thread.sleep(1000);
		lu.enterunitrate("500");
		Thread.sleep(500);
		lu.selectmodeofpayment("DD");
		lu.selectbank("State Bank of India");
		lu.clickonsave();
		String s=lu.getMessage();
		Assert.assertEquals(s, "Leave encashment successfully created.");
	}
	
	@Test(priority=7)
	public void AddNewLeaveEncashmentInFFS_SC_480() throws Exception{
		AddNewLeaveEncashmentInFFS lu=new AddNewLeaveEncashmentInFFS(driver);
		lu.clickonleave();
		lu.clickonleaveencashment();
		lu.clickonfilter();
		Thread.sleep(2000);
		lu.clickonload();
		Thread.sleep(3000);
		lu.clickonview();
		lu.addnewleaveencashment();
		Thread.sleep(1000);
		lu.selectmonth("Aug/2018");
		Thread.sleep(1000);
		lu.selectleave("Earned Leave");
		Thread.sleep(1000);
		lu.enternoofleaves("2");
		Thread.sleep(1000);
		lu.enterunitrate("500");
		Thread.sleep(500);
		lu.checkffs();
		Thread.sleep(2000);
		lu.clickonsave();
		String s=lu.getMessage();
		Assert.assertEquals(s, "Leave encashment successfully created.");
	}*/	
}
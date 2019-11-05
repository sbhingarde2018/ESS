package com.spp.scripts;

import org.testng.annotations.Test;

import com.spp.common.BaseTest;
import com.spp.pages.BranchPage;
import com.spp.pages.BranchValidationPage;

import junit.framework.Assert;

public class BranchValidationTestcase extends BaseTest {
	@Test(priority=0)
	public void Branchvalidation_SC_1823() throws Exception{
		BranchValidationPage bp=new BranchValidationPage(driver);
		Thread.sleep(5000);
		bp.navigateMaster();
		bp.clickCompanayLink();
		bp.clickBranchLink();
		bp.clickAddBranchLink();
		bp.enterBranchName("Bangalore");//CHANGE
		bp.enterReponsiblePersonName("Suraj");
		bp.enterBranchAddress("HSR Bangalore");
		bp.enterBranchState("Karnataka");
		bp.clickCreateBranchButton();
		Thread.sleep(500);
		bp.navigateMaster();
		bp.clickBranchLink();
		bp.clickAddBranchLink();
		bp.clickCreateBranchButton();
		String s=bp.getBranchNameMessage();
		Assert.assertEquals(s, "Branch can't be blank");
		String s1=bp.getResponsiblepersonMessage();
		Assert.assertEquals(s1, "Responsible Person can't be blank");
		String s2=bp.getBranchaddressMessage();
		Assert.assertEquals(s2, "Address can't be blank");
		String s3=bp.getBranchstateMessage();
		Assert.assertEquals(s3, "State can't be blank");
		Thread.sleep(5000);
		bp.clickBranchLink();
		bp.clickAddBranchLink();
		bp.enterBranchName("Bangalore");//CHANGE
		bp.enterReponsiblePersonName("Suraj");
		bp.enterBranchAddress("HSR Bangalore");
		bp.enterBranchState("Karnataka");
		bp.clickCreateBranchButton();
		String s4=bp.getbublicateBranchNameMessage();
		Assert.assertEquals(s4, "Branch name has already been taken");
		
		
	}
	@Test(priority=1)
	public void ValidationofPFESIPTBranch_SC_1824() throws Exception{
		BranchValidationPage bp=new BranchValidationPage(driver);
		Thread.sleep(5000);
		bp.navigateMaster();
		bp.clickCompanayLink();
		bp.clickBranchLink();
	Thread.sleep(3000);
	bp.clickEditBranch();
		bp.clickPFDetail();
		bp.clickCreatePFDetail();
		String s=bp.getPFGroupMessage();
		Assert.assertEquals(s, "PF Group can't be blank");
		String s1=bp.getEffectiveDateMessage();
		Assert.assertEquals(s1, "PF Effective From can't be blank");
		bp.selectPFGroup("PF_Bangalore");
		Thread.sleep(2000);
		bp.selectmonthoptionPF();
		bp.clickCreatePFDetail();
		bp.selectPFGroup("PF_Bangalore");
		Thread.sleep(2000);
		bp.selectmonthoptionPF();
		bp.clickCreatePFDetail();
		String s2=bp.getbublicatePFgroupMessage();
		Assert.assertEquals(s2, "Pf group has already been taken");
		String s3=bp.getbublicatePFEffectiveDateMessage();
		Assert.assertEquals(s3, "Pf effective from has already been taken");
		
		bp.closedubllicatemsg();
		Thread.sleep(2000);
		bp.clickESIDetail();
		bp.clickCreateESIdetail();
		String s4=bp.getESIGroupMessage();
		Assert.assertEquals(s4, "ESI Group can't be blank");
		String s5=bp.getESIEffectiveDateMessage();
		Assert.assertEquals(s5, "ESI Effective From can't be blank");
		bp.selectESIGroup("ESI_Bangalore");
		Thread.sleep(1000);
		bp.selectmonthoptionESI();
		bp.clickCreateESIdetail();
		bp.selectESIGroup("ESI_Bangalore");
		Thread.sleep(1000);
		bp.selectmonthoptionESI();
		bp.clickCreateESIdetail();
		String s6=bp.getbublicateESIgroupMessage();
		Assert.assertEquals(s6, "Esi group has already been taken");
		String s7=bp.getbublicateESIEffectiveDateMessage();
		Assert.assertEquals(s7, "Esi effective from has already been taken");
	//	bp.closedubllicatemsg();
		Thread.sleep(1000);
		bp.clickPTDetail();
		bp.clickCreatePTDetail();		
		String s8=bp.getPTGroupMessage();
		Assert.assertEquals(s8, "PT Group can't be blank");
		String s9=bp.getPTEffectiveDateMessage();
		Assert.assertEquals(s9, "PT Effective From can't be blank");
		Thread.sleep(2000); 
	//	bp.selectmonth();
		bp.selectPTGroup("PT_Bangalore");
		bp.selectmonthoptionPT();
		bp.clickCreatePTDetail();
		Thread.sleep(2000); 
		bp.selectPTGroup("PT_Bangalore");
		bp.selectmonthoptionPT();
		bp.clickCreatePTDetail();
		String s10=bp.getbublicatePTgroupMessage();
		Assert.assertEquals(s10, "Pt group has already been taken");
		String s11=bp.getbublicatePTEffectiveDateMessage();
		Assert.assertEquals(s11, "Pt effective from has already been taken");
		}
}

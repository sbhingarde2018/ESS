package com.spp.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.spp.common.BaseTest;
import com.spp.generics.Utility;
import com.spp.pages.AddCloneSalaryStructure;
import com.spp.pages.AddSalaryStructure;
import com.spp.pages.AddSalaryStructureNotBasedOnGross;
import com.spp.pages.AssignSalaryHead;
import com.spp.pages.DeleteAssignedSalaryHead;
import com.spp.pages.DeleteSalaryStructure;
import com.spp.pages.EditAssignedSalaryHead;
import com.spp.pages.EditSalaryStructure;


public class SalaryStructure extends BaseTest {
	
	@Test(priority=0)
 	public void verifyCreatedSalaryStructure_SC_28() throws Exception{
 		AddSalaryStructure ss=new AddSalaryStructure(driver);
 		ss.navigateMaster();
 		ss.clickSalaryStructureLink();
 		ss.clickAddSalaryStructureLink();	
 		ss.enterSalaryStructureName("SALARYSTRUCTURE");
 		ss.clickBasedOnGross();
 		ss.clickCreateButton();
 		String s=ss.getMessage();
 		Assert.assertEquals(s, "Salary group successfully created");
	}
	@Test(priority=1)
    public void AddSalaryStructureNotBasedOnGross_SC_29() throws Exception{
  		AddSalaryStructureNotBasedOnGross ss=new AddSalaryStructureNotBasedOnGross(driver);
  		Thread.sleep(5000);
  		ss.navigateMaster();
  		ss.clickSalaryStructureLink();
  		ss.clickAddSalaryStructureLink();
  		ss.enterSalaryStructureName("New Structure_"+Utility.getRandNum(4000, 5000));  
  		ss.clickCreateButton();
  		String s=ss.getMessage();
  		Assert.assertEquals(s, "Salary group successfully created");
  		ss.clickDeleteButton();
	}
	@Test(priority=2)
	public void verifyEditedSalaryStructure_SC_428() throws Exception{
		EditSalaryStructure es=new EditSalaryStructure(driver);
		Thread.sleep(5000);
		es.navigateMaster();
		es.clickSalaryStructureLink();
		es.clickEditSalaryStructureLink();
		es.enterSalaryStructureName("SALARYSTRUCTURE");
		es.clickBasedOnGross();
		es.clickUpdateSalaryStructureButton();
		String s=es.getMessage();
		Assert.assertEquals(s, "Salary group succesfully updated");
	}
	@Test(priority=3)
	public void verifyAssignedSalaryHead_SC_30() throws Exception{
		AssignSalaryHead sh=new AssignSalaryHead(driver);
		Thread.sleep(5000);
		sh.navigateMaster();
		sh.clickSalaryStructureLink();
		sh.clickSettingsLink();
		sh.clickAssignedHeadLink();
		sh.selectSalaryHead("Basic");
		sh.selectCalculationType("Lumpsum");
		sh.selectBasedOn("Pay Days");
		sh.clickPFApplicabilty();
		sh.clickESIApplicabilty();
		sh.selectRoundOff("Actual");
		sh.enterEffectiveDate("Jan/2019");
		Thread.sleep(5000);
		sh.clickCreateSalaryGroupDetailButton();
		String s=sh.getMessage();
		Assert.assertEquals(s, "Salary structure detail successfully created");
	}
	@Test(priority=4)
  	public void verifyCloneSalaryStructure_SC_245() throws Exception{
  		AddCloneSalaryStructure cs=new AddCloneSalaryStructure(driver);
  		Thread.sleep(5000);
  		cs.navigateMaster();
  		cs.clickSalaryStructureLink();
  		Thread.sleep(5000);
  		cs.clickCloneSalaryStructure();
  		Thread.sleep(4000);
  		cs.enterSalaryStructureName("Clone 22");
  		cs.clickCloneOfDropDown();
  		cs.selectCloneOfDropDown();
  		cs.clickCreateSalaryStructure();
 		String s=cs.getMessage();
		Assert.assertEquals(s, "Salary Structure clone has been successfully created");
	}
	@Test(priority=5)
  	public void verifyEditedAssignedSalaryHead_SC_429() throws Exception{
  		EditAssignedSalaryHead ea=new EditAssignedSalaryHead(driver);
  		ea.navigateMaster();
  		ea.clickSalaryStructureLink();
  		ea.clickSettingsLink();
  		ea.clickEditLink();
  		ea.selectCalculationType("Not Applicable");
  		ea.selectBasedOn("Independent Days");
  		ea.selectRoundOff("Actual");
  		ea.clickPFApplicabilty();
  		ea.clickESIApplicabilty();
  		ea.clickUpdateSalaryGroupDetail();
  		String s=ea.getMessage();
  		Assert.assertEquals(s, "Salary structure detail succesfully updated");
  	}
	@Test(priority=6)
	public void verifyDeleteAssignedHead_SC_251() throws Exception{
	 	DeleteAssignedSalaryHead da=new DeleteAssignedSalaryHead(driver);
	 	da.navigateMaster();
	 	da.clickSalaryStructureLink();
	 	da.clickSettingsLink();
		//da.edittoaddgroup();
	 	//da.updatesalarygroup();
	 	da.clickDeleteSalaryHead();
	 	da.switchToPopUpAndAccept(driver);
	 	String s=da.salaryheadcantbedeleted();
	 	Assert.assertEquals(s, "Selected salary structure detail can't be deleted.");
	 	Thread.sleep(2000);
	 	da.clickEditIconLink();
	 	da.selectCalculationType("Not Applicable");
	 	da.clickUpdateSalaryGroupDetail();
	 	Thread.sleep(2000);
	 	da.clickDeleteSalaryHead();
	 	da.switchToPopUpAndDismiss();
	 	Thread.sleep(2000);
	 	da.clickDeleteSalaryHead();
	 	da.switchToPopUpAndAccept(driver);
	 	String sa=da.getMessage();
	 	Assert.assertEquals(sa, "Salary structure detail successfully destroyed");
	}
	@Test(priority=7)
  	public void verifyDeletedSalaryStructure_SC_252() throws Exception{
  		DeleteSalaryStructure ss=new DeleteSalaryStructure(driver);
  		Thread.sleep(5000);
  		ss.navigateMaster();
  		ss.clickSalaryStructureLink();
  		ss.clickSettingsLink();
 		Thread.sleep(2000);
 		ss.clickDeleteSalaryHead();
 		Thread.sleep(2000);
  		String s=ss.getMessage();
  		Assert.assertEquals(s, "Salary structure detail successfully destroyed");
  		ss.navigateMaster();
  		ss.clickSalaryStructureLink();
  		ss.clickDeleteSalaryStructure();
  		Thread.sleep(2000);
  		ss.clickDeleteSalaryStructure1();
  		String d=ss.salarygroupdelete();
  		Assert.assertEquals(d, "Salary group succesfully deleted");
	}						  

}

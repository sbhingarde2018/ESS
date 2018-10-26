package com.spp.scripts;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;


import com.spp.common.BaseTest;
import com.spp.pages.AllotSalaryNotOnGross;
import com.spp.pages.AllotSalaryToEmployee;
import com.spp.pages.AllotSalaryViaExcel;
import com.spp.pages.AllotSalarytoanemployeeAfterchangingSalaryStructure;
import com.spp.pages.AssignNewHeadtoStructure;
import com.spp.pages.CheckIfSalHeadisAssignInSalStructure;
import com.spp.pages.CreateSalaryGroupusingEmployee;
import com.spp.pages.CreateSalaryHeadusingEmployee;
import com.spp.pages.EditClassificationDetailsChangeSalaryStructureofanemployee;



public class SalaryRateDetails extends BaseTest {

	/*@Test(priority=0)
	public void verifyAllotSalaryToEmployee_SC_98() throws Exception {
		System.out.println("Hello 1");
		AllotSalaryToEmployee rr= new AllotSalaryToEmployee(driver);
		rr.clickEmployeeLink();
		rr.selectSalaryRateDetails();
		rr.selectAdvancedFilterIcon();
		Thread.sleep(3000);
		
		rr.selectLoadButton();
		rr.selectAllotSalaryButton();
		rr.selectEffectiveFrom("Mar/2018");
		rr.selectGetRate();
		rr.enterGrossSal("40000");
		rr.enterConveyance("20000");
		rr.enterMess("2000");
		//rr.selectPopulateButton();
		rr.SelectSaveButton();
 		String s=rr.getMessage();
 		Assert.assertEquals(s, "Salary Allotted successfully");
		Thread.sleep(3000);
		rr.ClickSalaryAlloted();
		rr.ClickEdit();
	} 
	@Test(priority=1)
	public void verifyAllotSalaryNotOnGross_SC_99() throws Exception {
		AllotSalaryNotOnGross rr= new AllotSalaryNotOnGross(driver);
		rr.clickEmployeeLink();
		rr.selectSalaryRateDetails();
		rr.selectAdvancedFilterIcon();
		Thread.sleep(3000);
		
		rr.selectLoadButton();
		Thread.sleep(2000);
		rr.selectAllotSalaryButton();
		rr.selectEffectiveFrom("Mar/2018");
		rr.selectGetRate();
		Thread.sleep(3000);
		rr.enterBasic("20000");    //
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		//jse.executeScript("scroll(0, 1000);");
		rr.selectPopulateButton();
		Thread.sleep(3000);
		jse.executeScript("scroll(0, 1000);");
		Thread.sleep(3000);
		rr.SelectSaveButton();
 		String s=rr.getMessage();
 		Assert.assertEquals(s, "Salary Allotted successfully");
		Thread.sleep(3000);
		rr.ClickSalaryAlloted();
		rr.ClickEdit();
	} 
	@Test(priority=2)
	public void verifyAllotSalaryViaExcel_SC_100() throws InterruptedException {
		AllotSalaryViaExcel aa= new AllotSalaryViaExcel(driver);
		aa.clickEmployeeLink();
		aa.selectSalaryRateDetails();
		aa.selectSalaryRateTemplate();
		aa.selectMonthYear("Mar/2018");
		aa.selectSalaryStructure("Clone 2");
		aa.selectGetClick();
		Thread.sleep(2000);
		aa.selectLoadButton();
		aa.selectGenerateFileButton();
		// incomplete because of import excel 	functionality	
	}
	
	@Test(priority=3)
	public void EditClassificationDetailsChangeSalaryStructureofanemployee_SC_410() throws Exception{
		EditClassificationDetailsChangeSalaryStructureofanemployee dw= new EditClassificationDetailsChangeSalaryStructureofanemployee(driver);
		dw.clickonemployee();
		dw.clickonemployeedetails();
		dw.clickonfilter();
		Thread.sleep(2000);
		dw.clickonload();
		Thread.sleep(2000);
		dw.clickonview();
		Thread.sleep(2000);
		dw.clickonclassificationdetails();
		Thread.sleep(1000);
		dw.clickonedit();
		dw.selectsalarystructure("Gross Salary Structure");
		dw.updateclassificationdetails();
		Thread.sleep(2000);
		dw.switchToPopUpAndDismiss();
		Thread.sleep(2000);
		dw.updateclassificationdetails();
		Thread.sleep(2000);
		dw.switchToPopUpAndAccept(driver);
		String message = dw.getMessage();
		Assert.assertEquals(message, "Employee detail was successfully updated.");
	}
	@Test(priority=4)
	public void AllotSalarytoanemployeeAfterchangingSalaryStructure_SC_411() throws Exception{
		AllotSalarytoanemployeeAfterchangingSalaryStructure dw= new AllotSalarytoanemployeeAfterchangingSalaryStructure(driver);
		dw.clickonemployee();
		dw.clickonsalaryratedetails();
		dw.selectsalaryallotedtab();
		dw.clickonfilter();
		Thread.sleep(2000);
		dw.clickonload();
		Thread.sleep(2000);
		dw.clickonedit();
		Thread.sleep(2000);
		dw.selectefffrom("Jan/2018");
		dw.clickongetrate();
		Thread.sleep(2000);
		dw.entergrosssalary("25000");
		dw.clickonsave();
		String message = dw.getMessage();
		Assert.assertEquals(message, "Salary Allotted successfully");
	}
	
	@Test(priority=5)
	public void AssignNewHeadtoStructure_SC_412() throws Exception{
		AssignNewHeadtoStructure hs= new AssignNewHeadtoStructure(driver);
		hs.clickonmaster();
		hs.clickonsalarystructure();
		hs.clickonsettings();
		hs.assignnewhead();
		hs.selectsalhead("Leave");
		hs.selectcalculationtype("Every Month");
		hs.selectbasedon("Present Days");
		hs.checkpf();
		hs.checkesi();
		hs.selectefffrommonth("Jun/2018");
		hs.selectroundoff("Higher Rupee");
		hs.createsalarygrpdetail();
		String message = hs.getMessage();
		Assert.assertEquals(message, "Salary structure detail successfully created");
	}
	@Test(priority=6)
	public void CheckIfSalHeadisAssignInSalStructure_SC_413() throws Exception{
		CheckIfSalHeadisAssignInSalStructure ss=new CheckIfSalHeadisAssignInSalStructure(driver);
		ss.clickonemployee();
		ss.clickonsalaryratedetails();
		ss.selectsalaryallotedtab();
		ss.clickonfilter();
		Thread.sleep(2000);
		ss.clickonload();
		Thread.sleep(2000);
		ss.clickonedit();
		Thread.sleep(1000);
		System.out.println("Salary Head is Displayed");
	}
	
	@Test(priority=7)
	public void CreateSalaryHeadusingEmployee_SC_465() throws Exception{
		CreateSalaryHeadusingEmployee he=new CreateSalaryHeadusingEmployee(driver);
		he.clickonemployee();
		he.clickonsalaryratedetails();
		he.clickongenerallink();
		Thread.sleep(2000);
		he.clickonsalaryhead();
		he.addnewsalhead();
		he.enterheadname("Gross Salary");
		he.entershortname("GROSS87");
		he.createsalaryhead();
		String message = he.getMessage();
		Assert.assertEquals(message, "Salary head successfully created");
	}*/
		
	

	@Test(priority=8)
	public void CreateSalaryGroupusingEmployee_SC_466() throws Exception{
		CreateSalaryGroupusingEmployee ge=new CreateSalaryGroupusingEmployee(driver);
		ge.clickonemployee();
		ge.clickonsalaryratedetails();
		ge.clickongenerallink();
		Thread.sleep(2000);
		ge.clickonsalarystructure();
		ge.createnewsalstructure();
		ge.entersalstructurename("Gross Structure1");
		ge.checkbasedongross();
		ge.createsalstructure();
		String message = ge.getMessage();
		Assert.assertEquals(message, "Salary group successfully created");
	}
}



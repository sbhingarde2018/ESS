package com.spp.scripts;

import java.util.ArrayList;

import org.testng.annotations.Test;

import com.spp.common.BaseTest;
import com.spp.generics.Utility;
import com.spp.pages.CheckifLeaveMonthlyLeaveSummaryGeneralLinkEmployeeMasterredirectstoEmployeeMaster;
import com.spp.pages.GenerateAdvancedLeaveSummary;
import com.spp.pages.GenerateMonthlyLeaveSummary;

import junit.framework.Assert;

public class MonthlyLeaveSummary extends BaseTest{

	@Test(priority=0)
	public void GenerateMonthlyLeaveSummary_SC_118() throws Exception{
	GenerateMonthlyLeaveSummary gm=new GenerateMonthlyLeaveSummary(driver);
		gm.clickonReport();
		gm.clickonmonthlyleavesummary();
		gm.selectpaymonth("Jan/2020");
		Thread.sleep(2000);
		gm.selectleavepolicy("ClonePolicy");
		Thread.sleep(2000);
		gm.selectleavetype("Casual Leave (CL)");
		Thread.sleep(2000);
		gm.selectorderby("Ref No.");
		Thread.sleep(2000);
		gm.resizeWindow();
		Thread.sleep(2000);
		gm.clickongetemployees();
		Thread.sleep(3000);
		gm.clickonload();
		Thread.sleep(3000);
		gm.selectallemployees();
		Thread.sleep(1000);
		gm.generatereport();
		//ArrayList<String> excelnames = gm.getColumn();
		//ArrayList<String> webnames = new ArrayList<String>();
		//webnames.add("JOHN");
		//webnames.add("Alex");
		//boolean listcontains = gm.stringComp(excelnames, webnames);		
		//Assert.assertEquals(true, listcontains);
		Thread.sleep(2000);
		gm.exitFullscreen();
		Thread.sleep(2000);
	}
	
	@Test(priority=1)
	public void GenerateAdvancedLeaveSummary_SC_119() throws Exception{
	GenerateAdvancedLeaveSummary gm=new GenerateAdvancedLeaveSummary(driver);
		gm.clickonReport();
		gm.clickonmonthlyleavesummary();
		gm.selectpaymonth("Jan/2020");
		Thread.sleep(2000);
		gm.selectleavepolicy("ClonePolicy");
		Thread.sleep(2000);
		gm.selectleavetype("Casual Leave (CL)");
		Thread.sleep(2000);
		gm.selectorderby("Ref No.");
		Thread.sleep(2000);
		gm.resizeWindow();
		Thread.sleep(2000);
		gm.clickongetemployees();
		Thread.sleep(2000);
		gm.clickonload();
		Thread.sleep(2000);
		gm.selectallemployees();
		gm.selectadvanceleavesummary();
		Thread.sleep(2000);
		gm.generatereport();
		Thread.sleep(2000);
		//ArrayList<String> excelnames = gm.getColumn();
		//System.out.println(excelnames.toString());
		//ArrayList<String> webnames = new ArrayList<String>();
		//webnames.add("JOHN");
		//webnames.add("Alex");
		//boolean listcontains = gm.stringComp(excelnames, webnames);		
		//Assert.assertEquals(true, listcontains);
		//Thread.sleep(2000);
		gm.exitFullscreen();
		Thread.sleep(2000);
	}
	
	@Test(priority=2)
	public void CheckifLeaveMonthlyLeaveSummaryGeneralLinkEmployeeMasterredirectstoEmployeeMaster_SC_486() throws Exception{
		CheckifLeaveMonthlyLeaveSummaryGeneralLinkEmployeeMasterredirectstoEmployeeMaster la=new CheckifLeaveMonthlyLeaveSummaryGeneralLinkEmployeeMasterredirectstoEmployeeMaster(driver);
		la.clickonReport();
		la.clickonmonthlyleavesummary();
	//	la.clickongenerallinks();
		la.clickonemployeemaster();
		Thread.sleep(2000);
		la.addnewemployee();
		la.enterEmployeeid("ABC12983");
		la.enterEmployeeref("Ref-90011");
		la.enterEmployeename("Arihant");
		la.enterEmployeefather("Harish");
		la.selectDateofBirth("06 June 1995");
		la.selectGender("Female");
		la.selectMaritalStatus("Single");
		la.selectDateofJoining("06 June 2018");
		Thread.sleep(3000);
		la.clickPresentAddress();
		la.selectState("Maharashtra");
		la.selectclassificationdetail();
		la.selectsalstructure("Structure");
		la.selectbranch("default");
		la.selectattendancestructure("Karnataka");
		la.selectbank("CASH");
		la.selectleavepolicy("Default");
		Thread.sleep(2000);
		la.createemployee();
		String s=la.getMessage();
 		Assert.assertEquals(s, "Employee successfully created");
 		Thread.sleep(3000);
 		la.ClickEmpMod();
 		la.ClickEmpdetails();
 		la.ClickFilter();
 		la.resizeWindow();
 		Thread.sleep(3000);
 		la.ClickLoad();
 		Thread.sleep(3000);
 		la.exitFullscreen();
 		la.enterSearch("Arihant");
 		la.ClickDelete();
 		Thread.sleep(2000);
	}
}
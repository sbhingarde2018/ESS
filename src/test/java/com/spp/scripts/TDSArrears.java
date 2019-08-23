package com.spp.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.spp.common.BaseTest;
import com.spp.generics.Utility;
import com.spp.pages.AddNewEmployee;
import com.spp.pages.AddNewEmployeeTDS;
import com.spp.pages.AddNewSalaryAllotment;
//import com.spp.pages.ComputeArrear;
import com.spp.pages.CreateArrear;
import com.spp.pages.PublishSalary;
import com.spp.pages.TDSComputation;
import com.spp.pages.ToCheckTDSArrears;


public class TDSArrears extends BaseTest {

	
	@Test(priority=0)
	public void AddNewEmployee_SC_326() throws Exception{
		AddNewEmployeeTDS at=new AddNewEmployeeTDS(driver);
		at.navigateEmployee();
		at.clickEmployeeDetails();
		at.clickAddNewEmployee();
		Thread.sleep(3000);
		at.enterEmployeeId("TATA53866");
		at.enterEmployeeRefNo("TATA721666");
		at.enterEmployeeName("Rihana");
		at.enterFathername("Neil");
		at.enterdob("14 June 1980");
		at.selectGender("Female");
		at.selectMaritalStatus("Single");
		at.enterdoj("01 March 2019");
		//at.entersaldate("01 February 2013");
		Thread.sleep(1000);
		//at.selectPresentadd();
		at.selectstate("Maharashtra");
		Thread.sleep(1000);
		at.selectstatdetails();
		at.checkTDS();
		at.selectpanoption("ADD PAN");
		at.enterpanno("PRAPT6351P");
		at.entereffectivedatePAN("01 January 2013");
		Thread.sleep(1000);
		at.selectclassificationdetail();
		at.selectsalstructure("Structure");
		at.selectbranch("default");
		at.selectattendancestructure("Karnataka");
		at.selectbank("CASH");
		at.selectleavepolicy("Default");
		Thread.sleep(2000);
		at.selectdesignation("Tester");
		Thread.sleep(2000);
		at.createemployee();
		String s=at.getMessage();
		Assert.assertEquals(s, "Employee successfully created");
	}
	@Test(priority=1)
	public void AddNewSalaryAllotment_SC_327() throws Exception{
		AddNewSalaryAllotment ad=new AddNewSalaryAllotment(driver);
		ad.clickonemployee();
		ad.clickonsalaryratedetails();
		ad.clickonlistingemployee();
		ad.resizeWindow();
		ad.clickonfilter();
		Thread.sleep(2000);
		ad.clickonload();
		Thread.sleep(5000);
		ad.exitFullscreen();
		Thread.sleep(3000);
		ad.selectpagetwo();
		ad.clickonallotsalary();
		Thread.sleep(1000);
		ad.selectmonthyear("May/2019");
		Thread.sleep(3000);
		ad.entergrosssal("20000");
		ad.clickonsave();
		String y=ad.getMessage();
		Assert.assertEquals(y, "Salary Allotted successfully");
	}
	@Test(priority=2)
	public void PublishSalary_SC_330() throws Exception{
		PublishSalary ab=new PublishSalary(driver);
		ab.selectSalary();
		ab.selectSalaryEditor();
		Thread.sleep(3000);
		ab.selectPayMonth("May/2019");
		ab.selectSalaryStructure("Structure");
		ab.selectGetValues();
		ab.resizeWindow();
		Thread.sleep(3000);
		ab.selectLoad();
		Thread.sleep(5000);
		ab.exitFullscreen();
		ab.selectProcess();
		Thread.sleep(3000);
		ab.selectEdit();
		ab.selectSubmitForReview();
		Thread.sleep(3000);
		ab.selectEdit();
		ab.selectSalary();
		ab.selectReview();
		ab.selectview();
		Thread.sleep(3000);
		ab.selectpublish();
		String i=ab.getMessage();
		Assert.assertEquals(i, "Salary is published successfully");
	}
	@Test(priority=4)
	public void CreateArrear_SC_331() throws InterruptedException{
		CreateArrear cc=new CreateArrear(driver);
		cc.clickSalaryLink();
		cc.selectArrears();
		cc.selectCreateArrear();
		cc.EnterArrearName("new_"+Utility.getRandNum(2000, 3000));
		cc.selectArrearFrom("Mar/2017");
		cc.selectArrearTo("May/2017");
		Thread.sleep(3000);
		cc.selectArrearRefMonth("May/2017");
		cc.selectPaymonth("May/2017");
		cc.ClickCreateButton();
		String t=cc.getMessage();
		Assert.assertEquals(t, "Arrear was successfully created.");
	}
	/*@Test(priority=5)
	public void ComputeArrear_SC_332() throws InterruptedException{
		ComputeArrear ca=new ComputeArrear(driver);
		ca.clickSalaryLink();
		ca.selectArrears();
		ca.selectComputation();
		ca.EnterAddEmployee();
		ca.resizeWindow();
		Thread.sleep(3000);
		ca.ClickLoad();
		Thread.sleep(3000);
		ca.exitFullscreen();
		ca.ClickSave();
		String y=ca.getMessage();
		Assert.assertEquals(y, "Employees Added Successfully.");
	}*/
	@Test(priority=6)
	public void TDSComputation_SC_333() throws Exception{
		TDSComputation tc=new TDSComputation(driver);
		tc.clickontds();
		tc.clickoncomputation();
		tc.selectfinancialyear("2017/2018");
		tc.clickonfilter();
		tc.resizeWindow();
		Thread.sleep(3000);
		tc.ClickOnLoad();
		Thread.sleep(4000);
		tc.exitFullscreen();
		tc.ClickOnCompute();
	}
	@Test(priority=7)
	public void ToCheckTDSArrears_SC_334() throws Exception{
		ToCheckTDSArrears ab=new ToCheckTDSArrears(driver);
		ab.clickonTDS();
		ab.clickonComputationalDetails();
		Thread.sleep(3000);
		ab.clickonTDS();
		Thread.sleep(2000);
		}
	}

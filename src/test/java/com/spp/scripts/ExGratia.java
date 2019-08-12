package com.spp.scripts;

import org.testng.annotations.Test;
import com.spp.common.BaseTest;
import com.spp.generics.Utility;
import com.spp.pages.ComputeExGratia;
import com.spp.pages.DeleteExGratia;
import com.spp.pages.SalaryExGratiaAddNewExGratiadefinition;
import com.spp.pages.UpdateExGratiaComputation;

import junit.framework.Assert;

public class ExGratia extends BaseTest {
	@Test(priority=0)
	public void SalaryExGratiaAddNewExGratiadefinition_SC_315() throws Exception{
		SalaryExGratiaAddNewExGratiadefinition cc=new SalaryExGratiaAddNewExGratiadefinition(driver);
		cc.Clicksalary();
		cc.ClickExGratia();
		cc.ClickAddnewexgratia();
		cc.EnterExgratiahead("GratiaTest");
		cc.SelectFormula("Bonus");
		cc.SelectFromMonth("Jan/2019");
		cc.SelectToMonth("Dec/2020");
		cc.SelectPayMonth("Dec/2020");
		cc.ClickCreateExGratiaBtn();
		String i=cc.getMessage();
		Assert.assertEquals(i, "Ex-Gratia successfully created");
		cc.ClickDeleteBtn();
		cc.switchToPopUpAndAccept(driver);
		}
	
	@Test(priority=1)
	public void ComputeExGratia_SC_339() throws Exception{
		ComputeExGratia cc=new ComputeExGratia(driver);
		cc.Clicksalary();
		cc.ClickExGratia();
		cc.ClickCompute();
	}
	@Test(priority=2)
	public void UpdateExGratiaComputation_SC_404() throws Exception{
		UpdateExGratiaComputation cc=new UpdateExGratiaComputation(driver);
		cc.Clicksalary();
		cc.ClickExGratia();
		cc.ClickCompute();
		cc.ClickEdit();
		cc.EnterExgratiaGiven("200");
		cc.ClickUpdateComputation();
		String i=cc.getMessage();
		Assert.assertEquals(i, "Pateti Computation Updated");
	}
	@Test(priority=3)
	public void DeleteExGratia_SC_405() throws Exception{
		DeleteExGratia cc=new DeleteExGratia(driver);
		cc.Clicksalary();
		cc.ClickExGratia();
		cc.ClickCompute();
		cc.ClickDelete();
		cc.switchToPopUpAndDismiss();
		cc.ClickDelete();
		cc.switchToPopUpAndAccept(driver);
		String i=cc.getMessage();
		Assert.assertEquals(i, "Pateti Computation deleted");
	}
}

package com.spp.scripts;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.spp.common.BaseTest;
import com.spp.pages.AddNewFullandFinalSettlementwithIncludeHeldSalaryAmount;

public class FullandFinalSettlement extends BaseTest{

	
	@Test(priority=0)
	public void AddNewFullandFinalSettlementwithIncludeHeldSalaryAmount_SC_972() throws Exception {
		AddNewFullandFinalSettlementwithIncludeHeldSalaryAmount ad = new AddNewFullandFinalSettlementwithIncludeHeldSalaryAmount(driver);
		ad.clickonsalary();
		ad.clickonFNF();
		ad.AddnewFNF();
		ad.SelectEmployee("Ashish(REF09)");
		ad.includeheldsalamount();
		ad.createfnf();
		String e=ad.getmessage();
		Assert.assertEquals(e, "Full And Final Settlement successfully created");
		ad.clickdelete();
	}
	@Test(priority=1)
	public void AddNewFullandFinalSettlementwithIncludePendingAdvanceAmount_SC_973() throws Exception {
		AddNewFullandFinalSettlementwithIncludeHeldSalaryAmount ad = new AddNewFullandFinalSettlementwithIncludeHeldSalaryAmount(driver);
		ad.clickonsalary();
		ad.clickonFNF();
		ad.AddnewFNF();
		ad.SelectEmployee("Ashish(REF09)");
		ad.includependingadvanceamount();
		ad.createfnf();
		String e=ad.getmessage();
		Assert.assertEquals(e, "Full And Final Settlement successfully created");
		ad.clickdelete();
	}
	@Test(priority=2)
	public void AddNewFullandFinalSettlementwithIncludelastmonthSalarySalarySummary_SC_974() throws Exception {
		AddNewFullandFinalSettlementwithIncludeHeldSalaryAmount ad = new AddNewFullandFinalSettlementwithIncludeHeldSalaryAmount(driver);
		ad.clickonsalary();
		ad.clickonFNF();
		ad.AddnewFNF();
		ad.SelectEmployee("Ashish(REF09)");
		ad.includelastsalamount();
		ad.createfnf();
		String e=ad.getmessage();
		Assert.assertEquals(e, "Full And Final Settlement successfully created");
		ad.clickdelete();
	}
	@Test(priority=3)
	public void AddNewFullandFinalSettlementwithIncludeOpenComponent_SC_975() throws Exception {
		AddNewFullandFinalSettlementwithIncludeHeldSalaryAmount ad = new AddNewFullandFinalSettlementwithIncludeHeldSalaryAmount(driver);
		ad.clickonsalary();
		ad.clickonFNF();
		ad.AddnewFNF();
		ad.SelectEmployee("Ashish(REF09)");
		ad.includeopencomponent();
		ad.createfnf();
		String e=ad.getmessage();
		Assert.assertEquals(e, "Full And Final Settlement successfully created");
		ad.clickdelete();
	}
	@Test(priority=4)
	public void AddNewFullandFinalSettlementwithIncludePendingLoanAmount_SC_976() throws Exception {
		AddNewFullandFinalSettlementwithIncludeHeldSalaryAmount ad = new AddNewFullandFinalSettlementwithIncludeHeldSalaryAmount(driver);
		ad.clickonsalary();
		ad.clickonFNF();
		ad.AddnewFNF();
		ad.SelectEmployee("Ashish(REF09)");
		ad.includependingloanamount();
		ad.createfnf();
		String e=ad.getmessage();
		Assert.assertEquals(e, "Full And Final Settlement successfully created");
		ad.clickdelete();
	}
	@Test(priority=5)
	public void AddNewFullandFinalSettlementwithIncludeHeldSalaryAmountIncludePendingAdvanceAmount_SC_978() throws Exception {
		AddNewFullandFinalSettlementwithIncludeHeldSalaryAmount ad = new AddNewFullandFinalSettlementwithIncludeHeldSalaryAmount(driver);
		ad.clickonsalary();
		ad.clickonFNF();
		ad.AddnewFNF();
		ad.SelectEmployee("Ashish(REF09)");
		ad.includeheldsalamount();
		ad.includependingadvanceamount();
		ad.createfnf();
		String e=ad.getmessage();
		Assert.assertEquals(e, "Full And Final Settlement successfully created");
		ad.clickdelete();
	}
	@Test(priority=6)
	public void AddNewFullandFinalSettlementwithIncludeHeldSalaryAmountDetailedSalary_SC_979() throws Exception {
		AddNewFullandFinalSettlementwithIncludeHeldSalaryAmount ad = new AddNewFullandFinalSettlementwithIncludeHeldSalaryAmount(driver);
		ad.clickonsalary();
		ad.clickonFNF();
		ad.AddnewFNF();
		ad.SelectEmployee("Ashish(REF09)");
		ad.includeheldsalamount();
		ad.includelastsalamount();
		ad.includedetailsalamount();
		ad.createfnf();
		String e=ad.getmessage();
		Assert.assertEquals(e, "Full And Final Settlement successfully created");
		ad.clickdelete();
	}
	@Test(priority=7)
	public void AddNewFullandFinalSettlementwithIncludeHeldSalaryAmountSalarySummary_SC_979() throws Exception {
		AddNewFullandFinalSettlementwithIncludeHeldSalaryAmount ad = new AddNewFullandFinalSettlementwithIncludeHeldSalaryAmount(driver);
		ad.clickonsalary();
		ad.clickonFNF();
		ad.AddnewFNF();
		ad.SelectEmployee("Ashish(REF09)");
		ad.includeheldsalamount();
		ad.includelastsalamount();
		ad.includesalsummaryamount();
		ad.createfnf();
		String e=ad.getmessage();
		Assert.assertEquals(e, "Full And Final Settlement successfully created");
		ad.clickdelete();
	}
	
}

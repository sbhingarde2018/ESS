package com.spp.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.spp.common.BaseTest;
import com.spp.generics.Utility;
import com.spp.pages.TocheckTaxcalculationbasedonDeclaredAmount;
import com.spp.pages.TocheckTaxcalculationbasedonProofAmount;
import com.spp.pages.TocheckifProofAmountcanbesetforTDSCalculation;
import com.spp.pages.TocheckifbydefaultsettingisbasedonDeclaredAmount;
import com.spp.pages.ToseeifthesettingrevertsbacktoDeclaredAmountwithstartofnewfinancialyear;

public class TDSOptionsSettings extends BaseTest {
	@Test(priority=0)
	public void TocheckifbydefaultsettingisbasedonDeclaredAmount_SC_1024() throws Exception {
		TocheckifbydefaultsettingisbasedonDeclaredAmount ab=new TocheckifbydefaultsettingisbasedonDeclaredAmount(driver);
		ab.ClickTDS();
		ab.ClickOPtionsSettings();
		Thread.sleep(2000);
	}
	@Test(priority=1)
	public void TocheckifProofAmountcanbesetforTDSCalculation_SC_1025() throws Exception {
		TocheckifProofAmountcanbesetforTDSCalculation ab=new TocheckifProofAmountcanbesetforTDSCalculation(driver);
		ab.ClickTDS();
		ab.ClickOPtionsSettings();
		ab.ClickProofAmount();
		Thread.sleep(2000);
		ab.SelectMonthYear("May/2020");
		ab.ClickSaveBtn();
		//String i=ab.getMessage();
		//Assert.assertEquals(i, "Tds Computation Settings Saved Successfully");
		Thread.sleep(2000);
		ab.ClickDeclaredAmount();
		ab.ClickSaveBtn();
	}
	@Test(priority=2)
	public void TocheckTaxcalculationbasedonDeclaredAmount_SC_1037() throws Exception {
		TocheckTaxcalculationbasedonDeclaredAmount ab=new TocheckTaxcalculationbasedonDeclaredAmount(driver);
		ab.ClickTDS();
		ab.ClickComputationalDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickVIDeductions();
		Thread.sleep(2000);
		ab.ClickDeductions80C();
		Thread.sleep(2000);
		ab.SelectParticulars("Annuity plan of LIC");
		ab.EnterGrossAmount("10000");
		ab.EnterProofAmount("5000");
		ab.ClickSaveBtn();
		Thread.sleep(2000);
		ab.ClickTDS();
		
		
	}
	@Test(priority=3)
	public void TocheckTaxcalculationbasedonProofAmount_SC_1040() throws Exception {
		TocheckTaxcalculationbasedonProofAmount ab=new TocheckTaxcalculationbasedonProofAmount(driver);
		ab.ClickTDS();
		ab.ClickOPtionsSettings();
		ab.ClickProofAmount();
		Thread.sleep(2000);
		ab.SelectMonthYear("Apr/2018");
		ab.ClickSaveBtn1();
		ab.ClickTDS();
		ab.ClickComputationalDetails();
		Thread.sleep(2000);
		ab.ClickDetails();
		Thread.sleep(2000);
		ab.ClickVIDeductions();
		Thread.sleep(2000);
		ab.ClickDeductions80C();
		Thread.sleep(2000);
		ab.SelectParticulars("Annuity plan of LIC");
		ab.EnterGrossAmount("10000");
		ab.EnterProofAmount("5000");
		ab.ClickSaveBtn();
	}
	@Test(priority=4)
	public void ToseeifthesettingrevertsbacktoDeclaredAmountwithstartofnewfinancialyear_SC_1042() throws Exception {
		ToseeifthesettingrevertsbacktoDeclaredAmountwithstartofnewfinancialyear ab=new ToseeifthesettingrevertsbacktoDeclaredAmountwithstartofnewfinancialyear(driver);
		ab.ClickSalary();
		ab.ClickPaymonth();
		Thread.sleep(2000);
		ab.clickCreatePaymonth();
		Thread.sleep(2000);
		ab.switchToPopUpAndAccept(driver);
		Thread.sleep(2000);
		ab.ClickTDS();
		ab.ClickOptionSettings();
		Thread.sleep(2000);
	}
}

package com.spp.scripts;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.spp.common.BaseTest;
import com.spp.generics.Utility;
import com.spp.pages.AddNewGratuity;
import com.spp.pages.AddNewGratuitywithSalaryConsideredEarnedPaymentmodeDD;
import com.spp.pages.AddNewGratuitywithSalaryConsideredEarnedPaymentmodeDDChequeDDNo;
import com.spp.pages.AddNewGratuitywithSalaryConsideredEarnedPaymentmodeIncludeinFSS;
import com.spp.pages.AddNewGratuitywithSalaryConsideredEarnedPaymentmodeStateBank;
import com.spp.pages.AddNewGratuitywithSalaryConsideredEarnedPaymentmodeStateBankChequeDDNo;
import com.spp.pages.AddNewGratuitywithSalaryConsideredTheoreticalChequeDDNoChequeDDdate;
import com.spp.pages.AddNewGratuitywithSalaryConsideredTheoreticalPaymentmodeCash;
import com.spp.pages.AddNewGratuitywithSalaryConsideredTheoreticalPaymentmodeDD;
import com.spp.pages.AddNewGratuitywithSalaryConsideredTheoreticalPaymentmodeDDChequeDDNo;
import com.spp.pages.AddNewGratuitywithSalaryConsideredTheoreticalPaymentmodeDDChequeDDNoChequeDDdate;
import com.spp.pages.AddNewGratuitywithSalaryConsideredTheoreticalPaymentmodeICICIBankLTD;
import com.spp.pages.AddNewGratuitywithSalaryConsideredTheoreticalPaymentmodeICICIBankLtdChequeDDNo;
import com.spp.pages.AddNewGratuitywithSalaryConsideredTheoreticalPaymentmodeIncludeinFFS;
import com.spp.pages.CheckGratuityinthegeneratedReport;
import com.spp.pages.DeleteGratuity;
import com.spp.pages.UpdateGratuity;

public class Gratuity extends BaseTest {

	@Test(priority=0)
	public void AddNewGratuity_SC_342() throws Exception {
		AddNewGratuity ag = new AddNewGratuity(driver);
		ag.clickonsalary();
		ag.clickongratutiy();
		ag.addnewgratuity();
		ag.selectEmployee("Ashish(REF09)");
		Thread.sleep(3000);
		ag.selectmodeofPayment("CASH");
		ag.enterdateofpayment("01 August 2019");
		ag.clickCompute();
		ag.clickCreateGratuity();
		Thread.sleep(2000);
		ag.switchToPopUpAndAccept(driver);
		String i=ag.getMessage();
		Assert.assertEquals(i, "Gratuity successfully created");
	}
	
	@Test(priority=1)
	public void CheckGratuityinthegeneratedReport_SC_350() throws Exception {
		CheckGratuityinthegeneratedReport ag=new CheckGratuityinthegeneratedReport(driver);
		ag.ClickSalary();
		ag.ClickGratuity();
		ag.ClickReport();
		ag.ClickGetEmp();
		ag.resizeWindow();
		Thread.sleep(2000);
		ag.ClickLoad();
		ag.exitFullscreen();
		Thread.sleep(3000);
		ag.ClickSelectEmp();
		ag.ClickGenerateReport();
	}
	
	@Test(priority=2)
	public void UpdateGratuity_SC_406() throws Exception {
		UpdateGratuity ag=new UpdateGratuity(driver);
		ag.clicksalary();
		ag.clickgratutiy();
		ag.clickEdit();
		Thread.sleep(3000);
		ag.selectmodeofPayment("State Bank of India");
		ag.EnterChequeNo("89767");
		ag.ClickUpdateGratuity();
		Thread.sleep(2000);
		ag.switchToPopUpAndAccept(driver);
		String i=ag.getMessage();
		Assert.assertEquals(i, "Gratuity successfully updated");
	}
	
	@Test(priority=3)
	public void DeleteGratuity_SC_407() throws Exception {
		DeleteGratuity ag=new DeleteGratuity(driver);
		ag.clickSalary();
		ag.ClickGratuity();
		ag.clickDelete();
		ag.switchToPopUpAndDismiss();
		ag.clickDelete();
		ag.switchToPopUpAndAccept(driver);
	}
	
	@Test(priority=4)
	public void AddNewGratuitywithSalaryConsideredEarnedPaymentmodeDD_SC_909() throws Exception {
		AddNewGratuitywithSalaryConsideredEarnedPaymentmodeDD ag=new AddNewGratuitywithSalaryConsideredEarnedPaymentmodeDD(driver);
		ag.clickonsalary();
		ag.clickongratutiy();
		ag.addnewgratuity();
		ag.selectEmployee("Ashish(REF09)");
		Thread.sleep(3000);
		ag.selectmodeofPayment("DD");
		ag.enterdateofpayment("01 August 2019");
		ag.clickCompute();
		ag.clickCreateGratuity();
		Thread.sleep(2000);
		ag.switchToPopUpAndAccept(driver);
		String i=ag.getMessage();
		Assert.assertEquals(i, "Gratuity successfully created");
		Thread.sleep(2000);
		ag.clickDelete();
	}
	
	@Test(priority=5)
	public void AddNewGratuitywithSalaryConsideredEarnedPaymentmodeIncludeinFSS_SC_910() throws Exception {
		AddNewGratuitywithSalaryConsideredEarnedPaymentmodeIncludeinFSS ag=new AddNewGratuitywithSalaryConsideredEarnedPaymentmodeIncludeinFSS(driver);
		ag.clickonsalary();
		ag.clickongratutiy();
		ag.addnewgratuity();
		ag.selectEmployee("Ashish(REF09)");
		Thread.sleep(3000);
		ag.selectmodeofPayment("Include in FFS");
		ag.enterdateofpayment("01 August 2019");
		ag.clickCompute();
		ag.clickCreateGratuity();
		Thread.sleep(2000);
		ag.switchToPopUpAndAccept(driver);
		String i=ag.getMessage();
		Assert.assertEquals(i, "Gratuity successfully created");
		Thread.sleep(2000);
		ag.clickDelete();
	}
	
	@Test(priority=6)
	public void AddNewGratuitywithSalaryConsideredEarnedPaymentmodeStateBank_SC_911() throws Exception {
		AddNewGratuitywithSalaryConsideredEarnedPaymentmodeStateBank ag=new AddNewGratuitywithSalaryConsideredEarnedPaymentmodeStateBank(driver);
		ag.clickonsalary();
		ag.clickongratutiy();
		ag.addnewgratuity();
		ag.selectEmployee("Ashish(REF09)");
		Thread.sleep(3000);
		ag.selectmodeofPayment("State Bank of India");
		ag.enterdateofpayment("01 August 2019");
		ag.EnterChequeNo("89767");
		ag.clickCompute();
		ag.clickCreateGratuity();
		Thread.sleep(2000);
		ag.switchToPopUpAndAccept(driver);
		String i=ag.getMessage();
		Assert.assertEquals(i, "Gratuity successfully created");
		Thread.sleep(2000);
		ag.clickDelete();
	}
	
	@Test(priority=7)
	public void AddNewGratuitywithSalaryConsideredTheoreticalPaymentmodeCash_SC_912() throws Exception {
		AddNewGratuitywithSalaryConsideredTheoreticalPaymentmodeCash ag=new AddNewGratuitywithSalaryConsideredTheoreticalPaymentmodeCash(driver);
		ag.clickonsalary();
		ag.clickongratutiy();
		ag.addnewgratuity();
		ag.selectEmployee("Ashish(REF09)");
		Thread.sleep(3000);
		ag.selectmodeofPayment("CASH");
		ag.enterdateofpayment("01 August 2019");
		ag.clickCompute();
		ag.clickCreateGratuity();
		Thread.sleep(2000);
		ag.switchToPopUpAndAccept(driver);
		String i=ag.getMessage();
		Assert.assertEquals(i, "Gratuity successfully created");
		Thread.sleep(2000);
		ag.clickDelete();
	}
	
}

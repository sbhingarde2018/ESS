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
import com.spp.pages.GratuitywithSalaryConsideredEarnedPaymentmodeDDSelectedSalaryHeads;
import com.spp.pages.UpdateGratuity;

public class Gratuity extends BaseTest {

	/*@Test(priority=0)
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
	
	@Test(priority=8)
	public void AddNewGratuitywithSalaryConsideredTheoreticalPaymentmodeDD_SC_913() throws Exception {
		AddNewGratuitywithSalaryConsideredTheoreticalPaymentmodeDD ag=new AddNewGratuitywithSalaryConsideredTheoreticalPaymentmodeDD(driver);
		ag.clickonsalary();
		ag.clickongratutiy();
		ag.addnewgratuity();
		ag.selectEmployee("Ashish(REF09)");
		Thread.sleep(3000);
		ag.selectSalaryConsideredTheoretical();
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
	
	@Test(priority=9)
	public void AddNewGratuitywithSalaryConsideredTheoreticalPaymentmodeIncludeinFFS_SC_914() throws Exception {
		AddNewGratuitywithSalaryConsideredTheoreticalPaymentmodeIncludeinFFS ag=new AddNewGratuitywithSalaryConsideredTheoreticalPaymentmodeIncludeinFFS(driver);
		ag.clickonsalary();
		ag.clickongratutiy();
		ag.addnewgratuity();
		ag.selectEmployee("Ashish(REF09)");
		Thread.sleep(3000);
		ag.selectSalaryConsideredTheoretical();
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
	
	@Test(priority=10)
	public void AddNewGratuitywithSalaryConsideredTheoreticalPaymentmodeDDChequeDDNo_SC_915() throws Exception {
		AddNewGratuitywithSalaryConsideredTheoreticalPaymentmodeDDChequeDDNo ag=new AddNewGratuitywithSalaryConsideredTheoreticalPaymentmodeDDChequeDDNo(driver);
		ag.clickonsalary();
		ag.clickongratutiy();
		ag.addnewgratuity();
		ag.selectEmployee("Ashish(REF09)");
		Thread.sleep(3000);
		ag.selectSalaryConsideredTheoretical();
		Thread.sleep(3000);
		ag.selectmodeofPayment("DD");
		ag.EnterChequeNo("89767");
		ag.enterdateofpayment("01 August 2019");
		ag.clickCompute();
		ag.clickCreateGratuity();
		Thread.sleep(2000);
		ag.switchToPopUpAndAccept(driver);
		String i=ag.getMessage();
		Assert.assertEquals(i, "Gratuity successfully created");
		Thread.sleep(2000);
		ag.clickDelete();
	}*/
	
	/*@Test(priority=11)
	public void AddNewGratuitywithSalaryConsideredTheoreticalPaymentmodeICICIBankLTD_SC_916() throws Exception {
		AddNewGratuitywithSalaryConsideredTheoreticalPaymentmodeICICIBankLTD ag=new AddNewGratuitywithSalaryConsideredTheoreticalPaymentmodeICICIBankLTD(driver);
		ag.clickonsalary();
		ag.clickongratutiy();
		ag.addnewgratuity();
		ag.selectEmployee("Ashish(REF09)");
		Thread.sleep(3000);
		ag.selectSalaryConsideredTheoretical();
		Thread.sleep(3000);
		ag.selectmodeofPayment("ICICI Bank Ltd");
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
	
	@Test(priority=12)
	public void AddNewGratuitywithSalaryConsideredTheoreticalPaymentmodeICICIBankLtdChequeDDNo_SC_919() throws Exception {
		AddNewGratuitywithSalaryConsideredTheoreticalPaymentmodeICICIBankLtdChequeDDNo ag=new AddNewGratuitywithSalaryConsideredTheoreticalPaymentmodeICICIBankLtdChequeDDNo(driver);
		ag.clickonsalary();
		ag.clickongratutiy();
		ag.addnewgratuity();
		ag.selectEmployee("Ashish(REF09)");
		Thread.sleep(3000);
		ag.selectSalaryConsideredTheoretical();
		Thread.sleep(3000);
		ag.selectmodeofPayment("ICICI Bank Ltd");
		ag.EnterChequeNo("89767");
		ag.enterdateofpayment("01 August 2019");
		ag.clickCompute();
		ag.clickCreateGratuity();
		Thread.sleep(2000);
		ag.switchToPopUpAndAccept(driver);
		String i=ag.getMessage();
		Assert.assertEquals(i, "Gratuity successfully created");
		Thread.sleep(2000);
		ag.clickDelete();
	}*/
	
	/*@Test(priority=13)
	public void AddNewGratuitywithSalaryConsideredEarnedPaymentmodeDDChequeDDNo_SC_920() throws Exception {
		AddNewGratuitywithSalaryConsideredEarnedPaymentmodeDDChequeDDNo ag=new AddNewGratuitywithSalaryConsideredEarnedPaymentmodeDDChequeDDNo(driver);
		ag.clickonsalary();
		ag.clickongratutiy();
		ag.addnewgratuity();
		ag.selectEmployee("Ashish(REF09)");
		Thread.sleep(3000);
		ag.selectmodeofPayment("DD");
		ag.EnterChequeNo("89767");
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
	
	@Test(priority=14)
	public void AddNewGratuitywithSalaryConsideredEarnedPaymentmodeStateBankChequeDDNo_SC_921() throws Exception {
		AddNewGratuitywithSalaryConsideredEarnedPaymentmodeStateBankChequeDDNo ag=new AddNewGratuitywithSalaryConsideredEarnedPaymentmodeStateBankChequeDDNo(driver);
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
	
	@Test(priority=15)
	public void AddNewGratuitywithSalaryConsideredTheoreticalPaymentmodeDDChequeDDNoChequeDDdate_SC_922() throws Exception {
		AddNewGratuitywithSalaryConsideredTheoreticalPaymentmodeDDChequeDDNoChequeDDdate ag=new AddNewGratuitywithSalaryConsideredTheoreticalPaymentmodeDDChequeDDNoChequeDDdate(driver);
		ag.clickonsalary();
		ag.clickongratutiy();
		ag.addnewgratuity();
		ag.selectEmployee("Ashish(REF09)");
		Thread.sleep(3000);
		ag.selectSalaryConsideredTheoretical();
		Thread.sleep(3000);
		ag.selectmodeofPayment("DD");
		ag.EnterChequeNo("89767");
		ag.enterdateofpayment("01 August 2019");
		ag.EnterChequeDate("10 August 2019");
		ag.clickCompute();
		ag.clickCreateGratuity();
		Thread.sleep(2000);
		ag.switchToPopUpAndAccept(driver);
		String i=ag.getMessage();
		Assert.assertEquals(i, "Gratuity successfully created");
		Thread.sleep(2000);
		ag.clickDelete();
	}*/
	
	/*@Test(priority=16)
	public void AddNewGratuitywithSalaryConsideredTheoreticalChequeDDNoChequeDDdate_SC_923() throws Exception {
		AddNewGratuitywithSalaryConsideredTheoreticalChequeDDNoChequeDDdate ag=new AddNewGratuitywithSalaryConsideredTheoreticalChequeDDNoChequeDDdate(driver);
		ag.clickonsalary();
		ag.clickongratutiy();
		ag.addnewgratuity();
		ag.selectEmployee("Ashish(REF09)");
		Thread.sleep(3000);
		ag.selectSalaryConsideredTheoretical();
		Thread.sleep(3000);
		ag.selectmodeofPayment("ICICI Bank Ltd");
		ag.EnterChequeNo("89767");
		ag.enterdateofpayment("01 August 2019");
		ag.EnterChequeDate("10 August 2019");
		ag.clickCompute();
		ag.clickCreateGratuity();
		Thread.sleep(2000);
		ag.switchToPopUpAndAccept(driver);
		String i=ag.getMessage();
		Assert.assertEquals(i, "Gratuity successfully created");
		Thread.sleep(2000);
		ag.clickDelete();
	}
	@Test(priority=17)
	public void AddNewGratuitywithSalaryConsidered_Earned_Paymentmode_DD_ChequeDDNoChequeDDdate_SC_924() throws Exception {
		AddNewGratuitywithSalaryConsideredTheoreticalChequeDDNoChequeDDdate ag=new AddNewGratuitywithSalaryConsideredTheoreticalChequeDDNoChequeDDdate(driver);
		ag.clickonsalary();
		ag.clickongratutiy();
		ag.addnewgratuity();
		ag.selectEmployee("Ashish(REF09)");
		Thread.sleep(3000);
		ag.selectSalaryConsideredEarned();
		Thread.sleep(3000);
		ag.selectmodeofPayment("DD");
		ag.EnterChequeNo("89767");
		ag.enterdateofpayment("01 August 2019");
		ag.EnterChequeDate("10 August 2019");
		ag.clickCompute();
		Thread.sleep(2000);
		ag.clickCreateGratuity();
		Thread.sleep(2000);
		ag.switchToPopUpAndAccept(driver);
		String i=ag.getMessage();
		Assert.assertEquals(i, "Gratuity successfully created");
		Thread.sleep(2000);
		ag.clickDelete();
	}
	/*@Test(priority=18)
	public void AddNewGratuitywithSalaryConsidered_Earned_Paymentmode_StateBank_ChequeDDNoChequeDDdate_SC_925() throws Exception {
		AddNewGratuitywithSalaryConsideredTheoreticalChequeDDNoChequeDDdate ag=new AddNewGratuitywithSalaryConsideredTheoreticalChequeDDNoChequeDDdate(driver);
		ag.clickonsalary();
		ag.clickongratutiy();
		ag.addnewgratuity();
		ag.selectEmployee("Ashish(REF09)");
		Thread.sleep(3000);
		ag.selectSalaryConsideredEarned();
		Thread.sleep(3000);
		ag.selectmodeofPayment("State Bank of India");
		ag.EnterChequeNo("89767");
		ag.enterdateofpayment("01 August 2019");
		ag.EnterChequeDate("10 August 2019");
		ag.clickCompute();
		Thread.sleep(2000);
		ag.clickCreateGratuity();
		Thread.sleep(2000);
		ag.switchToPopUpAndAccept(driver);
		String i=ag.getMessage();
		Assert.assertEquals(i, "Gratuity successfully created");
		Thread.sleep(2000);
		ag.clickDelete();
	}
	@Test(priority=19)
	public void AddNewGratuitywithSalaryConsideredEarnedPaymentmodeDDSelectedSalaryHeads_SC_926() throws Exception {
		GratuitywithSalaryConsideredEarnedPaymentmodeDDSelectedSalaryHeads ag = new GratuitywithSalaryConsideredEarnedPaymentmodeDDSelectedSalaryHeads(driver);
		ag.clickonsalary();
		ag.clickongratutiy();
		ag.addnewgratuity();
		ag.selectEmployee("Ashish(REF09)");
		Thread.sleep(3000);
		ag.selectSalaryConsideredEarned();
		Thread.sleep(3000);
		ag.selectmodeofPayment("DD");
		ag.clickHeadsC();
		ag.clickSelectedSalaryHead();
		ag.clickSet();
		ag.EnterChequeNo("89767");
		ag.enterdateofpayment("01 August 2019");
		ag.EnterChequeDate("10 August 2019");
		ag.clickCompute();
		Thread.sleep(2000);
		ag.clickCreateGratuity();
		Thread.sleep(2000);
		ag.switchToPopUpAndAccept(driver);
		String i=ag.getMessage();
		Assert.assertEquals(i, "Gratuity successfully created");
		Thread.sleep(2000);
		ag.clickDelete();
		}
	@Test(priority=20)
	public void AddNewGratuitywithSalaryConsideredEarnedPaymentmodeIncludeinFSSSelectedSalaryHeads_SC_927() throws Exception {
		GratuitywithSalaryConsideredEarnedPaymentmodeDDSelectedSalaryHeads ag = new GratuitywithSalaryConsideredEarnedPaymentmodeDDSelectedSalaryHeads(driver);
		ag.clickonsalary();
		ag.clickongratutiy();
		ag.addnewgratuity();
		ag.selectEmployee("Ashish(REF09)");
		Thread.sleep(3000);
		ag.selectSalaryConsideredEarned();
		Thread.sleep(3000);
		ag.selectmodeofPayment("Include in FFS");
		ag.clickHeadsC();
		ag.clickSelectedSalaryHead();
		ag.clickSet();
		//ag.EnterChequeNo("89767");
		ag.enterdateofpayment("01 August 2019");
		//ag.EnterChequeDate("10 August 2019");
		ag.clickCompute();
		Thread.sleep(2000);
		ag.clickCreateGratuity();
		Thread.sleep(2000);
		ag.switchToPopUpAndAccept(driver);
		String i=ag.getMessage();
		Assert.assertEquals(i, "Gratuity successfully created");
		Thread.sleep(2000);
		ag.clickDelete();
		}
	@Test(priority=21)
	public void AddNewGratuitywithSalaryConsideredEarnedPaymentmodeStateBankSelectedSalaryHeads_SC_928() throws Exception {
		GratuitywithSalaryConsideredEarnedPaymentmodeDDSelectedSalaryHeads ag = new GratuitywithSalaryConsideredEarnedPaymentmodeDDSelectedSalaryHeads(driver);
		ag.clickonsalary();
		ag.clickongratutiy();
		ag.addnewgratuity();
		ag.selectEmployee("Ashish(REF09)");
		Thread.sleep(3000);
		ag.selectSalaryConsideredEarned();
		Thread.sleep(3000);
		ag.selectmodeofPayment("State Bank of India");
		ag.clickHeadsC();
		ag.clickSelectedSalaryHead();
		ag.clickSet();
		ag.EnterChequeNo("89767");
		ag.enterdateofpayment("01 August 2019");
		ag.EnterChequeDate("10 August 2019");
		ag.clickCompute();
		Thread.sleep(2000);
		ag.clickCreateGratuity();
		Thread.sleep(2000);
		ag.switchToPopUpAndAccept(driver);
		String i=ag.getMessage();
		Assert.assertEquals(i, "Gratuity successfully created");
		Thread.sleep(2000);
		ag.clickDelete();
		}
	@Test(priority=22)
	public void AddNewGratuitywithSalaryConsideredTheoreticalPaymentmodeCashSelectedSalaryHeads_SC_929() throws Exception {
		GratuitywithSalaryConsideredEarnedPaymentmodeDDSelectedSalaryHeads ag = new GratuitywithSalaryConsideredEarnedPaymentmodeDDSelectedSalaryHeads(driver);
		ag.clickonsalary();
		ag.clickongratutiy();
		ag.addnewgratuity();
		ag.selectEmployee("Ashish(REF09)");
		Thread.sleep(3000);
		ag.selectSalaryConsideredTheoretical();
		Thread.sleep(3000);
		ag.selectmodeofPayment("CASH");
		ag.clickHeadsC();
		ag.clickSelectedSalaryHead();
		ag.clickSet();
		//ag.EnterChequeNo("89767");
		ag.enterdateofpayment("01 August 2019");
		//ag.EnterChequeDate("10 August 2019");
		ag.clickCompute();
		Thread.sleep(2000);
		ag.clickCreateGratuity();
		Thread.sleep(2000);
		ag.switchToPopUpAndAccept(driver);
		String i=ag.getMessage();
		Assert.assertEquals(i, "Gratuity successfully created");
		Thread.sleep(2000);
		ag.clickDelete();
		}
	@Test(priority=23)
	public void AddNewGratuitywithSalaryConsideredTheoreticalPaymentmodeDDSelectedSalaryHeads_SC_930() throws Exception {
		GratuitywithSalaryConsideredEarnedPaymentmodeDDSelectedSalaryHeads ag = new GratuitywithSalaryConsideredEarnedPaymentmodeDDSelectedSalaryHeads(driver);
		ag.clickonsalary();
		ag.clickongratutiy();
		ag.addnewgratuity();
		ag.selectEmployee("Ashish(REF09)");
		Thread.sleep(3000);
		ag.selectSalaryConsideredTheoretical();
		Thread.sleep(3000);
		ag.selectmodeofPayment("DD");
		ag.clickHeadsC();
		ag.clickSelectedSalaryHead();
		ag.clickSet();
		//ag.EnterChequeNo("89767");
		ag.enterdateofpayment("01 August 2019");
		//ag.EnterChequeDate("10 August 2019");
		ag.clickCompute();
		Thread.sleep(2000);
		ag.clickCreateGratuity();
		Thread.sleep(2000);
		ag.switchToPopUpAndAccept(driver);
		String i=ag.getMessage();
		Assert.assertEquals(i, "Gratuity successfully created");
		Thread.sleep(2000);
		ag.clickDelete();
		}
	@Test(priority=24)
	public void AddNewGratuitywithSalaryConsideredTheoreticalPaymentmodeIncludeinFFSSelectedSalaryHeads_SC_931() throws Exception {
		GratuitywithSalaryConsideredEarnedPaymentmodeDDSelectedSalaryHeads ag = new GratuitywithSalaryConsideredEarnedPaymentmodeDDSelectedSalaryHeads(driver);
		ag.clickonsalary();
		ag.clickongratutiy();
		ag.addnewgratuity();
		ag.selectEmployee("Ashish(REF09)");
		Thread.sleep(3000);
		ag.selectSalaryConsideredTheoretical();
		Thread.sleep(3000);
		ag.selectmodeofPayment("Include in FFS");
		ag.clickHeadsC();
		ag.clickSelectedSalaryHead();
		ag.clickSet();
		//ag.EnterChequeNo("89767");
		ag.enterdateofpayment("01 August 2019");
		//ag.EnterChequeDate("10 August 2019");
		ag.clickCompute();
		Thread.sleep(2000);
		ag.clickCreateGratuity();
		Thread.sleep(2000);
		ag.switchToPopUpAndAccept(driver);
		String i=ag.getMessage();
		Assert.assertEquals(i, "Gratuity successfully created");
		Thread.sleep(2000);
		ag.clickDelete();
		}*/
	@Test(priority=25)
	public void AddNewGratuitywithSalaryConsideredTheoreticalPaymentmodeDDChequeDDNoSelectedSalaryHeads_SC_932() throws Exception {
		GratuitywithSalaryConsideredEarnedPaymentmodeDDSelectedSalaryHeads ag = new GratuitywithSalaryConsideredEarnedPaymentmodeDDSelectedSalaryHeads(driver);
		ag.clickonsalary();
		ag.clickongratutiy();
		ag.addnewgratuity();
		ag.selectEmployee("Ashish(REF09)");
		Thread.sleep(3000);
		ag.selectSalaryConsideredTheoretical();
		Thread.sleep(3000);
		ag.selectmodeofPayment("DD");
		ag.clickHeadsC();
		ag.clickSelectedSalaryHead();
		ag.clickSet();
		ag.EnterChequeNo("89767");
		ag.enterdateofpayment("01 August 2019");
		//ag.EnterChequeDate("10 August 2019");
		ag.clickCompute();
		Thread.sleep(2000);
		ag.clickCreateGratuity();
		Thread.sleep(2000);
		ag.switchToPopUpAndAccept(driver);
		String i=ag.getMessage();
		Assert.assertEquals(i, "Gratuity successfully created");
		Thread.sleep(2000);
		ag.clickDelete();
		}
	@Test(priority=26)
	public void AddNewGratuitywithSalaryConsideredTheoreticalPaymentmodeICICIBankLtdSelectedSalaryHeads_SC_933() throws Exception {
		GratuitywithSalaryConsideredEarnedPaymentmodeDDSelectedSalaryHeads ag = new GratuitywithSalaryConsideredEarnedPaymentmodeDDSelectedSalaryHeads(driver);
		ag.clickonsalary();
		ag.clickongratutiy();
		ag.addnewgratuity();
		ag.selectEmployee("Ashish(REF09)");
		Thread.sleep(3000);
		ag.selectSalaryConsideredTheoretical();
		Thread.sleep(3000);
		ag.selectmodeofPayment("ICICI Bank Ltd");
		ag.clickHeadsC();
		ag.clickSelectedSalaryHead();
		ag.clickSet();
		//ag.EnterChequeNo("89767");
		ag.enterdateofpayment("01 August 2019");
		//ag.EnterChequeDate("10 August 2019");
		ag.clickCompute();
		Thread.sleep(2000);
		ag.clickCreateGratuity();
		Thread.sleep(2000);
		ag.switchToPopUpAndAccept(driver);
		String i=ag.getMessage();
		Assert.assertEquals(i, "Gratuity successfully created");
		Thread.sleep(2000);
		ag.clickDelete();
		}
	@Test(priority=27)
	public void AddNewGratuitywithSalaryConsideredTheoreticalPaymentmodeICICIBankLtdChequeDDNoSelectedSalaryHeads_SC_934() throws Exception {
		GratuitywithSalaryConsideredEarnedPaymentmodeDDSelectedSalaryHeads ag = new GratuitywithSalaryConsideredEarnedPaymentmodeDDSelectedSalaryHeads(driver);
		ag.clickonsalary();
		ag.clickongratutiy();
		ag.addnewgratuity();
		ag.selectEmployee("Ashish(REF09)");
		Thread.sleep(3000);
		ag.selectSalaryConsideredTheoretical();
		Thread.sleep(3000);
		ag.selectmodeofPayment("DD");
		ag.clickHeadsC();
		ag.clickSelectedSalaryHead();
		ag.clickSet();
		ag.EnterChequeNo("89767");
		ag.enterdateofpayment("01 August 2019");
		//ag.EnterChequeDate("10 August 2019");
		ag.clickCompute();
		Thread.sleep(2000);
		ag.clickCreateGratuity();
		Thread.sleep(2000);
		ag.switchToPopUpAndAccept(driver);
		String i=ag.getMessage();
		Assert.assertEquals(i, "Gratuity successfully created");
		Thread.sleep(2000);
		ag.clickDelete();
		}
	@Test(priority=28)
	public void AddNewGratuitywithSalaryConsideredEarnedPaymentmodeDDChequeDDSelectedSalaryHeads_SC_935() throws Exception {
		GratuitywithSalaryConsideredEarnedPaymentmodeDDSelectedSalaryHeads ag = new GratuitywithSalaryConsideredEarnedPaymentmodeDDSelectedSalaryHeads(driver);
		ag.clickonsalary();
		ag.clickongratutiy();
		ag.addnewgratuity();
		ag.selectEmployee("Ashish(REF09)");
		Thread.sleep(3000);
		ag.selectSalaryConsideredEarned();
		Thread.sleep(3000);
		ag.selectmodeofPayment("DD");
		ag.clickHeadsC();
		ag.clickSelectedSalaryHead();
		ag.clickSet();
		ag.EnterChequeNo("89767");
		ag.enterdateofpayment("01 August 2019");
		//ag.EnterChequeDate("10 August 2019");
		ag.clickCompute();
		Thread.sleep(2000);
		ag.clickCreateGratuity();
		Thread.sleep(2000);
		ag.switchToPopUpAndAccept(driver);
		String i=ag.getMessage();
		Assert.assertEquals(i, "Gratuity successfully created");
		Thread.sleep(2000);
		ag.clickDelete();
		}
	@Test(priority=29)
	public void AddNewGratuitywithSalaryConsideredEarnedStateBankChequeDDNoSelectedSalaryHeads_SC_936() throws Exception {
		GratuitywithSalaryConsideredEarnedPaymentmodeDDSelectedSalaryHeads ag = new GratuitywithSalaryConsideredEarnedPaymentmodeDDSelectedSalaryHeads(driver);
		ag.clickonsalary();
		ag.clickongratutiy();
		ag.addnewgratuity();
		ag.selectEmployee("Ashish(REF09)");
		Thread.sleep(3000);
		ag.selectSalaryConsideredEarned();
		Thread.sleep(3000);
		ag.selectmodeofPayment("State Bank of India");
		ag.clickHeadsC();
		ag.clickSelectedSalaryHead();
		ag.clickSet();
		ag.EnterChequeNo("89767");
		ag.enterdateofpayment("01 August 2019");
		//ag.EnterChequeDate("10 August 2019");
		ag.clickCompute();
		Thread.sleep(2000);
		ag.clickCreateGratuity();
		Thread.sleep(2000);
		ag.switchToPopUpAndAccept(driver);
		String i=ag.getMessage();
		Assert.assertEquals(i, "Gratuity successfully created");
		Thread.sleep(2000);
		ag.clickDelete();
		}
	@Test(priority=30)
	public void AddNewGratuitywithSalaryConsideredTheoreticalDDChequeDDNoSelectedSalaryHeads_SC_937() throws Exception {
		GratuitywithSalaryConsideredEarnedPaymentmodeDDSelectedSalaryHeads ag = new GratuitywithSalaryConsideredEarnedPaymentmodeDDSelectedSalaryHeads(driver);
		ag.clickonsalary();
		ag.clickongratutiy();
		ag.addnewgratuity();
		ag.selectEmployee("Ashish(REF09)");
		Thread.sleep(3000);
		ag.selectSalaryConsideredTheoretical();
		Thread.sleep(3000);
		ag.selectmodeofPayment("DD");
		ag.clickHeadsC();
		ag.clickSelectedSalaryHead();
		ag.clickSet();
		ag.EnterChequeNo("89767");
		ag.enterdateofpayment("01 August 2019");
		ag.EnterChequeDate("10 August 2019");
		ag.clickCompute();
		Thread.sleep(2000);
		ag.clickCreateGratuity();
		Thread.sleep(2000);
		ag.switchToPopUpAndAccept(driver);
		String i=ag.getMessage();
		Assert.assertEquals(i, "Gratuity successfully created");
		Thread.sleep(2000);
		ag.clickDelete();
		}
	@Test(priority=31)
	public void AddNewGratuitywithSalaryConsideredTheoreticalChequeDDdateSelectedSalaryHeads_SC_938() throws Exception {
		GratuitywithSalaryConsideredEarnedPaymentmodeDDSelectedSalaryHeads ag = new GratuitywithSalaryConsideredEarnedPaymentmodeDDSelectedSalaryHeads(driver);
		ag.clickonsalary();
		ag.clickongratutiy();
		ag.addnewgratuity();
		ag.selectEmployee("Ashish(REF09)");
		Thread.sleep(3000);
		ag.selectSalaryConsideredTheoretical();
		Thread.sleep(3000);
		ag.selectmodeofPayment("ICICI Bank Ltd");
		ag.clickHeadsC();
		ag.clickSelectedSalaryHead();
		ag.clickSet();
		ag.EnterChequeNo("89767");
		ag.enterdateofpayment("01 August 2019");
		ag.EnterChequeDate("10 August 2019");
		ag.clickCompute();
		Thread.sleep(2000);
		ag.clickCreateGratuity();
		Thread.sleep(2000);
		ag.switchToPopUpAndAccept(driver);
		String i=ag.getMessage();
		Assert.assertEquals(i, "Gratuity successfully created");
		Thread.sleep(2000);
		ag.clickDelete();
		}
}

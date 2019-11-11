package com.spp.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.spp.common.BaseTest;
import com.spp.pages.GratuityValidation;

public class GratuityValidationTest extends BaseTest {
	@Test(priority=0)
	public void GratuityValidation_SC_1809() throws Exception {
		GratuityValidation gv = new GratuityValidation(driver);
		gv.clickonsalary();
		gv.clickongratutiy();
		gv.addnewgratuity();
		gv.clickCompute();
		gv.clickCreateGratuity();
		Thread.sleep(2000);
		String s=gv.getValidationMessage();
		Assert.assertEquals(s, "Select Employee Name");
		
		Thread.sleep(5000);
		
		gv.clickonsalary();
		gv.clickongratutiy();
		gv.addnewgratuity();
		gv.selectEmployee("Alex(EMP_02)");
		Thread.sleep(3000);
		gv.selectmodeofPayment("CASH");
		gv.enterdateofpayment("29 November 2019");
		gv.clickCompute();
		gv.clickCreateGratuity();
		Thread.sleep(2000);
		gv.switchToPopUpAndAccept(driver);
		String s1=gv.getErrorMessage();
		Assert.assertEquals(s1, "Gratuity amount can't be blank");
		
		Thread.sleep(5000);
		
		gv.clickonsalary();
		gv.clickongratutiy();
		gv.addnewgratuity();
		gv.selectEmployee("Alex(EMP_02)");
		Thread.sleep(3000);
		gv.selectmodeofPayment("CASH");
		gv.enterdateofpayment("29 November 2019");
		gv.clickCompute();
		gv.enterGratuityAmount("50000");
		gv.clickCreateGratuity();
		Thread.sleep(2000);
		gv.switchToPopUpAndAccept(driver);
		String s2=gv.getSucessMessage();
		Assert.assertEquals(s2, "Gratuity successfully created");
	}
	

}

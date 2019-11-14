package com.spp.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.spp.common.BaseTest;
import com.spp.pages.ArrearsValidation;

public class ArrearsValidationn extends BaseTest {
	
	@Test(priority=0)
	public void ArrearsValidationn_sc_1843() throws Exception{
		
		ArrearsValidation av = new ArrearsValidation(driver);
		
		
		av.navigateSalary();
		av.clickonArrears();
		av.clickonAddNewArrears();
		av.enterArrearName("");
		av.enterArreardescriptionName("");
		av.selectFromMonth("Aug/2019");
		av.selectToMonth("Aug/2019");
		av.selectReferMonth("Aug/2019");
		av.selectPayMonth("Aug/2019");
		av.clickonCreateArrear();
		String s1 = av.getArrearValidationMessage();
		Assert.assertEquals(s1, "Arrear name can't be blank");
		
		
		Thread.sleep(5000);
		
		
		
		av.navigateSalary();
		av.clickonArrears();
		av.clickonAddNewArrears();
		av.enterArrearName("Arrear_Bangalore");
		av.enterArreardescriptionName("Arrear_BA");
		av.selectToMonth("Aug/2019");
		av.selectReferMonth("Aug/2019");
		av.selectPayMonth("Aug/2019");
		av.clickonCreateArrear();
		String s2 = av.getArrearFromMonthValidationMessage();
		Assert.assertEquals(s2, "Arrear from month can't be blank");
		
		
		
	}
	

}

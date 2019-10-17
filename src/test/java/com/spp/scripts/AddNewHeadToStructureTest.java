package com.spp.scripts;

import org.testng.annotations.Test;

import com.spp.common.BaseTest;
import com.spp.pages.AssignNewHeadToStructureValidation;

import junit.framework.Assert;

public class AddNewHeadToStructureTest extends BaseTest{
	@Test
	public void AssignNewHeadtoStructureValidation_SC_1794(){
		AssignNewHeadToStructureValidation sv= new AssignNewHeadToStructureValidation(driver);
		sv.clickonmaster();
		sv.clickonsalarystructure();
		sv.clickonsettings();
		sv.assignnewhead();
		sv.createsalarygrpdetail();
		String s=sv.getValidationMessage();
		Assert.assertEquals(s, "Select Salary Head");
		
		sv.clickonmaster();
		sv.clickonsalarystructure();
		sv.clickonsettings();
		sv.assignnewhead();
		sv.selectsalhead("Cab");
		sv.selectcalculationtype("Lumpsum");
		sv.selectbasedon("Pay Days");
		sv.selectefffrommonth("Mar/2019");
		sv.checkesi();
		sv.checkpf();
		sv.createsalarygrpdetail();
		String s1=sv.getMessage();
		Assert.assertEquals(s1, "Salary structure detail successfully created");
		
		sv.clickonmaster();
		sv.clickonsalarystructure();
		sv.clickonsettings();
		sv.assignnewhead();
		sv.selectsalhead("Cab");
		sv.selectcalculationtype("Lumpsum");
		sv.selectbasedon("Pay Days");
		sv.selectefffrommonth("Mar/2019");
		sv.checkesi();
		sv.checkpf();
		sv.createsalarygrpdetail();
		String s2=sv.getErrorMessage();
		Assert.assertEquals(s2, "Salary head has already been taken");
		
	}

}

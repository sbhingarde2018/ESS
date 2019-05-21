package com.spp.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.spp.common.BaseTest;
import com.spp.generics.Utility;
import com.spp.pages.ComputeTDS;
import com.spp.pages.ComputeTDSOverWrite;

public class Computation extends BaseTest {

	@Test(priority=0)
	public void ComputeTDS_SC_1054() throws Exception{
		ComputeTDS ab=new ComputeTDS(driver);
		ab.ClickTDS();
		ab.ClickComputation();
		ab.SelectFinancialYear("2018/2019");
		ab.resizeWindow();
		ab.ClickFilter();
		Thread.sleep(3000);
		ab.ClickLoad();
		Thread.sleep(5000);
		ab.exitFullscreen();
		ab.ClickComputeBtn();
		Thread.sleep(5000);
		String i=ab.getMessage();
		Assert.assertEquals(i, "Tds Computed Succesfully");
	}
	
	@Test(priority=1)
	public void ComputeTDSOverWrite_SC_1086() throws Exception{
		ComputeTDSOverWrite ab=new ComputeTDSOverWrite(driver);
		ab.ClickTDS();
		ab.ClickComputation();
		ab.SelectFinancialYear("2018/2019");
		ab.ClickOverWrite();
		ab.resizeWindow();
		ab.ClickFilter();
		Thread.sleep(3000);
		ab.ClickLoad();
		Thread.sleep(5000);
		ab.exitFullscreen();
		ab.ClickComputeBtn();
		Thread.sleep(5000);
		String j=ab.getMessage();
		Assert.assertEquals(j, "Tds Computed Succesfully");
	}
}

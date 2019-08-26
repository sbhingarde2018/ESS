package com.spp.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.spp.common.BaseTest;
import com.spp.generics.Utility;
import com.spp.pages.TocheckForm16History;
import com.spp.pages.UploadForm16;

public class Form16 extends BaseTest {
	
	@Test(priority=0)
	public void UploadForm16_SC_1205() throws Exception {
		UploadForm16 ab=new UploadForm16(driver);
		ab.ClickTDs();
		ab.ClickForm16();
		Thread.sleep(2000);
		ab.SelectAssessmentYear("2018/2019");
		ab.clickChooseFile("");
		Thread.sleep(3000);
		ab.clickUploadBtn();
		String i=ab.getMessage();
		Assert.assertEquals(i, "Employee Form 16 successfuly uploaded.");
		Thread.sleep(2000);
	}
	@Test(priority=1)
	public void TocheckForm16History_SC_1206() throws Exception {
		TocheckForm16History ab=new TocheckForm16History(driver);
		ab.ClickTDs();
		ab.ClickBulkTDSDeclarations();
		Thread.sleep(3000);
		ab.ClickHistory();
		Thread.sleep(3000);
		ab.SelectAssessmentYear("2018/2019");
		ab.resizeWindow();
		Thread.sleep(3000);
		ab.ClickLoad();
		ab.exitFullscreen();
		Thread.sleep(2000);
	}
}

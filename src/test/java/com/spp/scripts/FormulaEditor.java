package com.spp.scripts;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.spp.common.BaseTest;
import com.spp.pages.AddFormula;
import com.spp.pages.DeleteFormula;
import com.spp.pages.UpdateFormula;

public class FormulaEditor extends BaseTest {
	
	@Test(priority=0)
	public void verifyCreatedFormule_SC_74(){
		AddFormula af=new AddFormula(driver);
		af.clickMastserLink();
		af.selectFormulaEditor();
		af.clickAddFormula();
		af.enterName("example");
		af.clickBasicFormula();
		af.clickOperator();
		af.enterExpression("0.6");
		af.clickVerifyButton();
		String s=af.getMessage();
		Assert.assertEquals(s, "Formula is verified.");
		af.clickSaveButton();
		String s1=af.getSaveMessage();
		Assert.assertEquals(s1, "Formula is successfully created");
	}
	
	@Test(priority=1)
	public void verifyUpdatedFormula_SC_75() throws Exception{
		UpdateFormula uf=new UpdateFormula(driver);
		uf.clickMastserLink();
		uf.selectFormulaEditor();
		uf.clickEditIcon();
		uf.clearExpression();
		uf.enterName("ExampleFormula");
		Thread.sleep(3000);
		uf.clickBasicFormula();
		Thread.sleep(3000);
		uf.clickOperator();
		uf.enterExpression("0.10");
		uf.clickVerifyButton();
		String s=uf.getMessage();
		Assert.assertEquals(s, "Formula is verified.");
		uf.clickUpdateButton();
		String s1=uf.getUpdateMessage();
		Assert.assertEquals(s1, "Formula is successfully updated");
	} 
	
	@Test(priority=2)
	public void verifyDeletedFormula_SC_76(){
		DeleteFormula df=new DeleteFormula(driver);
		df.clickMastserLink();
		df.selectFormulaEditor();
		df.clickDeleteButton();
		String s=df.getMessage();
		Assert.assertEquals(s,"Formula is successfully deleted");
	} 
}
	



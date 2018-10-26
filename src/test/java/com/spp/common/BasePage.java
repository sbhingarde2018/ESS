package com.spp.common;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.log4testng.Logger;

import com.spp.generics.Property;

public class BasePage {

	public Logger log=Logger.getLogger(this.getClass());
	public WebDriver driver;
	public String configFile;
	public long timeout;
	public BasePage(WebDriver driver){
		this.driver=driver;
		configFile=Automation_Constant.CONFIG_PATH+Automation_Constant.CONFIG_FILE;
		timeout=Long.parseLong(Property.getPropertyValue(configFile, "EXPLICIT"));
	}

	public void verifyURLis(String expectedUrl){
		new WebDriverWait(driver,timeout).until(ExpectedConditions.urlToBe(expectedUrl));
	}

	public void verifyURLhas(String expectedUrl){
		new WebDriverWait(driver, timeout).until(ExpectedConditions.urlContains(expectedUrl));
	}

	public void waitTillElementIsVisible(WebElement element){
		new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
	}

	public void mouseActions(WebDriver driver,WebElement element){
		Actions a=new Actions(driver);
		a.moveToElement(element).build().perform();
	}

	public void dropDownSelect(WebElement locator, String valToBeSelected) {
		Select s=new Select(locator);
		s.selectByVisibleText(valToBeSelected);
	}
	
	public void switchToPopUpAndAccept(WebDriver driver){
		Alert alert=driver.switchTo().alert();
		alert.accept();
	}
	public String switchToPopUpAndgetText(WebDriver driver){
		Alert alert=driver.switchTo().alert();
		return alert.getText();
	}
	

	public void switchToPopUpAndDismiss(WebDriver driver){
		Alert alert=driver.switchTo().alert();
		alert.dismiss();
	}

	public void switchToPopUpAndDismiss(){
		Alert alert=driver.switchTo().alert();
		alert.dismiss();
	}
	
	public void doubleClickAction(WebDriver driver,WebElement element){
		Actions a=new Actions(driver);
		a.moveToElement(element).doubleClick().build().perform();
		
	}
	
	public void navigate(WebDriver driver){
		driver.navigate().back();
	}

	public  void selectValue(WebElement locator, String valToBeSelected) throws IOException{
		Select s=new Select(locator);
		s.selectByValue(valToBeSelected);
	}
	public String getAlertText()
	
	{
		
		String text = driver.switchTo().alert().getText();
		return text;
}
}

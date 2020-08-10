package com.testing.experta.testCases;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.testing.experta.pageObjects.Navigation;

public class TC_CheckText_Productores_001 extends BaseClass {

	@Test
	public void checkProductores() throws Exception {
		Navigation productores = new Navigation(driver);
		productores.clickProductores();
		logger.info("Verificando Productores...");
		
		boolean res = driver.getPageSource().contains("SUMAMOS");
		
		if (res==true) {
			logger.info("Test Case Productores OK");
			Assert.assertTrue(true);
		} else {
			captureScreen(driver,"checkProductores");
			logger.info("Test Case Productores Fail");
			Assert.assertTrue(false);
		}
	}
	
}

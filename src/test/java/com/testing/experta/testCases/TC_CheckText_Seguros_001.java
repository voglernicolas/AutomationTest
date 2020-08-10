package com.testing.experta.testCases;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.testing.experta.pageObjects.Navigation;

public class TC_CheckText_Seguros_001 extends BaseClass {

	@Test
	public void checkSeguros() throws Exception {
		Navigation seguros = new Navigation(driver);
		logger.info("Verificando Seguros - Autos...");
		seguros.clickSeguros();
		seguros.clickSegurosAutos();
		
		boolean res = driver.getPageSource().contains("¿CONOCÉS NUESTRO SEGURO DE AUTOS?");
		
		if (res==true) {
			Assert.assertTrue(true);
			logger.info("Test Case Seguros - Autos OK");
		} else {
			captureScreen(driver,"checkSeguros");
			logger.info("Test Case Seguros - Autos FAIL");
			Assert.assertTrue(false);
		}
	}
}

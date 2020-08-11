package com.testing.experta.testCases;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.testing.experta.pageObjects.BaseClass;
import com.testing.experta.pageObjects.Navigation;

public class TC_CheckText_Servicios_001 extends BaseClass {

	@Test
	public void checkServicios() throws Exception {
		Navigation servicios = new Navigation(driver);
		servicios.clickServicios();
		servicios.clickDenunciaServicios();
		
		boolean res = driver.getPageSource().contains("DENUNCIAS DE SINIESTROS - FORMULARIOS");
		//Assert.assertEquals(asertion.getText(), "DENUNCIAS DE SINIESTROS - FORMULARIOS");
		
		if (res==true) {
			logger.info("Test Case Servicios - Denuncia Siniestros OK");
			Assert.assertTrue(true);
		} else {
			captureScreen(driver,"checkProductores");
			logger.info("Test Case Servicios - Denuncia Siniestros FAIL");
			Assert.assertTrue(false);
		}
	}
	
}

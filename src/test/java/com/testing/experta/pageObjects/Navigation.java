package com.testing.experta.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Navigation {

	WebDriver ldriver;
	
	public Navigation(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	
	// Elements lookup
	
	@FindBy(how = How.XPATH, using ="//p[contains(text(),'SEGUROS')]")
	@CacheLookup
	WebElement seguros;
	
	@FindBy(how = How.LINK_TEXT, using ="AUTOS")
	@CacheLookup
	WebElement seguros_autos;
	
	@FindBy(how = How.LINK_TEXT, using = "PRODUCTORES")
	@CacheLookup
	WebElement productores;

	@FindBy(how = How.XPATH, using = "//p[contains(text(),'SERVICIOS')]")
	@CacheLookup
	WebElement servicios;
	
	@FindBy(how = How.LINK_TEXT, using = "DENUNCIA DE SINIESTROS")
	@CacheLookup
	WebElement servicios_denunciaSiniestros;
	
	
	// Clicks
	
	public void clickSeguros() {
		seguros.click();
	}
	
	public void clickProductores() {
		productores.click();
	}
	
	public void clickSegurosAutos() {
		seguros_autos.click();
	}
	
	public void clickServicios() {
		servicios.click();
	}
	
	public void clickDenunciaServicios() {
		servicios_denunciaSiniestros.click();
	}
	
}

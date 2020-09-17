package br.com.webjump.test.page;

import static br.com.webjump.test.core.DriverFactory.getDriver;

import org.openqa.selenium.By;

import br.com.webjump.test.core.DSL;

import org.openqa.selenium.WebElement;

public class TestePage {
	
	DSL dsl;
	
	public TestePage() {
		
		dsl = new DSL();
		
	}
	
	public void FocarFrameButton() {
		
		WebElement frame = getDriver().findElement(By.id("iframe_panel_heading"));
		System.out.println(frame.getLocation().y);
		dsl.executaJS("window.scrollBy(0,arguments[0])", frame.getLocation().y);
		dsl.FocarFrame("iframe_panel_heading");
	}
	
	public void VoltarFrameDefault() {
		
		dsl.VoltarFrame();
	}
		
	public void clicarButtonOnePage() {
		
		dsl.ClicarBotao("//button[@id='btn_one']");
	}
	
	public boolean validarButtonOnePage() {
			
		return	dsl.ValidarBotoesDisplay("//button[@id='btn_one']");
	}
	
	
	public void clicarButtonTwoPage() {
		
		dsl.ClicarBotao("//button[@id='btn_two']");
	}
	
	public boolean validarButtonTwoPage() {
		
		return	dsl.ValidarBotoesDisplay("//button[@id='btn_two']");
	}
	
	public void clicarButtonFourPage() {
		
		dsl.ClicarBotao("//button[@id='btn_link']");
	}
	
	public boolean validarButtonFourPage() {
			
			return	dsl.ValidarBotoesDisplay("//button[@id='btn_link']");
	}
	
	public void InsereYoufirstName(String firstName) {
		
		dsl.escrever("//input[@id='first_name']", firstName);
	}
	
	public String obterValorCampoYouFirstName() {
		
		return dsl.obterValorCampo("//input[@id='first_name']");
	}
	
	public void ClicaCheckBoxOptionThree () {
		
		dsl.clicaCheckBox("//input[@id='opt_three']");
	} 
	
	public void SelecionaCombobox(String option) {
		
		dsl.selecionarCombo("//select[@id='select_box']", option);
	}
	
	public boolean validaImagemSeleniumPage() {
		
		return dsl.ValidarImagem("//img[4]");
		
	}
	
	
}

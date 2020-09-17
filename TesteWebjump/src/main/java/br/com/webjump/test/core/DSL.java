package br.com.webjump.test.core;

import static br.com.webjump.test.core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DSL {
	
/******************************************** TextBox ***********************************************/
	
	// Escreve o texto no campo de texto
	public void escrever(String xpath, String texto) {
		getDriver().findElement(By.xpath(xpath)).clear();
		getDriver().findElement(By.xpath(xpath)).sendKeys(texto);
	}
	
	// Retorna o valor do WebElemento
	public String obterValorCampo (String xpath) {
		
		return getDriver().findElement(By.xpath(xpath)).getAttribute("value");
	}
	
	/******************************************** Radio Button *******************************************/
	
	// Clica no radioButton conforme o seu xpath
	public void clicarRadio(String xpath) {
		
		getDriver().findElement(By.xpath(xpath)).click();	
	}
	
	// Valida se o radiobutton foi selecionado corretamente
	public boolean isRadioSelecionado(String xpath) {
		
		return getDriver().findElement(By.xpath(xpath)).isSelected();
	} 
	
	/********************************************* ComboBox *************************************************/
	
	// Seleciona corretamente a opção do comboBox conforme o texto visivel
	public void selecionarCombo(String xpath, String valor) {
		
		WebElement element = getDriver().findElement(By.xpath(xpath));
		
		Select combo = new Select(element);
		
		combo.selectByVisibleText(valor);
		
	}
	
	// Retorna o valor selecionado no comboBox
	public String ValorSelecionadoComboBox(String xpath) {
		
		WebElement element = getDriver().findElement(By.xpath(xpath));
		
		Select combo = new Select(element);
		
		return combo.getFirstSelectedOption().getText();
		 
	}
	
	/********************************************** CheckBox **************************************************/
	
	// Clica no checkbox selecionado
	public void clicaCheckBox(String xpath) {
		
		getDriver().findElement(By.xpath(xpath)).click();
	}
	
	// Valida se o checkbox foi selecionado corretamente
	public boolean isCheckBoxSelecionado(String xpath) {
		
		return getDriver().findElement(By.xpath(xpath)).isSelected();
	} 
	
	
	/********************************************** Button ****************************************************/
	
	public void ClicarBotao(String xpath) {
		
		getDriver().findElement(By.xpath(xpath)).click();
	}
	
	public boolean ValidarBotoesDisplay(String xpath) {
		
		return getDriver().findElement(By.xpath(xpath)).isDisplayed();
		
	}
	
	/*******************************************  FRAME *******************************************************/
	
	public void FocarFrame(String id_frame) {
		
		getDriver().switchTo().frame(id_frame);
	}
	
	public void VoltarFrame() {
		
		getDriver().switchTo().defaultContent();
		
	}
	
	/************************************************ JavaScript ************************************************/
	
	public Object executaJS(String cmd, Object...param ) {
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		
		return js.executeScript(cmd ,param);
		
		
	}
	
	/************************************************** IMAGE ***************************************************/
	
	public boolean ValidarImagem(String xpath) {
		
		WebElement image =  getDriver().findElement(By.xpath(xpath));
		
		return image.isDisplayed();
		
		
		
	}
	

}

package br.com.webjump.test.step;

import static br.com.webjump.test.core.DriverFactory.getDriver;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.webjump.test.core.HelpStep;
import br.com.webjump.test.page.TestePage;

public class Cenario03Step extends HelpStep{
	
	TestePage page;
	
	@Before
	public void Inicializa() {
		
		getDriver().get("https://wejump-automation-test.github.io/qa-test/");
		
		page = new TestePage();
		
	}
	
	@Test
	public void PreencherDados () throws Throwable {
		
		page.InsereYoufirstName("Evandro");
		page.clicarButtonOnePage();
		page.ClicaCheckBoxOptionThree();
		page.SelecionaCombobox("ExampleTwo");
		
		Assert.assertEquals("Evandro", page.obterValorCampoYouFirstName());
		Assert.assertTrue(page.validaImagemSeleniumPage());
	
		super.finaliza();
		
	}
 
}

package br.com.webjump.test.step;

import static br.com.webjump.test.core.DriverFactory.getDriver;

import org.junit.Before;
import org.junit.Test;

import br.com.webjump.test.core.HelpStep;
import br.com.webjump.test.page.TestePage;
import org.junit.Assert;

public class Cenario01Step extends HelpStep  {
	
	TestePage page;
	
	@Before
	public void Inicializa() {
		
		getDriver().get("https://wejump-automation-test.github.io/qa-test/");
		
		page = new TestePage();
		
	}
	
	@Test
	public void ClicarBotoesOneTwoFour() throws Throwable {
		
		page.clicarButtonOnePage();
		page.clicarButtonTwoPage();
		page.clicarButtonFourPage();
	
		
		Assert.assertTrue(page.validarButtonOnePage());
		Assert.assertTrue(page.validarButtonTwoPage());
		Assert.assertTrue(page.validarButtonFourPage());
		
		super.finaliza();
		
		
	}

}

package br.com.webjump.test.core;

import static br.com.webjump.test.core.DriverFactory.getDriver;
import static br.com.webjump.test.core.DriverFactory.killDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class HelpStep {

	@Rule
	public TestName testName = new TestName();

	@After
	public void finaliza ()throws IOException 
	{
		// Captura a tela do navegador para evidencias
		TakesScreenshot ts =  (TakesScreenshot) getDriver();
		File arquivo = ts.getScreenshotAs(OutputType.FILE);
		// Como utilizo MAC OSX utilizo File.separator para não ter problema com separador de pastas do sistema operacional
		FileUtils.copyFile(arquivo,new File("target" + File.separator + "screenshots" + File.separator +testName.getMethodName() + ".jpg"));
		
		/* fecha todas as abas do browser e instancias do driver */	
		if(Propriedades.CLOSE_BROWSER)
		{
			killDriver();
			
		}
		
	}
	
	
}

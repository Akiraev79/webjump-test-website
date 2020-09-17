package br.com.webjump.test.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverFactory {

	//private static WebDriver driver;
	
		private DriverFactory() {}
		
		private static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<WebDriver>() {
		
			protected synchronized WebDriver initialValue() {
				
				return initDriver();
			}
			
		};
		
		public static WebDriver getDriver() {
			
			return threadDriver.get();
		}
		
		public static WebDriver initDriver() {
			
			System.setProperty("webdriver.gecko.driver", "/Users/evandrosouzasantos/Downloads/drivers/geckodriver");
			
			WebDriver driver = null;
			
			// Verifico se a instancia ja foi criada para o Webdriver
			if(driver == null) {
				
				switch (Propriedades.browser) {
				
					case FIREFOX: driver = new FirefoxDriver(); break;
					case CHROME: driver = new ChromeDriver(); break;
					case INTERNET_EXPLORER: driver = new InternetExplorerDriver(); break;
					case SAFARI: driver = new SafariDriver(); break;
				
				}
				
				driver.manage().window().maximize();	
			}
			
			return driver;
		}
		
		public static void killDriver() {
			
			WebDriver driver = getDriver();
			
			// Verifico se o driver não esta nulo para poder matar a instancia
			if(driver != null) {
				
				driver.quit();
				driver = null;
			}
			
			if(threadDriver != null) {
				
				threadDriver.remove();
			}
		}

}

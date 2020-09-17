package br.com.webjump.test.suite;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.webjump.test.step.*;

import static br.com.webjump.test.core.DriverFactory.killDriver;

@RunWith(Suite.class)
@SuiteClasses({
		Cenario01Step.class,
		Cenario02Step.class,
		Cenario03Step.class,
})
public class TesteSuite {

	@AfterClass
	public static void FinalizaBrowser() {
		
		killDriver();
	}
}

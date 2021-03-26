package br.sp.anaclara.suites;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.sp.anaclara.core.DriverFactory;
import br.sp.anaclara.pages.LoginPage;
import br.sp.anaclara.tests.MyStoreTest;

@RunWith(Suite.class)
@SuiteClasses({
	MyStoreTest.class,
	LoginPage.class
})
public class SuiteGeral {
//	private static LoginPage page = new LoginPage();
//	
//	@BeforeClass
//	public static void inicializa(){
//		page.acessarTelaInicial();
//		
//		page.setEmail("wagner@costa");
//		page.setSenha("123456");
//		page.entrar();
//	}
	
	@AfterClass
	public static void finaliza(){
		DriverFactory.killDriver();
	}
}

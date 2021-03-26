package br.sp.anaclara.tests;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

//Import do que vai ser usado das outras classes e JUnit
import org.junit.Test;

import br.sp.anaclara.core.BaseTest;
import br.sp.anaclara.pages.LoginPage;
import br.sp.anaclara.pages.MyStoreHomePage;

public class MyStoreTest extends BaseTest {

	//Cria uma nova pagina de registro e de login para o uso 
	MyStoreHomePage homepg = new MyStoreHomePage();
	LoginPage login = new LoginPage();

	
	
	//Inicializa a P�gina
	@Before
	public void inicializa() {
		homepg.acessarTelaInicial();
	}
	
	//Preenche o formul�rio e realiza o teste
	@Test
	public void teste01_FazerCadastro() throws InterruptedException {
		
		Thread.sleep(300); //Espera poss�vel atraso de carregamento da p�gina
		
		//Preenche o formul�rio
		homepg.digitarUsername("anaclara");
		homepg.digitarEmail("ana@clara.com");
		homepg.digitarSenha("Xx123456");
		homepg.digitarConfirmacaoPassword("Xx123456");
		homepg.digitarNome("Yara");
		homepg.digitarSobrenome("Marina");
		homepg.digitarTelefone("1198765432");
		homepg.digitarCidade("Guarulhos");
		homepg.digitarEndereco("Rua Claudino Barbosa");
		homepg.digitarProvincia("SP");
		homepg.digitarCEP("04045000");
		homepg.pais("Brazil");
		homepg.aceitarTermo();
		homepg.registrar();
		
		//Espera poss�vel atraso de carregamento da p�gina
		Thread.sleep(300);

		//Valida com um elemento da p�gina inicial se retornou para a p�gina sem erros
		Assert.assertTrue(homepg.sucesso().contains("SPEAKERS"));	
	}
	
	@Test
	public void teste02_FazLogin() throws InterruptedException {
		
		Thread.sleep(300); //Espera poss�vel atraso de carregamento da p�gina
		

		//Icone Login
		login.clicarBotaoLogin();

		//Preenche o formul�rio
		login.digitarUsername("anaclara");
		login.digitarSenha("Xx123456");
		
		//Botao para logar
		login.clicarBotaoLogar();
		
		
		//Espera poss�vel atraso de carregamento da p�gina
		Thread.sleep(300);

		//Valida se o nome do usu�rio esta aparecendo na tela
		Assert.assertTrue(homepg.sucesso().contains("teste"));	
	}
	
	
	//Finaliza a p�gina
	@After
	public void finaliza() {

	}
	
}

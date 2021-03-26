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

	
	
	//Inicializa a Página
	@Before
	public void inicializa() {
		homepg.acessarTelaInicial();
	}
	
	//Preenche o formulário e realiza o teste
	@Test
	public void teste01_FazerCadastro() throws InterruptedException {
		
		Thread.sleep(300); //Espera possível atraso de carregamento da página
		
		//Preenche o formulário
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
		
		//Espera possível atraso de carregamento da página
		Thread.sleep(300);

		//Valida com um elemento da página inicial se retornou para a página sem erros
		Assert.assertTrue(homepg.sucesso().contains("SPEAKERS"));	
	}
	
	@Test
	public void teste02_FazLogin() throws InterruptedException {
		
		Thread.sleep(300); //Espera possível atraso de carregamento da página
		

		//Icone Login
		login.clicarBotaoLogin();

		//Preenche o formulário
		login.digitarUsername("anaclara");
		login.digitarSenha("Xx123456");
		
		//Botao para logar
		login.clicarBotaoLogar();
		
		
		//Espera possível atraso de carregamento da página
		Thread.sleep(300);

		//Valida se o nome do usuário esta aparecendo na tela
		Assert.assertTrue(homepg.sucesso().contains("teste"));	
	}
	
	
	//Finaliza a página
	@After
	public void finaliza() {

	}
	
}

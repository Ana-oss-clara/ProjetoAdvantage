package br.sp.anaclara.pages;

import org.openqa.selenium.By;

import br.sp.anaclara.core.BasePage;

public class LoginPage extends BasePage {
	
	public void clicarBotaoLogin() throws InterruptedException {
		clicarBotao(By.xpath("//*[@id=\"menuUser\"]"));
	}
	
	public void digitarUsername(String sobrenome) throws InterruptedException {
		clicarBotao(By.xpath("/html/body/login-modal/div/div/div[3]/sec-form/sec-view[1]/div/input"));
		acaoMouseOver("/html/body/login-modal/div/div/div[3]/sec-form/sec-view[1]/div/input");
		escrever(By.xpath("/html/body/login-modal/div/div/div[3]/sec-form/sec-view[1]/div/input"), sobrenome);
	}
	
	public void digitarSenha(String sobrenome) throws InterruptedException {
		clicarBotao(By.xpath("/html/body/login-modal/div/div/div[3]/sec-form/sec-view[2]/div/input"));
		acaoMouseOver("/html/body/login-modal/div/div/div[3]/sec-form/sec-view[2]/div/input");
		escrever(By.xpath("/html/body/login-modal/div/div/div[3]/sec-form/sec-view[2]/div/input"), sobrenome);
	}


	public void clicarBotaoLogar() throws InterruptedException {
		clicarBotao(By.xpath("//*[@id=\"sign_in_btnundefined\"]"));
	}
	
	public String sucesso() {
		String txtValida;
		txtValida = obterTexto(By.xpath("//*[contains(.,\"teste\")]"));
		
		return txtValida;
	}

}

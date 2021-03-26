package br.sp.anaclara.pages;

import static br.sp.anaclara.core.DriverFactory.getDriver;

import org.openqa.selenium.By;

import br.sp.anaclara.core.BasePage;

public class MyStoreHomePage extends BasePage {
		
	
	//PO: Interação com os elementos da página
	
	public void acessarTelaInicial(){
		getDriver().get("http://advantageonlineshopping.com/#/register");
	}
	
	public void clicarCreateAcc() throws InterruptedException {
		clicarBotao(By.xpath("///a[contains(.,\"CREATE NEW ACCOUNT\")]"));
	}
	
	public void digitarUsername(String sobrenome) throws InterruptedException {
		clicarBotao(By.xpath("//*[contains(text(),\'Username\')]"));
		acaoMouseOver("\"//*[contains(text(),\\'Username\\')]\"");
		escrever(By.xpath("//@name[contains(.,\"first_nameRegisterPage\")]"), sobrenome);
	}
	
	public void digitarEmail(String email) throws InterruptedException {
		escrever(By.xpath("customer_email"), email);
	}
	
	public void digitarSenha(String senha) throws InterruptedException {
		escrever(By.xpath("customer_senha"), senha);
	}
	
	public void digitarConfirmacaoPassword(String confirmaPass) throws InterruptedException {
		escrever(By.xpath("customer_confirmasenha"), confirmaPass);
	}
	
	public void digitarNome(String nome) throws InterruptedException {
		escrever(By.xpath("customer_name"), nome);
	}
	
	public void digitarSobrenome(String sobrenome) throws InterruptedException {
		escrever(By.xpath("customer_lastname"), sobrenome);
	}
	
	public void digitarCidade(String cidade) throws InterruptedException {
		escrever(By.xpath("customer_cidade"), cidade);
	}
	
	public void digitarEndereco(String endereco) throws InterruptedException {
		escrever(By.xpath("customer_endereco"), endereco);
	}
	
	public void digitarEstado(String estado) throws InterruptedException {
		escrever(By.xpath("customer_estado"), estado);
	}
	
	public void digitarProvincia(String provincia) throws InterruptedException {
		escrever(By.xpath("customer_providencia"), provincia);
	}
	
	public void digitarCEP(String cep) throws InterruptedException {
		escrever(By.xpath("customer_CEP"), cep);
	}
	
	public void digitarTelefone(String telefone) throws InterruptedException {
		escrever(By.xpath("customer_CEP"), telefone);
	}
	
	public void pais(String string) {
		selecionarComboTxtByXpath("//*[@id=\"formCover\"]/div[3]/div[1]/sec-view[1]/div/select", "Brazil");
	}
	
	public void aceitarTermo() {
		clicarCheckByXpath("//*[@id=\"formCover\"]/sec-view/div/input");
	}
	
	public void registrar() throws InterruptedException {
		clicarBotaoByXpath("//*[@id=\"formCover\"]/sec-view/div/input");
	}
	
	
	public String sucesso() {
		String txtValida;
		txtValida = obterTexto(By.id("speakersImg"));
		
		return txtValida;
	}
	
}

package br.com.web.pages;

//import static br.com.web.core.DriverFactory.getDriver;

import org.openqa.selenium.By;
//import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.web.core.BasePage;

public class NavegacaoSubmenusPage extends BasePage {

	//private static WebDriverWait wait;

	// Elementos Web
	By botaoServicos = By.id("menu-item-290");
	By botaoAutomatizado = By.id("menu-item-296");
	By botaoFuncional = By.id("menu-item-293");
	By botaoManual = By.id("menu-item-292");
	By botaoMobile = By.id("menu-item-291");
	By botaoFabrica = By.id("menu-item-294");
	By botaoConsultoria = By.id("menu-item-295");
	By botaoCrowdsourced = By.id("menu-item-816");
	By botaoAlocacao = By.id("menu-item-297");
	By botaoAutomacao = By.id("menu-item-772");
	By textoAutomatizado = By.xpath("//*[@id=\"wrapper\"]/div[3]/div/div/div/div/h2");
	By textoFuncional = By.xpath("//*[@id=\"TITULO\"]/div[1]/div/div/div/h1");
	By textoManual = By.xpath("//*[@id=\"TÍTULO-PAGINA\"]/div[1]/div/div/div/h1");
	By textoMobile = By.xpath("//*[@id=\"TÍTULO-PAGINA\"]/div[1]/div/div/div/h1");
	By textoFabrica = By.xpath("//*[@id=\"wrapper\"]/div[1]/div[1]/div/div/div/h1");
	By textoConsultoria = By.xpath("//*[@id=\"wrapper\"]/div[1]/div[1]/div/div/div/h1");
	By textoCrowdsourced = By.xpath("//*[@id=\"wrapper\"]/div[1]/div[1]/div/div/div/h1");
	By textoAlocacao = By.xpath("//*[@id=\"wrapper\"]/div[1]/div[1]/div/div/div/h1");
	By textoAutomacao = By.xpath("//*[@id=\"wrapper\"]/div[1]/div[1]/div/div/div/h1");

	public void clicarTestesAutomatizados() {
		clicar(botaoServicos);
		clicar(botaoAutomatizado);
	}
	
	public void validarTestesAutomatizados() {
		validarTexto("HISTÓRICO DE SUCESSO", textoAutomatizado);
	} 
	
	public void clicarTestesFuncionais() {
		clicar(botaoServicos);
		clicar(botaoFuncional);
	}
	
	public void validarTestesFuncionais() {
		validarTexto("//TESTES FUNCIONAIS NÃO FUNCIONAIS", textoFuncional);
	} 
	
	public void clicarTestesManuais() {
		clicar(botaoServicos);
		clicar(botaoManual);
	}
	
	public void validarTestesManuais() {
		validarTexto("//TESTES MANUAIS", textoManual);
	} 
	
	public void clicarTestesMobile() {
		clicar(botaoServicos);
		clicar(botaoMobile);
	}
	
	public void validarTestesMobile() {
		validarTexto("//TESTES MOBILE", textoMobile);
	}
	
	public void clicarFabricaTestes() {
		clicar(botaoServicos);
		clicar(botaoFabrica);
	}
	
	public void validarFabricaTestes() {
		validarTexto("//FÁBRICA DE TESTES", textoFabrica);
	}
	
	public void clicarConsultoria() {
		clicar(botaoServicos);
		clicar(botaoConsultoria);
	}
	
	public void validarConsultoria() {
		validarTexto("//CONSULTORIA", textoConsultoria);
	}
	
	public void clicarCrowdsourced() {
		clicar(botaoServicos);
		clicar(botaoCrowdsourced);
	}
	
	public void validarCrowdsourced() {
		validarTexto("//CROWDSOURCED AUDITESTE", textoCrowdsourced);
	}
	
	public void clicarAlocacao() {
		clicar(botaoServicos);
		clicar(botaoAlocacao);
	}
	
	public void validarAlocacao() {
		validarTexto("//ALOCAÇÃO DE PROFISSIONAIS", textoAlocacao);
	}
	
	public void clicarAutomacao() {
		clicar(botaoServicos);
		clicar(botaoAutomacao);
	}
	
	public void validarAutomacao() {
		validarTexto("//AUTOMAÇÃO DE PROCESSOS", textoAutomacao);
	}
}

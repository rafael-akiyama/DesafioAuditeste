package br.com.web.pages;

import static br.com.web.core.DriverFactory.getDriver;


import org.openqa.selenium.By;

import br.com.web.core.BasePage;

public class NavegacaoMenuPage extends BasePage {
	
	// Elementos Web
	By botaoFechar = By.xpath("//*[@id=\"sgpb-popup-dialog-main-div-wrapper\"]/div/img");
	By botaoHome = By.id("menu-item-132");
	By botaoQuemSomos = By.id("menu-item-133");
	By botaoCases = By.id("menu-item-392");
	By botaoTrabalhe = By.id("menu-item-135");
	By botaoBlog = By.id("menu-item-1477");
	By botaoContato = By.id("menu-item-130");
	By textoHome = By.xpath("//*[@id=\"wrapper\"]/div[3]/div/div[1]/div/div/h2/b");
	By textoQuemSomos = By.xpath("//*[@id=\"TITULO-SITE\"]/div[1]/div/div/div/h1");
	By textoCases = By.xpath("//*[@id=\"TITULO-SITE\"]/div[1]/div/div/div/h1");
	By textoTrabalhe = By.xpath("//*[@id=\"field_container\"]/div/div[1]/label/span");
	By textoBlog = By.xpath("//*[@id=\"wrapper\"]/div/div[1]/div/div/div/h1");
	By textoContato = By.xpath("//*[@id=\"wrapper\"]/div[2]/div[1]/div[2]/div/div/div[2]/div[2]/div/div/div[1]/b");

	public void acessarSite() throws Exception {
		getDriver().get("https://www.auditeste.com.br");
	}

	public void clicarFechar() {
		ignorarElementoAusente(botaoFechar);
	}
	
	public void clicarHome() {
		clicar(botaoHome);
	}
	
	public void validarHome() {
		validarTexto("Solidez de Mercado", textoHome);
	}
	
	public void clicarQuemSomos() {
		clicar(botaoQuemSomos);
	}
	
	public void validarQuemSomos() {
		validarTexto("//QUEM SOMOS", textoQuemSomos);
	}
	
	public void clicarCases() {
		clicar(botaoCases);
	}
	
	public void validarCases() {
		validarTexto("//CASES DE SUCESSO", textoCases);
	}
	
	public void clicarTrabalhe() {
		clicar(botaoTrabalhe);
	}
	
	public void validarTrabalhe() {
		validarTexto("NOME", textoTrabalhe);
	}
	
	public void clicarBlog() {
		clicar(botaoBlog);
	}
	
	public void validarBlog() {
		validarTexto("//BLOG", textoBlog);
	}
	
	public void clicarContato() {
		clicar(botaoContato);
	}
	
	public void validarContato() {
		validarTexto("TELEFONE", textoContato);
	}

}
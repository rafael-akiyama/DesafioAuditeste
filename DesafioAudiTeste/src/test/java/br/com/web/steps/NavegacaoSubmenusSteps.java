package br.com.web.steps;

import br.com.web.pages.NavegacaoSubmenusPage;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class NavegacaoSubmenusSteps {
	
	private NavegacaoSubmenusPage page = new NavegacaoSubmenusPage();
	
	
	@Quando("^o usuario clicar no Submenu Testes Automatizados$")
	public void oUsuarioClicarNoSubmenuTestesAutomatizados() throws Throwable {
	   page.clicarTestesAutomatizados();
	}

	@Entao("^o Submenu Testes Automatizados sera acessado$")
	public void oSubmenuTestesAutomatizadosSeraAcessado() throws Throwable {
	    page.validarTestesAutomatizados();
	}

	@Quando("^o usuario clicar no Submenu Testes Funcionais não funcionais$")
	public void oUsuarioClicarNoSubmenuTestesFuncionaisNãoFuncionais() throws Throwable {
		page.clicarTestesFuncionais();

	}

	@Entao("^o Submenu Testes Funcionais não funcionais sera acessado$")
	public void oSubmenuTestesFuncionaisNãoFuncionaisSeraAcessado() throws Throwable {
	    page.validarTestesFuncionais();
	}

	@Quando("^o usuario clicar no Submenu Testes Manuais$")
	public void oUsuarioClicarNoSubmenuTestesManuais() throws Throwable {
	   page.clicarTestesManuais();
	}

	@Entao("^o Submenu Testes Manuais sera acessado$")
	public void oSubmenuTestesManuaisSeraAcessado() throws Throwable {
	    page.validarTestesManuais();
	}

	@Quando("^o usuario clicar no Submenu Testes Mobile$")
	public void oUsuarioClicarNoSubmenuTestesMobile() throws Throwable {
	    page.clicarTestesMobile();
	}

	@Entao("^o Submenu Testes Mobile sera acessado$")
	public void oSubmenuTestesMobileSeraAcessado() throws Throwable {
	    page.validarTestesMobile();
	}

	@Quando("^o usuario clicar no Submenu Fabrica de Testes$")
	public void oUsuarioClicarNoSubmenuFabricaDeTestes() throws Throwable {
	    page.clicarFabricaTestes();
	}

	@Entao("^o Submenu Fabrica de Testes sera acessado$")
	public void oSubmenuFabricaDeTestesSeraAcessado() throws Throwable {
	    page.validarFabricaTestes();
	}

	@Quando("^o usuario clicar no Submenu Consultoria$")
	public void oUsuarioClicarNoSubmenuConsultoria() throws Throwable {
	    page.clicarConsultoria();
	}

	@Entao("^o Submenu Consultoria sera acessado$")
	public void oSubmenuConsultoriaSeraAcessado() throws Throwable {
	    page.validarConsultoria();
	}

	@Quando("^o usuario clicar no Submenu Crowdsourced Auditeste$")
	public void oUsuarioClicarNoSubmenuCrowdsourcedAuditeste() throws Throwable {
	   
	}

	@Entao("^o Submenu Crowdsourced Auditeste sera acessado$")
	public void oSubmenuCrowdsourcedAuditesteSeraAcessado() throws Throwable {
	    
	}

	@Quando("^o usuario clicar no Submenu Alocacao de Profissionais$")
	public void oUsuarioClicarNoSubmenuAlocacaoDeProfissionais() throws Throwable {
	    
	}

	@Entao("^o Submenu Alocacao de Profissionais sera acessado$")
	public void oSubmenuAlocacaoDeProfissionaisSeraAcessado() throws Throwable {
	    
	}

	@Quando("^o usuario clicar no Submenu Automação de Processos$")
	public void oUsuarioClicarNoSubmenuAutomaçãoDeProcessos() throws Throwable {
	    
	}

	@Entao("^o Submenu Automação de Processos sera acessado$")
	public void oSubmenuAutomaçãoDeProcessosSeraAcessado() throws Throwable {
	   
	}

}

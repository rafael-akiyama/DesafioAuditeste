package br.com.web.steps;

import br.com.web.pages.NavegacaoMenuPage;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class NavegacaoMenuSteps {

	private NavegacaoMenuPage page = new NavegacaoMenuPage();

	@Dado("^que um usuario acesse a plataforma web do Auditeste$")
	public void queUmUsuarioAcesseAPlataformaWebDoAuditeste() throws Throwable {
	    page.acessarSite();
	    page.clicarFechar();
	}
	
	@Quando("^o usuario clicar no menu Home$")
	public void oUsuarioClicarNoMenuHome() throws Throwable {
	    page.clicarHome();
	    page.clicarFechar();
	}

	@Entao("^o menu Home sera acessado$")
	public void oMenuHomeSeraAcessado() throws Throwable {
	    page.validarHome();
	}

	@Quando("^o usuario clicar no menu Quem Somos$")
	public void oUsuarioClicarNoMenuQuemSomos() throws Throwable {
	   page.clicarQuemSomos();
	   
	   
	}

	@Entao("^o menu Quem Somos sera acessado$")
	public void oMenuQuemSomosSeraAcessado() throws Throwable {
		page.validarQuemSomos();
	    
	}
	
	@Quando("^o usuario clicar no menu Cases de Sucesso$")
	public void oUsuarioClicarNoMenuCasesDeSucesso() throws Throwable {
	    page.clicarCases();
	}

	@Entao("^o menu Cases de Sucesso sera acessado$")
	public void oMenuCasesDeSucessoSeraAcessado() throws Throwable {
	    page.validarCases();
	}
	
	@Quando("^o usuario clicar no menu Trabalhe Conosco$")
	public void oUsuarioClicarNoMenuTrabalheConosco() throws Throwable {
	    page.clicarTrabalhe();
	}

	@Entao("^o menu Trabalhe Conosco sera acessado$")
	public void oMenuTrabalheConoscoSeraAcessado() throws Throwable {
	    page.validarTrabalhe();
	}
	
	@Quando("^o usuario clicar no menu Blog$")
	public void oUsuarioClicarNoMenuBlog() throws Throwable {
	    page.clicarBlog();
	}

	@Entao("^o menu Blog sera acessado$")
	public void oMenuBlogSeraAcessado() throws Throwable {
	    page.validarBlog();
	}
	
	@Quando("^o usuario clicar no menu Contato$")
	public void oUsuarioClicarNoMenuContato() throws Throwable {
	    page.clicarContato();
	}

	@Entao("^o menu Contato sera acessado$")
	public void oMenuContatoSeraAcessado() throws Throwable {
	    page.validarContato();
	}

	
}
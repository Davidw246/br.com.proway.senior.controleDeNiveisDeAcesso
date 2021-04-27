package controller.acesso;

import static org.junit.Assert.*;

import org.junit.Test;

public class PerfilControllerTest {

	@Test
	public void verificaSeOcorreACriacaoDeUmPerfil() {

		PerfilController perfilController = new PerfilController();

		Integer idDoPerfil = 10;
		String nomeDoPerfil = "Ponto";

		assertTrue(perfilController.criarPerfilVazioController(idDoPerfil, nomeDoPerfil));
	}

	@Test
	public void verificaSeOcorreACriacaoDeDoisPerfis() {

		PerfilController perfilController = new PerfilController();

		Integer idDoPerfil1 = 10;
		String nomeDoPerfil1 = "Ponto";

		Integer idDoPerfil2 = 20;
		String nomeDoPerfil2 = "Cadastro";

		boolean perfil1 = perfilController.criarPerfilVazioController(idDoPerfil1, nomeDoPerfil1);
		boolean perfil2 = perfilController.criarPerfilVazioController(idDoPerfil2, nomeDoPerfil2);

		assertTrue(perfil1);
		assertTrue(perfil2);

		assertEquals(2, perfilController.lerListaDePerfisCriados().size());
	}

	@Test
	public void verificaSeNaoAdicionaPerfisDuplicados() {

		PerfilController perfilController = new PerfilController();

		Integer idDoPerfil1 = 10;
		String nomeDoPerfil1 = "Ponto";

		Integer idDoPerfil2 = 10;
		String nomeDoPerfil2 = "Cadastro";

		boolean perfil1 = perfilController.criarPerfilVazioController(idDoPerfil1, nomeDoPerfil1);
		boolean perfil2 = perfilController.criarPerfilVazioController(idDoPerfil2, nomeDoPerfil2);

		assertTrue(perfil1);
		assertFalse(perfil2);

		assertEquals(1, perfilController.lerListaDePerfisCriados().size());
	}
	
	@Test
	public void verificaSeOPerfilFoiExcluido() {
		
		PerfilController perfilController = new PerfilController();
		Integer idDoPerfil = 10;
		String nomeDoPerfil = "Ponto";
		
		perfilController.criarPerfilVazioController(idDoPerfil, nomeDoPerfil);
		perfilController.deletarPerfilController(idDoPerfil);
		
		assertTrue(perfilController.lerListaDePerfisCriados().isEmpty());		
	}
	
	@Test
	public void verificaSeOPerfilVazioFoiAlteradoDAO() {
		
		PerfilController perfilController = new PerfilController();		
		Integer idDoPerfil = 10;
		String nomeDoPerfilAntigo = "Ponto";
		String nomeDoPerfilNovo = "Cadastro";
		
		perfilController.criarPerfilVazioController(idDoPerfil, nomeDoPerfilAntigo);
		
		perfilController.alterarNomePerfilController(idDoPerfil, nomeDoPerfilNovo);
		
		assertEquals(nomeDoPerfilNovo, perfilController.lerListaDePerfisCriados().get(0).getNomeDoPerfil());
	}
	
	
	@Test
	public void verificaSeUmaPermissaoEhAtribuidaAUmPerfil() {
		
		PerfilController perfilController = new PerfilController();		
		PermissaoController permissaoController = new PermissaoController();
		
		Integer idDoPerfil = 10;
		String nomeDoPerfil = "Ponto";
		
		Integer idDaPermissao = 20;
		String nomeDaPermissao = "Atribuir algo";
		
		permissaoController.criarPermissaoController(idDaPermissao, nomeDaPermissao);
		perfilController.criarPerfilVazioController(idDoPerfil, nomeDoPerfil);
		
		perfilController.adicionarPermissaoEmUmPerfil(idDoPerfil, idDaPermissao);	
		
		assertFalse(perfilController.listarPermissoesDeUmPerfil(idDoPerfil).isEmpty());
	}
	
	@Test
	public void verificaSeMaisDeUmaPermissaoEhAtribuidaAUmPerfil() {
		
		PerfilController perfilController = new PerfilController();		
		PermissaoController permissaoController = new PermissaoController();
		
		Integer idDoPerfil = 10;
		String nomeDoPerfil = "Ponto";
		
		Integer idDaPermissao1 = 20;
		String nomeDaPermissao1 = "Atribuir algo";
		
		Integer idDaPermissao2 = 30;
		String nomeDaPermissao2 = "Deletar algo";
		
		Integer idDaPermissao3 = 40;
		String nomeDaPermissao3 = "Visualizar algo";
		
		permissaoController.criarPermissaoController(idDaPermissao1, nomeDaPermissao1);
		permissaoController.criarPermissaoController(idDaPermissao2, nomeDaPermissao2);
		permissaoController.criarPermissaoController(idDaPermissao3, nomeDaPermissao2);
		
		perfilController.criarPerfilVazioController(idDoPerfil, nomeDoPerfil);
		
		perfilController.adicionarPermissaoEmUmPerfil(idDoPerfil, idDaPermissao1);	
		perfilController.adicionarPermissaoEmUmPerfil(idDoPerfil, idDaPermissao2);	
		perfilController.adicionarPermissaoEmUmPerfil(idDoPerfil, idDaPermissao3);	
		
		assertEquals(3, perfilController.listarPermissoesDeUmPerfil(idDoPerfil).size());
	}
	
	@Test
	public void verificaSeUmaPermissaoEhRemovidaDeUmPerfil() {
		
		PerfilController perfilController = new PerfilController();		
		PermissaoController permissaoController = new PermissaoController();
		
		Integer idDoPerfil = 10;
		String nomeDoPerfil = "Ponto";
		
		Integer idDaPermissao = 20;
		String nomeDaPermissao = "Atribuir algo";
		
		permissaoController.criarPermissaoController(idDaPermissao, nomeDaPermissao);
		perfilController.criarPerfilVazioController(idDoPerfil, nomeDoPerfil);
		
		perfilController.adicionarPermissaoEmUmPerfil(idDoPerfil, idDaPermissao);	
		perfilController.deletarPermissaoEmUmPerfil(idDoPerfil, idDaPermissao);
		
		assertTrue(perfilController.listarPermissoesDeUmPerfil(idDoPerfil).isEmpty());
	}
}

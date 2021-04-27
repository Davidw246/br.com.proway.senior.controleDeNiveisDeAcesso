package controller.acesso;

import static org.junit.Assert.*;

import org.junit.Test;

public class PermissaoControllerTest {

	@Test
	public void verificaSeOcorreACriacaoDeUmaPermissao() {

		PermissaoController permissaoController = new PermissaoController();

		Integer idDaPermissao = 10;
		String nomeDaPermissao = "Atribuir algo";

		assertTrue(permissaoController.criarPermissaoController(idDaPermissao, nomeDaPermissao));
	}

	@Test
	public void verificaSeOcorreACriacaoDeDuasPermissoes() {

		PermissaoController permissaoController = new PermissaoController();

		Integer idDaPermissao1 = 10;
		String nomeDaPermissao1 = "Atribuir algo";

		Integer idDaPermissao2 = 20;
		String nomeDaPermissao2 = "Deletar algo";

		boolean permissao1 = permissaoController.criarPermissaoController(idDaPermissao1, nomeDaPermissao1);
		boolean permissao2 = permissaoController.criarPermissaoController(idDaPermissao2, nomeDaPermissao2);

		assertTrue(permissao1);
		assertTrue(permissao2);

		assertEquals(2, permissaoController.lerListaDePermissoesCriadas().size());
	}

	@Test
	public void verificaSeNaoAdicionaPermissoesDuplicadas() {

		PermissaoController permissaoController = new PermissaoController();

		Integer idDaPermissao1 = 10;
		String nomeDaPermissao1 = "Atribuir algo";

		Integer idDaPermissao2 = 10;
		String nomeDaPermissao2 = "Deletar algo";

		boolean permissao1 = permissaoController.criarPermissaoController(idDaPermissao1, nomeDaPermissao1);
		boolean permissao2 = permissaoController.criarPermissaoController(idDaPermissao2, nomeDaPermissao2);

		assertTrue(permissao1);
		assertFalse(permissao2);

		assertEquals(1, permissaoController.lerListaDePermissoesCriadas().size());
	}
	
	@Test
	public void verificaSeAPermissaoFoiExcluida() {
		
		PermissaoController permissaoController = new PermissaoController();
		Integer idDaPermissao = 10;
		String nomeDaPermissao = "Atribuir algo";
		
		permissaoController.criarPermissaoController(idDaPermissao, nomeDaPermissao);
		permissaoController.deletarPermissaoController(idDaPermissao);
		
		assertEquals(0, permissaoController.lerListaDePermissoesCriadas().size());
		
	}
	
	

}

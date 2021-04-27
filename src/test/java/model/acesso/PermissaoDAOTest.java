package model.acesso;

import static org.junit.Assert.*;

import org.junit.Test;

import controller.acesso.PermissaoController;

public class PermissaoDAOTest {

	@Test
	public void verificaSeOcorreACriacaoDeUmaPermissaoDAO() {

		PermissaoDAO permissaoDAO = new PermissaoDAO();
		PermissaoModel permissaEsperada = new PermissaoModel(10, "Atribuir algo");

		Integer idDaPermissao = 10;
		String nomeDaPermissao = "Atribuir algo";
		
		PermissaoModel permissaoCriada = permissaoDAO.criarPermissao(idDaPermissao, nomeDaPermissao);

		assertEquals(permissaEsperada.getIdDaPermissao(), permissaoCriada.getIdDaPermissao());
		assertEquals(permissaEsperada.getNomeDaPermissao(), permissaoCriada.getNomeDaPermissao());
	}

	@Test
	public void verificaSeOcorreACriacaoDeDuasPermissoesDAO() {

		PermissaoDAO permissaoDAO = new PermissaoDAO();

		Integer idDaPermissao1 = 10;
		String nomeDaPermissao1 = "Atribuir algo";

		Integer idDaPermissao2 = 20;
		String nomeDaPermissao2 = "Adicionar algo";

		permissaoDAO.criarPermissao(idDaPermissao1, nomeDaPermissao1);
		permissaoDAO.criarPermissao(idDaPermissao2, nomeDaPermissao2);

		assertEquals(2, permissaoDAO.lerListaDePermissoesCriadas().size());
	}

	
	@Test
	public void verificaSeAPermissaoFoiExcluidaDAO() {
		
		PermissaoDAO permissaoDAO = new PermissaoDAO();

		Integer idDaPermissao1 = 10;
		String nomeDaPermissao1 = "Atribuir algo";
		
		permissaoDAO.criarPermissao(idDaPermissao1, nomeDaPermissao1);
		permissaoDAO.deletarPermissao(idDaPermissao1);
		
		assertEquals(0, permissaoDAO.lerListaDePermissoesCriadas().size());
		
	}

}

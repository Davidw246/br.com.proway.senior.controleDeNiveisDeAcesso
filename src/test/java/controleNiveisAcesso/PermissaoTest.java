package controleNiveisAcesso;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import model.acesso.PermissaoModel;

public class PermissaoTest {

	@Test
	public void testCriaNomePermissao() {
		String permissao = "Visualizar";
		PermissaoModel nomeDaPermissao = new PermissaoModel();
		assertTrue(nomeDaPermissao.criarNomePermissao(permissao));
	}

	@Test
	public void testCriaNomePermissaoFalse() {
		String permissao = "";
		PermissaoModel nomeDaPermissao = new PermissaoModel();
		assertFalse(nomeDaPermissao.criarNomePermissao(permissao));
	}

	@Test
	public void testEscolhaDaPermissao() {
		PermissaoModel permissao = new PermissaoModel();

		ArrayList<String> listaPermissoesTeste = new ArrayList<String>();

		listaPermissoesTeste.add("Registro de ponto");
		permissao.criarNomePermissao("Registro de ponto");

		assertEquals(permissao.getNomeDaPermissao(), listaPermissoesTeste.get(0));
	}
}

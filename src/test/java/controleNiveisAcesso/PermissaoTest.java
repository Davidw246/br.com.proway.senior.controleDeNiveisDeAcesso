package controleNiveisAcesso;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import model.acesso.Permissao;

public class PermissaoTest {

	@Test
	public void testCriaNomePermissao() {
		String permissao = "Visualizar";
		Permissao nomeDaPermissao = new Permissao();
		assertTrue(nomeDaPermissao.criarNomePermissao(permissao));
	}

	@Test
	public void testCriaNomePermissaoFalse() {
		String permissao = "";
		Permissao nomeDaPermissao = new Permissao();
		assertFalse(nomeDaPermissao.criarNomePermissao(permissao));
	}

	@Test
	public void testEscolhaDaPermissao() {
		Permissao permissao = new Permissao();

		ArrayList<String> listaPermissoesTeste = new ArrayList<String>();

		listaPermissoesTeste.add("Registro de ponto");
		permissao.criarNomePermissao("Registro de ponto");

		assertEquals(permissao.getNomeDaPermissao(), listaPermissoesTeste.get(0));
	}
}

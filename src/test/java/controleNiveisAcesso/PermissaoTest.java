package controleNiveisAcesso;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class PermissaoTest {

	@Test
	public void testCriaNomePermissao() {
		String permissao = "Visualizar";
		Permissao nomeDaPermissao = new Permissao();
		assertTrue(nomeDaPermissao.criaNomePermissao(permissao));
	}

	@Test
	public void testCriaNomePermissaoFalse() {
		String permissao = "";
		Permissao nomeDaPermissao = new Permissao();
		assertFalse(nomeDaPermissao.criaNomePermissao(permissao));
	}

	@Test
	public void testEscolhaDaPermissao() {
		Permissao permissao = new Permissao();

		ArrayList<String> listaPermissoesTeste = new ArrayList<String>();

		listaPermissoesTeste.add("Registro de ponto");
		permissao.criaNomePermissao("Registro de ponto");

		assertEquals(permissao.nomeDasPermissoes.get(0), listaPermissoesTeste.get(0));
	}
}

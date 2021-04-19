package controleNiveisAcesso;

import static org.junit.Assert.*;

import org.junit.Test;

public class PerfilTest {

	@Test
	public void testCriaNomePerfil() {
		String perfil = "Gerente de RH";
		String permissao = "Visualizar";
		Perfil nomeDoPerfil = new Perfil();
		assertTrue(nomeDoPerfil.criaNomePerfil(perfil, permissao));
	}

	@Test
	public void testCriaNomePerfilFalse() {
		String perfil = "";
		String permissao = "";
		Perfil nomeDoPerfil = new Perfil();
		assertFalse(nomeDoPerfil.criaNomePerfil(perfil, permissao));
	}
}

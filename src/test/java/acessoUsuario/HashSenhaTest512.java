package acessoUsuario;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import model.login.HashSenha;
import model.login.VerificarLogin;

public class HashSenhaTest512 {

	@Test
	public void testHashSenha() {
		HashSenha hash = new HashSenha();
		String senha = "a";
		String valorCodificado = "1f40fc92da241694750979ee6cf582f2d5d7"
				+ "d28e18335de05abc54d0560e0f5302860c652bf08d560252aa5e"
				+ "74210546f369fbbbce8c12cfc7957b2652fe9a75";
		assertEquals(valorCodificado, hash.senhaDoUsuario(senha));

	}
}
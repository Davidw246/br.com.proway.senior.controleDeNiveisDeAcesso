package model.acesso;

import static org.junit.Assert.*;

import org.junit.Test;

import model.acesso.HashSenha;

public class HashSenhaTest {

	@Test
	public void testHashSenha() {
		HashSenha hash = new HashSenha();
		String senha = "a";
		String valorCodificado = "1f40fc92da241694750979ee6cf582f2d5d7d28e1833"
				+ "5de05abc54d0560e0f5302860c652bf08d560252aa5e74210546f369fbbbce"
				+ "8c12cfc7957b2652fe9a75";
		assertEquals(valorCodificado,hash.senhaDoUsuario(senha));

	}

}

package acessoUsuario;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import model.login.HashSenha;
import model.login.VerificarLogin;

public class HashSenhaTest {
	
		@Test
		public void testHashSenha() {
			HashSenha hash = new HashSenha();
			String senha = "123456";
			assertEquals(hash.senhaUsuario, senha);
		}
	}
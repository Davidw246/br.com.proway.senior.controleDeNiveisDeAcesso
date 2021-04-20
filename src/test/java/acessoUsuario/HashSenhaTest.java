package acessoUsuario;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import acessoUsuario.VerificaLogin;

public class HashSenhaTest {
	
		@Test
		public void testHashSenha() {
			HashSenha hash = new HashSenha();
			String senha = "123456";
			assertEquals(hash.senhaUsuario, senha);
		}
	}
package acessoUsuario;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

	public class VerificaLoginTest {

		@Test
		public void testVerificaLogin() {
			VerificaLogin acesso = new VerificaLogin();
			String login = null;
			assertTrue(acesso.validacaoLogin(login));
		}
	
	@Test
	public void testVerificaLoginFalse() {
		VerificaLogin acesso = new VerificaLogin();
		String login = "Claudio";
		assertFalse(acesso.validacaoLogin(login));
	}
	
	@Test
	public void testVerificaSenha() {
		VerificaLogin acessoSenha = new VerificaLogin();
		String senha = "123";
		assertTrue(acessoSenha.validacaoSenha(senha));
	}
	
	@Test
	public void testVerificaSenhaFalse() {
		VerificaLogin acessoSenha = new VerificaLogin();
		String senha = "1";
		assertFalse(acessoSenha.validacaoSenha(senha));
	}
	
	@Test
	public void testLimitadorLogin() {
		VerificaLogin limitadorLogin = new VerificaLogin();
		String login = "adm";
		assertTrue(limitadorLogin.limitadorLogin(login));
	}
	
	@Test
	public void testLimitadorLoginFalse() {
		VerificaLogin limitadorLogin = new VerificaLogin();
		String login = "admmmmmmmmmmmmmmmmmmmmmmmmm";
		assertFalse(limitadorLogin.limitadorLogin(login));
	}
	
	@Test
	public void testLimitadorSenha() {
		VerificaLogin limitadorSenha = new VerificaLogin();
		String senha = "123";
		assertTrue(limitadorSenha.limitadorSenha(senha));
	}
	
	public void testLimitadorSenhaFalse() {
		VerificaLogin limitadorSenha = new VerificaLogin();
		String senha = "0000000000000000000000000000";
		assertFalse(limitadorSenha.limitadorSenha(senha));
	}
}

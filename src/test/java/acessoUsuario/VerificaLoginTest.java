package acessoUsuario;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import model.login.VerificarLogin;

	public class VerificaLoginTest {

		@Test
		public void testVerificaLogin() {
			VerificarLogin acesso = new VerificarLogin();
			String login = "claudio";
			acesso.setLogin(login);
			assertTrue(acesso.validarLogin(acesso.getLogin()));
		}
	
	@Test
	public void testVerificaLoginFalse() {
		VerificarLogin acesso = new VerificarLogin();
		String login = "Claudio";
		assertFalse(acesso.validarLogin(login));
	}
	
	@Test
	public void testVerificaSenha() {
		VerificarLogin acessoSenha = new VerificarLogin();
		String senha = "123456789";
		acessoSenha.setSenha(senha);
		assertTrue(acessoSenha.validarSenha(acessoSenha.getSenha()));
	}
	
	@Test
	public void testVerificaSenhaFalse() {
		VerificarLogin acessoSenha = new VerificarLogin();
		String senha = "1";
		assertFalse(acessoSenha.validarSenha(senha));
	}
	
	@Test
	public void testLimitadorLogin() {
		VerificarLogin limitadorLogin = new VerificarLogin();
		String login = "adm";
		assertTrue(limitadorLogin.limitadorLogin(login));
	}
	
	@Test
	public void testLimitadorLoginFalse() {
		VerificarLogin limitadorLogin = new VerificarLogin();
		String login = "admmmmmmmmmmmmmmmmmmmmmmmmm";
		assertFalse(limitadorLogin.limitadorLogin(login));
	}
	
	@Test
	public void testLimitadorSenha() {
		VerificarLogin limitadorSenha = new VerificarLogin();
		String senha = "123";
		assertTrue(limitadorSenha.limitadorSenha(senha));
	}
	
	public void testLimitadorSenhaFalse() {
		VerificarLogin limitadorSenha = new VerificarLogin();
		String senha = "0000000000000000000000000000";
		assertFalse(limitadorSenha.limitadorSenha(senha));
	}
}

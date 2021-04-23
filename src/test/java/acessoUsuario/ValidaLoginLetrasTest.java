package acessoUsuario;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import model.login.ValidarCaracteresLogin;

public class ValidaLoginLetrasTest {

	@Test
	public void testValidaLoginLetras() {
		ValidarCaracteresLogin loginCaracteres = new ValidarCaracteresLogin();
		String login = "EltonDavid";
		assertTrue(loginCaracteres.validarCaracteresLogin(login));
	}
	
	@Test
	public void testValidaLoginLetrasCaracter() {
		ValidarCaracteresLogin loginCaracteres = new ValidarCaracteresLogin();
		String login = "1234567891";
		assertFalse(loginCaracteres.validarCaracteresLogin(login));
	}
	
	@Test
	public void testValidaLoginLetrasMenorQueDez() {
		ValidarCaracteresLogin loginCaracteres = new ValidarCaracteresLogin();
		String login = "EltonDavi";
		assertFalse(loginCaracteres.validarCaracteresLogin(login));
	}
}

package acessoUsuario;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import acessoUsuario.ValidaLoginLetras;

public class validaLoginLetrasTest {

	@Test
	public void testValidaLoginLetras() {
		ValidaLoginLetras loginCaracteres = new ValidaLoginLetras();
		String login = "EltonDavid";
		assertTrue(loginCaracteres.validaLoginCaracteres(login));
	}
	
	@Test
	public void testValidaLoginLetrasCaracter() {
		ValidaLoginLetras loginCaracteres = new ValidaLoginLetras();
		String login = "1234567891";
		assertFalse(loginCaracteres.validaLoginCaracteres(login));
	}
	
	@Test
	public void testValidaLoginLetrasMenorQueDez() {
		ValidaLoginLetras loginCaracteres = new ValidaLoginLetras();
		String login = "EltonDavi";
		assertFalse(loginCaracteres.validaLoginCaracteres(login));
	}
}

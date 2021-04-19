package acessoUsuario;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import acessoUsuario.validaLoginLetras;

public class validaLoginLetrasTest {

	@Test
	public void testValidaLoginLetras() {
		validaLoginLetras loginCaracteres = new validaLoginLetras();
		String login = "EltonDavid";
		assertTrue(loginCaracteres.validaLoginCaracteres(login));
	}
	
	@Test
	public void testValidaLoginLetrasCaracter() {
		validaLoginLetras loginCaracteres = new validaLoginLetras();
		String login = "1234567891";
		assertFalse(loginCaracteres.validaLoginCaracteres(login));
	}
	
	@Test
	public void testValidaLoginLetrasMenorQueDez() {
		validaLoginLetras loginCaracteres = new validaLoginLetras();
		String login = "EltonDavi";
		assertFalse(loginCaracteres.validaLoginCaracteres(login));
	}
}

package model.acesso;

import static org.junit.Assert.*;

import org.junit.Test;

public class UsuarioControllerTest {

	
	@Test
	public void testeSeEmailValido() {
		UsuarioController userControl = new UsuarioController();
		Usuario user = new Usuario();
		user.setLogin("vitorperes1104@gmail.com");
		assertTrue(userControl.validarEmail(user.getLogin()));
	}
	@Test
	public void testeSeEmailInvalido() {
		UsuarioController userControl = new UsuarioController();
		Usuario user = new Usuario();
		user.setLogin("vitorperes110gmail.com");
		assertFalse(userControl.validarEmail(user.getLogin()));
	}
	@Test
	public void testeSeEmailVazio() {
		UsuarioController userControl = new UsuarioController();
		Usuario user = new Usuario();
		user.setLogin("");
		assertFalse(userControl.validarEmail(user.getLogin()));
	}
	
	@Test
	public void testeSeSenhaValida() {
		UsuarioController userControl = new UsuarioController();
		Usuario user = new Usuario();
		user.setSenha("1Vaaaa");
		assertTrue(userControl.validarSenha(user.getSenha()));
	}
	
	@Test
	public void testeSeSenhaInvalida() {
		UsuarioController userControl = new UsuarioController();
		Usuario user = new Usuario();
		user.setSenha("123124321");
		assertFalse(userControl.validarSenha(user.getSenha()));
	}
	@Test
	public void testeSeSenhaMenor() {
		UsuarioController userControl = new UsuarioController();
		Usuario user = new Usuario();
		user.setSenha("1Pa");
		assertFalse(userControl.validarSenha(user.getSenha()));
	}
	@Test
	public void testeSeSenhaMaior() {
		UsuarioController userControl = new UsuarioController();
		Usuario user = new Usuario();
		user.setSenha("1Pa124126124131364346413523342433244143143131413311");
		assertFalse(userControl.validarSenha(user.getSenha()));
	}
	@Test
	public void testeAlteraSenha(){
		UsuarioController userControl = new UsuarioController();
		DaoUsuario daoUsuarioTest = new DaoUsuario();
		Usuario user = new Usuario();
		user.setSenha("1Pabcde");
		user.setId(0);
		daoUsuarioTest.user.add(user);
		userControl.alteraSenha(0, "2Cabasde");
		System.out.println(daoUsuarioTest.get(0).getSenha());
		assertEquals("2Cabasde", daoUsuarioTest.get(0).getSenha());
	}

}

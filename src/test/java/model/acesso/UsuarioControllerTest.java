package model.acesso;

import static org.junit.Assert.*;

import org.junit.Test;

public class UsuarioControllerTest {

	@Test
	public void testeSeEstaLogado() {
		Usuario usuario = new Usuario();
		usuario.setLogin("Vitor");
		usuario.setSenha("123");
		usuario.setLogado(true);
		DaoUsuario daoUsuario = new DaoUsuario();
		daoUsuario.user.add(daoUsuario.create(usuario));
		UsuarioController controller = new UsuarioController(); 
		assertTrue(controller.logarPerfil(daoUsuario.getAll()));
	}

	@Test
	public void testeSeEstaLogadoVazio() {
		Usuario usuario = new Usuario();
		usuario.setLogin("");
		usuario.setSenha("");
		usuario.setLogado(false);
		DaoUsuario daoUsuario = new DaoUsuario();
		daoUsuario.user.add(daoUsuario.create(usuario));
		UsuarioController controller = new UsuarioController(); 
		assertFalse(controller.logarPerfil(daoUsuario.getAll()));
	}
	
	@Test
	public void testeSeLoginValido() {
		Usuario user = new Usuario();
		user.setLogin("Vitor");
		user.setSenha("123");
		
	
	}

}

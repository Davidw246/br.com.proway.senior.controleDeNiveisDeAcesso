package model.acesso;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import controller.UsuarioController;

/**
 * 
 * @author Vitor Peres
 * @author David Willian
 * @author Leonardo Pereira
 * vitor.peres@senior.com.br
 * leonardo.pereira@senior.com.br
 * david.oliveira@senior.com.br
 * 
 */
public class UsuarioDAOTest {

	@Test
	public void testCreateUsuario() {
		
		UsuarioDAO userDAO = new UsuarioDAO();
		Usuario usuario = new Usuario();
		usuario.setId(0);
		usuario.setLogin("vitorperes1104@gmail.com");
		userDAO.create(usuario);
		
		assertEquals("vitorperes1104@gmail.com", userDAO.user.get(0).getLogin());
		
	}
	
	@Test
	public void testGetUsuario() {
		UsuarioDAO userDAO = new UsuarioDAO();
		Usuario usuario = new Usuario();
		usuario.setId(0);
		usuario.setLogin("vitorperes1104@gmail.com");
		userDAO.create(usuario);
		Usuario userTest = userDAO.get(0);
		
		assertEquals("vitorperes1104@gmail.com", userTest.getLogin());
		
	}
	
	@Test
	public void testUpdateUsuario() {
		UsuarioController userControl = new UsuarioController();
		Usuario usuario = new Usuario();
		usuario.setId(0);
		usuario.setLogin("Teste");
		userControl.daoUsuario.create(usuario);
		usuario.setLogin("Teste usuario atualizado");
		userControl.daoUsuario.update(usuario);
		assertEquals("Teste usuario atualizado", userControl.daoUsuario.user.get(0).getLogin());
	}
	
	@Test
	public void testeGetAllUsuario() {
		UsuarioController userControl = new UsuarioController();
		
		PermissaoModel permissao = new PermissaoModel(1, "Permissao alteração de perfil");
		ArrayList<PermissaoModel> listaPermissao = new ArrayList<PermissaoModel>();
		listaPermissao.add(permissao);
		
		PerfilModel perfilTest = new PerfilModel(1, "Perfil teste", listaPermissao);

		Usuario userUm = new Usuario(0, "vcperes@furb.br", "Va123456", perfilTest);
		Usuario userDois = new Usuario(1, "vitorperes1104@gmail.com", "Ca123456", perfilTest);
		userControl.daoUsuario.user.add(userUm);
		userControl.daoUsuario.user.add(userDois);
		ArrayList<Usuario> arrayUsuariosTest = userControl.daoUsuario.getAll();
		assertEquals("vcperes@furb.br", arrayUsuariosTest.get(0).getLogin());
		assertEquals("vitorperes1104@gmail.com", arrayUsuariosTest.get(1).getLogin());
	}
	
	@Test
	public void testeRemoveUsuario() {
		UsuarioController userControl = new UsuarioController();
		PermissaoModel permissao = new PermissaoModel(1, "Permissao alteração de perfil");
		ArrayList<PermissaoModel> listaPermissao = new ArrayList<PermissaoModel>();
		listaPermissao.add(permissao);
		
		PerfilModel perfilTest = new PerfilModel(1, "Perfil teste", listaPermissao);

		Usuario userUm = new Usuario(0, "vcperes@furb.br", "Va123456", perfilTest);
		Usuario userDois = new Usuario(1, "vitorperes1104@gmail.com", "Ca123456", perfilTest);

		userControl.daoUsuario.user.add(userUm);
		userControl.daoUsuario.user.add(userDois);
		userControl.daoUsuario.remove(0);
	
		assertEquals(1, userControl.daoUsuario.user.get(0).getId());
	}


}

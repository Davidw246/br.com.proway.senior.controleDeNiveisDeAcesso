package controller.acesso;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import controller.UsuarioController;
import model.acesso.PerfilModel;
import model.acesso.PermissaoModel;
import model.acesso.Usuario;

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
	public void testeAlteraSenha() {
		UsuarioController userControl = new UsuarioController();
		Usuario user = new Usuario();
		user.setSenha("1Pabcde");
		user.setId(0);
		userControl.daoUsuario.user.add(user);
		userControl.alteraSenha(0, "2Cabasde");
		assertEquals("2Cabasde", userControl.daoUsuario.get(0).getSenha());
	}

	@Test
	public void testeAlteraLogin() {
		UsuarioController userControl = new UsuarioController();
		Usuario user = new Usuario();
		user.setLogin("vitorperes1104@gmail.com");
		user.setId(0);
		userControl.daoUsuario.user.add(user);
		userControl.alteraLogin(0, "dwillian676@gmail.com");
		assertEquals("dwillian676@gmail.com", userControl.daoUsuario.get(0).getLogin());
	}

	@Test
	public void testeGerarCodigo() {
		UsuarioController userControl = new UsuarioController();
		assertTrue(userControl.gerarCodigo());
	}

	@Test
	public void testeAlteraPerfil() {

		UsuarioController userControl = new UsuarioController();
		Usuario user = new Usuario();

		PermissaoModel permissaoNormal = new PermissaoModel(1, "Permissao alteração de perfil");
		ArrayList<PermissaoModel> listaPermissaoNormal = new ArrayList<PermissaoModel>();
		listaPermissaoNormal.add(permissaoNormal);
		PermissaoModel permissaoTest = new PermissaoModel(2, "Permissao alterada Test");
		ArrayList<PermissaoModel> listaPermissaoTest = new ArrayList<PermissaoModel>();
		listaPermissaoTest.add(permissaoTest);

		PerfilModel perfilNormal = new PerfilModel(1, "Teste", listaPermissaoNormal);
		PerfilModel perfilTest = new PerfilModel(2, "Teste alterado", listaPermissaoTest);

		user.setPerfil(perfilNormal);
		userControl.daoUsuario.user.add(user);
		userControl.alteraPerfil(0, perfilTest);

		assertEquals(perfilTest, userControl.daoUsuario.user.get(0).getPerfil());
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

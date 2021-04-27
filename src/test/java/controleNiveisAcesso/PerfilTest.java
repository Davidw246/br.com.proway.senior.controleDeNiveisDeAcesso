package controleNiveisAcesso;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import model.acesso.Perfil;
import model.acesso.Permissao;
import model.login.Usuario;

public class PerfilTest {

	@Test
	public void testCriaNomePerfil() {
		String perfil = "Gerente de RH";
		String permissao = "Visualizar";
		Perfil nomeDoPerfil = new Perfil();
		assertTrue(nomeDoPerfil.criarNomePerfil(perfil, permissao));
	}

	@Test
	public void testCriaNomePerfilFalse() {
		String perfil = "";
		String permissao = "";
		Perfil nomeDoPerfil = new Perfil();
		assertFalse(nomeDoPerfil.criarNomePerfil(perfil, permissao));
	}

	@Test
	public void testAdicionaPermissaoAPerfilDoUsuarioJaCriado() {
		String nomeDoLogin = "Vanderlei";
		String nomeDaPermissao = "Gerente";
		Perfil perfil = new Perfil();
		Usuario usuario = new Usuario();
		
		perfil.listaDosPerfis.add("Gerente");

		usuario.setLogin("Vanderlei");
		usuario.setPerfil("Gerente");

		assertTrue(perfil.adicionarPermissaoAPerfilDoUsuarioCadastrado(nomeDoLogin, nomeDaPermissao));
	}

	@Test
	public void testRemovePermissaoAPerfilDoUsuarioJaCriado() {
		ArrayList<String> listaDasPermissoesDoUsuarioTest = new ArrayList<String>();
		
		String nomeDoLogin = "Vanderlei";
		String nomeDaPermissao = "Visualizar";
		String nomeDoPerfil = "Gerente";
		Perfil perfil = new Perfil();
		Usuario usuario = new Usuario();
		Permissao permissao = new Permissao();

		perfil.listaDosPerfis.add(nomeDoPerfil);
		permissao.listaDasPermissoes.add(nomeDaPermissao);
		usuario.adicionarNomePermissaoNaListaPermissoes(nomeDaPermissao);
		listaDasPermissoesDoUsuarioTest.add(nomeDaPermissao);
		
		usuario.setLogin("Vanderlei");
		usuario.setPerfil("Gerente");

		assertTrue(perfil.removerPermissaoDoPerfilDoUsuarioCadastrado(listaDasPermissoesDoUsuarioTest, nomeDoLogin, nomeDaPermissao));
	}

}

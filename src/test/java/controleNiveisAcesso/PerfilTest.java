package controleNiveisAcesso;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import model.acesso.PerfilModel;
import model.acesso.PermissaoModel;
import model.acesso.Usuario;

public class PerfilTest {

	@Test
	public void testCriaNomePerfil() {
		String perfil = "Gerente de RH";
		String permissao = "Visualizar";
		PerfilModel nomeDoPerfil = new PerfilModel();
		assertTrue(nomeDoPerfil.criarNomePerfil(perfil, permissao));
	}

	@Test
	public void testCriaNomePerfilFalse() {
		String perfil = "";
		String permissao = "";
		PerfilModel nomeDoPerfil = new PerfilModel();
		assertFalse(nomeDoPerfil.criarNomePerfil(perfil, permissao));
	}

	@Test
	public void testAdicionaPermissaoAPerfilDoUsuarioJaCriado() {
		String nomeDoLogin = "Vanderlei";
		String nomeDaPermissao = "Gerente";
		PerfilModel perfil = new PerfilModel();
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
		PerfilModel perfil = new PerfilModel();
		Usuario usuario = new Usuario();
		PermissaoModel permissao = new PermissaoModel();

		perfil.listaDosPerfis.add(nomeDoPerfil);
		permissao.listaDasPermissoes.add(nomeDaPermissao);
		usuario.adicionarNomePermissaoNaListaPermissoes(nomeDaPermissao);
		listaDasPermissoesDoUsuarioTest.add(nomeDaPermissao);
		
		usuario.setLogin("Vanderlei");
		usuario.setPerfil("Gerente");

		assertTrue(perfil.removerPermissaoDoPerfilDoUsuarioCadastrado(listaDasPermissoesDoUsuarioTest, nomeDoLogin, nomeDaPermissao));
	}

}

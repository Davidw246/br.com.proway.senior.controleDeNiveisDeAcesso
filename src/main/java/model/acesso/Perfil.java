package model.acesso;

import java.util.ArrayList;

import model.interfaces.InterfacePerfil;
import model.login.Usuario;

public class Perfil implements InterfacePerfil {

	private String nomeDoPerfil;
	private String nomeDoLogin;

	public ArrayList<String> listaDosPerfis = new ArrayList<String>();

	Permissao permissaoDeAcesso = new Permissao();

	/**
	 * M�todos m�gicos/M�todos de acesso
	 * 
	 * @return nomeDoPerfil Tipo String
	 */
	public String getNomeDoPerfil() {
		return nomeDoPerfil;
	}

	public void setNomeDoPerfil(String nomeDoPerfil) {
		this.nomeDoPerfil = nomeDoPerfil;
	}

	public String getNomeDoLogin() {
		return nomeDoLogin;
	}

	public void setNomeDoLogin(String nomeDoLogin) {
		this.nomeDoLogin = nomeDoLogin;
	}

	/**
	 * Um m�todo que cria o nome do perfil/cadastra a permiss�o.
	 * 
	 * Verifica se o nome se o nome recebido � nulo ou vazio.
	 * 
	 * Recebe uma string.
	 * 
	 * Adiciona a string (nome do perfil) ao ArrayList (lista de perfis).
	 * 
	 * @param nomeDoPerfil    Recebe string
	 * @param nomeDaPermissao Recebe string
	 * @return validacao Retorna true ou false.
	 */
	public boolean criarNomePerfil(String nomeDoPerfil, String nomeDaPermissao) {
		boolean validacao;

		if (nomeDoPerfil.equals("") || nomeDoPerfil.equals(null)) {
			validacao = false;
		} else {
			permissaoDeAcesso.escolherPermissao(nomeDaPermissao);

			setNomeDoPerfil(nomeDoPerfil);
			listaDosPerfis.add(nomeDoPerfil);

			validacao = true;
		}
		return validacao;
	}

	/**
	 * M�todo que adiciona uma Permiss�o a um Perfil de Usu�rio j� cadastrado.
	 * 
	 * Verifica dentro da lista de Permiss�es de um Perfil de um Usu�rio.
	 * 
	 * Adiciona Permiss�o a este Perfil.
	 * 
	 * @param nomeDoLogin Recebe String
	 * @return validacao
	 */
	public boolean adicionarPermissaoAPerfilDoUsuarioCadastrado(String nomeDoLogin, String nomeDaPermissao) {
		Usuario usuario = new Usuario();
		boolean validacao = false;
		
		if (nomeDoLogin.equalsIgnoreCase(usuario.getLogin())) {
			for (int i = 0; i < listaDosPerfis.size(); i++) {
				if (listaDosPerfis.get(i).equalsIgnoreCase(usuario.getPerfil())) {
					usuario.adicionarNomePermissaoNaListaPermissoes(nomeDaPermissao);
					validacao = true;
				}
			}
		}
		return validacao;
	}

	/**
	 * M�todo que remove uma Permiss�o de um Perfil de Usu�rio j� cadastrado.
	 * 
	 * Verifica dentro da lista de Permiss�es de um Perfil de um Usu�rio.
	 * 
	 * Remove uma Permiss�o espec�fica deste Perfil.
	 * 
	 * @param nomeDoLogin     Recebe String
	 * @param nomeDaPermissao Recebe String
	 * @return validacao
	 */

	public boolean removerPermissaoDoPerfilDoUsuarioCadastrado(ArrayList<String> listaDasPermissoesDoUsuario, String nomeDoLogin,
			String nomeDaPermissao) {
		
		Usuario usuario = new Usuario();
		boolean validacao = false;
		
		if (nomeDoLogin.equalsIgnoreCase(usuario.getLogin())) {
			for (int i = 0; i < listaDosPerfis.size(); i++) {
				if (listaDosPerfis.get(i).equalsIgnoreCase(usuario.getPerfil())) {
					for (int j = 0; j < listaDasPermissoesDoUsuario.size(); j++) {
						if (nomeDaPermissao.equalsIgnoreCase(listaDasPermissoesDoUsuario.get(i))) {
							listaDasPermissoesDoUsuario.remove(i);
							validacao = true;
						}
					}
				}
			}
		}
		return validacao;
	}

}

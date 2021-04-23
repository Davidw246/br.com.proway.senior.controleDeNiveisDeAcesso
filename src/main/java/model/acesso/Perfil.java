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
	 * Métodos mágicos/Métodos de acesso
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
	 * Um método que cria o nome do perfil/cadastra a permissão.
	 * 
	 * Verifica se o nome se o nome recebido é nulo ou vazio.
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
	 * Método que adiciona uma Permissão a um Perfil de Usuário já cadastrado.
	 * 
	 * Verifica dentro da lista de Permissões de um Perfil de um Usuário.
	 * 
	 * Adiciona Permissão a este Perfil.
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
	 * Método que remove uma Permissão de um Perfil de Usuário já cadastrado.
	 * 
	 * Verifica dentro da lista de Permissões de um Perfil de um Usuário.
	 * 
	 * Remove uma Permissão específica deste Perfil.
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

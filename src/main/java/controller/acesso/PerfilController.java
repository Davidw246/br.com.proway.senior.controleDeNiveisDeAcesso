package controller.acesso;

import java.util.ArrayList;

import model.acesso.Usuario;

public class PerfilController {
	
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

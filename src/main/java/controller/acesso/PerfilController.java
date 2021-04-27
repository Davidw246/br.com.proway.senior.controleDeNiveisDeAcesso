package controller.acesso;

import java.util.ArrayList;

import model.acesso.Usuario;

public class PerfilController {
	
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

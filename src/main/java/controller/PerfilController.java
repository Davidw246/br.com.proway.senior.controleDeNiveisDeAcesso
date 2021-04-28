package controller;

import java.util.ArrayList;

import model.acesso.PerfilDAO;
import model.acesso.PerfilModel;
import model.acesso.PermissaoDAO;
import model.acesso.PermissaoModel;

/**
 * Classe PerfilController
 * 
 * Classe responsável pelas validações e verificações das entradas e saídas
 *
 */

public class PerfilController {

	private PerfilDAO dao = new PerfilDAO();

	/**
	 * Método criarPerfilVazioController
	 * 
	 * Método responsável pela criação do perfil vazio, verificando previamente se o
	 * mesmo já existe na lista de perfis cadastrados.
	 * 
	 * @param idDoPerfil   Integer
	 * @param nomeDoPerfil String
	 * @return boolean
	 */
	public boolean criarPerfilVazioController(Integer idDoPerfil, String nomeDoPerfil) {

		if (dao.lerListaDePerfisCriados().size() == 0) {
			dao.criarPerfilVazio(idDoPerfil, nomeDoPerfil);
			return true;
		} else {
			if (dao.buscarPerfil(idDoPerfil) == null) {
				dao.criarPerfilVazio(idDoPerfil, nomeDoPerfil);
				return true;
			} else {
				return false;
			}
		}
	}

	/**
	 * Método deletarPerfilController
	 * 
	 * Método realiza a exclusão do perfil conforme id informado
	 * 
	 * @param idDoPerfil Integer
	 * @return void
	 */
	public void deletarPerfilController(Integer idDoPerfil) {
		dao.deletarPerfil(idDoPerfil);
	}

	/**
	 * Método lerListaDePerfisCriados
	 * 
	 * Método retorna a lista de perfis criados
	 * 
	 * @return ArrayList<PerfilModel>
	 */
	public ArrayList<PerfilModel> lerListaDePerfisCriados() {
		return dao.lerListaDePerfisCriados();
	}

	/**
	 * Método alterarPerfilController
	 * 
	 * Método realiza a alteração do nome de um perfil conforme id informado
	 * 
	 * @param idDoPerfil     Integer
	 * @param novoNomePerfil String
	 * @return void
	 */
	public void alterarNomePerfilController(Integer idDoPerfil, String novoNomePerfil) {
		dao.alterarNomePerfil(idDoPerfil, novoNomePerfil);
	}

	/**
	 * Método adicionarPermissaoEmUmPerfil
	 * 
	 * Método adiciona uma permissão a um perfil, com base nos seus respectivos id's
	 * 
	 * @param idDoPerfil
	 * @param idDaPermissao
	 * @return void
	 */
	public void adicionarPermissaoEmUmPerfil(Integer idDoPerfil, Integer idDaPermissao) {
		PermissaoDAO permissaoDAO = new PermissaoDAO();

		ArrayList<PermissaoModel> listaDePermissoesDoPerfil = dao.buscarPerfil(idDoPerfil)
				.getListaDePermissoesDoPerfil();

		listaDePermissoesDoPerfil.add(permissaoDAO.buscarPermissao(idDaPermissao));
	}

	/**
	 * Método deletarPermissaoEmUmPerfil
	 * 
	 * Método remove uma permissão de um perfil, com base nos seus respectivos id's
	 * 
	 * @param idDoPerfil
	 * @param idDaPermissao
	 * @return void
	 */
	public void deletarPermissaoEmUmPerfil(Integer idDoPerfil, Integer idDaPermissao) {
		PermissaoDAO permissaoDAO = new PermissaoDAO();

		ArrayList<PermissaoModel> listaDePermissoesDoPerfil = dao.buscarPerfil(idDoPerfil)
				.getListaDePermissoesDoPerfil();

		listaDePermissoesDoPerfil.remove(permissaoDAO.buscarPermissao(idDaPermissao));
	}

	/**
	 * Método listarPermissoesDeUmPerfil
	 * 
	 * Método retorna uma lista de permissões atribuídas a um perfil
	 * 
	 * @param idDoPerfil
	 * @return ArrayList<PermissaoModel>
	 */
	public ArrayList<PermissaoModel> listarPermissoesDeUmPerfil(Integer idDoPerfil) {
		return dao.buscarPerfil(idDoPerfil).getListaDePermissoesDoPerfil();
	}
}

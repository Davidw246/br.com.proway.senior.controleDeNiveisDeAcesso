package controller;

import java.util.ArrayList;

import model.acesso.PermissaoDAO;
import model.acesso.PermissaoModel;

/**
 * Classe PermissaoController
 * 
 * Classe responsável pelas validações e verificações das entradas e saídas
 * 
 * @author Lucas Ivan, lucas.ivan@senior.com.br
 * @author Sarah Brito, sarah.brito@senior.com.br
 *
 */

public class PermissaoController {

	private PermissaoDAO dao = new PermissaoDAO();
	
	/**
	 * Método criarPermissaoController
	 * 
	 * Método responsável pela criação da permissão, verificando previamente se a mesma 
	 * já existe na lista de permissões cadastradas. 
	 * 
	 * @param idDaPermissao Integer
	 * @param nomeDaPermissao String
	 * @return boolean
	 */
	public boolean criarPermissaoController(Integer idDaPermissao, String nomeDaPermissao) {
		
		if (dao.lerListaDePermissoesCriadas().size() == 0) {
			dao.criarPermissao(idDaPermissao, nomeDaPermissao);
			return true;
		} else {
			if (dao.buscarPermissao(idDaPermissao) == null) {
				dao.criarPermissao(idDaPermissao, nomeDaPermissao);
				return true;
			} else {
				return false;
			}	
		}			
	}
	
	/**
	 * Método deletarPermissaoController
	 * 
	 * Método realiza a exclusão da permissão conforme id informado
	 * 
	 * @param idDaPermissao Integer
	 * @return void
	 */
	public void deletarPermissaoController(Integer idDaPermissao) {
		dao.deletarPermissao(idDaPermissao);
	}

	/**
	 * Método lerListaDePermissoesCriadas
	 * 
	 * Método retorna a lista de permissões criadas
	 * 
	 * @return ArrayList<PermissaoModel>
	 */
	public ArrayList<PermissaoModel> lerListaDePermissoesCriadas() {
		return dao.lerListaDePermissoesCriadas();
	}

}

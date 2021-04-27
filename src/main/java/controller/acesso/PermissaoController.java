package controller.acesso;

import java.util.ArrayList;

import model.acesso.PermissaoDAO;
import model.acesso.PermissaoModel;

/**
 * Classe PermissaoController
 * 
 * Classe responsável pelas validações e verificações das entradas
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
	 * @param idDaPermissao
	 * @param nomeDaPermissao
	 * @param listaDePermissoesCriadas
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
	 * Método realiza a exclusão da permissão conforme id solicitada
	 * 
	 * @param idDaPermissao Integer
	 * @return void
	 */
	public void deletarPermissaoController(Integer idDaPermissao) {
		dao.deletarPermissao(idDaPermissao);
	}

	/**
	 * Método atribuirPermissaoAoUsuario
	 * 
	 * Método responsável por atribuir uma permissao existente no banco de dados
	 * para o usuário informado
	 * 
	 * @param usuario       Usuario
	 * @param idDaPermissao Integer
	 * @return void
	 * 
	 */
	
//	public void atribuirPermissaoAoUsuario(Usuario usuario, Integer idDaPermissao) {
//	
//	}
	
	/**
	 * Método lerListaDePermissoesCriadas
	 * 
	 * Método retorna a lista de permissões criadas
	 * 
	 * @return ArrayList
	 */
	public ArrayList<PermissaoModel> lerListaDePermissoesCriadas() {
		return dao.lerListaDePermissoesCriadas();
	}

}

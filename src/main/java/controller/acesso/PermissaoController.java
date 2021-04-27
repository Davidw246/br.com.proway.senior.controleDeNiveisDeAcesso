package controller.acesso;

import java.util.ArrayList;

import model.acesso.PermissaoDAO;
import model.acesso.PermissaoModel;

/**
 * Classe PermissaoController
 * 
 * Classe respons�vel pelas valida��es e verifica��es das entradas
 *
 */

public class PermissaoController {

	private PermissaoDAO dao = new PermissaoDAO();
	
	public PermissaoDAO getDao() {
		return dao;
	}

	/**
	 * M�todo criarPermissaoController
	 * 
	 * M�todo respons�vel pela cria��o da permiss�o, verificando previamente se a mesma 
	 * j� existe na lista de permiss�es cadastradas. 
	 * 
	 * @param idDaPermissao
	 * @param nomeDaPermissao
	 * @param listaDePermissoesCriadas
	 * @return boolean
	 */
	public boolean criarPermissaoController(Integer idDaPermissao, String nomeDaPermissao) {
		
		if (dao.getListaDePermissoesCriadas().size() == 0) {
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
	 * M�todo que retorna uma String com a escolha da permissao
	 * 
	 * Valida se o nome da permissao esta dentro do Array de permissoes
	 * 
	 * @param nomeDaPermissao Recebe String
	 * @return true || false boolean
	 */
	public String escolherPermissao(String nomeDaPermissao) {
		String validacao = "";
		for (int i = 0; i < listaDasPermissoes.size(); i++) {
			if (nomeDaPermissao.equalsIgnoreCase(listaDasPermissoes.get(i))) {
				validacao = nomeDaPermissao;
			} else {
				validacao = "Voc� n�o tem acesso";
			}
		}
		return validacao;
	}

}

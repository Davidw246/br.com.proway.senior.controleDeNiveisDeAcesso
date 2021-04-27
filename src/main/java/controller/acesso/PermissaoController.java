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
	 * M�todo deletarPermissaoController
	 * 
	 * M�todo realiza a exclus�o da permiss�o conforme id solicitada
	 * 
	 * @param idDaPermissao Integer
	 * @return void
	 */
	public void deletarPermissaoController(Integer idDaPermissao) {
		dao.deletarPermissao(idDaPermissao);
	}

	/**
	 * M�todo atribuirPermissaoAoUsuario
	 * 
	 * M�todo respons�vel por atribuir uma permissao existente no banco de dados
	 * para o usu�rio informado
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
	 * M�todo lerListaDePermissoesCriadas
	 * 
	 * M�todo retorna a lista de permiss�es criadas
	 * 
	 * @return ArrayList
	 */
	public ArrayList<PermissaoModel> lerListaDePermissoesCriadas() {
		return dao.lerListaDePermissoesCriadas();
	}

}

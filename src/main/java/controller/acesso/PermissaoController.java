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
	public boolean criarPermissaoController(Integer idDaPermissao, String nomeDaPermissao,
			ArrayList<PermissaoModel> listaDePermissoesCriadas) {

		PermissaoDAO dao = new PermissaoDAO();
		boolean validacao;
		int i = 0;
		
		if (listaDePermissoesCriadas.size() == 0) {
			dao.criarPermissao(idDaPermissao, nomeDaPermissao);
			return true;

		} else {
			
			do {
				if (listaDePermissoesCriadas.get(i).getIdDaPermissao() == idDaPermissao) {
					validacao = false;
				} else {
					validacao = true;
					i++;
				}

			} while (validacao = true);

			if (validacao = true) {
				dao.criarPermissao(idDaPermissao, nomeDaPermissao);
				return true;

			} else {
				return false;
			}
		}
	}

	/**
	 * Método que retorna uma String com a escolha da permissao
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
				validacao = "Você não tem acesso";
			}
		}
		return validacao;
	}

}

package model.acesso;

import java.util.ArrayList;

import model.interfaces.InterfacePermissaoDAO;

/**
 * Classe PermissaoDAO
 * 
 * Classe que implementa a interface que se relaciona com o banco de dados de permissões
 * 
 * @author Lucas Ivan, lucas.ivan@senior.com.br
 * @author Sarah Brito, sarah.brito@senior.com.br
 * 
 */

public class PermissaoDAO implements InterfacePermissaoDAO {

	private ArrayList<PermissaoModel> listaDePermissoesCriadas = new ArrayList<PermissaoModel>();

	/**
	 * Método criarPermissao
	 * 
	 * Método responsável por inserir uma permissao no banco de dados conforme
	 * atribuitos associadados
	 * 
	 * @param idDaPermissao Integer
	 * @param nomeDaPermissao String
	 * @return PermissaoModel 
	 * 
	 */
	public PermissaoModel criarPermissao(Integer idDaPermissao, String nomeDaPermissao) {
		PermissaoModel permissaoModel = new PermissaoModel(idDaPermissao, nomeDaPermissao);

		listaDePermissoesCriadas.add(permissaoModel);

		return permissaoModel;
	}

	/**
	 * Método deletarPermissao
	 * 
	 * Método responsável por deletar uma permissao existente no banco de dados a partir do
	 * id informado
	 * 
	 * @param idDaPermissao Integer
	 * @return boolean
	 * 
	 */
	public boolean deletarPermissao(Integer idDaPermissao) {
		PermissaoModel permissaoEscolhida = this.buscarPermissao(idDaPermissao);
		if (permissaoEscolhida != null) {
			listaDePermissoesCriadas.remove(permissaoEscolhida);
			return true;
		}
		return false;
	}

	/**
	 * Método buscarPermissao
	 * 
	 * Método responsável por buscar, através do id, uma permissão dentro de uma
	 * lista de Permissoes. Se a permissao existe, retorna a mesma. Se não, retorna
	 * nulo.
	 * 
	 * @param idDaPermissao Integer
	 * @return PermissaoModel
	 */
	public PermissaoModel buscarPermissao(Integer idDaPermissao) {
		for (PermissaoModel permissaoModel : listaDePermissoesCriadas) {
			if (permissaoModel.getIdDaPermissao() == idDaPermissao) {
				return permissaoModel;
			}
		}
		return null;
	}

	/**
	 * Método lerListaDePermissoesCriadas
	 * 
	 * Retorna a lista de permissoes criadas
	 *  
	 * @return ArrayList<PermissaoModel>
	 */
	public ArrayList<PermissaoModel> lerListaDePermissoesCriadas() {
		return listaDePermissoesCriadas;
	}


}

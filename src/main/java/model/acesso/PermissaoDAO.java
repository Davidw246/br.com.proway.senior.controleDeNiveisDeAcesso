package model.acesso;

import java.util.ArrayList;

import controller.interfaces.InterfacePermissaoDAO;

/**
 * Classe PermissaoDao
 * 
 * Classe que implementa a interface em relação com o banco de dados referentes
 * as possiveis permissões do usuario
 * 
 */

public class PermissaoDAO implements InterfacePermissaoDAO {

	private ArrayList<PermissaoModel> listaDePermissoesCriadas = new ArrayList<PermissaoModel>();
	

	/**
	 * Método criarPermissao
	 * 
	 * Método responsável por inserir uma permissao de banco de dados conforme
	 * atribuito associadado
	 * 
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
	 * Método responsável por deletar uma permissao no banco de dados a partir 
	 * do objeto informado
	 * 
	 * @param permissaoEscolhida PermissaoModel
	 * @return void
	 * 
	 */
	public void deletarPermissao(PermissaoModel permissaoEscolhida) {
		listaDePermissoesCriadas.remove(permissaoEscolhida);
	}

	/**
	 * Método buscarPermissao
	 * 
	 * Método responsável por buscar, através do id, uma permissão dentro de uma lista de Permissoes.
	 * Se a permissao existe, retorna a mesma. Se não, retorna nulo.
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

	public ArrayList<PermissaoModel> getListaDePermissoesCriadas() {
		return listaDePermissoesCriadas;
	}

	/**
	 * Método atribuirPermissaoAoUsuario
	 * 
	 * Método responsável por atribuir uma permissao existente no banco de dados para 
	 * o usuário informado
	 * 
	 * @param usuario Usuario
	 * @param idDaPermissao Integer
	 * @return void
	 * 
	 */
//	public void atribuirPermissaoAoUsuario(Usuario usuario, Integer idDaPermissao) {
//	
//	}

}

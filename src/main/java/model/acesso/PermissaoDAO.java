package model.acesso;

import java.util.ArrayList;

import controller.interfaces.InterfacePermissaoDAO;

/**
 * Classe PermissaoDao
 * 
 * Classe que implementa a interface em rela��o com o banco de dados referentes
 * as possiveis permiss�es do usuario
 * 
 */

public class PermissaoDAO implements InterfacePermissaoDAO {

	private ArrayList<PermissaoModel> listaDePermissoesCriadas = new ArrayList<PermissaoModel>();
	

	/**
	 * M�todo criarPermissao
	 * 
	 * M�todo respons�vel por inserir uma permissao de banco de dados conforme
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
	 * M�todo deletarPermissao
	 * 
	 * M�todo respons�vel por deletar uma permissao no banco de dados a partir 
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
	 * M�todo buscarPermissao
	 * 
	 * M�todo respons�vel por buscar, atrav�s do id, uma permiss�o dentro de uma lista de Permissoes.
	 * Se a permissao existe, retorna a mesma. Se n�o, retorna nulo.
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
	 * M�todo atribuirPermissaoAoUsuario
	 * 
	 * M�todo respons�vel por atribuir uma permissao existente no banco de dados para 
	 * o usu�rio informado
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

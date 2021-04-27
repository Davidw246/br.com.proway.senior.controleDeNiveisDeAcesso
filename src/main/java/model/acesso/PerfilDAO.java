package model.acesso;

import java.util.ArrayList;

import model.interfaces.InterfacePerfilDAO;

/**
 * Classe PerfilDAO
 * 
 * Classe que implementa a interface que se relaciona com o banco de dados de perfis
 * 
 */

public class PerfilDAO implements InterfacePerfilDAO{

	private ArrayList<PerfilModel> listaDePerfisCriados = new ArrayList<PerfilModel>();
	
	/**
	 * Método criarPerfil
	 * 
	 * Método responsável por criar um perfil vazio no banco de dados conforme
	 * atribuitos associadados
	 * 
	 * @param idDoPerfil Integer
	 * @param nomeDoPerfil String
	 * @return PerfilModel 
	 * 
	 */
	public PerfilModel criarPerfilVazio(Integer idDoPerfil, String nomeDoPerfil) {
		PerfilModel perfilModel = new PerfilModel(idDoPerfil, nomeDoPerfil, new ArrayList<PermissaoModel>());
		listaDePerfisCriados.add(perfilModel);	
		return perfilModel;
	}

	
	/**
	 * Método deletarPerfil
	 * 
	 * Método responsável por deletar um perfil existente no banco de dados a partir do
	 * id informado
	 * 
	 * @param idDoPerfil Integer
	 * @return boolean
	 * 
	 */
	public boolean deletarPerfil(Integer idDoPerfil) {
		PerfilModel perfilEscolhido = this.buscarPerfil(idDoPerfil);
		if (perfilEscolhido != null) {
			listaDePerfisCriados.remove(perfilEscolhido);
			return true;
		}
		return false;
	}

	/**
	 * Método buscarPerfil
	 * 
	 * Método responsável por buscar, através do id, um perfil dentro de uma
	 * lista de Perfis. Se o perfil existe, retorna o mesmo. Se não, retorna
	 * nulo.
	 * 
	 * @param idDoPerfil Integer
	 * @return PerfilModel
	 */
	public PerfilModel buscarPerfil(Integer idDoPerfil) {
		for (PerfilModel perfilModel : listaDePerfisCriados) {
			if (perfilModel.getIdDoPerfil() == idDoPerfil) {
				return perfilModel;
			}
		}
		return null;
	}

	/**
	 * Método lerListaDePerfisCriados
	 * 
	 * Retorna a lista de perfis criados
	 *  
	 * @return ArrayList<PerfilModel>
	 */
	public ArrayList<PerfilModel> lerListaDePerfisCriados() {
		return listaDePerfisCriados;
	}
	
	/**
	 * Método alterarPerfil
	 * 
	 * Método procura um perfil, com base no seu id, e altera o seu nome
	 * 
	 * @param idDoPerfil Integer
	 * @param novoNomeDoPerfil String
	 * @return PerfilModel
	 */
	public PerfilModel alterarNomePerfil(Integer idDoPerfil, String novoNomeDoPerfil) {
		PerfilModel perfilAlterado = this.buscarPerfil(idDoPerfil);

		if (perfilAlterado != null) {

			perfilAlterado.setNomeDoPerfil(novoNomeDoPerfil);
			return perfilAlterado;
		}
		return null;
	}

}

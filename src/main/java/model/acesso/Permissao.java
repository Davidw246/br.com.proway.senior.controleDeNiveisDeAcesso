package model.acesso;

import java.util.ArrayList;

import model.interfaces.InterfacePermissao;

public class Permissao implements InterfacePermissao {

	private String nomeDaPermissao;
	public ArrayList<String> listaDasPermissoes = new ArrayList<String>();
	
	/**
	 * M�todos de acesso
	 * 
	 * Nome da permiss�o do tipo String
	 * 
	 * @return nomeDaPermissao	String
	 */
	public String getNomeDaPermissao() {
		return nomeDaPermissao;
	}

	public void setNomeDaPermissao(String nomeDaPermissao) {
		this.nomeDaPermissao = nomeDaPermissao;
	}

	/**
	 * Um m�todo que cria o nome da permiss�o
	 * Verifica se o nome recebido � nulo ou vazio.
	 * 
	 * @param nomeDaPermissao	Recebe String
	 * @return true || false	boolean
	 */
	public boolean criarNomePermissao(String nomeDaPermissao) {
		if (nomeDaPermissao.equals("") || nomeDaPermissao.equals(null)) {
			return false;
		} else {
			setNomeDaPermissao(nomeDaPermissao);
			listaDasPermissoes.add(nomeDaPermissao);
			return true;
		}
	}

	/**
	 * M�todo que retorna uma String com a escolha da permissao
	 * 
	 * Valida se o nome da permissao esta dentro do Array de permissoes
	 * 
	 * @param nomeDaPermissao	Recebe String
	 * @return true || false	boolean
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

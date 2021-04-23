package model.acesso;

import java.util.ArrayList;

import model.interfaces.InterfacePermissao;

public class Permissao implements InterfacePermissao {

	private String nomeDaPermissao;
	public ArrayList<String> listaDasPermissoes = new ArrayList<String>();
	
	/**
	 * Métodos de acesso
	 * 
	 * Nome da permissão do tipo String
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
	 * Um método que cria o nome da permissão
	 * Verifica se o nome recebido é nulo ou vazio.
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
	 * Método que retorna uma String com a escolha da permissao
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
				validacao = "Você não tem acesso";
			}
		}
		return validacao;
	}
}

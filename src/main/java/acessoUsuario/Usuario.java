package acessoUsuario;

import java.util.ArrayList;

public class Usuario {

	/**
	 * 
	 * Atributos do Usuário
	 */
	int id;
	String login = "Vanderlei";
	String senha;
	String perfil = "Gerente"; // Nome fixo para teste
	ArrayList<String> listaDasPermissoesDoUsuario = new ArrayList<String>();
	
	public Usuario() {
		
		}

	public Usuario(int id, String login, String senha, String perfil) {
		this.id = id;
		this.login = login;
		this.senha = senha;
		this.perfil = perfil;
	}

	/**
	 * Métodos mágicos/Métodos de acesso Getters and Setters
	 * 
	 * @return id int
	 */
	public int getId() {
		return id;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * 
	 * @return login String
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * 
	 * @param login
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * 
	 * @return senha String
	 */
	public String getSenha() {
		return senha;
	}

	/**
	 * 
	 * @param senha
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}

	/**
	 * 
	 * @return perfil String
	 */
	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	/**
	 * Método que adiciona um nome de Permissão a uma lista de Permissões de
	 * um Usuário
	 * 
	 * @param nomeDaPermissao	Recebe String
	 */
	
	public void adicionaListaDasPermissoesDoUsuario(String nomeDaPermissao) {
		for (int i = 0; i < listaDasPermissoesDoUsuario.size(); i++) {	
			listaDasPermissoesDoUsuario.add(nomeDaPermissao);
		}
	}
		
}

package acessoUsuario;

import java.util.ArrayList;

public class Usuario {

	/**
	 * 
	 * Atributos do Usu�rio
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
	 * M�todos m�gicos/M�todos de acesso Getters and Setters
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
	 * M�todo que adiciona um nome de Permiss�o a uma lista de Permiss�es de
	 * um Usu�rio
	 * 
	 * @param nomeDaPermissao	Recebe String
	 */
	
	public void adicionaListaDasPermissoesDoUsuario(String nomeDaPermissao) {
		for (int i = 0; i < listaDasPermissoesDoUsuario.size(); i++) {	
			listaDasPermissoesDoUsuario.add(nomeDaPermissao);
		}
	}
		
}

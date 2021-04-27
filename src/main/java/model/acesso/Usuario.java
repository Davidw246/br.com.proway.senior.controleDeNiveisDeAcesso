package model.acesso;

import java.util.ArrayList;

public class Usuario {

	/**
	 * 
	 * Atributos do Usuário
	 */
	int idDoUsuario;
	String loginDoUsuario;
	String senhaDoUsuario;
	PerfilModel perfil;
	//ArrayList<String> listaDasPermissoesDoUsuario = new ArrayList<String>();
	
	public Usuario() {
		
		}

	public Usuario(int id, String login, String senha, PerfilModel perfil) {
		this.idDoUsuario = id;
		this.loginDoUsuario = login;
		this.senhaDoUsuario = senha;
		this.perfil = perfil;
	}

	/**
	 * Métodos mágicos/Métodos de acesso Getters and Setters
	 * 
	 * @return id int
	 */
	public int getId() {
		return idDoUsuario;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.idDoUsuario = id;
	}

	/**
	 * 
	 * @return login String
	 */
	public String getLogin() {
		return loginDoUsuario;
	}

	/**
	 * 
	 * @param login
	 */
	public void setLogin(String login) {
		this.loginDoUsuario = login;
	}

	/**
	 * 
	 * @return senha String
	 */
	public String getSenha() {
		return senhaDoUsuario;
	}

	/**
	 * 
	 * @param senha
	 */
	public void setSenha(String senha) {
		this.senhaDoUsuario = senha;
	}

	/**
	 * 
	 * @return perfil Perfil
	 */
	public PerfilModel getPerfil() {
		return perfil;
	}

	public void setPerfil(PerfilModel perfil) {
		this.perfil = perfil;
	}


	
	/**
	 * O método faz a verificação de login do perfil.
	 * 
	 * @param login
	 * @param senha
	 * @return true boolean
	 */

	public boolean logarPerfil(String login, String senha) {
		if (login.equals("") || senha.equals("")) {
			return false;
		} else if (login.equals(null) || senha.equals(null)) {
			return false;

		} else {
			if (login.equalsIgnoreCase(this.getLogin()) && senha.equals(this.getSenha())) {
				return true;
			} else {
				return false;
			}
		}
	}
		
}

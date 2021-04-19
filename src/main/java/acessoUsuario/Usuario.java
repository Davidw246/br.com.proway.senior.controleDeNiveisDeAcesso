package acessoUsuario;

public class Usuario {

	/**
	 * 
	 * Atributos do Usuario
	 */
	int id;
	String login;
	String senha;
	String perfil;
	
	public Usuario(int id, String login, String senha, String perfil) {
		super();
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

	/**
	 * 
	 * @param perfil
	 */
	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}
}

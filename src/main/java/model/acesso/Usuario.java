package model.acesso;

public class Usuario {

	int idDoUsuario;
	String loginDoUsuario;
	String senhaDoUsuario;
	PerfilModel perfil;
	boolean isLogado;

	public Usuario() {
	}

	public Usuario(int id, String login, String senha, PerfilModel perfil) {
		this.idDoUsuario = id;
		this.loginDoUsuario = login;
		this.senhaDoUsuario = senha;
		this.perfil = perfil;
	}

	public int getId() {
		return idDoUsuario;
	}

	public void setId(int id) {
		this.idDoUsuario = id;
	}

	public String getLogin() {
		return loginDoUsuario;
	}

	public void setLogin(String login) {
		this.loginDoUsuario = login;
	}

	public String getSenha() {
		return senhaDoUsuario;
	}

	public void setSenha(String senha) {
		this.senhaDoUsuario = senha;
	}

	public PerfilModel getPerfil() {
		return perfil;
	}

	public void setPerfil(PerfilModel perfil) {
		this.perfil = perfil;
	}

	public void setLogado(boolean isLogado) {
		this.isLogado = isLogado;
	}

}

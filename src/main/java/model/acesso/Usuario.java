package model.acesso;

import java.util.ArrayList;

public class Usuario {

	int idDoUsuario;
	String loginDoUsuario;
	String senhaDoUsuario;
	Perfil perfil;
	boolean isLogado;

	public Usuario() {

	}

	public Usuario(int id, String login, String senha, Perfil perfil) {
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

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	public void setLogado(boolean isLogado) {
		this.isLogado = isLogado;
	}

}

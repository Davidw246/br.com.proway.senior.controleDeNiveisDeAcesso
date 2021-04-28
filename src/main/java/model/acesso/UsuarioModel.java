package model.acesso;

import java.util.ArrayList;

public class UsuarioModel {

	private int idDoUsuario;
	private String loginDoUsuario;
	private String senhaDoUsuario;
	private ArrayList<PerfilModel> listaDePerfisDoUsuario = new ArrayList<PerfilModel>();

	public UsuarioModel() {
	}

	public UsuarioModel(int idDoUsuario, String loginDoUsuario, String senhaDoUsuario,
			ArrayList<PerfilModel> listaDePerfisDoUsuario) {
		super();
		this.idDoUsuario = idDoUsuario;
		this.loginDoUsuario = loginDoUsuario;
		this.senhaDoUsuario = senhaDoUsuario;
		this.listaDePerfisDoUsuario = listaDePerfisDoUsuario;
	}

	public ArrayList<PerfilModel> getListaDePerfisDoUsuario() {
		return listaDePerfisDoUsuario;
	}

	public int getId() {
		return idDoUsuario;
	}

	public void setId(int id) {
		this.idDoUsuario = id;
	}	

	public void setListaDePerfisDoUsuario(ArrayList<PerfilModel> listaDePerfisDoUsuario) {
		this.listaDePerfisDoUsuario = listaDePerfisDoUsuario;
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
}

package model.acesso;

import model.interfaces.PerfilInterface;

public class UsuarioPerfil implements PerfilInterface {

	private String nome;

	private String senha;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	/**
	 * O método faz a verificação de login do perfil.
	 * 
	 * @param nome
	 * @param senha
	 * @return true boolean
	 */

	public boolean logarPerfil(String nome, String senha) {
		if (nome.equals("") || senha.equals("")) {
			return false;
		} else if (nome.equals(null) || senha.equals(null)) {
			return false;

		} else {
			if (nome.equalsIgnoreCase(this.getNome()) && senha.equals(this.getSenha())) {
				return true;
			} else {
				return false;
			}
		}
	}
}
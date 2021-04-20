package acessoUsuario;

public class Perfil implements PerfilInterface {

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
	 * @return
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
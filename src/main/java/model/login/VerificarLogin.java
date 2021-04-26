package model.login;

import model.interfaces.InterfaceAcessoUsuario;

public class VerificarLogin implements InterfaceAcessoUsuario {

	String loginDoUsuario;
	String senhaDoUsuario;

	/***
	 * Verifica se usuário existe.
	 * 
	 * Faz validação com banco de dados se usuário já existe no sistema.
	 * 
	 * @param login2
	 * 
	 * @param String login
	 * @return
	 */
	// rever corpo do método para validar se o email consta na base de dados (array) para permitir o login
	public boolean validarLogin(String login) {
		if (login.equalsIgnoreCase(this.getLogin())) {
			return true;
		} else {
			return false;
		}
	}

	// rever corpo do método para validar se a senha consta na base de dados (array) para permitir o login
	/***
	 * Verifica se senha existe.
	 * 
	 * Faz validação com banco de dados se senha já existe no sistema.
	 * 
	 * @param String senha
	 * @return
	 */
	public boolean validarSenha(String senha) {
		if (senha.equalsIgnoreCase(this.getSenha())) {
			return true;
		} else {
			return false;
		}
	}

	/***
	 * Verifica tamanho do usuário digitado.
	 * 
	 * Faz validação do tamanho da String do usuário que foi digitado e informa se
	 * esta valido ou não..
	 * 
	 * @param String login
	 * @return
	 */
	// email ultrapassa limite
//	public boolean limitadorLogin(String login) {
//		if (login.length() <= 10) {
//			return true;
//		} else {
//			return false;
//		}
//	}

	/***
	 * Verifica tamanho do senha digitado.
	 * 
	 * Faz validação do tamanho da String do senha que foi digitado e informa se
	 * esta valido ou não..
	 * 
	 * @param String senha
	 * @return
	 */
	// aumentar limite de caracteres (24). Verificar para obrigar numero e caracter especial na senha
	public boolean limitadorSenha(String senha) {
		if (senha.length() <= 10) {
			return true;
		} else {
			return false;
		}
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

package acessoUsuario;

import interfaceLogin.InterfaceAcessoUsuario;

public class VerificaLogin implements InterfaceAcessoUsuario {

	String login;
	String senha;

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

	public boolean validacaoLogin(String login) {
		if (login.equalsIgnoreCase(this.getLogin())) {
			return true;
		} else {
			return false;
		}
	}

	/***
	 * Verifica se senha existe.
	 * 
	 * Faz validação com banco de dados se senha já existe no sistema.
	 * 
	 * @param String senha
	 * @return
	 */
	public boolean validacaoSenha(String senha) {
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
	public boolean limitadorLogin(String login) {
		if (login.length() <= 10) {
			return true;
		} else {
			return false;
		}
	}

	/***
	 * Verifica tamanho do senha digitado.
	 * 
	 * Faz validação do tamanho da String do senha que foi digitado e informa se
	 * esta valido ou não..
	 * 
	 * @param String senha
	 * @return
	 */
	public boolean limitadorSenha(String senha) {
		if (senha.length() <= 10) {
			return true;
		} else {
			return false;
		}
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}

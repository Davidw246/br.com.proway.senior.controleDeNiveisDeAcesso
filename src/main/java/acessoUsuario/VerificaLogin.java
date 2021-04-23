package acessoUsuario;

import interfaceLogin.InterfaceAcessoUsuario;

public class VerificaLogin implements InterfaceAcessoUsuario {

	String login;
	String senha;

	/***
	 * Verifica se usu�rio existe.
	 * 
	 * Faz valida��o com banco de dados se usu�rio j� existe no sistema.
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
	 * Faz valida��o com banco de dados se senha j� existe no sistema.
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
	 * Verifica tamanho do usu�rio digitado.
	 * 
	 * Faz valida��o do tamanho da String do usu�rio que foi digitado e informa se
	 * esta valido ou n�o..
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
	 * Faz valida��o do tamanho da String do senha que foi digitado e informa se
	 * esta valido ou n�o..
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

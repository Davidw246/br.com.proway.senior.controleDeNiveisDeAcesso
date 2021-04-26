package model.login;

import model.interfaces.InterfaceAcessoUsuario;

public class VerificarLogin implements InterfaceAcessoUsuario {

	String loginDoUsuario;
	String senhaDoUsuario;

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
	// rever corpo do m�todo para validar se o email consta na base de dados (array) para permitir o login
	public boolean validarLogin(String login) {
		if (login.equalsIgnoreCase(this.getLogin())) {
			return true;
		} else {
			return false;
		}
	}

	// rever corpo do m�todo para validar se a senha consta na base de dados (array) para permitir o login
	/***
	 * Verifica se senha existe.
	 * 
	 * Faz valida��o com banco de dados se senha j� existe no sistema.
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
	 * Verifica tamanho do usu�rio digitado.
	 * 
	 * Faz valida��o do tamanho da String do usu�rio que foi digitado e informa se
	 * esta valido ou n�o..
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
	 * Faz valida��o do tamanho da String do senha que foi digitado e informa se
	 * esta valido ou n�o..
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

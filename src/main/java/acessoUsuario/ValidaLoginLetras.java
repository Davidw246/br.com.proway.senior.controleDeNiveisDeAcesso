package acessoUsuario;

public class ValidaLoginLetras {

	/**
	 * Verifica caracteres do usu�rio digitado.
	 * 
	 *  Faz valida��o para permitir somente letras para digitar no usu�rio.
	 * 
	 * @param boolean login
	 * @return loginValido boolean
	 */
	public static boolean validaLoginCaracteres(String login) {
		boolean loginValido = true;
		if (login.length() != 10) {
			loginValido = false;
		}
		if (login.substring(0, 9).matches("[A-Z]*")) {
			loginValido = false;
		}
		if (login.substring(9).matches("[0-9]*")) {
			loginValido = false;
		}
		return loginValido;
	}

}
package acessoUsuario;

public class ValidaLoginLetras {

	/**
	 * Verifica caracteres do usuário digitado.
	 * 
	 *  Faz validação para permitir somente letras para digitar no usuário.
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
package acessoUsuario;

<<<<<<< HEAD:src/main/java/acessoUsuario/ValidaLoginLetras.java
public class ValidaLoginLetras {
=======
import interfaceLogin.InterfaceValidaLoginLetras;

public class ValidaLoginLetras extends VerificaLogin 
implements InterfaceValidaLoginLetras {
>>>>>>> LoginAtualizacao:src/main/java/acessoUsuario/validaLoginLetras.java

	/**
	 * Verifica caracteres do usu�rio digitado.
	 * 
	 *  Faz valida��o para permitir somente letras para digitar no usu�rio.
	 * 
	 * @param boolean login
	 * @return loginValido boolean
	 */
	public boolean validaLoginCaracteres(String login) {
		boolean loginValido = true;
//		if (login.length() != 10) {
//			loginValido = false;
//		}
		if (login.substring(0, 9).matches("[A-Z]*")) {
			loginValido = false;
		}
		if (login.substring(9).matches("[0-9]*")) {
			loginValido = false;
		}
		return loginValido;
	}

}
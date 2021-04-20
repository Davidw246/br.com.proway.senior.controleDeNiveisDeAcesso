package acessoUsuario;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import interfaceLogin.InterfaceHashSenha;

public class HashSenha implements InterfaceHashSenha {

	static String senhaUsuario = "123456";

	/***
	 * Criptografia para sennha.
	 * 
	 * 
	 * Neste m�todo esta sendo utilizado uma API do java para gerar um algoritmo para realizar a HASH
	 * da senha.
	 * 
	 * @param String senha
	 * @return
	 * @throws NoSuchAlgorithmException
	 * @throws UnsupportedEncodingException
	 */
	public boolean hashSenhavalidacao(String senha)
			throws NoSuchAlgorithmException, UnsupportedEncodingException {
		if (senha.equals(senhaUsuario)) {
			MessageDigest hash = MessageDigest.getInstance("MD5");
			byte messageDigest[] = hash.digest(senha.getBytes("UTF-8"));
			System.out.println(messageDigest);
			return true;
		} else {
			return false;
		}
	}
}

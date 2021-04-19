package acessoUsuario;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashSenha {

	public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		hashSenhavalidacao(senhaUsuario);

	}

	static String senhaUsuario = "admin";

	
	/***
	 * Criptografia para sennha.
	 * 
	 * 
	 * Neste método esta sendo utilizado uma API do java para gerar um algoritmo para realizar a HASH
	 * da senha.
	 * 
	 * @param String senha
	 * @return
	 * @throws NoSuchAlgorithmException
	 * @throws UnsupportedEncodingException
	 */
	public static boolean hashSenhavalidacao(String senha)
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
//public static void main(String args []) throws NoSuchAlgorithmException,
//UnsupportedEncodingException {
//
//          String senha = "admin";
//
//          MessageDigest algorithm = MessageDigest.getInstance("MD5");
//          byte messageDigest[] = algorithm.digest(senha.getBytes("UTF-8"));
//
//          System.out.println(messageDigest);
//}
//
//}

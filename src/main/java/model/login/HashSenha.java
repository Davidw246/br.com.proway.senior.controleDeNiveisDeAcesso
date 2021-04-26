package model.login;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import model.interfaces.InterfaceHashSenha;

public class HashSenha implements InterfaceHashSenha {

	public String senhaDoUsuario = "123456";

	// Será alterado 
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
	public boolean validarHashSenha(String senha)
			throws NoSuchAlgorithmException, UnsupportedEncodingException {
		if (senha.equals(senhaDoUsuario)) {
			MessageDigest hash = MessageDigest.getInstance("MD5");
			byte messageDigest[] = hash.digest(senha.getBytes("UTF-8"));
			System.out.println(messageDigest);
			return true;
		} else {
			return false;
		}
	}
}

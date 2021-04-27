package model.login;

import java.math.BigInteger;
import java.security.MessageDigest;

import model.interfaces.InterfaceHashSenha;

public class HashSenha {
	/***
	 * Criptografia para sennha.
	 * 
	 * 
	 * Neste método esta sendo utilizado uma API do java "BigInteger" para gerar um algoritmo
	 * para realizar a HASH da senha utilizando criptografia SHA-512.
	 * 
	 * @param String senha
	 * @return valorCodificado
	 */

	public static String senhaDoUsuario(String senha) {
		String valorCodificado = null;
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-512");
			digest.reset();
			digest.update(senha.getBytes("utf8"));
			valorCodificado = String.format("%064x", new BigInteger(1, digest.digest()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return valorCodificado;
	}
}

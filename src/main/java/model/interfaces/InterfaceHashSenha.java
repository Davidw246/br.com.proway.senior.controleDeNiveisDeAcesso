package model.interfaces;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

public interface InterfaceHashSenha {
	
	public boolean validarHashSenha(String senha) throws NoSuchAlgorithmException, UnsupportedEncodingException;

}

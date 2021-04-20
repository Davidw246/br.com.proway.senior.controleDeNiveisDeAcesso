package interfaceLogin;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

public interface InterfaceHashSenha {
	
	public boolean hashSenhavalidacao(String senha) throws NoSuchAlgorithmException, UnsupportedEncodingException;

}

package model.interfaces;

import model.acesso.Usuario;

public interface InterfaceAcessoUsuario {
	
	public boolean validarLogin(Usuario usuario);
	public boolean validarSenha(Usuario usuario);
	//public boolean limitadorLogin(String login);
	public boolean limitadorSenha(String senha);

}

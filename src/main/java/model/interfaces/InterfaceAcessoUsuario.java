package model.interfaces;

public interface InterfaceAcessoUsuario {
	
	public boolean validarLogin(String login);
	public boolean validarSenha(String senha);
	public boolean limitadorLogin(String login);
	public boolean limitadorSenha(String senha);

}

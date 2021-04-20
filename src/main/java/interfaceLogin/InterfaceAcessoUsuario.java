package interfaceLogin;

public interface InterfaceAcessoUsuario {
	
	public boolean validacaoLogin(String login);
	public boolean validacaoSenha(String senha);
	public boolean limitadorLogin(String login);
	public boolean limitadorSenha(String senha);

}

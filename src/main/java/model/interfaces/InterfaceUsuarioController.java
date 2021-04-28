package model.interfaces;

public interface InterfaceUsuarioController {
	
	public boolean validarEmail(String email);
	public boolean validarSenha(String senha);
	public String enviarEmail(String loginDoUsuario);
	public void alteraSenha(int id, String senhaNova);

}

package acessoUsuario;

public class UsuarioPerfil {

	String nome = "claudio";
	String senha = "1234";

	Boolean isLogado = false;

	/**
	 * O m�todo faz a verifica��o de login do perfil.
	 * 
	 * @param nome
	 * @param senha
	 * @return true boolean
	 */

	public boolean logarPerfil(String nome, String senha) {
		if (nome == "" || senha == "" || nome == null || senha == null) {
			return false;
		} else {
			if (this.nome.equalsIgnoreCase(nome) && this.senha.equals(senha)) {
				return true;
			} else {
				return false;
			}
		}
	}
}
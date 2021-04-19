package controleNiveisAcesso;

public class Perfil {

	private String nomeDoPerfil;

	Permissao permissaoDeAcesso = new Permissao();

	/*
	 * M�todos m�gicos/M�todos de acesso
	 */
	public String getNomeDoPerfil() {
		return nomeDoPerfil;
	}

	public void setNomeDoPerfil(String nomeDoPerfil) {
		this.nomeDoPerfil = nomeDoPerfil;
	}

	/**
	 * Um m�todo que cria o nome do perfil. Verifica se o nome se o nome recebido �
	 * nulo ou vazio.
	 * 
	 * @param nomeDoPerfil � uma String
	 * @return retorna true ou false
	 */
	public boolean criaNomePerfil(String nomeDoPerfil, String nomeDaPermissao) {
		boolean validacao;

		if (nomeDoPerfil == null) {
			validacao = false;
		} else if (nomeDoPerfil.equals("")) {
			validacao = false;
		} else {
			permissaoDeAcesso.escolhaDaPermissao(nomeDaPermissao);
			validacao = true;
		}
		return validacao;
	}
}

package controleNiveisAcesso;

import java.util.ArrayList;

import interfaceControleAcesso.InterfacePerfil;

public class Perfil implements InterfacePerfil {

	private String nomeDoPerfil;
	ArrayList<String> listaDosPerfis = new ArrayList<String>();

	Permissao permissaoDeAcesso = new Permissao();

	/**
	 * Métodos mágicos/Métodos de acesso
	 * 
	 * @return nomeDoPerfil		Tipo String
	 */
	public String getNomeDoPerfil() {
		return nomeDoPerfil;
	}

	public void setNomeDoPerfil(String nomeDoPerfil) {
		this.nomeDoPerfil = nomeDoPerfil;
	}

	/**
	 * Um método que cria o nome do perfil/cadastra a permissão.
	 * 
	 * Verifica se o nome se o nome recebido é nulo ou vazio.
	 * 
	 * Recebe uma string.
	 * 
	 * Adiciona a string (nome do perfil) ao ArrayList (lista de perfis).
	 * 
	 * @param nomeDoPerfil		Recebe string
	 * @param nomeDaPermissao	Recebe string
	 * @return validacao		Retorna true ou false.
	 */
	public boolean criaNomePerfil(String nomeDoPerfil, String nomeDaPermissao) {
		boolean validacao;

		if (nomeDoPerfil.equals("") || nomeDoPerfil.equals(null)) {
			validacao = false;
		} else {
			permissaoDeAcesso.escolhaDaPermissao(nomeDaPermissao);

			setNomeDoPerfil(nomeDoPerfil);
			listaDosPerfis.add(nomeDoPerfil);

			validacao = true;
		}
		return validacao;
	}
}

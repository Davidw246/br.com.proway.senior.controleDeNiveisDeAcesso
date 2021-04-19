package controleNiveisAcesso;

import java.util.ArrayList;

public class Permissao {

	ArrayList<String> nomeDasPermissoes = new ArrayList<String>();

	/**
	 * Um m�todo que cria o nome da permiss�o Verifica se o nome se o nome recebido
	 * � nulo ou vazio.
	 * 
	 * @param nomeDaPermissao � uma String
	 * @return retorna true ou false
	 */
	public boolean criaNomePermissao(String nomeDaPermissao) {
		if (nomeDaPermissao == null) {
			return false;
		} else if (nomeDaPermissao.equals("")) {
			return false;
		} else {
			nomeDasPermissoes.add(nomeDaPermissao);
			return true;
		}
	}

	/**
	 * M�todo que retorna true caso o perfil esteja autorizado
	 * 
	 * @param perfil
	 * @return true
	 */
	public String escolhaDaPermissao(String nomeDaPermissao) {
		String validacao = "";
		for (int i = 0; i < nomeDasPermissoes.size(); i++) {
			if (nomeDaPermissao.equalsIgnoreCase(nomeDasPermissoes.get(i))) {
				validacao = nomeDaPermissao;
			} else {
				validacao = "Voc� n�o tem acesso";
			}
		}
		return validacao;
	}
}

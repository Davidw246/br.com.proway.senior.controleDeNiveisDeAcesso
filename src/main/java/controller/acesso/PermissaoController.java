package controller.acesso;

/**
 * 
 * @author SENIOR
 *
 */

public class PermissaoController {
	
	
	/**
	 * Método que retorna uma String com a escolha da permissao
	 * 
	 * Valida se o nome da permissao esta dentro do Array de permissoes
	 * 
	 * @param nomeDaPermissao	Recebe String
	 * @return true || false	boolean
	 */
	public String escolherPermissao(String nomeDaPermissao) {
		String validacao = "";
		for (int i = 0; i < listaDasPermissoes.size(); i++) {
			if (nomeDaPermissao.equalsIgnoreCase(listaDasPermissoes.get(i))) {
				validacao = nomeDaPermissao;
			} else {
				validacao = "Você não tem acesso";
			}
		}
		return validacao;
	}

}

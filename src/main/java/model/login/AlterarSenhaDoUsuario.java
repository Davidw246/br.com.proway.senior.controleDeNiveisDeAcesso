package model.login;

import java.util.Random;

public class AlterarSenhaDoUsuario {
	private String loginDoUsuario;



	public String getLoginDoUsuario() {
		return loginDoUsuario;
	}

	public void setLoginDoUsuario(String loginDoUsuario) {
		this.loginDoUsuario = loginDoUsuario;
	}

	/**
	 * Envia um e-mail
	 * 
	 * Envia o e-mail para o usuário com o código aleatório gerado para a
	 * confirmação.
	 * 
	 * @param email        Email do usuário
	 * @param codigoGerado Código aleatório gerado pelo sistema
	 */
	// Adicionar enviarCodigo no método
	public boolean enviarEmail(String loginDoUsuario) {
		boolean verificacaoUsuario;
		if (loginDoUsuario.equalsIgnoreCase(this.getLoginDoUsuario())) {
			verificacaoUsuario = true;
		} else {
			verificacaoUsuario = false;
		}
		return verificacaoUsuario;

	}

	/**
	 * Verifica se o usuário existe no sistema
	 * 
	 * @return boolean
	 */
	public boolean verificarUsuario(String loginDoUsuario) {

		boolean verificacao;
		if (loginDoUsuario.equalsIgnoreCase(this.getLoginDoUsuario())) {
			verificacao = true;
		} else {
			verificacao = false;
		}
		return verificacao;
	}

	/**
	 * Solicita o código para o usuário
	 * 
	 * Carrega o front-end com o campo para o usuário digitar o código
	 * 
	 * @return Código digitado pelo usuário
	 */
	// Não está sendo utilizado, é front
//	public int solicitarCodigo() {
//		System.out.print("Código verificador de 5 digitos: ");
//		int codigo = 12345;
//		return codigo;
//	}

	/**
	 * Gera um código aleatório
	 * 
	 * Gera o cógigo random para a verificação de usuário
	 * 
	 * @return codigo de 5 digitos
	 */
	public int gerarCodigo(int codigo) {

		Random random = new Random();
		codigo = random.nextInt(99999);
		if (codigo <= 10000) {
			codigo += 10000;
		}
		return codigo;
	}
}
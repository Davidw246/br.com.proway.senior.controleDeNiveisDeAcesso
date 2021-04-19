package acessoUsuario;

import java.util.Random;

public class AlteraSenha {
	String nome = "Claudio";
	String email = "exemplo@gmail.com";

	/**
	 * Envia um e-mail
	 * 
	 * Envia o e-mail para o usuário com o código aleatório gerado para a
	 * confirmação.
	 * 
	 * @param email        Email do usuário
	 * @param codigoGerado Código aleatório gerado pelo sistema
	 */
	public boolean enviarEmail(String email) {
		boolean verificacaoUsuario;
		if (this.email.equals(email)) {
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
	public boolean verificarUsuario(String email) {

		boolean verificacao;
		if (this.nome.equals(email)) {
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
	public static int solicitarCodigo() {
		System.out.print("Código verificador de 5 digitos: ");
		int codigo = 12345;
		return codigo;
	}

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
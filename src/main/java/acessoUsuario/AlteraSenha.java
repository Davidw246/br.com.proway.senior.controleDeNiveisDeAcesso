package acessoUsuario;

import java.util.Random;

public class AlteraSenha {
	private String nome;
	private String email;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
	public boolean enviarEmail(String email) {
		boolean verificacaoUsuario;
		if (email.equalsIgnoreCase(this.getEmail())) {
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
		if (nome.equalsIgnoreCase(this.getEmail())) {
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
	public int solicitarCodigo() {
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
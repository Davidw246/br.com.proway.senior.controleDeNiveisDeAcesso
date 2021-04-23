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
	 * Envia o e-mail para o usu�rio com o c�digo aleat�rio gerado para a
	 * confirma��o.
	 * 
	 * @param email        Email do usu�rio
	 * @param codigoGerado C�digo aleat�rio gerado pelo sistema
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
	 * Verifica se o usu�rio existe no sistema
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
	 * Solicita o c�digo para o usu�rio
	 * 
	 * Carrega o front-end com o campo para o usu�rio digitar o c�digo
	 * 
	 * @return C�digo digitado pelo usu�rio
	 */
	public int solicitarCodigo() {
		System.out.print("C�digo verificador de 5 digitos: ");
		int codigo = 12345;
		return codigo;
	}

	/**
	 * Gera um c�digo aleat�rio
	 * 
	 * Gera o c�gigo random para a verifica��o de usu�rio
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
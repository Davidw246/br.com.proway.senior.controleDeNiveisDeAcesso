package acessoUsuario;

public class VerificaLogin {
	
	String login;
	String senha;

	
	/***
	 * Verifica se usuário existe.
	 * 
	 * Faz validação com banco de dados se usuário já existe no sistema.
	 * 
	 * @param String login
	 * @return
	 */
	public boolean validacaoLogin(String login) {
		if (login.equals("X")) {
			System.out.printf("Usuário %s existe no sistema.", login);
			return true;
		} else {
			System.out.printf("Usuário não existe no sistema");
			return false;
		}
	}
	
	
	/***
	 * Verifica se senha existe.
	 * 
	 * Faz validação com banco de dados se senha já existe no sistema.
	 * 
	 * @param String senha
	 * @return
	 */
	public boolean validacaoSenha(String senha) {
		if (senha.equals("123")) {
			System.out.printf("Senha %s valida.", senha);
			return true;
		} else {
			System.out.printf("Senha incorreta");
			return false;
		}
	}
	
	/***
	 * Verifica tamanho do usuário digitado.
	 * 
	 * Faz validação do tamanho da String do usuário que foi digigitado e informa
	 * se esta valido ou não..
	 * 
	 * @param String login
	 * @return
	 */
	public boolean limitadorLogin(String login) {
		if (login.length() <= 10) {
			System.out.printf("Verificacao usuário limitor %s valida.", login);
			return true;
		} else {
			System.out.printf("Limite máximo usuário");
			return false;
		}
	}
	
	
	/***
	 * Verifica tamanho do senha digitado.
	 * 
	 * Faz validação do tamanho da String do senha que foi digigitado e informa
	 * se esta valido ou não..
	 * 
	 * @param String senha
	 * @return
	 */
	public boolean limitadorSenha(String senha) {
		if (senha.length() <= 10) {
			System.out.printf("Verificacao senha limitor %s valida.", senha);
			return true;
		} else {
			System.out.printf("Limite máximo senha");
			return false;
		}
	}
	
	
	/***
	 * Valida usuário os caracteres digitados.
	 * 
	 * Faz validação do usuário digitado, permitando para digitar letras.
	 * 
	 * @param String login
	 * @return
	 */
	public boolean validaLogin(String login) {
		login = login.replaceAll("[Elton]", "");
		if(login.length() != 7) {
			return false;
		}
		if(!login.substring(0, 3).matches("[A-Z]*")) {
			return false;
		}
		return login.substring(3).matches("[0-9]*");
	}
}
	
//	static Scanner esc;
//
//	public static void main(String[] args) {
//
//		esc = new Scanner(System.in);
//
//		String login, senha;
//
//		System.out.println("Insira login: ");
//
//		login = esc.next();
//
//		System.out.println("Insira senha: ");
//
//		senha = esc.next();
//
//		verificalogin(login, senha);
//
//		if (verificalogin(login, senha) == true) {
//			System.out.printf("Usuário %s logado com sucesso.", login);
//		} else
//			System.out.printf("Usuário não cadastrado");
//
//	}
//
//	/**
//	 * Verifica as credenciais.
//	 * 
//	 * Compara as informações que o usuario inseriu com as que estão no sistema.
//	 * 
//	 * @param login String login do usuario
//	 * @param senha String senha do usuario
//	 * @return True or False
//	 */
//	static boolean verificalogin(String login, String senha) {
//
//		if (login.equals("Claudio") && senha.equals("2")) {
//			return true;
//		} else {
//			return false;
//		}
//	}
//
//}

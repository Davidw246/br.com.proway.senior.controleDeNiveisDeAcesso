package acessoUsuario;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Recebe Id de cadastro
 * 
 * Recebe Id de cadastro e outros dados para retornar um ID de acesso ao
 * sistema. O id recebido é do tipo int, enquanto os demais dados (nome e
 * e-mail) são Strings.
 * 
 * 
 * @author Vanderlei
 * 
 *
 */

public class RecebeIdCadastro {

	final static ArrayList<Integer> id = new ArrayList<Integer>();
	final static ArrayList<String> nome = new ArrayList<String>();
	final static ArrayList<String> email = new ArrayList<String>();

	/**
	 * Para fins de verificação e teste, optamos por popular as variáveis com 5
	 * observações e dessa forma podemos rodar os métodos deste programa e efetuar
	 * os testes.
	 */

	public static ArrayList<Integer> PopulaDadosId(ArrayList<Integer> id) {
		// Popula os dados id
		id.add(0);
		id.add(1);
		id.add(2);
		id.add(3);
		id.add(4);
		return id;
	}

	public static void PopulaDadosNome(ArrayList<String> nome) {
		// Popula os dados nome

		nome.add("Guilherme");
		nome.add("David W");
		nome.add("Tharlys");
		nome.add("Vanderlei");
		nome.add("Elton");
	}
	
	public static ArrayList<String> getNome() {
		return nome;
	}

	public static void PopulaDadosEmail(ArrayList<String> email) {
		// Popula os dados e-mail
		email.add("guilherme@companyname.com");
		email.add("david.w@companyname.com");
		email.add("tharlys@companyname.com");
		email.add("vanderlei@companyname.com");
		email.add("elton@companyname.com");
	}

	/**
	 * Compara a lista de Id recebido e compara com uma lista padrão com as
	 * informações esperadas.
	 * 
	 * 
	 */
	public static boolean EqualsId() {

		ArrayList<Integer> listaIdRecebida = new ArrayList<Integer>();
		listaIdRecebida = PopulaDadosId(id);

		ArrayList<Integer> comparaListaId = new ArrayList<Integer>(); // lista genérica simulando os valores esperados
		comparaListaId.add(0);
		comparaListaId.add(1);
		comparaListaId.add(2);
		comparaListaId.add(3);
		comparaListaId.add(4);

		boolean listasIguais = false;
		for (int i = 0; i < comparaListaId.size(); i++) {
			if (comparaListaId.equals(listaIdRecebida)) {
				listasIguais = true;
			}
		}
		return comparaListaId.equals(listaIdRecebida);

	}

	public static boolean ValidaId(boolean b) {

		/**
		 * O método ValidaId verifica se os Ids recebidos são válidos.
		 * 
		 */

		boolean idValido = true;

		for (int i = 0; i < id.size(); i++) {
			if (id.contains(null)) {
				idValido = false;
			}
			System.out.println("Relação de IDs com pelo menos uma informação 'false': " + id);
		}
		return idValido;
	}

	public static boolean ValidaNome(boolean b) {

		/**
		 * O método ValidaNome verifica se os nomes dos colaboradores são válidos e
		 * lista a relação na tela.
		 */

		boolean nomeValido = true;

		for (int i = 0; i < nome.size(); i++) {
			if (nome.contains(null)) {
				nomeValido = false;
			}
			System.out.println("Relação de nomes dos colaboradores recebidos: " + nome);
		}
		return nomeValido;
	}

	/**
	 * Valida os nomes recebidos em busca de caracteres especiais ou outro dado diferente de 
	 * letras que possam tornar o nome nulo.
	 *   
	 */
	public static boolean validaDadosNome(String nome) {

		boolean dadosValidos = false;
		
		for (int i = 0; i <nome.length(); i++) {
			if (nome.matches("[a-zA-Z]{1,}")) {
				dadosValidos = true;
			}
		}
		return dadosValidos;
	}

	/**
	 * O método ValidaEmail verifica se os endereços de e-mail dos colaboradores são
	 * válidos e lista a relação na tela.
	 */
	public static boolean ValidaEmail(boolean b) {
		boolean emailValido = true;

		for (int i = 0; i < email.size(); i++) {
			if (email.contains(null)) {
				emailValido = false;
			}
			System.out.println("Relação de e-mails dos colaboradores recebidos: " + email);
		}
		return emailValido;
	}

	/**
	 * Verifica se os endereços de e-mai foram cadastrados corretamente ou se possuem caracteres especiais.
	 * 
	 */
	public static boolean isValidEmail(String email) {

		boolean isValidEmail = false;
		if (email != null && email.length() > 0) {
			String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
			Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
			Matcher matcher = pattern.matcher(email);
			if (matcher.matches()) {
				isValidEmail = true;
			}
		}
		return isValidEmail;
	}
}
package model.login;

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

	@Deprecated
	public class ReceberIdCadastro {
		final private static ArrayList<Integer> id = new ArrayList<Integer>(); // Visível apenas nesta classe
		final private static ArrayList<String> nome = new ArrayList<String>(); // Visível apenas nesta classe
		final private static ArrayList<String> email = new ArrayList<String>(); // Visível apenas nesta classe
		private static boolean listasIguais;

	/**
	 * Para fins de verificação e teste, optamos por popular as variáveis com 5
	 * observações e dessa forma podemos rodar os métodos deste programa e efetuar
	 * os testes.
	 * 
	 * @param id
	 * @return id
	 */
	public static ArrayList<Integer> popularDadosId(ArrayList<Integer> id) {
		// Popula os dados id
		id.add(0);
		id.add(1);
		id.add(2);
		id.add(3);
		id.add(4);
		return id;
	}
	
	public static ArrayList<Integer> getId() {
		return id;
	}

	public static void popularDadosNome(ArrayList<String> nome) {
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

	public static void popularDadosEmail(ArrayList<String> email) {
		// Popula os dados e-mail
		email.add("guilherme@companyname.com");
		email.add("david.w@companyname.com");
		email.add("tharlys@companyname.com");
		email.add("vanderlei@companyname.com");
		email.add("elton@companyname.com");
	}

	public static boolean isListasIguais() {
		return listasIguais;
	}

	public static void setListasIguais(boolean listasIguais) {
		ReceberIdCadastro.listasIguais = listasIguais;
	}
	
	/**
	 * Compara a lista de Id recebido e compara com uma lista padrão com as
	 * informações esperadas.
	 * 
	 * 
	 */
	public static boolean equalsId() {
		ArrayList<Integer> listaIdRecebida = new ArrayList<Integer>();
		listaIdRecebida = popularDadosId(getId());
		ArrayList<Integer> comparaListaId = new ArrayList<Integer>(); // lista genérica simulando os valores esperados
		comparaListaId.add(0);
		comparaListaId.add(1);
		comparaListaId.add(2);
		comparaListaId.add(3);
		comparaListaId.add(4);
		setListasIguais(false);
		for (int i = 0; i < comparaListaId.size(); i++) {
			if (comparaListaId.equals(listaIdRecebida)) {
				setListasIguais(true);
			}
		}
		return comparaListaId.equals(listaIdRecebida);
	}

	/**
	 * O método ValidaId verifica se os Ids recebidos são válidos.
	 * 
	 * @param boolean b
	 * @return idValido
	 */
	public static boolean validarId(boolean b) {
		boolean idValido = true;
		for (int i = 0; i < getId().size(); i++) {
			if (getId().contains(null)) {
				idValido = false;
			}
			System.out.println("Relação de IDs com pelo menos uma informação 'false': " + getId());
		}
		return idValido;
	}

	/**
	 * O método ValidaNome verifica se os nomes dos colaboradores são válidos e
	 * lista a relação na tela.
	 * 
	 * @param boolean b
	 * @return nomeValido
	 */
	public static boolean validarNome(boolean b) {
		boolean nomeValido = true;
		for (int i = 0; i < getNome().size(); i++) {
			if (getNome().contains(null)) {
				nomeValido = false;
			}
			System.out.println("Relação de nomes dos colaboradores recebidos: " + getNome());
		}
		return nomeValido;
	}

	/**
	 * Valida os nomes recebidos em busca de caracteres especiais ou outro dado
	 * diferente de letras que possam tornar o nome nulo.
	 * 
	 * @param String nome
	 * @return dadosValidos
	 * 
	 */
	public static boolean validarDadosNome(String nome) {
		boolean dadosValidos = false;
		for (int i = 0; i < nome.length(); i++) {
			if (nome.matches("[a-zA-Z]{1,}")) {
				dadosValidos = true;
			}
		}
		return dadosValidos;
	}

}
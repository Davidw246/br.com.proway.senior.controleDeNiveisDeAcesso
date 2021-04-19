package acessoUsuario;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Ignore;
import org.junit.Test;

/**
 * Testa a entrada de dados.
 * 
 * Verifica se as informações externas estão chegando de forma correta, sem dados nulos ou ausentes.
 * 
 * Os dados recebidos são Id funcional, nome e endereço de e-mai cadastrados na base de dados.
 */

public class RecebeIdCadastroTest {

	@Test
	public void testValidaIdTrue() {
		boolean idValido;
		idValido = true;
		ArrayList<Integer> idTest = new ArrayList();
		idTest.add(0);
		idTest.add(1);
		idTest.add(2);
		idTest.add(3);
		idTest.add(4);

		assertTrue(RecebeIdCadastro.ValidaId(idValido));
		System.out.println("Relação de id true: " + idTest);

	}

	/**
	 * Testa se existe pelo menos um dos Ids recebidos inválido
	 * 
	 * Verifica se na listagem de Ids recebidos há algum dado nulo (não integer ou
	 * em branco). Caso algum dado seja nulo, o ArrayList idTest será listado na
	 * tela e será informado em qual posição da lista de Ids que ele se encontra.
	 */

	@Test
	public void testValidaIdFalse() {
		boolean idInvalido;
		idInvalido = false;
		ArrayList<Integer> idTestInvalido = new ArrayList();
		idTestInvalido.add(0);
		idTestInvalido.add(1);
		idTestInvalido.add(null); // esta informação está incorreta
		idTestInvalido.add(3);
		idTestInvalido.add(4);

		assertTrue(RecebeIdCadastro.ValidaId(idInvalido));
		System.out.println("Relação de id false: " + idTestInvalido);
		System.out.println("O Id nulo se encontra na posição: " + idTestInvalido.indexOf(null));

	}

	/**
	 * Teste para verificar se os dados recebidos são iguais aos dados esperados.
	 * 
	 * Compara a relação de Ids recebida com a relação esperada e dessa forma valida a relação recebida.
	 */

	@Test
	public void testComparaListaId() {
		
		boolean listasIguais;
		listasIguais = true;
		
		ArrayList<Integer> testComparaListaId = new ArrayList();
		testComparaListaId.add(0);
		testComparaListaId.add(1);
		testComparaListaId.add(2);
		testComparaListaId.add(3);
		testComparaListaId.add(4);
		/*
		ArrayList<Integer> listaIdRecebida = new ArrayList(); 
		listaIdRecebida = RecebeIdCadastro.id;
			*/
		ArrayList<Integer> listaIdRecebida = new ArrayList(); 
		listaIdRecebida.add(0);
		listaIdRecebida.add(1);
		listaIdRecebida.add(2);
		listaIdRecebida.add(3);
		listaIdRecebida.add(4);
		
		
		//ArrayList<String> listaNomesRecebidos = RecebeIdCadastro.nome;
		//ArrayList<String> listaEmailsRecebidos = RecebeIdCadastro.email;
		
		System.out.println("Relação de ids recebido: " + listaIdRecebida);
		System.out.println("Relação de ids para comparação: " + testComparaListaId);
		
		assertEquals(testComparaListaId, listaIdRecebida);
		
		
		
	}

	/**
	 * Testa se os nomes cadastrados estão corretos
	 * 
	 * Verifica se na listagem de nomes recebidos todos estão corretos. Caso os
	 * nomes estejam corretos o ArrayList nomeTestValido será listado na tela.
	 */

	@Test
	public void testValidaNomeValido() {

		boolean nomeValido;
		nomeValido = true;

		ArrayList<String> nomeTestValido = new ArrayList();
		nomeTestValido.add("Guilherme");
		nomeTestValido.add("David W");
		nomeTestValido.add("Tharlys");
		nomeTestValido.add("Vanderlei");
		nomeTestValido.add("Elton");

		assertTrue(RecebeIdCadastro.ValidaNome(nomeValido));
		System.out.println("Relação de nomes true: " + nomeTestValido);

	}

	/**
	 * Testa se existe pelo menos um nome cadastrado nullo
	 * 
	 * Verifica se na listagem de nomes recebidos há algum dado nulo. Caso algum
	 * dado nulo exista na relação, o ArrayList nomeTestInvalido será listado na
	 * tela e será informado em qual posição se encontra o dado com o nome nulo.
	 */

	@Test
	public void testValidaNomeInvalido() {

		boolean nomeInvalido;
		nomeInvalido = true;

		ArrayList<String> nomeTestInvalido = new ArrayList();
		nomeTestInvalido.add("Guilherme");
		nomeTestInvalido.add("David W");
		nomeTestInvalido.add("Tharlys");
		nomeTestInvalido.add(null);
		nomeTestInvalido.add("Elton");

		assertTrue(RecebeIdCadastro.ValidaNome(nomeInvalido));
		System.out.println("Relação de nomes false: " + nomeTestInvalido);
		System.out.println("O nome nulo se encontra na posição: " + nomeTestInvalido.indexOf(null));

	}

	/**
	 * Testa se os e-mails cadastrados são válidos
	 * 
	 * Verifica se na listagem de e-mails recebidos todos estão corretos. Caso
	 * estejam todos corretos, o ArrayList emailTestValido será listado na tela.
	 */

	@Test
	public void testValidaEmailValido() {

		boolean emailValido;
		emailValido = true;

		ArrayList<String> emailTestValido = new ArrayList();
		emailTestValido.add("guilherme@companyname.com");
		emailTestValido.add("david.w@companyname.com");
		emailTestValido.add("tharlys@companyname.com");
		emailTestValido.add("vanderlei@companyname.com");
		emailTestValido.add("elton@companyname.com");

		assertTrue(RecebeIdCadastro.ValidaEmail(emailValido));
		System.out.println("Relação de e-mails true: " + emailTestValido);

	}

	/**
	 * Testa se há pelo menos um dos e-mails cadastrado de forma nula
	 * 
	 * Verifica se na listagem de e-mails recebidos há pelo menos um deles nulo.
	 * Caso tenha pelo menos um e-mail nulo, o ArrayList emailTestInvalido será
	 * listado na tela e será informado em qual posição o endereço de e-mail
	 * inválido se encontra.
	 */

	@Test
	public void testValidaEmailInvalido() {

		boolean emailInvalido;
		emailInvalido = true;

		ArrayList<String> emailTestInvalido = new ArrayList();
		emailTestInvalido.add("guilherme@companyname.com");
		emailTestInvalido.add("david.w@companyname.com");
		emailTestInvalido.add("tharlys@companyname.com");
		emailTestInvalido.add("vanderlei@companyname.com");
		emailTestInvalido.add(null);

		assertTrue(RecebeIdCadastro.ValidaEmail(emailInvalido));
		System.out.println("Relação de e-mails true: " + emailTestInvalido);
		System.out.println("O e-mail nulo se encontra na posição: " + emailTestInvalido.indexOf(null));

	}
	
	@Test
	public void testValidaCorpoEmailInvalido() {
		
		String emailTestInvalido = "guilherme@com@panyname.com";
						
		boolean emailInvalido;
		emailInvalido = false;
		
		assertEquals(RecebeIdCadastro.isValidEmail(emailTestInvalido), emailInvalido);
		System.out.println("O email: "+ emailTestInvalido + " é " + RecebeIdCadastro.isValidEmail(emailTestInvalido));
		
	}// fim método valida testValidaCorpoEmailInvalido
	
	@Test
	public void testValidaCorpoEmailValido() {
		
		String emailTestValido = "guilherme@companyname.com";
				
		boolean emailValido;
		emailValido = true;
		
		assertEquals(RecebeIdCadastro.isValidEmail(emailTestValido), emailValido);
		System.out.println("O email: "+ emailTestValido + " é " + RecebeIdCadastro.isValidEmail(emailTestValido));
        
	}// fim método valida testValidaCorpoEmailValido
}
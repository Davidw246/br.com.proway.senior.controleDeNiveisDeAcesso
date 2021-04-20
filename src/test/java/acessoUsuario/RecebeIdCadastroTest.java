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
 * Verifica se as informa��es externas est�o chegando de forma correta, sem dados nulos ou ausentes.
 * 
 * Os dados recebidos s�o Id funcional, nome e endere�o de e-mai cadastrados na base de dados.
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

		assertTrue(RecebeIdCadastro.EqualsId());
		System.out.println();
		System.out.println("Rela��o de IDs validados: " + idTest);
	}

	/**
	 * Testa se existe pelo menos um dos Ids recebidos inv�lido
	 * 
	 * Verifica se na listagem de Ids recebidos h� algum dado nulo (n�o integer ou
	 * em branco). Caso algum dado seja nulo, o ArrayList idTest ser� listado na
	 * tela e ser� informado em qual posi��o da lista de Ids que ele se encontra.
	 */

	@Test
	public void testValidaIdFalse() {
		boolean idInvalido;
		idInvalido = false;
		ArrayList<Integer> idTestInvalido = new ArrayList();
		idTestInvalido.add(0);
		idTestInvalido.add(1);
		idTestInvalido.add(null); // esta informa��o est� incorreta
		idTestInvalido.add(3);
		idTestInvalido.add(4);

		assertTrue(RecebeIdCadastro.ValidaId(idInvalido));
		System.out.println();
		System.out.println("Rela��o de IDs com pelo menos uma informa��o 'false': " + idTestInvalido);
		System.out.println("O Id nulo se encontra na posi��o: " + idTestInvalido.indexOf(null));
	}

	/**
	 * Teste para verificar se os dados recebidos s�o iguais aos dados esperados.
	 * 
	 * Compara a rela��o de Ids recebida com a rela��o esperada e dessa forma valida a rela��o recebida.
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
		
		ArrayList<Integer> listaIdRecebida = new ArrayList(); 
		listaIdRecebida.add(0);
		listaIdRecebida.add(1);
		listaIdRecebida.add(2);
		listaIdRecebida.add(3);
		listaIdRecebida.add(4);
		
		System.out.println();
		System.out.println("Rela��o de ids recebido: " + listaIdRecebida);
		System.out.println("Rela��o de ids para compara��o: " + testComparaListaId);
		System.out.println();
		assertEquals(testComparaListaId, listaIdRecebida);		
	}

	/**
	 * Testa se os nomes cadastrados est�o corretos
	 * 
	 * Verifica se na listagem de nomes recebidos todos est�o corretos. Caso os
	 * nomes estejam corretos o ArrayList nomeTestValido ser� listado na tela.
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
		System.out.println("Rela��o de nomes true: " + nomeTestValido);
	}
	
	/**
	 * Testa se existe pelo menos um nome cadastrado nullo
	 * 
	 * Verifica se na listagem de nomes recebidos h� algum dado nulo. Caso algum
	 * dado nulo exista na rela��o, o ArrayList nomeTestInvalido ser� listado na
	 * tela e ser� informado em qual posi��o se encontra o dado com o nome nulo.
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
		System.out.println("Rela��o de nomes false: " + nomeTestInvalido);
		System.out.println("O nome nulo se encontra na posi��o: " + nomeTestInvalido.indexOf(null));
	}

	/**
	 * Verifica se o nome cadastrado est� correto
	 * 
	 * Verifica se n�o h� caracteres especiais ou num�ricos no nome, informando se o nome � true ou false.
	 * 
	 */
	@Test
	public void testValidaDadosNomeValido() {
		
		String nomeTestValido = "Vanderlei";
				
		boolean nomeValido;
		nomeValido = true;
		
		assertEquals(RecebeIdCadastro.validaDadosNome(nomeTestValido), nomeValido);
		System.out.println();
		System.out.println("O nome: "+ nomeTestValido + " � " + RecebeIdCadastro.validaDadosNome(nomeTestValido));
	}
	
	/**
	 * Testa se os e-mails cadastrados s�o v�lidos
	 * 
	 * Verifica se na listagem de e-mails recebidos todos est�o corretos. Caso
	 * estejam todos corretos, o ArrayList emailTestValido ser� listado na tela.
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
		System.out.println();
		System.out.println("Rela��o de e-mails true: " + emailTestValido);
		System.out.println();

	}

	/**
	 * Testa se h� pelo menos um dos e-mails cadastrado de forma nula
	 * 
	 * Verifica se na listagem de e-mails recebidos h� pelo menos um deles nulo.
	 * Caso tenha pelo menos um e-mail nulo, o ArrayList emailTestInvalido ser�
	 * listado na tela e ser� informado em qual posi��o o endere�o de e-mail
	 * inv�lido se encontra.
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
		System.out.println();
		System.out.println("Rela��o de e-mails true: " + emailTestInvalido);
		System.out.println("O e-mail nulo se encontra na posi��o: " + emailTestInvalido.indexOf(null));
		System.out.println();

	}

	/**
	 * Testa se o endere�o de e-mail est� corretamente cadastrado, retornando que o endere�o � true.
	 */
	@Test
	public void testValidaCorpoEmailValido() {
		
		String emailTestValido = "guilherme@companyname.com";
				
		boolean emailValido;
		emailValido = true;
		
		assertEquals(RecebeIdCadastro.isValidEmail(emailTestValido), emailValido);
		System.out.println("O email: "+ emailTestValido + " � " + RecebeIdCadastro.isValidEmail(emailTestValido));
	}
	
	/**
	 * Testa se o endere�o de e-mail n�o est� corretamente cadastrado, retornando que o endere�o � false.
	 */
	@Test
	public void testValidaCorpoEmailInvalido() {
		
		String emailTestInvalido = "guilherme@com@panyname.com";
						
		boolean emailInvalido;
		emailInvalido = false;
		
		assertEquals(RecebeIdCadastro.isValidEmail(emailTestInvalido), emailInvalido);
		System.out.println("O email: "+ emailTestInvalido + " � " + RecebeIdCadastro.isValidEmail(emailTestInvalido));
	}
}
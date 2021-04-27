package model.acesso;

import java.util.ArrayList;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.internal.runners.model.EachTestNotifier;

import model.interfaces.InterfaceUsuarioController;

public class UsuarioController implements InterfaceUsuarioController {

	UsuarioDAO daoUsuario = new UsuarioDAO();
	/**
	 * Verifica se os endere�os de email foram cadastrados corretamente ou se
	 * possuem caracteres especiais.
	 * 
	 * A vari�vel expression relaciona os caracteres que ser�o buscados dentro da
	 * vari�vel email. O m�todo matcher() � empregado para procurar um padr�o na
	 * string, retornando um objeto Matcher que cont�m informa��es sobre a pesquisa
	 * realizada.
	 * 
	 * @param String email
	 * @return isValidaEmail
	 * 
	 * 
	 */
	// Mesclar com m�todo logarPerfil na classe Usuario
	public boolean validarEmail(String email) {
		boolean emailValido = false;
		if (email != null && email.length() > 0) {
			String expressao = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
			Pattern pattern = Pattern.compile(expressao, Pattern.CASE_INSENSITIVE);
			Matcher matcher = pattern.matcher(email);
			if (matcher.matches()) {
				emailValido = true;
			}
		}
		return emailValido;
	}

	/**
	 * Verifica se a senha corresponde aos pre requisitos da expressao. 
	 *
	 *(?=.*[0-9]) um d�gito deve ocorrer pelo menos uma vez 
	 *(?=.*[a-z]) uma letra min�scula deve ocorrer pelo menos uma vez
	 *(?=.*[A-Z]) uma letra mai�scula deve ocorrer pelo menos uma vez 
	 *(?=\\S+$) nenhum espa�o em branco permitido em toda a string 
	 *.{6,} pelo menos 6 caracteres
	 * 
	 * @param String senha
	 * @return senhaValida
	 * 
	 * 
	 */
	// Mesclar com m�todo logarPerfil na classe Usuario
	public boolean validarSenha(String senha) {
		boolean senhaValida = false;
		if (senha != null && senha.length() > 0) {
			String expressao = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{6,24}";
			Pattern pattern = Pattern.compile(expressao, Pattern.CASE_INSENSITIVE);
			Matcher matcher = pattern.matcher(senha);
			if (matcher.matches()) {
				senhaValida = true;
			}
		}
		return senhaValida;
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
	// Adicionar enviarCodigo no m�todo
	public String enviarEmail(String loginDoUsuario) {
		
		String codigo = "" + this.gerarCodigo();
		if (this.validarEmail(loginDoUsuario)) {
			// Faz conex�o com BD e envia e-mail para usu�rio
			return codigo;
		}
		return codigo;
	}

	public void alteraSenha(int id, String senhaNova) {
		
		Usuario usuarioEscolhido = daoUsuario.get(id);
		daoUsuario.get(id).setSenha(senhaNova);
		usuarioEscolhido.setSenha(senhaNova);
		daoUsuario.update(usuarioEscolhido);
	}

	/**
	 * Gera um c�digo aleat�rio
	 * 
	 * Gera o c�gigo random para a verifica��o de usu�rio
	 * 
	 * @return codigo de 5 digitos
	 */
	public boolean gerarCodigo() {

		Random random = new Random();
		int codigo = random.nextInt(99999);
		if (codigo <= 10000) {
			codigo += 10000;
		}
		return true;
	}
}

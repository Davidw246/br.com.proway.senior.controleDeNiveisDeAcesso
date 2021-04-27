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
	 * Verifica se os endereços de email foram cadastrados corretamente ou se
	 * possuem caracteres especiais.
	 * 
	 * A variável expression relaciona os caracteres que serão buscados dentro da
	 * variável email. O método matcher() é empregado para procurar um padrão na
	 * string, retornando um objeto Matcher que contém informações sobre a pesquisa
	 * realizada.
	 * 
	 * @param String email
	 * @return isValidaEmail
	 * 
	 * 
	 */
	// Mesclar com método logarPerfil na classe Usuario
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
	 *(?=.*[0-9]) um dígito deve ocorrer pelo menos uma vez 
	 *(?=.*[a-z]) uma letra minúscula deve ocorrer pelo menos uma vez
	 *(?=.*[A-Z]) uma letra maiúscula deve ocorrer pelo menos uma vez 
	 *(?=\\S+$) nenhum espaço em branco permitido em toda a string 
	 *.{6,} pelo menos 6 caracteres
	 * 
	 * @param String senha
	 * @return senhaValida
	 * 
	 * 
	 */
	// Mesclar com método logarPerfil na classe Usuario
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
	 * Envia o e-mail para o usuário com o código aleatório gerado para a
	 * confirmação.
	 * 
	 * @param email        Email do usuário
	 * @param codigoGerado Código aleatório gerado pelo sistema
	 */
	// Adicionar enviarCodigo no método
	public String enviarEmail(String loginDoUsuario) {
		
		String codigo = "" + this.gerarCodigo();
		if (this.validarEmail(loginDoUsuario)) {
			// Faz conexão com BD e envia e-mail para usuário
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
	 * Gera um código aleatório
	 * 
	 * Gera o cógigo random para a verificação de usuário
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

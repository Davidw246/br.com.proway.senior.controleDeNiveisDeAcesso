package controller;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import model.acesso.PerfilModel;
import model.acesso.UsuarioModel;
import model.acesso.UsuarioDAO;
import model.interfaces.InterfaceUsuarioController;

public class UsuarioController implements InterfaceUsuarioController {

	public UsuarioDAO daoUsuario = new UsuarioDAO();
	
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
	 */
	
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
	 * @param String senha
	 * @return senhaValida
	 */
	
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
	
	public String enviarEmail(String loginDoUsuario) {
		
		String codigo = "" + this.gerarCodigo();
		if (this.validarEmail(loginDoUsuario)) {
			// Faz conexão com BD e envia e-mail para usuário
			return codigo;
		}
		return codigo;
	}

	/**
	 * Método que altera a senha do usuario
	 * 
	 * Recebe id e nova senha para alterar
	 * 
	 * @param int id do usuario procurado para alteraçao
	 * @param String senhaNova do usuario
	 */
	public void alteraSenha(int id, String senhaNova) {
		
		UsuarioModel usuarioEscolhido = daoUsuario.get(id);
		
		usuarioEscolhido.setSenha(senhaNova);
		daoUsuario.update(usuarioEscolhido);
	}
	
	/**
	 * Método que altera o login do usuario
	 * 
	 * Recebe id e novo login para alterar
	 * 
	 * @param int id do usuario procurado para alteraçao
	 * @param String loginNovo do usuario
	 */
	public void alteraLogin(int id, String loginNovo) {
		
		UsuarioModel usuarioEscolhido = daoUsuario.get(id);
		usuarioEscolhido.setLogin(loginNovo);
		daoUsuario.update(usuarioEscolhido);
	}
	
	/**
	 * Método que altera perfil do usuario.
	 * 
	 * Recebe id do usuario, e perfil novo para alterar
	 * 
	 * @param int id do usuario procurado para a troca de perfil
	 * @param Perfil perfilNovo do usuario que vai ter o perfil trocado.
	 */
	public void alteraPerfil(int id, PerfilModel novoPerfil) {
	
		UsuarioModel usuarioEscolhido = daoUsuario.get(id);
		usuarioEscolhido.setPerfil(novoPerfil);
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

package model.acesso;

import java.util.ArrayList;

import org.junit.internal.runners.model.EachTestNotifier;

import model.interfaces.InterfaceAcessoUsuario;

public class UsuarioController implements InterfaceAcessoUsuario {

	/**
	 * M�todo que verifica se usu�rio est� logado.
	 *
	 * Verifica se valores de login e senha do objeto usu�rio est�o nulos ou vazio,
	 * se n�o, seta isLogado como verdadeiro.
	 * 
	 * @param Usuario objeto.
	 */
	public boolean logarPerfil(ArrayList<Usuario> usuario) {

		boolean isLogado = false;
		for (int i = 0; i < usuario.size(); i++) {
			if (usuario.get(i).getIsLogado()) {
				isLogado = true;
				return isLogado;
			}
		}
		return isLogado;
	}

	/**
	 * M�todo que valida login.
	 * 
	 * Compara atributo de objeto recebido com atributo do BD.
	 * 
	 * @param Usuario objeto.
	 * @return retorna booleano verdadeiro se login v�lido.
	 */
	public boolean validarLogin(Usuario usuario) {
		DaoUsuario daoUsuario = new DaoUsuario();
		for (int i = 0; i < daoUsuario.user.size(); i++) {

		//	if (daoUsuario.get(usuario.getId()) == daoUsuario.user.get(i).getId()){
				return true;
			}
		}
		return false;
	}

	/**
	 * M�todo que valida senha
	 * 
	 * Compara atributo de objeto recebido com atributo do BD.
	 * 
	 * @param Usuario objeto.
	 * @return retorna booleano verdadeiro se senha v�lida.
	 */
	public boolean validarSenha(Usuario usuario) {
		DaoUsuario daoUsuario = new DaoUsuario(usuario);
		Usuario usuarioUltimo = daoUsuario.get(daoUsuario.user.size() - 1);
		if (usuarioUltimo.getSenha().equalsIgnoreCase(usuario.getSenha())) {
			return true;
		} else {
			return false;
		}
	}

	/***
	 * Verifica tamanho do senha digitado.
	 * 
	 * Faz valida��o do tamanho da String do senha que foi digitado e informa se
	 * esta valido ou n�o..
	 * 
	 * @param String senha
	 * @return
	 */
	// aumentar limite de caracteres (24). Verificar para obrigar numero e caracter
	// especial na senha
	public boolean limitadorSenha(String senha) {
		if (senha.length() <= 24) {
			return true;
		} else {
			return false;
		}
	}
}

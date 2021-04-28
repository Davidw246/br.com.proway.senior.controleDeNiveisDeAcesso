package model.acesso;

import java.util.ArrayList;
import model.interfaces.InterfaceUsuarioDAO;

public class UsuarioDAO implements InterfaceUsuarioDAO<UsuarioModel> {

/**
 * 
 * @author Vitor Peres
 * @author David Willian
 * @author Leonardo Pereira
 * vitor.peres@senior.com.br
 * leonardo.pereira@senior.com.br
 * david.oliveira@senior.com.br
 * 
 */

	public ArrayList<UsuarioModel> user = new ArrayList<UsuarioModel>();

	/**
	 * Cria usuário novo.
	 * 
	 * Recebe objeto e adiciona no ArrayList<Usuario> user da classe UsuarioDAO
	 * @param UsuarioModel novoUser como parâmetro para o DAO adicionar na lista de usuarios.
	 */
	public void create(UsuarioModel novoUsuario) {
		UsuarioModel user = novoUsuario;
		this.user.add(user);
	}

	/**
	 * Retorna objeto usuário da lista de usuários
	 * 
	 * @param int id do usuário que quer buscar
	 * @return retorna objeto Usuario da lista de usuarios.
	 */
	public UsuarioModel get(int id) {
		for (int i = 0; i < this.user.size(); i++) {
			if (this.user.get(i).getId() == id) {
				return this.user.get(i);

			}
		}
		return null;
	}
	
	/**
	 * Atualiza objeto usuario na lista de usuarios da classe UsuarioDAO
	 * 
	 * @param UsuarioModel usuario atualizado que substitui objeto na lista de usuarios
	 * @return Boolean true apos atualizacao
	 */
	public boolean update(UsuarioModel usuarioAtualizado) {
		user.set(usuarioAtualizado.getId(), usuarioAtualizado);
		return true;
	}

	/**
	 * Retorna lista de todos os usuarios da ArrayList de usuarios
	 * 
	 * @return ArrayList<Usuario>
	 */
	public ArrayList<UsuarioModel> getAll() {

		return user;
	}
	/**
	 * Método que remove usuario da lista de usuarios.
	 * 
	 * Recebe id do usuario a ser removido, percorre arraylist e remove pelo id igual.
	 * @param int id do usuario a ser removido.
	 *
	 */
	public void remove(int id) {
		for (int i =0; i< user.size();i++) {
			if(user.get(i).getId() == id) {
				user.remove(i);
			}
		}
		
	}

}

package model.acesso;

import java.util.ArrayList;
import model.interfaces.DaoInterface;

public class UsuarioDAO implements DaoInterface<Usuario> {

	ArrayList<Usuario> user = new ArrayList<Usuario>();

	/**
	 * Cria usu�rio novo.
	 * 
	 * Recebe objeto e adiciona no ArrayList<Usuario> user da classe UsuarioDAO
	 * @param Usuario novoUser como par�metro para o DAO adicionar na lista de usuarios.
	 */
	public void create(Usuario novoUsuario) {
		Usuario user = novoUsuario;
		this.user.add(user);
	}

	/**
	 * Retorna objeto usu�rio da lista de usu�rios
	 * 
	 * @param int id do usu�rio que quer buscar
	 * @return retorna objeto Usuario da lista de usuarios.
	 */
	public Usuario get(int id) {
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
	 * @param Usuario usuario atualizado que substitui objeto na lista de usuarios
	 * @return Boolean true apos atualizacao
	 */
	public boolean update(Usuario usuarioAtualizado) {
		user.set(usuarioAtualizado.getId(), usuarioAtualizado);
		return true;
	}

	/**
	 * Retorna lista de todos os usuarios da ArrayList de usuarios
	 * 
	 * @return ArrayList<Usuario>
	 */
	public ArrayList<Usuario> getAll() {

		return user;
	}
	/**
	 * M�todo que remove usuario da lista de usuarios.
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

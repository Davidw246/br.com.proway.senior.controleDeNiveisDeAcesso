package model.acesso;

import java.util.ArrayList;

public class DaoUsuario implements DaoInterface<Usuario> {

	ArrayList<Usuario> user = new ArrayList<Usuario>();

	public Usuario create(Usuario item) {
		Usuario user = item;
		return user;
	}

	public Usuario get(int id) {
		for (int i = 0; i < user.size(); i++) {
			if (user.get(i).getId() == id) {
				return this.user.get(i);

			}
		}
		return null;
	}

	public boolean update(Usuario item) {
		int idUsuarioRecebido = item.getId();
		user.set(idUsuarioRecebido, item);

		return false;
	}

	public ArrayList<Usuario> getAll() {

		return user;
	}

}

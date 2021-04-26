package model.acesso;

import java.util.ArrayList;

public class DaoUsuario implements DaoInterface<Usuario> {

	ArrayList<Usuario> user = new ArrayList<Usuario>();

	public Usuario create(Usuario item) {
		Usuario user = item;
		return user;
	}

	public Usuario get(int id) {

		return user.get(id);
	}

	public boolean update(int id, Usuario item) {

		return false;
	}

	public ArrayList<Usuario> getAll() {

		return user;
	}
}

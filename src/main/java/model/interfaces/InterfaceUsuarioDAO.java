package model.interfaces;

import java.util.ArrayList;

public interface InterfaceUsuarioDAO<T> {
	ArrayList<T> getAll();
	void create(T item);
	T get (int id);
	boolean update (T item);
	void remove (int id);
}

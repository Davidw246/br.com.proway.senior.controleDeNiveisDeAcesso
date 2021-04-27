package model.acesso;

import java.util.ArrayList;

public interface DaoInterface<T> {
	ArrayList<T> getAll();
	T create(T item);
	T get (int id);
	boolean update (T item);
}

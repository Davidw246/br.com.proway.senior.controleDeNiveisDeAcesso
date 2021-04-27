package model.interfaces;

import java.util.ArrayList;

public interface DaoInterface<T> {
	ArrayList<T> getAll();
	void create(T item);
	T get (int id);
	boolean update (T item);
}

package model.interfaces;

import java.util.ArrayList;

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
public interface InterfaceUsuarioDAO<T> {
	ArrayList<T> getAll();
	void create(T item);
	T get (int id);
	boolean update (T item);
	void remove (int id);
}

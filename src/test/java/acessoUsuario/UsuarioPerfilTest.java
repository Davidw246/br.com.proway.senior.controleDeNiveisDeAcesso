package acessoUsuario;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class UsuarioPerfilTest {

	@Test
	public void testLogarPerfil() {
		UsuarioPerfil meuPerfil = new UsuarioPerfil();
		String nome = "CLAUDIO";
		String senha = "1234";
		assertFalse(meuPerfil.logarPerfil(nome, senha));
	}

	@Test
	public void testLogarPerfilFalse() {
		UsuarioPerfil meuPerfil = new UsuarioPerfil();
		String nome = "Claudio";
		String senha = "12345";
		assertFalse(meuPerfil.logarPerfil(nome, senha));
		
	}	
		
	@Test
	public void testLogarPerfilVazio() {
		UsuarioPerfil meuPerfil = new UsuarioPerfil();
		String nome = "";
		String senha = "";
		assertFalse(meuPerfil.logarPerfil(nome, senha));
	}

	@Ignore
	public void testLogarPerfilNull() {
		UsuarioPerfil meuPerfil = new UsuarioPerfil();
		String nome = null;
		String senha = null;
		assertFalse(meuPerfil.logarPerfil(nome, senha));
	}
}
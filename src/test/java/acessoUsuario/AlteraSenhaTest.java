package acessoUsuario;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import model.login.AlterarSenhaDoUsuario;

public class AlteraSenhaTest {

	@Ignore
	public void testVerificaUsuario() {
		AlterarSenhaDoUsuario minhaSenha = new AlterarSenhaDoUsuario();
		String nome = "Claudio";
		assertFalse(minhaSenha.verificarUsuario(nome));
	}

	@Test
	public void testEnviarEmail() {
		AlterarSenhaDoUsuario minhaSenha = new AlterarSenhaDoUsuario();
		String email = "exemplo@gmail.com";
		assertFalse(minhaSenha.enviarEmail(email));
	}

	@Test
	public void testGerarCodigo() {
		AlterarSenhaDoUsuario minhaSenha = new AlterarSenhaDoUsuario();
		int gerarCodigo = 12345;
		equals(minhaSenha.gerarCodigo(gerarCodigo));
	}

}
package acessoUsuario;

import static org.junit.Assert.*;

import org.junit.Test;

public class AlteraSenhaTest {

	@Test
	public void testVerificaUsuario() {
		AlteraSenha minhaSenha = new AlteraSenha();
		String nome = "Claudio";
		assertTrue(minhaSenha.verificarUsuario(nome));
	}

	@Test
	public void testEnviarEmail() {
		AlteraSenha minhaSenha = new AlteraSenha();
		String email = "exemplo@gmail.com";
		assertTrue(minhaSenha.enviarEmail(email));
	}

	@Test
	public void testGerarCodigo() {
		AlteraSenha minhaSenha = new AlteraSenha();
		int gerarCodigo = 12345;
		equals(minhaSenha.gerarCodigo(gerarCodigo));
	}

}
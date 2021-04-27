package acessoUsuario;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import model.login.AlterarSenha;

public class AlteraSenhaTest {

	@Ignore
	public void testVerificaUsuario() {
		AlterarSenha minhaSenha = new AlterarSenha();
		String nome = "Claudio";
		assertFalse(minhaSenha.verificarUsuario(nome));
	}

	@Test
	public void testEnviarEmail() {
		AlterarSenha minhaSenha = new AlterarSenha();
		String email = "exemplo@gmail.com";
		assertFalse(minhaSenha.enviarEmail(email));
	}

	@Test
	public void testGerarCodigo() {
		AlterarSenha minhaSenha = new AlterarSenha();
		int gerarCodigo = 12345;
		equals(minhaSenha.gerarCodigo(gerarCodigo));
	}

}
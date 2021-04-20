package acessoUsuario;

public interface AlteraSenhaInterface {

	public boolean enviarEmail(String email);

	public boolean verificarUsuario(String email);

	public int solicitarCodigo();

	public int gerarCodigo(int codigo);
}
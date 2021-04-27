package controller.interfaces;

import model.acesso.PermissaoModel;
import model.acesso.Usuario;

public interface InterfacePermissaoDAO {

	public PermissaoModel criarPermissao(Integer idDaPermissao, String nomeDaPermissao);
	
	public void deletarPermissao(PermissaoModel permissaoEscolhida);
	
	
	// rever
//	public void atribuirPermissaoAoUsuario(Usuario usuario, Integer idDaPermissao);
	
}

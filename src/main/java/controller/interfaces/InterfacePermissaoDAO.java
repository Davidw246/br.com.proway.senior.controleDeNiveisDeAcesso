package controller.interfaces;

import java.util.ArrayList;

import model.acesso.PermissaoModel;
import model.acesso.Usuario;

public interface InterfacePermissaoDAO {

	public PermissaoModel criarPermissao(Integer idDaPermissao, String nomeDaPermissao);
	
	public void deletarPermissao(Integer idDaPermissao);
	
	public PermissaoModel buscarPermissao(Integer idDaPermissao);
	
	public ArrayList<PermissaoModel> lerListaDePermissoesCriadas();

}

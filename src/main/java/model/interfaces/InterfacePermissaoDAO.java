package model.interfaces;

import java.util.ArrayList;
import model.acesso.PermissaoModel;

/**
 * @author Lucas Ivan, lucas.ivan@senior.com.br
 * @author Sarah Brito, sarah.brito@senior.com.br
 */

public interface InterfacePermissaoDAO {

	public PermissaoModel criarPermissao(Integer idDaPermissao, String nomeDaPermissao);
	
	public boolean deletarPermissao(Integer idDaPermissao);
	
	public PermissaoModel buscarPermissao(Integer idDaPermissao);
	
	public ArrayList<PermissaoModel> lerListaDePermissoesCriadas();

}

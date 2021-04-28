package model.interfaces;

import java.util.ArrayList;

import model.acesso.PerfilModel;

/**
 * @author Lucas Ivan, lucas.ivan@senior.com.br
 * @author Sarah Brito, sarah.brito@senior.com.br
 */

public interface InterfacePerfilDAO {
	
	
	public PerfilModel criarPerfilVazio(Integer idDoPerfil, String nomeDoPerfil);
	
	public boolean deletarPerfil(Integer idDoPerfil);
	
	public PerfilModel buscarPerfil(Integer idDoPerfil);
	
	public ArrayList<PerfilModel> lerListaDePerfisCriados();
	
	public PerfilModel alterarNomePerfil(Integer idDoPerfil, String nomeDoPerfil);
	
}

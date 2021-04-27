package model.interfaces;

import java.util.ArrayList;

import model.acesso.PerfilModel;
import model.acesso.PermissaoModel;

public interface InterfacePerfilDAO {
	
	
	public PerfilModel criarPerfilVazio(Integer idDoPerfil, String nomeDoPerfil);
	
	public boolean deletarPerfil(Integer idDoPerfil);
	
	public PerfilModel buscarPerfil(Integer idDoPerfil);
	
	public ArrayList<PerfilModel> lerListaDePerfisCriados();
	
	public PerfilModel alterarNomePerfil(Integer idDoPerfil, String nomeDoPerfil);
	
}

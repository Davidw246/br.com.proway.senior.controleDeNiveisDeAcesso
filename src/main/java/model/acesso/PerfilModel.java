package model.acesso;

import java.util.ArrayList;

/**
 * Classe PerfilModel
 * 
 * Defini os atributos necessários para instanciar um perfil,
 * o que é constituído por permissões.
 * 
 * @author Lucas Ivan, lucas.ivan@senior.com.br
 * @author Sarah Brito, sarah.brito@senior.com.br
 *
 */
public class PerfilModel {
	
	private Integer idDoPerfil;
	private String nomeDoPerfil;
	private ArrayList<PermissaoModel> listaDePermissoesDoPerfil = new ArrayList<PermissaoModel>();

	public Integer getIdDoPerfil() {
		return idDoPerfil;
	}

	public void setIdDoPerfil(Integer idDoPerfil) {
		this.idDoPerfil = idDoPerfil;
	}

	public String getNomeDoPerfil() {
		return nomeDoPerfil;
	}

	public void setNomeDoPerfil(String nomeDoPerfil) {
		this.nomeDoPerfil = nomeDoPerfil;
	}

	public ArrayList<PermissaoModel> getListaDePermissoesDoPerfil() {
		return listaDePermissoesDoPerfil;
	}

	public void setListaDePermissoesDoPerfil(ArrayList<PermissaoModel> listaDePermissoesDoPerfil) {
		this.listaDePermissoesDoPerfil = listaDePermissoesDoPerfil;
	}

	public PerfilModel(Integer idDoPerfil, String nomeDoPerfil, ArrayList<PermissaoModel> listaDePermissoesDoPerfil) {
		super();
		this.idDoPerfil = idDoPerfil;
		this.nomeDoPerfil = nomeDoPerfil;
		this.listaDePermissoesDoPerfil = listaDePermissoesDoPerfil;
	}

	@Override
	public String toString() {
		return "PerfilModel [idDoPerfil=" + idDoPerfil + ", nomeDoPerfil=" + nomeDoPerfil
				+ ", listaDePermissoesDoPerfil=" + listaDePermissoesDoPerfil + "]";
	}
}

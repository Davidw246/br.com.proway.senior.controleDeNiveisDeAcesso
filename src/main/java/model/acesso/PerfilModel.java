package model.acesso;

/**
 * Classe PerfilModel
 * 
 * Defini os atributos necessários para instanciar um perfil,
 * o que é constituído por permissões.
 *
 */
public class PerfilModel {
	
	private Integer idDoPerfil;
	private String nomeDoPerfil;
	private PermissaoModel permissao;

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

	public PermissaoModel getPermissao() {
		return permissao;
	}

	public void setPermissao(PermissaoModel permissao) {
		this.permissao = permissao;
	}
	
	

	public PerfilModel(Integer idDoPerfil, String nomeDoPerfil, PermissaoModel permissao) {
		this.idDoPerfil = idDoPerfil;
		this.nomeDoPerfil = nomeDoPerfil;
		this.permissao = permissao;
	}

	@Override
	public String toString() {
		return "PerfilModel [idDoPerfil=" + idDoPerfil + ", nomeDoPerfil=" + nomeDoPerfil + ", permissao=" + permissao
				+ "]";
	}
	
}

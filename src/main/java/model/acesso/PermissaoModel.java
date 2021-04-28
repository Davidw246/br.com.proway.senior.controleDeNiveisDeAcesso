package model.acesso;

/**
 * Classe PermissaoModel
 * 
 * Recebe os atributos necessários para instanciar uma permissão,
 * que será vinculada a um perfil.
 * 
 * @author Lucas Ivan, lucas.ivan@senior.com.br
 * @author Sarah Brito, sarah.brito@senior.com.br
 */

public class PermissaoModel {
	
	private Integer idDaPermissao;
	private String nomeDaPermissao;
	
	public Integer getIdDaPermissao() {
		return idDaPermissao;
	}
	public void setIdDaPermissao(Integer idDaPermissao) {
		this.idDaPermissao = idDaPermissao;
	}
	public String getNomeDaPermissao() {
		return nomeDaPermissao;
	}
	public void setNomeDaPermissao(String nomeDaPermissao) {
		this.nomeDaPermissao = nomeDaPermissao;
	}
	
	public PermissaoModel(Integer idDaPermissao, String nomeDaPermissao) {
		this.idDaPermissao = idDaPermissao;
		this.nomeDaPermissao = nomeDaPermissao;
	}
	
	@Override
	public String toString() {
		return "PermissaoModel [idDaPermissao=" + idDaPermissao + ", nomeDaPermissao=" + nomeDaPermissao + "]";
	}
	
	



}

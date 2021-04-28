package model.interfaces;

public interface InterfaceReceberIdCadastro {
	
	/**
	 * M�todos que obrigatoriamente devem ser implementados pela classe que implementar essa interface.
	 * 
	 * @return boolean
	 * 
	 */
	
	
	// Assinatura dos m�todos que devem ser implementados
	
	public boolean equalsId();
	public boolean validarId(boolean b);
	public boolean validarNome(boolean b);
	public boolean validarDadosNome(String nome);
	//public boolean ValidaEmail(boolean b);
	public boolean validarEmail(String email);
	
}

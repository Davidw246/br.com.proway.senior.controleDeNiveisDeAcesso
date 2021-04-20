package br.com.proway.senior.com.controle2;

public interface InterfaceRecebeIdCadastro {
	
	/**
	 * Métodos que obrigatoriamente devem ser implementados pela classe que implementar essa interface.
	 * 
	 * @return boolean
	 * 
	 */
	
	
	// Assinatura dos métodos que devem ser implementados
	
	public boolean EqualsId();
	public boolean ValidaId(boolean b);
	public boolean ValidaNome(boolean b);
	public boolean validaDadosNome(String nome);
	public boolean ValidaEmail(boolean b);
	public boolean isValidEmail(String email);
	
}

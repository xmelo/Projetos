package br.com.fiap.challenge.model;
public class Departamento {
 
	private int codDepto;
	private String nomeDepto;
	
	public Departamento() {
		
	}

	public Departamento(int codDepto, String nomeDepto) {
		super();
		this.codDepto = codDepto;
		this.nomeDepto = nomeDepto;
	}

	public int getCodDepto() {
		return codDepto;
	}

	public void setCodDepto(int codDepto) {
		this.codDepto = codDepto;
	}

	public String getNomeDepto() {
		return nomeDepto;
	}

	public void setNomeDepto(String nomeDepto) {
		this.nomeDepto = nomeDepto;
	}
	
	

}

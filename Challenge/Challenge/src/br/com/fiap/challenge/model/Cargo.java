package br.com.fiap.challenge.model;
public class Cargo {
	
	private int codCargo;
	private int codDepto;
	private String nomecargo;

	public Cargo() {
		
	}

	public Cargo(int codCargo, int codDepto, String nomecargo) {
		super();
		this.codCargo = codCargo;
		this.codDepto = codDepto;
		this.nomecargo = nomecargo;
	}

	public int getCodCargo() {
		return codCargo;
	}

	public void setCodCargo(int codCargo) {
		this.codCargo = codCargo;
	}
	
	public int getCodDepto() {
		return codDepto;
	}
	
	public void setCodDepto(int codDepto) {
		this.codDepto = codDepto;
	}

	public String getNomecargo() {
		return nomecargo;
	}

	public void setNomecargo(String nomecargo) {
		this.nomecargo = nomecargo;
	}
	
	
	

}
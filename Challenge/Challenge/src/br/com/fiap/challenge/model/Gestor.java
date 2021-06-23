package br.com.fiap.challenge.model;



public class Gestor {
	
	private int numGestor;
	private String nomeGestor;
	private int codDepto;
	private String genero;
	private String telefone;
	private String email;
	private String dtAdmissao;
	
	public Gestor() {
		
	}
	
	public Gestor(int numGestor, String nomeGestor, int codDepto, String genero, String telefone, String email,
			String dtAdmissao) {
		super();
		this.numGestor = numGestor;
		this.nomeGestor = nomeGestor;
		this.codDepto = codDepto;
		this.genero = genero;
		this.telefone = telefone;
		this.email = email;
		this.dtAdmissao = dtAdmissao;
	}

	public int getNumGestor() {
		return numGestor;
	}

	public void setNumGestor(int numGestor) {
		this.numGestor = numGestor;
	}

	public String getNomeGestor() {
		return nomeGestor;
	}

	public void setNomeGestor(String nomeGestor) {
		this.nomeGestor = nomeGestor;
	}

	public int getCodDepto() {
		return codDepto;
	}

	public void setCodDepto(int codDepto) {
		this.codDepto = codDepto;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDtAdmissao() {
		return dtAdmissao;
	}

	public void setDtAdmissao(String dtAdmissao) {
		this.dtAdmissao = dtAdmissao;
	}

}	
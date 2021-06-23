package br.com.fiap.challenge.model;

public class Funcionario {
	
	private int numFuncionario;
	private String nomeFuncionario;
	private int codDepto;
	private String genero;
	private String telefone;
	private String email;
	private String dataAdmissao;
	private int pontuacaoFuncionario;
	
	public Funcionario() {
		
	}

	public Funcionario(int numFuncionario, String nomeFuncionario, int codDepto, String genero, String telefone,
			String email, String dataAdmissao, int pontuacaoFuncionario) {
		super();
		this.numFuncionario = numFuncionario;
		this.nomeFuncionario = nomeFuncionario;
		this.codDepto = codDepto;
		this.genero = genero;
		this.telefone = telefone;
		this.email = email;
		this.dataAdmissao = dataAdmissao;
		this.pontuacaoFuncionario = pontuacaoFuncionario;
	}

	public int getNumFuncionario() {
		return numFuncionario;
	}

	public void setNumFuncionario(int numFuncionario) {
		this.numFuncionario = numFuncionario;
	}

	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
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

	public String getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public int getPontuacaoFuncionario() {
		return pontuacaoFuncionario;
	}

	public void setPontuacaoFuncionario(int pontuacaoFuncionario) {
		this.pontuacaoFuncionario = pontuacaoFuncionario;
	}
	
	
	
}
package br.com.fiap.challenge.model;

public class Missao {

	private int codMissao;
	private String DescMissao;
	private String datacadastro;
	private int codDepto;
	private int codGestor;
	private int codFunc;
	private String status;
	private int quantValor;
	private String dataTermino;
	
	public Missao() {
		
	}

	public Missao(int codMissao, String descMissao, String datacadastro, int codDepto, int codGestor, int codFunc,
			String status, int quantValor, String dataTermino) {
		super();
		this.codMissao = codMissao;
		DescMissao = descMissao;
		this.datacadastro = datacadastro;
		this.codDepto = codDepto;
		this.codGestor = codGestor;
		this.codFunc = codFunc;
		this.status = status;
		this.quantValor = quantValor;
		this.dataTermino = dataTermino;
	}

	public int getCodMissao() {
		return codMissao;
	}

	public void setCodMissao(int codMissao) {
		this.codMissao = codMissao;
	}

	public String getDescMissao() {
		return DescMissao;
	}

	public void setDescMissao(String descMissao) {
		DescMissao = descMissao;
	}

	public String getDatacadastro() {
		return datacadastro;
	}

	public void setDatacadastro(String datacadastro) {
		this.datacadastro = datacadastro;
	}

	public int getCodDepto() {
		return codDepto;
	}

	public void setCodDepto(int codDepto) {
		this.codDepto = codDepto;
	}

	public int getCodGestor() {
		return codGestor;
	}

	public void setCodGestor(int codGestor) {
		this.codGestor = codGestor;
	}

	public int getCodFunc() {
		return codFunc;
	}

	public void setCodFunc(int codFunc) {
		this.codFunc = codFunc;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getQuantValor() {
		return quantValor;
	}

	public void setQuantValor(int quantValor) {
		this.quantValor = quantValor;
	}

	public String getDataTermino() {
		return dataTermino;
	}

	public void setDataTermino(String dataTermino) {
		this.dataTermino = dataTermino;
	}
	
	
}

package br.com.fiap.regimedemocratico.model;

/**
 * 
 * Classe referida como Super Classe.
 * 
 * É responsável por modelar o Cadastro Geral, de pessoas que compõem o Sistema Democrático,
 * no Governo do Brasil.
 * 
 * @author Artaxerxes Antonio
 *
 */

public abstract class CadastroGeral {

	protected String cargo;
	protected String poder;
	protected String nome;
	protected String cpf;
	protected String sexo;
	protected String endereco;
	protected String telefone;
	protected double salario;
	protected String possuiFilhos;
	protected String anosDeMandato;
	protected String antecedentesCriminais;
	protected double patrimonioEstimado;
	protected String possuiBensForadoBrasil;
	protected double beneficios;

	public abstract double getInfluencia();
	
	/**
	 * Este método abstrato existe, para complementar as classes Filhas de Cadastro geral, 
	 * á executarem um getInfluencia. 
	 * @return
	 */

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getPoder() {
		return poder;
	}

	public void setPoder(String poder) {
		this.poder = poder;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getPossuiFilhos() {
		return possuiFilhos;
	}

	public void setPossuiFilhos(String possuiFilhos) {
		this.possuiFilhos = possuiFilhos;
	}

	public String getAnosDeMandato() {
		return anosDeMandato;
	}

	public void setAnosDeMandato(String anosDeMandato) {
		this.anosDeMandato = anosDeMandato;
	}

	public String getAntecedentesCriminais() {
		return antecedentesCriminais;
	}

	public void setAntecedentesCriminais(String antecedentesCriminais) {
		this.antecedentesCriminais = antecedentesCriminais;
	}

	public double getPatrimonioEstimado() {
		return patrimonioEstimado;
	}

	public void setPatrimonioEstimado(double patrimonioEstimado) {
		this.patrimonioEstimado = patrimonioEstimado;
	}

	public String getPossuiBensForadoBrasil() {
		return possuiBensForadoBrasil;
	}

	public void setPossuiBensForadoBrasil(String possuiBensForadoBrasil) {
		this.possuiBensForadoBrasil = possuiBensForadoBrasil;
	}

	public double getBeneficios() {
		return beneficios;
	}

	public void setBeneficios(double beneficios) {
		this.beneficios = beneficios;
	}

}
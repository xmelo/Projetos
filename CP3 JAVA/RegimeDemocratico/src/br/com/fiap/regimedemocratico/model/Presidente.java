package br.com.fiap.regimedemocratico.model;

/**
 * 
 * Classe Filha de Cadastro Geral, e foi completada com o atributo abstrato getInfluencia, determinado 
 * na Super Classe. 
 * Estipula o valor na qual os beneficios do Presidente da Rep�blica, dever� ser calculado no ProgramaBrasil.
 
 * @author Artaxerxes Antonio
 *
 */

public class Presidente extends CadastroGeral {

	@Override
	public double getInfluencia() {
		return 5 * beneficios;

	}
}

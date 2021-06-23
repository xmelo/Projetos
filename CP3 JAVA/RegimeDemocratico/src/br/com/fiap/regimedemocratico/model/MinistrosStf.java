package br.com.fiap.regimedemocratico.model;

/**
 * 
 * Classe Filha de Cadastro Geral, e foi completada com o atributo abstrato getInfluencia, determinado 
 * na Super Classe. 
 * Estipula o valor na qual os beneficios dos Ministros do STF, deverá ser calculado no ProgramaBrasil.

 * @author Artaxerxes Antonio
 *
 */

public class MinistrosStf extends CadastroGeral {

	@Override
	public double getInfluencia() {
		return 5 * beneficios;
	}

}

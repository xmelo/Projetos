package br.com.fiap.regimedemocratico.main;

/**
 * Classe ProgramaBrasil, codificado para o desenvolvimento do Programa, 
 * possui todas as informações, para os atributos criados na classe Cadastro Geral (Super Classe),
 * e classes filhas.
 *  
 * @author Artaxerxes Antonio
 *
 */

import br.com.fiap.regimedemocratico.model.DeputadosFederais;
import br.com.fiap.regimedemocratico.model.Presidente;
import br.com.fiap.regimedemocratico.model.Senadores;
import br.com.fiap.regimedemocratico.model.MinistrosStf;

public class ProgramaBrasil {

	/**
	 * Abaixo está o código de metódo main, para execução do projeto.
	 * @param args
	 */
	public static void main(String[] args) {
		
		Presidente presidente = new Presidente();
		presidente.setPoder("Poder Executivo");
		presidente.setCargo("Presidente da República");
		presidente.setNome("Juscelino Kubitschek");
		presidente.setCpf("447.965.742-22");
		presidente.setEndereco("Palácio do Alvorada");
		presidente.setSexo("Masculino");
		presidente.setPossuiFilhos("Sim");
		presidente.setTelefone("(61) 8556-9025");
		presidente.setSalario(25958.56);
		presidente.setBeneficios(15658.63);
		presidente.setPossuiBensForadoBrasil("Sim");
		presidente.setPatrimonioEstimado(2856987.58);
		presidente.setAntecedentesCriminais("Não");
		presidente.setAnosDeMandato("4 anos");
		
		Senadores senador1 = new Senadores();
		senador1.setPoder("Poder Legislativo");
		senador1.setCargo("Senador");
		senador1.setNome("Arminio de Azevedo");
		senador1.setCpf("585.565.789-00");
		senador1.setEndereco("Rua dos navegantes, S/N");
		senador1.setSexo("Masculino");
		senador1.setPossuiFilhos("Não");
		senador1.setTelefone("(61) 7456-9899");
		senador1.setSalario(11789.40);
		senador1.setBeneficios(7450.78);
		senador1.setPossuiBensForadoBrasil("Sim");
		senador1.setPatrimonioEstimado(1525634.20);
		senador1.setAntecedentesCriminais("Sim");
		senador1.setAnosDeMandato("4 anos");
		
		DeputadosFederais deputado1 = new DeputadosFederais();
		deputado1.setPoder("Poder Legislativo");
		deputado1.setCargo("Deputado Federal");
		deputado1.setNome("Luciana Moreira");
		deputado1.setCpf("258.441.250-45");
		deputado1.setEndereco("Av. Central Sul, 500");
		deputado1.setSexo("Feminino");
		deputado1.setPossuiFilhos("Não");
		deputado1.setTelefone("(11) 4562-7441");
		deputado1.setSalario(9778.14);
		deputado1.setBeneficios(4120.15);
		deputado1.setPossuiBensForadoBrasil("Não");
		deputado1.setPatrimonioEstimado(20056.19);
		deputado1.setAntecedentesCriminais("Não");
		deputado1.setAnosDeMandato("4 anos");
		
		MinistrosStf ministro1 = new MinistrosStf();
		ministro1.setPoder("Poder Judiciário");
		ministro1.setCargo("Ministro do STF");
		ministro1.setNome("Augustus da Silva");
		ministro1.setCpf("550.141.177-45");
		ministro1.setEndereco("Av. 7 de Setembro, 177");
		ministro1.setSexo("Masculino");
		ministro1.setPossuiFilhos("Sim");
		ministro1.setTelefone("(41) 2553-6007");
		ministro1.setSalario(20750.89);
		ministro1.setBeneficios(11654.85);
		ministro1.setPossuiBensForadoBrasil("Sim");
		ministro1.setPatrimonioEstimado(4897650.56);
		ministro1.setAntecedentesCriminais("Não");
		ministro1.setAnosDeMandato("Até aposentadoria compulsória aos 70 anos");
		
		System.out.println ();
		System.out.println ("*************Governo do Brasil***********************");
		System.out.println ();
		System.out.println ("Poder classificado na República Federativa do Brasil: " + presidente.getPoder());
		System.out.println ("Cargo: " + presidente.getCargo());
		System.out.println ("Valor recebido por influencia de cargo: " + presidente.getInfluencia());
		System.out.println ("Nome: " + presidente.getNome());
		System.out.println ("Cpf " + presidente.getCpf());
		System.out.println ("Endereço: " + presidente.getEndereco());
		System.out.println ("Sexo: " + presidente.getSexo());
		System.out.println ("Possui Filhos " + presidente.getPossuiFilhos());
		System.out.println ("Telefone: "+ presidente.getTelefone());
		System.out.println ("Salário: " + presidente.getSalario());
		System.out.println ("Valor referente á benefícios: "+ presidente.getBeneficios());
		System.out.println ("Possui Bens fora do Brasil: " + presidente.getPossuiBensForadoBrasil());
		System.out.println ("Valor do Patrimonio Estimado: " + presidente.getPatrimonioEstimado());
		System.out.println ("Possui Registro de Antecendentes Criminais: " + presidente.getAntecedentesCriminais());
		System.out.println ("Quantos anos de mandato?: " + presidente.getAnosDeMandato());
		System.out.println ();
		System.out.println ();
		System.out.println ("*************Governo do Brasil***********************");
		System.out.println ();
		System.out.println ();
		System.out.println ("Poder classificado na República Federativa do Brasil: " + senador1.getPoder());
		System.out.println ("Cargo: " + senador1.getCargo());
		System.out.println ("Valor recebido por influencia de cargo: " + senador1.getInfluencia());
		System.out.println ("Nome: " + senador1.getNome());
		System.out.println ("Cpf: " + senador1.getCpf());
		System.out.println ("Endereço: " +  senador1.getEndereco());
		System.out.println ("Sexo: " + senador1.getSexo());
		System.out.println ("Possui Filhos: " + senador1.getPossuiFilhos());
		System.out.println ("Telefone: "+  senador1.getTelefone());
		System.out.println ("Salário: " + senador1.getSalario());
		System.out.println ("Valor referente á benefícios: "+ senador1.getBeneficios());
		System.out.println ("Possui Bens fora do Brasil: " +  senador1.getPossuiBensForadoBrasil());
		System.out.println ("Valor do Patrimonio Estimado: " +  senador1.getPatrimonioEstimado());
		System.out.println ("Possui Registro de Antecendentes Criminais: " + senador1.getAntecedentesCriminais());
		System.out.println ("Quantos anos de mandato?: " + senador1.getAnosDeMandato());
		System.out.println ();
		System.out.println ("*************Governo do Brasil***********************");
		System.out.println ();
		System.out.println ("Poder classificado na República Federativa do Brasil: " + deputado1.getPoder());
		System.out.println ("Cargo: " + deputado1.getCargo());
		System.out.println ("Valor recebido por influencia de cargo: " + deputado1.getInfluencia());
		System.out.println ("Nome: " + deputado1.getNome());
		System.out.println ("Cpf: " + deputado1.getCpf());
		System.out.println ("Endereço: " +  deputado1.getEndereco());
		System.out.println ("Sexo: " + deputado1.getSexo());
		System.out.println ("Possui Filhos: " + deputado1.getPossuiFilhos());
		System.out.println ("Telefone: "+  deputado1.getTelefone());
		System.out.println ("Salário " + deputado1.getSalario());
		System.out.println ("Valor referente á benefícios: "+ deputado1.getBeneficios());
		System.out.println ("Possui Bens fora do Brasil: " + deputado1.getPossuiBensForadoBrasil());
		System.out.println ("Valor do Patrimonio Estimado: " +  deputado1.getPatrimonioEstimado());
		System.out.println ("Possui Registro de Antecendentes Criminais: " + deputado1.getAntecedentesCriminais());
		System.out.println ("Quantos anos de mandato?: " + deputado1.getAnosDeMandato());
		System.out.println ();
		System.out.println ("*************Governo do Brasil***********************");
		System.out.println ();
		System.out.println ("Poder classificado na República Federativa do Brasil: " + ministro1.getPoder());
		System.out.println ("Cargo: " + ministro1.getCargo());
		System.out.println ("Valor recebido por influencia de cargo: " + ministro1.getInfluencia());
		System.out.println ("Nome: " + ministro1.getNome());
		System.out.println ("Cpf: " + ministro1.getCpf());
		System.out.println ("Endereço: " +  ministro1.getEndereco());
		System.out.println ("Sexo: " + ministro1.getSexo());
		System.out.println ("Possui Filhos: " + ministro1.getPossuiFilhos());
		System.out.println ("Telefone: "+  ministro1.getTelefone());
		System.out.println ("Salário: " + ministro1.getSalario());
		System.out.println ("Valor referente á benefícios: "+ministro1.getBeneficios());
		System.out.println ("Possui Bens fora do Brasil: " + ministro1.getPossuiBensForadoBrasil());
		System.out.println ("Valor do Patrimonio Estimado: " +  ministro1.getPatrimonioEstimado());
		System.out.println ("Possui Registro de Antecendentes Criminais:" + ministro1.getAntecedentesCriminais());
		System.out.println ("Quantos anos de mandato?: " + ministro1.getAnosDeMandato());
		System.out.println ();
		System.out.println ("*************Governo do Brasil***********************");
		System.out.println ();
	}

}

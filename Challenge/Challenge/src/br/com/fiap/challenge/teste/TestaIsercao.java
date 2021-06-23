package br.com.fiap.challenge.teste;
import java.sql.SQLException;

import br.com.fiap.challenge.dao.*;
import br.com.fiap.challenge.model.*;


public class TestaIsercao {

	public static void main (String[] args) throws SQLException {
		
		Departamento d1 = new Departamento();
		d1.setNomeDepto("Compras");
		
		Departamento d2 = new Departamento();
		d2.setNomeDepto("Diretoria");
		
		DepartamentoDAO daoDepto = new DepartamentoDAO();
		daoDepto.adiciona(d1);
		daoDepto.adiciona(d2);
		
		
		Cargo c1 = new Cargo();
		c1.setNomecargo("Analista");
		c1.setCodDepto(1);
		
		Cargo c2 = new Cargo();
		c2.setNomecargo("Diretor");
		c2.setCodDepto(2);
		
		CargoDAO daoCargo = new CargoDAO();
		daoCargo.adiciona(c1);
		daoCargo.adiciona(c2);
		
		
		Gestor g1 = new Gestor();
		g1.setNomeGestor("Paulo");
		g1.setCodDepto(2);
		g1.setGenero("M");
		g1.setTelefone("(11) 99999-0000");
		g1.setEmail("paulo@empresa.com.br");
		g1.setDtAdmissao("2020/9/13");
		
		Gestor g2 = new Gestor();
		g2.setNomeGestor("Paula");
		g2.setCodDepto(1);
		g2.setGenero("F");
		g2.setTelefone("(11) 92837-0000");
		g2.setEmail("paula@empresa.com.br");
		g2.setDtAdmissao("2002/9/13");
		
		GestorDAO daoGestor = new GestorDAO();
		daoGestor.adiciona(g1);
		daoGestor.adiciona(g2);
		
		Funcionario f1 = new Funcionario();
		f1.setNomeFuncionario("Bruno");
		f1.setCodDepto(1);
		f1.setGenero("M");
		f1.setTelefone("(11) 93084-7352");
		f1.setEmail("bruno@empresa.com.br");
		f1.setDataAdmissao("1992/3/22");
		f1.setPontuacaoFuncionario(1000);
		
		Funcionario f2 = new Funcionario();
		f2.setNomeFuncionario("Maria");
		f2.setCodDepto(2);
		f2.setGenero("F");
		f2.setTelefone("(11) 92739-0239");
		f2.setEmail("maria@empresa.com.br");
		f2.setDataAdmissao("2010/11/13");
		f2.setPontuacaoFuncionario(1200);
		
		FuncionarioDAO daoFunc = new FuncionarioDAO();
		daoFunc.adiciona(f1);
		daoFunc.adiciona(f2);
		
		
		Missao m1 = new Missao();
		m1.setDescMissao("Cumprimentar novos colegas de trabalho.");
		m1.setDatacadastro("2002/9/12");
		m1.setCodDepto(2);
		m1.setCodGestor(1);
		m1.setCodFunc(1);
		m1.setStatus("Imcompleta");
		m1.setQuantValor(100);
		m1.setDataTermino("2022/9/3");
		
		Missao m2 = new Missao();
		m2.setDescMissao("Cumprimentar novos colegas de trabalho.");
		m2.setDatacadastro("2002/9/12");
		m2.setCodDepto(2);
		m2.setCodGestor(1);
		m2.setCodFunc(1);
		m2.setStatus("Em andamento");
		m2.setQuantValor(150);
		m2.setDataTermino("2021/7/01");		
		
		MissaoDAO daoMissao = new MissaoDAO();
		daoMissao.adiciona(m1);
		daoMissao.adiciona(m2);
		
	}
}

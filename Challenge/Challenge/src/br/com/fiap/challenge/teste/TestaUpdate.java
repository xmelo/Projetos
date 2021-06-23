package br.com.fiap.challenge.teste;

import java.sql.SQLException;

import br.com.fiap.challenge.dao.*;
import br.com.fiap.challenge.model.*;


public class TestaUpdate {
	public static void main (String[] args) throws SQLException {
		
		Departamento d = new Departamento();
		DepartamentoDAO daoDepto = new DepartamentoDAO();
		d.setCodDepto(1);
		d.setNomeDepto("Diretoria");
		daoDepto.edita(d);
		
		Cargo c = new Cargo();
		CargoDAO daoCargo = new CargoDAO();
		int idCargo = 1;
		c.setCodCargo(idCargo);
		c.setCodDepto(daoCargo.getCargos().get(idCargo-1).getCodDepto());
		c.setNomecargo("Gerente");
		daoCargo.edita(c);
		
		Gestor g = new Gestor();
		GestorDAO daoGestor = new GestorDAO();
		int idGestor = 1;
		g.setNumGestor(idGestor);
		g.setNomeGestor("João");
		g.setCodDepto(daoGestor.getGestor().get(idGestor-1).getCodDepto());
		g.setGenero("M");
		g.setTelefone("(11) 91111-0000");
		g.setEmail("joão@empresa.com.br");
		g.setDtAdmissao("2020/09/10");
		daoGestor.edita(g);
		
		Funcionario f = new Funcionario();
		FuncionarioDAO daoFunc = new FuncionarioDAO();
		int idFunc = 1;
		f.setNumFuncionario(idFunc);
		f.setNomeFuncionario("João");
		f.setCodDepto(daoFunc.getFuncionario().get(idFunc-1).getCodDepto());
		f.setGenero("M");
		f.setTelefone("(11) 91111-0000");
		f.setEmail("joão@empresa.com.br");
		f.setDataAdmissao("2020/09/10");
		f.setPontuacaoFuncionario(200);
		daoFunc.edita(f);
		
		Missao m = new Missao();
		MissaoDAO daoMissao = new MissaoDAO();
		int idMissao = 1;
		m.setDescMissao("Cumprimentar novos colegas de trabalho.");
		m.setDatacadastro("2020/03/15");
		m.setCodDepto(daoMissao.getMissao().get(idMissao-1).getCodDepto());
		m.setCodGestor(daoMissao.getMissao().get(idMissao-1).getCodGestor());
		m.setCodFunc(daoMissao.getMissao().get(idMissao-1).getCodFunc());
		m.setStatus("Imcompleta");
		m.setQuantValor(100);
		m.setDataTermino ("2000/02/13");
		daoMissao.edita(m);
		
	}
}

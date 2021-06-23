package br.com.fiap.challenge.teste;

import java.util.ArrayList;

import br.com.fiap.challenge.model.*;
import br.com.fiap.challenge.dao.*;


import java.sql.SQLException;

public class TestaListagem {
	
	public static void main (String[] args ) throws SQLException {
		
		DepartamentoDAO daoDepto = new DepartamentoDAO();
		ArrayList<Departamento> Deptos = daoDepto.getDeptos();
		
		for(Departamento d: Deptos) {
			System.out.println(d.getCodDepto() + " " + d.getNomeDepto());
		}
		
		CargoDAO daoCargo = new CargoDAO();
		ArrayList<Cargo> Cargos = daoCargo.getCargos();
		
		for(Cargo c: Cargos) {
			System.out.println(c.getCodCargo() + " " + c.getCodDepto() + " " + c.getNomecargo());
		}
		
		GestorDAO daoGestor = new GestorDAO();
		ArrayList<Gestor> Gestores = daoGestor.getGestor();
		
		for(Gestor g: Gestores) {
			System.out.print(g.getNumGestor());
			System.out.print(g.getNomeGestor());
			System.out.print(g.getCodDepto());
			System.out.print(g.getGenero());
			System.out.print(g.getTelefone());
			System.out.print(g.getEmail());
			System.out.println(g.getDtAdmissao());
		}
		
		FuncionarioDAO daoFunc = new FuncionarioDAO();
		ArrayList<Funcionario> Funcionarios = daoFunc.getFuncionario();
		
		for(Funcionario f: Funcionarios) {
			System.out.print(f.getNumFuncionario());
			System.out.print(f.getNomeFuncionario());
			System.out.print(f.getCodDepto());
			System.out.print(f.getGenero());
			System.out.print(f.getTelefone());
			System.out.print(f.getEmail());
			System.out.print(f.getDataAdmissao());
			System.out.println(f.getPontuacaoFuncionario());
		}
		
		MissaoDAO daoMissao = new MissaoDAO();
		ArrayList<Missao> Missoes = daoMissao.getMissao();
		
		for(Missao m: Missoes) {
			System.out.print(m.getCodMissao());
			System.out.print(m.getDescMissao());
			System.out.print(m.getDatacadastro());
			System.out.print(m.getCodDepto());
			System.out.print(m.getCodGestor());
			System.out.print(m.getCodFunc());
			System.out.print(m.getStatus());
			System.out.println(m.getDataTermino());
		}
		
		
	}
}

